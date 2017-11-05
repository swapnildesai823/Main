<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Room Details</title>
		<link rel="stylesheet" href="css/registrationForm.css">
		  <link href="css/bootstrap.min.css" rel="stylesheet">  
<link href="css/header.css" rel="stylesheet"/>
   <!--Table css required--> 
 <style>
 table
 {
 border-collapse:collapse;
 }
 td
 {
 padding-top:.5em;
 padding-bottom:.5em;
 }
 </style>
  
</head>
<body>
<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(243,210,230);">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="showHome">DivaStays</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    
      <ul class="nav navbar-nav navbar-right" style="background-color: rgb(243,210,230);" >
         <li><a href="logoutOwner" ><b style="color:#000000;">Logout</b></a></li> 
         <li><a href="showHelp" ><b style="color:#000000;">Help</b></a></li> 	
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
 <div class="main-content">
  <form class="form-basic" method="post" action="saveEditedRoom" onSubmit="return RoomSubmit()" enctype="multipart/form-data" style="background-color: rgb(243,210,230);">
    <div class="form-title-row">
   
       <h1>Room Details</h1>
    </div>
   <div class="form-row" style="float:left; width:50%;">
   <!--
    <label>
        <span>House ID</span>
            <input type="text" name="houseId" id="houseId" value="${room.house}">
     </label>
       -->
     <label>
            <span>Room Type</span>
               <select name="roomType" class="form-control selectpicker" id="roomType" required>
                    <option value="${room.roomtype}">${room.roomtype}</option>
                    <option value="hall">Hall</option>
                    <option value="bed">Bed</option>
                    <option value="kitchen">Kitchen</option>
               </select>
           </label>
      <label>
              <span>Food Availability</span>
                 <select name="foodAvailability" class="form-control selectpicker" id="foodAvailability" required>
                     <option value="${room.foodAvailability}">${room.foodAvailability}</option>
                     <option value="yes">Yes</option>
                     <option value="no">No</option>
                </select>
            </label>
    <div class="form-row" style="float:left;">
      <table id="table" class="table table-bordered" style="background-color:#FFFFFF">
        <thead>
          <tr>
            <label><span>Facilities</span></label>
          </tr>
        </thead>
      <tbody style="background-color: rgb(243,210,230);">
          <tr>
           <td>AC</td>
           <td><input type="radio" name="ac" value="ac"><span>Yes&nbsp;&nbsp;&nbsp;</span></td>
           <td><input type="radio" name="ac" value="not available"><span>No</span></td>
          </tr>
         <tr>
           <td>Wifi</td>
           <td><input type="radio" name="wifi" ><span>Yes</span></td>
           <td><input type="radio" name="wifi" ><span>No</span></td>
          </tr>
         <tr>
           <td>Bathroom</td>
           <td><input type="radio" name="bathroom"  ><span>Yes</span></td>
           <td><input type="radio" name="bathroom" ><span>No</span></td>
        </tr>
         <tr>
           <td>Geyser</td>
           <td><input type="radio" name="geyser" ><span>Yes</span></td>
           <td><input type="radio" name="geyser" ><span>No</span></td>
         </tr>
         <tr>
           <td>Bed</td>
           <td><input type="radio" name="bed"  ><span>Yes</span></td>
           <td><input type="radio" name="bed" ><span>No</span></td>
         </tr>
         <tr>
           <td>Swimming Pool&nbsp;&nbsp;&nbsp;&nbsp;</td>
           <td><input type="radio" name="swimmingPool"  ><span>Yes</span></td>
           <td><input type="radio" name="swimmingPool" ><span>No</span></td>
         </tr>
          <tr>
           <td>Parking</td>
           <td><input type="radio" name="parking"  ><span>Yes</span></td>
           <td><input type="radio" name="parking" ><span>No</span></td>
         </tr>
          <tr>
           <td>Gym</td>
           <td><input type="radio" name="gym"  ><span>Yes</span></td>
           <td><input type="radio" name="gym" ><span>No</span></td>
          </tr>
     </tbody>
</table>
   </div>
 </div>
       <div class="form-row" style="float:left; width:50%;">
        <label>
        <span>Room ID</span>
            <input type="text" name="roomId" id="roomId" placeholder="Room ID" onBlur="CheckRoomID(); return false;" value="${room.roomId}" autocomplete="off" required>
     </label>
           <label>
                    <span>Number Of Bed</span>
                 <select name="numberOfBed" id="numberOfBed" class="form-control selectpicker" required>
                        <option value="${room.numberOfBed}">${room.numberOfBed}</option>
                         <option value="1">1</option>
                        <option value="2">2</option>
                  </select>
            </label>      
           <label>
             <span>Upload Photo 1</span>
             <img src="<ui:image img='${room.img1}'></ui:image>" alt="..." style="height:90px" />
               <input type="file" name="img1" id="img1" onBlur="CheckImg1(); return false;" >
           </label>
           <label>
             <span>Upload Photo 2</span>
             <img src="<ui:image img='${room.img2}'></ui:image>" alt="..." style="height:90px" />
              <input type="file" name="img2" id="img2" onBlur="CheckImg2(); return false;">
           </label>
           <label>
            <span>Upload Photo 3</span>
            <img src="<ui:image img='${room.img3}'></ui:image>" alt="..." style="height:90px" />
              <input type="file" name="img3" id="img3" onBlur="CheckImg3(); return false;">
           </label>
        </div>
            <div class="form-row" style="width:50%;"  style="background-color:#6caee0;">
                <button type="submit" value="Submit" >Submit</button>
            </div>		   
            <input type="hidden" name="rId" id="rId" value="${room.rId}">         
        </form>
</div>
<script src="js/room.js" type="text/javascript"></script>  

</body>
</html>