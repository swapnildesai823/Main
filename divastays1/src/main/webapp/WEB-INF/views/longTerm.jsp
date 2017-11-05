<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>pg_long_term</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/styles.css" rel="stylesheet">
  <link href="css/default.css" rel="stylesheet">
  <link href="css/header.css" rel="stylesheet">
   <link href="css/popup.css" rel="stylesheet">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
  <!-- for google api-->
  <link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">

<!-- Inline CSS based on choices in "Settings" tab -->
<style>.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p, .bootstrap-iso form{font-family: Arial, Helvetica, sans-serif; color: black}.bootstrap-iso form button, .bootstrap-iso form button:hover{color: white !important;} .asteriskField{color: red;}</style>

<style>
	.ui-autocomplete { font-size: 10px; }
	#address { width: 300px; }
}
</style>
<style>

#first{ height:500px;}
</style>
<style>
	.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: #000000;
    padding: 5px 10px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}

.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}

.button1:hover {
    background-color: #009900;
    color: white;
}


/* Dropdown Button */
.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
    position: relative;
    display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #FFFFFF;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #0000CC}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
    display: block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {
    background-color: #006699;
}

<!-- start search box-->



.search {
    margin-top: -25%;
}
.search .form-section{
	background:rgba(0,0,0,0.6);
	border: 2px solid #414141;
	border-radius: 5px;
	padding: 10px;
}
<!-- end search box-->
  </style>
  

</head>
<body>
	
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
      <a class="navbar-brand" href="showHome"><b><font color="#000000">DivaStays</font></b></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     
     
      <ul class="nav navbar-nav navbar-right">
        
   <c:choose>
    <c:when test="${sessionScope.user!=null}">
     <img src="<ui:image img='${sessionScope.user.userImg}'></ui:image>" alt="..." style="height:30px" />
      <a href=logoutLongTerm>Logout</a>
    </c:when>    
    <c:otherwise>
      <li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><b><font color="#000000">Login</font></b>
						<span class="caret"></span></a>
					<ul id="login-dp" class="dropdown-menu">
						<li>
							<div class="row">
								<div class="col-md-12">
									Login via
									<div class="social-buttons">
										<a href="#" class="btn btn-fb"><i class="fa fa-facebook"></i>
											Facebook</a> <a href="#" class="btn btn-tw"><i
											class="fa fa-twitter"></i> Twitter</a>
									</div>
									or

									<form class="form" role="form" method="post" action="loginLongTerm"
										accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											<label class="sr-only" for="exampleInputEmail2">Email
												address</label> <input type="email" name="email"
												class="form-control" id="email" placeholder="Email address"
												autocomplete="off" required>
										</div>
										<div class="form-group">
											<label class="sr-only" for="exampleInputPassword2">Password</label>
											<input type="password" name="password" class="form-control"
												id="password" placeholder="Password" autocomplete="off"
												required>
											<div class="help-block text-right">
												<a href="verificationlink">Forget the password ?</a>
											</div>
											<span id="empIdErr" class="errMsg"></span>
										</div>
										<div class="form-group">
											<button type="submit" class="btn btn-primary btn-block"
												onclick="checkLogin();">Sign in</button>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox"> keep me
												logged-in
											</label>
										</div>
									</form>
								</div>
								<div class="bottom text-center">
									New here ? <a href="showUserReg"><b><font
											color="#000000">Join Us</font></b></a>
								</div>
							</div>
						</li>

					</ul></li>
    </c:otherwise>
</c:choose>        <li><a href="showHelp"><font color="#000000">Help</font></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->

 <jsp:include page="cityDropDown.jsp"></jsp:include>
 

<div class="jumbotron" style="background-color:#ffffff">   <!-- main div for the user search -->
   <div class="header-content" align="center">
      <div class="container text-center">						<!--conatainer center div start -->
          <h1 style="color:#000000; font-family:Georgia;">DivaStays</h1>     
              <p style="color:#000000; font-family:"Courier New", Courier, monospace;">Your Friendly  Neighbourhood Hostel</p>
          <h5 style="color:#000000;">now in India</h5>
          <a href="showKnowMore"> <button class="button btn-info">Know More</button></a>
          <br>
          <br>
            <br>
		   <div class="container text-center" style="background-color:rgb(243,210,230)" >    
  				<h3 align="center" style="color:#000000;">Stay with us and enjoy life</h3>
  					
                    
                
             <div class="row">
            	<div class="col-md-13 col-md-offset-1">
              	   <div class="form-section">
                	  <div class="row">
                         <form role="form" action="showFilterLongTerm" method="post">
                  <div class="col-md-2"></div>
                      <div class="col-md-5">
                        <div class="form-group">
                          <label class="sr-only" for="location">Location</label>
                          <input type="text" class="form-control" name="address" id="address" placeholder="Where ?"/>
                        </div>
                        </div>
               
                      <div class="col-md-1">
                      <button type="submit" class="btn btn-info">Search</button>

                        <!--<button type="submit" class="btn btn-default btn-primary">Search</button>-->
                      </div>
      
      						
      				</form>
                      </div>
                      </div>
                      </div>
            
                      </div>
                      
                   
                    </div>
                    
                    
                 
    
                    <!-- two more tag add for  puppose is to contain in one-->
                 
			
    <br>
      <br>      
                  
                    
                
  
  
  <!-- search box start -->
 				
                  <div class="col-md-12 text-center">
				 <!-here we are add the map ->   
             		<div>
             		   
           			<div class="map">
           <h2 class="service-title pad-bt15">Hostels In Pune</h2>
           <hr class="bottom-line">
				<div id="google-map">
        		
