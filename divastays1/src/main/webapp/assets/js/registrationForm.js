// JavaScript Document
//validate name-contain more than one characters only
function CheckName()   
{  
  var firstName = document.getElementById('firstName');
  var decimal=  /^[a-zA-Z ]{3,30}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C  ";
if(firstName.value.match(decimal))   
{   
 firstName.style.backgroundColor = goodColor;
}  
else  
{   
firstName.style.backgroundColor = badColor;
}  
}

//validate last name-contain more than one characters only
function CheckLastName()   
{  
  var lastName = document.getElementById('lastName');
  var decimal=  /^[a-zA-Z ]{3,30}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C  ";
if(lastName.value.match(decimal))   
{   
 lastName.style.backgroundColor = goodColor;
}  
else  
{   
lastName.style.backgroundColor = badColor;
}  
}

//validate Mobile-only 10 digits
function CheckPhoneNumber()   
{  
  var phoneNumber = document.getElementById('contact');
  var decimal=  /^\d{4}\d{4}\d{2}$/g;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(phoneNumber.value.match(decimal))   
{   
 phoneNumber.style.backgroundColor = goodColor;
}  
else  
{   
phoneNumber.style.backgroundColor = badColor;
}  
}  

//validate email-contain characters,symbols and numbers & must match email format
function CheckEmail()   
{  
  var email = document.getElementById('email');
  var decimal =  /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(email.value.match(decimal))   
{   
 email.style.backgroundColor = goodColor;
}  
else  
{   
email.style.backgroundColor = badColor;
}  
}  

//validate password-Must start with a capital letter,minimum 8 character including symbols and numbers.
function CheckPassword()   
{  
  var pass1 = document.getElementById('password1');
  var decimal= /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[^\w\s]).{8,}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(pass1.value.match(decimal))   
{   
 pass1.style.backgroundColor = goodColor;
}  
else  
{   
pass1.style.backgroundColor = badColor;
}  
}  
//confirm password-Must start with a capital letter,minimum 8 character including symbols and numbers.
function CheckPass()
{
    
    var pass1 = document.getElementById('password1');
    var pass2 = document.getElementById('password2');
    var goodColor = "#82E0AA";
    var badColor = "#E74C3C";
    //Compare the values in the password field 
    //and the confirmation field
    if(pass1.value == pass2.value){
        //The passwords match. 
        //Set the color to the good color and inform
        //the user that they have entered the correct password 
        pass2.style.backgroundColor = goodColor;
      
    }else{
        //The passwords do not match.
        //Set the color to the bad color and
        //notify the user.
        pass2.style.backgroundColor = badColor;
      }
}  
//validate aadhar-contains 12 digits
function CheckAadhar()   
{  
  var aadhar = document.getElementById('aadharNumber');
  var decimal=  /^\d{4}\d{4}\d{4}$/g;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(aadhar.value.match(decimal))   
{   
 aadhar.style.backgroundColor = goodColor;
}  
else  
{   
aadhar.style.backgroundColor = badColor;
}  
}  
//validate tenancy
function CheckTenancy()   
{  
  var tenancy = document.getElementById('tenancyType');
  var decimal= /.*\S.*/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(tenancy.value.match(decimal))   
{   
tenancy.style.backgroundColor = goodColor;
}  
else  
{   
tenancy.style.backgroundColor = badColor;
}  
}

