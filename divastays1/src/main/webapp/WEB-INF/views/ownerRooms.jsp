<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
   border: 1px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Room Details</title>
		<link rel="stylesheet" href="css/registrationForm.css">
		  <link href="css/bootstrap.min.css" rel="stylesheet">  
<link href="css/header.css" rel="stylesheet"/>
</head>
<body >
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
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
 <div class="main-content">
  <form class="form-basic" method="post" action=""  enctype="multipart/form-data" style="background-color: rgb(243,210,230);" style="background-image:url(images/formBackground.jpg)">
    <div class="form-title-row">
       <h1>Room Details</h1>
    </div>
    <div class="form-row" style="float:center;">
      <table id="table" class="table table-bordered" style="background-color:#FFFFFF">
        <thead>
          <tr>
            <th>Room Id</th>         
            <th>Room Image</th>
            <th>Options</th>
          </tr>
        </thead>
      <tbody style="background-color: rgb(243,210,230);">
       <c:forEach items="${room}" var="room" varStatus="itr">
          <tr>
           <td>${room.rId}</td>
            <td><img src="<ui:image img='${room.img1}'></ui:image>" alt="..." style="height:90px" /></td>   
            <td><a href="editRoom/${room.rId}">Edit</a><br>
            <a href="deleteRoom/${room.rId}">Delete</a>
          
            </td>
          </tr>
          </c:forEach>
     </tbody>
</table>
   </div>
 <div class="form-row" style="float:left; width:50%;">
         
           </div>
            <div class="form-row" style="width:50%;"  style="background-color:#6caee0;">
                <button type="submit" value="Submit" >Submit</button>
            </div>		
          
        </form>
</div>
<script src="js/room.js" type="text/javascript"></script>  

</body>
</html>