<iframe src="https://www.google.com/maps/d/embed?mid=1c-xBCOm4KzrFzL7o24ZlWuwAhSg" width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>               
        	</div>
        </div>
        
   </div></div>
</div>


<br>
  
  </div>
</div>
  
  <!-- search box end -->
<div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h2 class="service-title pad-bt15">Limited Deals</h2>
            <hr class="bottom-line">
          </div>
      

  		<a href="showDeal1"><div class="col-sm-4">
      		<div class="panel panel-primary">
       
      	 	 	<div class="panel-heading">Hinjewadi</div>
       			 <div class="panel-body"><img src="images/longterm_deal_hinjewadi.png" class="img-responsive" style="width:100%" alt="Image"></div>
       	 		<div class="panel-footer" style="color:#000000">best deal</div>
       	 		
      	</div>
    </div>
		</a>
        <div class="col-sm-4"> 
      	<div class="panel panel-primary">
      	 	 <div class="panel-heading">Shivaji Nagar</div>
       		 <div class="panel-body"><img src="images/longterm_shivajinagar.png" class="img-responsive" style="width:100%" alt="Image"></div>
       		 <div class="panel-footer" style="color:#000000">best deal</div>
      </div>
      </div>
      <div class="col-sm-4"> 
      		<div class="panel panel-primary">
        	<div class="panel-heading">Chinchwad</div>
        	<div class="panel-body"><img src="images/longterm_chinchwad.png" class="img-responsive" style="width:100%" alt="Image"></div>
        	<div class="panel-footer" style="color:#000000">best deal</div>
      </div>
    	</div>
      
    	    


        
   	  </div>
  </div>
</div>

<section id="three" class="no-padding">
        <div class="container-fluid">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="margin-top-0 ">DivaStays For All Your Needs</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>

            <div class="row no-gutter">           
              <div class="col-lg-4 col-sm-6">
                    <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="./assets/deer.png">
                        <img src="images/longtermdeal.jpg" class="img-responsive" alt="Image 1">
                           <div class="gallery-box-caption">
                            <div class="gallery-box-content">
                                <div>
                                    <i class="icon-lg ion-ios-search"></i>
                                    <h4>DivaStays with family</h4>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="./assets/beach.png">
                       <img src="images/longtermdeal_5.png" class="img-responsive" alt="Image 2">
                        <div class="gallery-box-caption">
                            <div class="gallery-box-content">
                                <div>
                                    <i class="icon-lg ion-ios-search"></i>
                                    <h4>DivaStays with friends</h4>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
				<div class="clearfix hidden-lg"> </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="./assets/lake.png">
                        <img src="images/pg3.png" class="img-responsive" alt="Image 3">

                        <div class="gallery-box-caption">
                            <div class="gallery-box-content">
                                <div>
                                    <i class="icon-lg ion-ios-search"></i>
                                    <h4>DivaStays best  with sharing</h4>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="./assets/bike.png">
                        <img src="images/pg8.png" class="img-responsive" alt="Image 4">
                        <div class="gallery-box-caption">
                            <div class="gallery-box-content">
                                <div>
                                    <i class="icon-lg ion-ios-search"></i>
                                    <h4>DivaStays best deal for Students</h4>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
				<div class="clearfix hidden-lg"> </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="./assets/city.png">
                        <img src="images/Hostel-2.png" class="img-responsive" alt="Image 5">
                        <div class="gallery-box-caption">
                            <div class="gallery-box-content">
                                <div>
                                    <i class="icon-lg ion-ios-search"></i>
                                    <h4>DivaStays in Pune</h4>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="./assets/colors.png">
                       <img src="images/longterm_couple.png" class="img-responsive" alt="Image 6">
                        <div class="gallery-box-caption">
                            <div class="gallery-box-content">
                                <div>
                                    <i class="icon-lg ion-ios-search"></i>
                                    <h4>DivaStays for couples</h4>
                                    
                                </div>
                            </div>
                        </div>
                    </a>
                </div>

                
             
             
	
        </div>
        
    </section>






    
