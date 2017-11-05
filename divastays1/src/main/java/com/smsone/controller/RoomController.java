package com.smsone.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Owner;
import com.smsone.model.Room;
import com.smsone.model.User;
import com.smsone.service.HouseService;
import com.smsone.service.RoomService;
import com.smsone.util.PlacesUtility;
@Controller
public class RoomController {
	@Autowired
	private RoomService roomService;
	@Autowired
	private HouseService houseService;
	//show room info
	@RequestMapping(value="/showRoomInfo")
	public String showRoominfo(@RequestParam("rId") Long rId,Model model)
	{
		Room r=roomService.getRoom(rId);
		model.addAttribute("room",r);
		model.addAttribute("beds",r.getBeds());
		//List<Beds> beds=roomService.getAllBedDetails(rId);
		//List<User> users=new ArrayList<User>();
		//for(Beds beds1:beds)
		//{
			//users.add(beds1.getUser());
		//}
	//	model.addAttribute("users",users);
		return "roomInfo";
	}
	@RequestMapping(value = "/editRoom/{rId}")
	public String editRoom(@PathVariable("rId") Long rId,RedirectAttributes ra)
	{
        ra.addAttribute("rId",rId);
		return "redirect:/editRoom1";
     
	}
	@RequestMapping(value = "/editRoom1")
	public String editRoom1(@RequestParam("rId") Long rId,Model model)
	{
		Room room=new Room();
		room.setrId(rId);
	    model.addAttribute("room",roomService.getRoom(room));
		return "editRoomDetails";  
	}
	@RequestMapping(value="/showHouseInfo/showRoomInfo/{rId}")
	public String showRoomDetails(@PathVariable("rId")Long rId,RedirectAttributes ra)

	{
		 ra.addAttribute("rId",rId);
		 return "redirect:/showRoomInfo";
	}
	@RequestMapping(value="/saveBed")
	public String saveBed(@RequestParam("bed") String bed,@RequestParam("rid") Long rid)
	{
		Beds beds=new Beds();
		houseService.saveBed(beds,rid);
		return "bedInfo";
	}
	@RequestMapping(value="/showBed")
	public String saveBed()
	{	
		return "bedInfo";
	}
	//assign bed
	@RequestMapping("/assignBed")
	public String assignBed(@RequestParam("uId")Long uId,@RequestParam("bId")Long bId)
	{
		User user=new User();
		Beds beds=new Beds();
		user.setuId(uId);
		beds.setbId(bId);
		roomService.assignBed(user, beds);
		return "assign";
	}
	//plcae autocomplete
	@RequestMapping(value = "/listAddress", method = RequestMethod.GET)
	public @ResponseBody
	List<String> getAddressList(@RequestParam String input) {
		try {
			return PlacesUtility.getData(input);
		} catch (IOException e) {
			return new ArrayList<String>();
		}
	}
	//show room reg form
	@RequestMapping(value = "/showRoomReg")
	public String showRoomReg()
	{
		return "roomReg";	
	}
	//save room details
	@RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
	public String saveRoom(@RequestParam("houseId")Long hId,@RequestParam("roomId")Long roomId,@RequestParam("roomType")String roomType,@RequestParam("ac")String ac,@RequestParam("wifi")String wifi,
							@RequestParam("bathroom")String bathroom,@RequestParam("geyser")String geyser,@RequestParam("bed")String bed,@RequestParam("swimmingPool")String swimmingPool,
							@RequestParam("gym")String gym,@RequestParam("numberOfBed")Integer numberOfBed,@RequestParam("foodAvailability")String foodAvailability,@RequestParam("img1")MultipartFile img1,@RequestParam("img2")MultipartFile img2,@RequestParam("img3")MultipartFile img3,Model model,@RequestParam("room")Integer numberOfRoom,@RequestParam("i")Integer i,HttpSession session) throws IOException
	{
		Room room=new Room();
		room.setRoomId(roomId);
		room.setRoomtype(roomType);
		room.setAc(ac);
		room.setWifi(wifi);
		room.setBathroom(bathroom);
		room.setGeyser(geyser);
		room.setBed(bed);
		room.setSwimmingPool(swimmingPool);
		room.setGym(gym);
		room.setNumberOfBed(numberOfBed);
		room.setFoodAvailability(foodAvailability);
		byte[] img11 = img1.getBytes();
		byte[] img13 = img2.getBytes();
		byte[] img12 = img3.getBytes();
		room.setImg1(img11);
		room.setImg2(img12);
		room.setImg3(img13);
		roomService.saveRoom(room,hId);
		model.addAttribute("rId",room.getrId());
		model.addAttribute("numberOfBed", numberOfBed);
		i++;
		if(i>numberOfRoom)
		{
			return "success";
		}
		else
		{
			model.addAttribute("hId", hId);
			model.addAttribute("room", numberOfRoom);
			model.addAttribute("i", i); 
			Owner owner=(Owner)session.getAttribute("owner");
			if(owner==null)
			{
				return "redirect:/showOwnerPage";
			}
			else
			{
				return "roomReg";
			}
		}
						
	}
		
	//save edited room details
	@RequestMapping(value = "/saveEditedRoom", method = RequestMethod.POST)
	public String saveEditedRoom(@RequestParam("rId")Long rId,@RequestParam("roomId")Long roomId,@RequestParam("roomType")String roomType,@RequestParam("numberOfBed")Integer numberOfBed,@RequestParam("foodAvailability")String foodAvailability,@RequestParam("img1")MultipartFile img1,@RequestParam("img2")MultipartFile img2,@RequestParam("img3")MultipartFile img3,Model model,HttpSession session) throws IOException
	{
		Room room=new Room();
		room.setrId(rId);
		room.setRoomId(roomId);
		room.setRoomtype(roomType);	
		room.setNumberOfBed(numberOfBed);
		room.setFoodAvailability(foodAvailability);
		byte[] img11 = img1.getBytes();
		byte[] img13 = img2.getBytes();
		byte[] img12 = img3.getBytes();
		room.setImg1(img11);
		room.setImg2(img12);
		room.setImg3(img13);
		roomService.updateRoom(room);
		return "success";
	}

}
