<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Room Information</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  

 




</head>
<body style="background-color: rgb(243,210,230);">
<!--Header-->
<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(243,210,230);">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
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
      
     
      <ul class="nav navbar-nav navbar-right">
        <li><a href="showHelp">Help</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!--End of Header-->
<!--Room details Start-->
<div class="container">    
 <div class="row">
 

    <!--Room 1 Section-->
    <div class="col-sm-5">
      <div class="tab-content">
       
   		
            <h3>Room Details</h3>
              <div class="w3-container">
         <table class="table">
           <thead>
              <tr class="w3-light-grey w3-hover-red">
                 <th>Things</th>
                 <th>Details</th>
             </tr>
           </thead>
             <tr class="w3-hover-green">
                <td>Type of Room</td>
                <td>${room.roomtype}</td>
             </tr>
             <tr class="w3-hover-green">
                <td>foodAvailability</td>
                <td>${room.foodAvailability}</td>
             </tr>
             <tr class="w3-hover-green">
                <td>Facilities</td>
                <td>Sofa<br>Television<br>Wifi<br>Attached Bathroom<br>Geyser</td>
            </tr>
             <tr class="w3-hover-green">
                <td>Roommates</td>
                <td>
                     <ul>
                      <li><a data-toggle="collapse" data-target="#bed1">Bed 1</a></li>
                       <div id="bed1" class="collapse">
                         <ol>
                           <li>English</li>
                           <li>non-Veg</li>
                         </ol>
                       </div>    
         
                     <li><a data-toggle="collapse" data-target="#bed2">Bed 2</a></li>
                        <div id="bed2" class="collapse">
                           <ol>
                             <li>Hindi</li>
                             <li>Veg</li>
                           </ol>   
                        </div>
                     </ul> 
                </td>
              </tr>
         </table>
 </div>
</div> 
<!--End Room 1 Section-->
  </div>
</div>
  
 
 <c:forEach items="${beds}" var="beds" varStatus="itr">
 ${beds.bId}

 </c:forEach>
  
 
 
 
 
 <div class="container">
  <div class="row">
   <div class="col-md-4">
  </div>
  <div class="col-md-4">
	<div class="panel panel-login" style="background-color: rgb(243,210,230);">
      <div class="panel-heading row">
	    <div class="row">
		  <div class="col-xs-6 text-center">
			<a href="#" class="active" id="book">Book</a>
		  </div>
		  <div class="col-xs-6 text-center">
			<a href="#" id="visit">Visit</a>
		  </div>
	    </div>
			<hr>
	   </div>
        
        
        
	<div class="panel-body">
	  <div class="row">
		<div class="col-lg-12">
		  <form id="login-form" action="showPaymentPage" method="post" role="form" style="display: block;">
           <p>
             To Book, you need to pay a token amount and the remaining before move-in.</p>
            <br>
            <br>
            <div class="form-group">
	         <div class="row">
	          <div class="col-sm-6 col-sm-offset-3">
		        <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Book Now" style="color:#FF0000">
	          </div>
	        </div> 
	      </div>
         </form>
  
  <form id="register-form" action="" method="post" role="form" style="display: none;">
   <div class="form-group">
	<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Name" value="" onBlur="CheckName(); return false;" required>
      <span id="checkName" class="checkName"></span>
   </div>
   <div class="form-group">
    <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="" onBlur="CheckEmail(); return false;" required> 
      <span id="checkEmail" class="checkEmail"></span>
   </div>
   <div class="form-group">
	<input type="text" name="phone" id="phone" tabindex="2" class="form-control" placeholder="Phone" onBlur="CheckPhone();                  return false;" required>
       <span id="checkPhone" class="checkPhone"></span>
  </div>
								
    <div class="form-group">
	  <div class="row">
	    <div class="col-sm-6 col-sm-offset-3">
	      <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register"                 value="Visit Now" style="color:#FF0000" onClick="Submit();">
		</div>
	  </div>
   </div>
   </form>
			        </div>
			     </div>
		      </div>             
	      </div>
        </div>      
     </div>
    <hr>
</div>
        
 <!--Script for book and view Code-->
<script>
$(function() {

    $('#book').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#visit').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});
</script>
<!--End of Script-->
 <script src="js/validate.js" type="text/javascript"></script>
 <script>
// When the user clicks on bed, open the popup
   function bed3() {
    var popup3 = document.getElementById("mypopup3");
	popup3.classList.toggle("show");
	
	}
</script>	
<script>	
	function bed2() {
  
	 var popup2 = document.getElementById("mypopup2");
	
	popup2.classList.toggle("show");
	}
</script>	
<script>	
	function bed1() {
  
	 var popup1 = document.getElementById("mypopup1");
	
	popup1.classList.toggle("show");
	}	
</script>
</body>
</html>