<div class="jumbotron">
  <div class="container text-center">
  <H2 style="color:#000000;">What do you have to do?Pick a house you like</H2>
   <h4 >That’s it. There is no haggling, no awkward questions from landlords, no need to even run around for paperwork</h4>
	 <div class="row">
  			<div class="col-lg-3">
				<div class="wow fadeInLeft" data-wow-delay="0.2s">
                <div class="service-box">
					<div class="search-icon">
						<img src="" alt="" />      <here we can giv the path>
					</div>
					<div class="service-desc">
						<h3>Search</h3>
						<h5>Find a place the fit all your preferences.</h5>
					</div>
                </div>
				</div>
            </div>

        
        
        <div class="col-sm-3">
    		<H3>Visit</H3>
     		 <h5>Find a place the fit all your preferences.</h5>
    	</div>
  		<div class="col-sm-3">
    		<H3>Book</H3>
     		 <h5>Find a place the fit all your preferences.</h5>
    	</div>
        <div class="col-sm-3">
    		<H3>Move-In</H3>
     		 <h5>Let's move to your home enjoy!.</h5>
    	</div>
        
      </div>
	  </div>
</div>
					
				 <!--  from here get in touch -->
    
    
    <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="margin-top-0 wow fadeIn" style="margin-top:10px">Get In Touch</h2>
                    <hr class="primary">
                    <p>We love feedback. Fill out the form below and we'll get back to you as soon as possible.</p>
                </div>
                <div class="col-lg-10 col-lg-offset-1 text-center">
                    <form class="contact-form row" action="sendMail" method="post">
                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Name" onBlur="CheckName();return false;" required>
                            <span id="checkName" class="checkName"></span>
                        </div>
                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control" id="email" name="email" placeholder="Email"  onBlur="CheckEmail();return false;" required="">
                            <span id="checkEmail" class="checkEmail"></span>
                        </div>
                        <div class="col-md-4">
                            <label></label>
                            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Phone" onBlur="CheckPhoneNumber();return false;" required>
                            
                            <span id="checkPhoneNumber" class="checkPhoneNumber"></span>
                        </div>
                        <div class="col-md-12">
                            <label></label>
                            <textarea class="form-control" rows="8" name="message" placeholder="Your message here.." required></textarea>
                        </div>
                        <div class="col-md-3 col-md-offset-4">
                            <label></label>
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" data-toggle="modal" data-target="#alertModal" class="btn btn-info" id="register" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SUBMIT<i class="ion-android-arrow-forward"></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button><br>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </section>
    
  <jsp:include page="footer.jsp"></jsp:include>
  
        
<div class="mod" id="myModal11" style="color: black;">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header" style="background-color: white;">
                <span class="close1">&times;</span>
                <h4 class="modal-title" id="myModalLabel">
                    Login</h4>
            </div>
            <div class="modal-body" style="background-color: white;">
            <h3 style="color: red">Username or Password is incorrect</h3>
                <div class="row">
                    <div class="col-md-6">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#Login" data-toggle="tab">Login</a></li>
                         
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content">
                       
                                <form role="form" class="form-horizontal" method="post" action="login">
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="email" name="email" placeholder="Email" autocomplete="off" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="password" name="password" placeholder="Password" autocomplete="off" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="submit" class="btn btn-primary btn-sm" style="color: black;">
                                            Submit</button>
                                        <a href="javascript:;">Forgot your password?</a>
                                    </div>
                                </div>
                                </form>
                          
                        </div>
                    
                    </div>
                  
                </div>
            </div>
        </div>
    </div>
</div>		
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>	
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/userFormVerify.js"></script>
<script src="js/popup.js"></script>
<script src="js/cbpHorizontalMenu.js" type="text/javascript"></script>

<script>
	$(document).ready(function(){
		var date_input=$('input[name="date"]'); //our date input has the name "date"
		var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
		date_input.datepicker({
			format: 'mm/dd/yyyy',
			container: container,
			todayHighlight: true,
			autoclose: true,
		})
	})
</script>

		<script>
			$(function() {
				cbpHorizontalMenu.init();
			});
		</script>
 <!--  places autocomplete    --> 
<script>
		$(function() {
			$("#address").autocomplete({
				source : function(request, response) {
					$.ajax({
						url : "listAddress",
						data : {
							input : request.term
						},
						success : function(data) {
							response(data);
						}
					});
				}
			});
		});
	</script>
 <!--  popup call from jsp    --> 
<c:if test="${invalid==400}">
   <script type="text/javascript">
    popup();
   </script>
</c:if>	 
</body>
</html>