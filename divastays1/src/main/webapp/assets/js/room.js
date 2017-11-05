// JavaScript Document
//validate RoomType
function CheckRoomType()   
{  
  var roomType = document.getElementById('roomType');
  var decimal= /.*\S.*/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(roomType.value.match(decimal))   
{   
roomType.style.backgroundColor = goodColor;
}  
else  
{   
roomType.style.backgroundColor = badColor;
}  
}


//validate food
function CheckFoodAvailability()   
{  
  var food = document.getElementById('checkButton');
  var decimal= /.*\S.*/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(food.value.match(decimal))   
{   
food.style.backgroundColor = goodColor;
}  
else  
{   
food.style.backgroundColor = badColor;
}  
}

//validate roomID
function CheckRoomID()   
{  
  var roomId = document.getElementById('roomId');
  var decimal = /^[0-9]{0,3}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(roomId.value.match(decimal))   
{   
	roomId.style.backgroundColor = goodColor;
}  
else  
{   
	roomId.style.backgroundColor = badColor;
}  
}  


//validate Bed
function CheckBed()   
{  
  var bed = document.getElementById('bed');
  var decimal = /^[0-9]{1,2}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(bed .value.match(decimal))   
{   
 bed.style.backgroundColor = goodColor;
}  
else  
{   
 bed.style.backgroundColor = badColor;
}  
}  

//validate Image1
function CheckImg1()   
{  
  var img1 = document.getElementById('img1');
  var decimal = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpeg|.jpg|.gif)$/;
  //var imgSize1 = document.getElementById("img1");
  var fileSize1 =img1.files[0].size;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(img1 .value.match(decimal) && fileSize1 < 1048576)   
{   
 img1.style.backgroundColor = goodColor;
}  
else  
{   
 img1.style.backgroundColor = badColor;
}  
}  

//validate Image2
function CheckImg2()   
{  
  var img2 = document.getElementById('img2');
  var decimal = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpeg|.jpg|.gif)$/;
   var fileSize2 =img2.files[0].size;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(img2 .value.match(decimal) && fileSize2 < 1048576)   
{   
 img2.style.backgroundColor = goodColor;
}  
else  
{   
 img2.style.backgroundColor = badColor;
}  
}  

//validate Image3
function CheckImg3()   
{  
  var img3 = document.getElementById('img3');
  var decimal = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpeg|.jpg|.gif)$/;
    var fileSize3 =img3.files[0].size;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(img3 .value.match(decimal) && fileSize3 < 1048576)   
{   
 img3.style.backgroundColor = goodColor;
}  
else  
{   
 img3.style.backgroundColor = badColor;
}  
}  


//Validate Submit
function RoomSubmit()
{
	
	var roomId = document.getElementById('roomId').value;
	var decimalRoomID = /^[0-9]{0,3}$/;
	var bed = document.getElementById('bed').value;
	var decimalBed = /^[0-9]{1,2}$/;
	
	 var img1 = document.getElementById('img1').value;
	 var img2 = document.getElementById('img2').value;
	 var img3 = document.getElementById('img3').value;
     var decimalImage = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpeg|.jpg|.gif)$/;
	
	//images size validation
     var imgSize1= document.getElementById("img1");
	  var imgSize2= document.getElementById("img2");
	  var imgSize3= document.getElementById("img3");
	  var fileSize1 =imgSize1.files[0].size;
	  var fileSize2 =imgSize2.files[0].size;
	  var fileSize3 =imgSize3.files[0].size;	
	
	
    if (roomId != '' && bed != '' && img1 != '' && img2 != '' && img3 != '')
	{
		if (roomId.match(decimalRoomID) && bed.match(decimalBed) && img1.match(decimalImage) && img2.match(decimalImage) && img3.match(decimalImage) && fileSize1 <= 1048576 && fileSize2 <= 1048576 && fileSize3 <= 1048576)
		{
			return true;
		}
		else
		{
			return false;
		}
}
    
    for(var i=1;i<=house1.getRoom();i++)
    	{
    	   return "roomReg";
    	}
}