//validate floor-start with 0 considering ground floor and allows 2 digits only
function CheckFloor()   
{  
  var floor1 = document.getElementById('floorNumber');
  var decimal = /^[0-9]{1,2}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(floor1.value.match(decimal))   
{   
 floor1.style.backgroundColor = goodColor;
}  
else  
{   
floor1.style.backgroundColor = badColor;
}  
}  
//validate No of Room-start with 1 only two digits
function CheckRoom()   
{  
  var room = document.getElementById('room');
  var decimal = /^[0-9]{1,2}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(room .value.match(decimal))   
{   
 room.style.backgroundColor = goodColor;
}  
else  
{   
 room.style.backgroundColor = badColor;
}  
}  
//validate food preference
function CheckFoodPreference()   
{  
  var food = document.getElementById('foodPreference');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
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
//validate rent-contain only 4-5 digits
function CheckRent()   
{  
  var rent = document.getElementById('rent');
  var decimal= /^[0-9]{4,5}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(rent.value.match(decimal))   
{   
 rent.style.backgroundColor = goodColor;
}  
else  
{   
rent.style.backgroundColor = badColor;
}  
}  

//validate Deposit-contain only 4-5 digits
function CheckDeposit()   
{  
  var deposit = document.getElementById('deposit');
  var decimal= /^[0-9]{4,5}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(deposit.value.match(decimal))   
{   
 deposit.style.backgroundColor = goodColor;
}  
else  
{   
deposit.style.backgroundColor = badColor;
}  
}  

//validate Area-contain only 4-5 digits
function CheckArea()   
{  
  var area = document.getElementById('area');
  var decimal= /^[0-9]{3,5}(\.\d{2})?$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(area.value.match(decimal))   
{   
 area.style.backgroundColor = goodColor;
}  
else  
{   
area.style.backgroundColor = badColor;
}  
}  

//validate Address-contains symbols,characters and numbers
function CheckAddress()   
{  
  var address = document.getElementById('address');
  var decimal= /.*\S.*/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(address.value.match(decimal))   
{   
 address.style.backgroundColor = goodColor;
}  
else  
{   
address.style.backgroundColor = badColor;
}  
}  

//validate feedback message-contains character,symbols and numbers
function CheckMessage()   
{  
  var message = document.getElementById('message');
  var decimal= /.*\S.*/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(message.value.match(decimal))   
{   
	message.style.backgroundColor = goodColor;
}  
else  
{   
	message.style.backgroundColor = badColor;
}  
}  

//validate pincode-six digits only
function CheckPincode()   
{  
  var pincode = document.getElementById('pincode');
  var decimal=  /^\d{2}\d{2}\d{2}$/g;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(pincode.value.match(decimal))   
{   
 pincode.style.backgroundColor = goodColor;
}  
else  
{   
pincode.style.backgroundColor = badColor;
}  
}  

//validate country
function CheckCountry()   
{  
  var country = document.getElementById('country');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(country.value.match(decimal))   
{   
 country.style.backgroundColor = goodColor;
}  
else  
{   
country.style.backgroundColor = badColor;
}  
}

//validate motherTounge
function CheckMotherTounge()   
{  
  var motherTounge = document.getElementById('motherTounge');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(motherTounge.value.match(decimal))   
{   
 motherTounge.style.backgroundColor = goodColor;
}  
else  
{   
motherTounge.style.backgroundColor = badColor;
}  
}

//validate profession
function CheckProfession()   
{  
  var profession = document.getElementById('profession');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(profession.value.match(decimal))   
{   
profession.style.backgroundColor = goodColor;
}  
else  
{   
profession.style.backgroundColor = badColor;
}  
}


//validate city
function CheckCity()   
{  
  var city = document.getElementById('city');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(city.value.match(decimal))   
{   
 city.style.backgroundColor = goodColor;
}  
else  
{   
city.style.backgroundColor = badColor;
}  
}

//validate state
function CheckState()   
{  
  var state = document.getElementById('state');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#66cc66";
  var badColor = "#ff6666";
if(state.value.match(decimal))   
{   
 state.style.backgroundColor = goodColor;
}  
else  
{   
state.style.backgroundColor = badColor;
}  
}
//House Form-contains digits and character
function CheckHouseName()
{
  var houseName = document.getElementById('houseName');
  var decimal = /.*\S.*/;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(houseName .value.match(decimal))   
{   
 houseName.style.backgroundColor = goodColor;
}  
else  
{   
 houseName.style.backgroundColor = badColor;
}  
}
//House Form
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
//House Form
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
//House Form
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
//Upload User Photo 
function CheckUserImg()   
{  
  var userImg = document.getElementById('userImg');
  var decimal = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpeg|.jpg|.gif)$/;
    var UserImgSize =userImg.files[0].size;
  var goodColor = "#82E0AA";
  var badColor = "#E74C3C";
if(userImg .value.match(decimal) && UserImgSize < 1048576)   
{   
	userImg.style.backgroundColor = goodColor;
}  
else  
{   
	userImg.style.backgroundColor = badColor;
}  
}  
//Validate Submit
function Submit()
{
	 var firstName = document.getElementById('firstName').value;
	 var decimalname =  /^[a-zA-Z ]{2,30}$/;
	 var lastName = document.getElementById('lastName').value;
	 var decimallname =  /^[a-zA-Z ]{2,30}$/;
	 var contact = document.getElementById('contact').value;
	 var decimalContact = /^\d{4}\d{4}\d{2}$/g;
	 var email = document.getElementById('email').value;
	 var decimalmail= /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	 var aadharNumber = document.getElementById('aadharNumber').value;
	 var decimalAadhar =  /^\d{4}\d{4}\d{4}$/g;
	 var Pass1 = document.getElementById('password1').value;
     var Pass2 = document.getElementById('password2').value;
	
	
    if (firstName !== null && lastName !== null && contact !== null && email !== null && aadharNumber !== null && Pass1 !== null  && Pass2 !== null)
	{
		if (firstName.match(decimalname) && lastName.match(decimallname) && contact.match(decimalContact) && email.match(decimalmail) && aadharNumber.match(decimalAadhar) && Pass1.value == Pass2.value)
		{
			return true;
		}
		else
		{
			return false;
		}
}
}

