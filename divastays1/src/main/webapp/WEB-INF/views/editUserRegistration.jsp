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
	<link rel="stylesheet" href="css/registrationForm.css">
	  <link href="css/bootstrap.min.css" rel="stylesheet">  
<link href="css/header.css" rel="stylesheet"/>
</head>
<body style="background-image:url(images/formBackground.jpg)">
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
       
         <li><a href="showHelp" ><b style="color:#000000;">Help</b></a></li> 	
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
   <div class="main-content">
		<form class="form-basic" method="post" action="saveEditedUser" onSubmit="return UserSubmit()" enctype="multipart/form-data" style="background-color: rgb(243,210,230);">

            <div class="form-title-row">
                <h1>User Registration Form</h1>
            </div>

            <div class="form-row" style="float:left; width:50%;">
                <label>
                    <span>First name</span>
                    <input type="text" name="firstName" id="firstName"  onBlur="CheckName(); return false;" autocomplete="off" value="${user.firstName}">
                </label>
                <label>
                    <span>Contact No.</span>
                    <input type="text" name="contactNumber" id="contact" placeholder="Contact Number" onBlur="checkContactNumber();CheckPhoneNumber(); return false;" autocomplete="off" value="${user.contactNumber}">
                </label>
                <label>
                    <span>Aadhar Number</span>
                    <input type="text" name="aadharNumber" id="aadharNumber" placeholder="Aadhar Number" onBlur="checkAadharNumber();CheckAadhar(); return false;" autocomplete="off" value="${user.aadharNumber}">
                </label>
                  <label>
                    <span>Mother Tounge</span>
                    <select name="motherTounge" id="motherTounge" class="form-control selectpicker" required>
                          <option value="${user.motherTongue}">${user.motherTongue}</option>
                        <option value="hindi">Hindi</option>
                        <option value="marathi">मराठी</option>
                        <option value="english">English</option>
                        <option value="bengali">বাংলা</option>
                         <option value="telugu">తెలుగు</option>
                          <option value="tamil">தமிழ்</option>
                         <option value="urdu">اُردُو</option>
                          <option value="kannada">ಕನ್ನಡ</option>
                           <option value="gujrati">ગુજરાતી</option>
                            <option value="oriya">ଓଡ଼ିଆ</option>
                             <option value="malyalam">മലയാളം</option>
                              <option value="sanskrit">संस्कृतम्</option>
                        
                     </select>
                </label>
                <label>
                    <span>Address</span>
                    <textarea name="address" id="address" placeholder="Address"  onBlur=" CheckAddress(); return false;" autocomplete="off" >${user.address}</textarea>
                </label>            
              
                  <label>
                    <span>Pincode</span>
                    <input type="text" name="pincode" id="pincode" placeholder="Pincode" onBlur="CheckPincode(); return false;" autocomplete="off" value="${user.pincode}">
                </label>
                 <label>
                    <span>State</span> 
                  <script type="text/javascript" language="JavaScript">
                document.write('<select name="subcategory1" id="subcategory1" class="form-control" ><option value="${user.state}">${user.state}</option></select>')
            </script>
                </label>
              
                <label>
                    <span>Password</span>
                    <input type="Password" name="password1" id="password1" placeholder="Password" onBlur="CheckPassword(); return false;" autocomplete="off" value="${user.password}">
                </label>
                <label>
                   <span></span>
                   <img src="<ui:image img='${user.userImg}'></ui:image>" alt="..." style="height:90px" />
                 <input type="file"  name="userImg" id="userImg" onBlur="CheckUserImg(); return false;">
               
                </label>        
             </div>

            <div class="form-row" style="float:left; width:50%;">
                <label>
                    <span>Last name</span>
                    <input type="text" name="lastName" id="lastName" placeholder="Last Name" onBlur="CheckLastName(); return false;" autocomplete="off" value="${user.lastName}">
                </label>
                 <label>
                    <span>Email</span>
                    <input type="email" name="email" id="email" placeholder="Email" onBlur="checEmail();CheckEmail(); return false;" autocomplete="off" value="${user.email}">
                </label>
             
                 <label>
                    <span>Food Preference</span>
                    <select name="foodPreference" id="foodPreference" class="form-control selectpicker" required>
                        <option value="${user.foodPreference}">${user.foodPreference}</option>
                        <option value="veg">Veg</option>
                        <option value="non-veg">Non-Veg</option>
                        <option value="both">Both</option>
                     </select>
                </label>
                   <label>
                    <span>Profession</span>
                    <select name="profession" id="profession" class="form-control selectpicker" required>
                        <option value="${user.profession}">${user.profession}</option>
                        <option value="student">Student</option>
                        <option value="employee">Employee</option>
                     </select>
                </label>
                <label>
                    <span>City</span>
                 <select name="city" id="city" class="form-control selectpicker" onChange="dynamicdropdown(this.value);" required>
                        <option value="${user.city}">${user.city}</option>
                        <option value="pune">Pune</option>
                        <option value="mumbai">Mumbai</option>
                         <option value="nagpur">Nagpur</option>
                        <option value="kolhapur">Kolhapur</option>
                        </select>
                </label>
                <br>
                <br>
                
               <label>
                 <span>Area</span>
                   <script type="text/javascript" language="JavaScript">
                document.write('<select name="subcategory" id="subcategory" class="form-control" ><option value="${user.area}">${user.area}</option></select>')
            </script>
                </label>
             <label>
             <span>Country</span>
                 <script type="text/javascript" language="JavaScript">
                document.write('<select name="subcategory2" id="subcategory2" class="form-control" ><option value="${user.country}">${user.country}</option></select>')
            </script>
                </label>
             
                <label>
                    <span>Confirm Password</span>
                    <input type="password" name="password2" id="password2" placeholder="Confirm Password" onBlur="CheckPass(); return false;" autocomplete="off" required>
                </label>
                 <input type="hidden" name="uId" id="uId" value="${user.uId}">
                             </div>
            <div class="form-row" style="width:50%;">
               <button type="submit" value="Submit">Submit</button>   
            </div>				
        </form>
        <script>document.userImg.submit();</script>
    </div>
    <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script type="text/javascript">
    function checEmail()
    {
    	 var email=document.getElementById( "email" ).value;
    	 $.ajax({
    			url:"checkUserMail",
    			data:{email:$("#email").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#email").val("");
    					$("#email").focus();
    				}
    			}
    			
    		});
    }
    </script>
    <script>
    function checkContactNumber()
    {
    	 var contact=document.getElementById( "contact" ).value;
    	 $.ajax({
    			url:"checkContactNumber",
    			data:{contactNumber:$("#contact").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#contact").val("");
    					$("#contact").focus();
    				}
    			}
    			
    		});
    }
    
    </script>
    
    <script>
    function checkAadharNumber()
    {
    	 var aadharNumber=document.getElementById( "aadharNumber" ).value;
    	 $.ajax({
    			url:"checkAadharNumber",
    			data:{aadharNumber:$("#aadharNumber").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#aadharNumber").val("");
    					$("#aadharNumber").focus();
    				}
    			}
    			
    		});
    }
    
    </script>
    
    
<script src="js/registrationForm.js" type="text/javascript"></script>  
 <script src="js/dynamicdropdown.js" type="text/javascript"></script>

</body>
</html>