//validate HouseSubmit
function HouseSubmit()
{
	 var Floor = document.getElementById('floorNumber').value;
     var decimalFloor = /^[0-9]{1,2}$/;
	 var Room = document.getElementById('room').value;
     var decimalRoom = /^[0-9]{1,2}$/;
	 var Rent = document.getElementById('rent').value;
     var decimalRent = /^[0-9]{4,5}$/;
	 var Deposit = document.getElementById('deposit').value;
     var decimalDeposit = /^[0-9]{4,5}$/;
	 var Area = document.getElementById('area').value;
     var decimalArea = /^[1-9]{3,5}(\.\d{2})?$/;
	 var Address = document.getElementById('address').value;
     var decimalAddress = /.*\S.*/;
	 var aadhar1 = document.getElementById('aadharNumber').value;
     var decimalaadhar1 =  /^\d{4}\d{4}\d{4}$/g;	 
	 var img1 = document.getElementById('img1').value;
	 var img2 = document.getElementById('img2').value;
	 var img3 = document.getElementById('img3').value;
     var decimalImage = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpg|.gif)$/; 
	 var houseName = document.getElementById('houseName').value;
     var decimalHouseName = /.*\S.*/; 
     var pincode = document.getElementById('pincode').value;
     var decimalpincode = /^\d{2}\d{2}\d{2}$/g; 
    //images size validation
      var imgSize1= document.getElementById("img1");
 	  var imgSize2= document.getElementById("img2");
 	  var imgSize3= document.getElementById("img3");
 	  var fileSize1 =imgSize1.files[0].size;
 	  var fileSize2 =imgSize2.files[0].size;
 	  var fileSize3 =imgSize3.files[0].size;		 
	 if (aadhar1 !== null && Floor !== null && Room !== null && Rent !== null && Deposit !== null && Area !== null && Address !== null && img1 !== null && img2 !== null && img3 !== null && houseName !== null && pincode !== null)
	{
		if (aadhar1.match(decimalaadhar1) && pincode.match(decimalpincode) && Floor.match(decimalFloor) && Room.match(decimalRoom) && Rent.match(decimalRent) && Deposit.match(decimalDeposit) && Area.match(decimalArea) && Address.match(decimalAddress) && img1.match(decimalImage) && img2.match(decimalImage) && img3.match(decimalImage) && houseName.match(decimalHouseName) && fileSize1 <= 1048576 && fileSize2 <= 1048576 && fileSize3 <= 1048576 )
		{
			return true;
		}
		else
		{
			return false;
		}
    }
	 
}
//Validate UserSubmit
function UserSubmit()
{
	 var FirstName = document.getElementById('firstName').value;
	 var decimalFirstName =  /^[a-zA-Z ]{2,30}$/;
	 var LastName = document.getElementById('lastName').value;
	 var decimalLastName =  /^[a-zA-Z ]{2,30}$/;
	 var Contact = document.getElementById('contact').value;
	 var decimalContactNumber = /^\d{4}\d{4}\d{2}$/g;
	 var Email = document.getElementById('email').value;
	 var decimalEmail= /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	 var AadharNumber = document.getElementById('aadharNumber').value;
	 var decimalAadharNumber =  /^\d{4}\d{4}\d{4}$/g;
	 var Pincode = document.getElementById('pincode');
     var decimalPincode =  /^\d{2}\d{2}\d{2}$/g;
	 var Address1 = document.getElementById('address');
     var decimalAddress1 = /.*\S.*/;	 
	 var Password1 = document.getElementById('password1').value;
     var Password2 = document.getElementById('password2').value;
     var userImg = document.getElementById('userImg').value;
     var decimalUserImage = /([a-zA-Z0-9\s_\\.\-:])+(.png|.jpg|.gif)$/;
     var UserImgSize1= document.getElementById("userImg");
     var UserImgSize =UserImgSize1.files[0].size;    
    if (FirstName !== null && LastName !== null && Contact !== null && Email !== null && AadharNumber !== null && Pincode !== null && Address1 !== null && Password1 !== null && Password2 !== null && userImg !== null)
	{
		
    	if (FirstName.match(decimalFirstName) && LastName.match(decimalLastName) && Contact.match(decimalContactNumber) && Email.match(decimalEmail) && AadharNumber.match(decimalAadharNumber) && Pincode.match(decimalPincode) && Address1.match(decimalAddress1) && Password1.value == Password2.value && userImg.match(decimalUserImage) && UserImgSize <= 1048576)
		{
    		return true;
		
		}
		else
		{
			
			return false;
		}
}
}
//submit feedback validation
function submitFeedback()
{
	 var firstName = document.getElementById('firstName').value;
	 var decimalname =  /^[a-zA-Z ]{2,30}$/;
	 var contact = document.getElementById('contact').value;
	 var decimalContact = /^\d{4}\d{4}\d{2}$/g;
	 var email = document.getElementById('email').value;
	 var decimalmail= /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	 var message = document.getElementById('message').value;
     var decimalmessage = /.*\S.*/;
	
	
    if (firstName !== null && contact !== null && email !== null && message !== null)
	{
		if (firstName.match(decimalname) && contact.match(decimalContact) && email.match(decimalmail) && message.match(decimalmessage) )
		{
			return true;
		}
		else
		{
			return false;
		}
}
}

