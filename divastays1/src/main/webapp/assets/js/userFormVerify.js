//confirm password
function checkPass()
{
    //Store the password field objects into variables ...
    var pass1 = document.getElementById('pass1');
    var pass2 = document.getElementById('pass2');
    //Store the Confimation Message Object ...
    var message = document.getElementById('confirmMessage');
    //Set the colors we will be using ...
    var goodColor = "#66cc66";
    var badColor = "#ff6666";
    //Compare the values in the password field 
    //and the confirmation field
    if(pass1.value == pass2.value){
        //The passwords match. 
        //Set the color to the good color and inform
        //the user that they have entered the correct password 
        pass2.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Passwords Match!"
    }else{
        //The passwords do not match.
        //Set the color to the bad color and
        //notify the user.
        pass2.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Passwords Do Not Match!"
    }
}  

//validate password
function CheckPassword()   
{  
  var pass1 = document.getElementById('pass1');
var decimal= /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[^\w\s]).{8,}$/;
var message = document.getElementById('checkMessage');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(pass1.value.match(decimal))   
{   
 pass1.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Passwords Ok!" 
}  
else  
{   
pass1.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid password"
}  
}  

//validate aadhar
function CheckAadhar()   
{  
  var aadhar = document.getElementById('aadhar');
var decimal=  /^\d{4}\d{4}\d{4}$/g;
var message = document.getElementById('checkAadhar');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(aadhar.value.match(decimal))   
{   
 aadhar.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Aadhar Number Ok!" 
}  
else  
{   
aadhar.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid Aadhar Number"
}  
}  

//validate pincode
function CheckPincode()   
{  
  var pincode = document.getElementById('pincode');
var decimal=  /^\d{2}\d{2}\d{2}$/g;
var message = document.getElementById('checkPincode');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(pincode.value.match(decimal))   
{   
 pincode.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Pincode Ok!" 
}  
else  
{   
pincode.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid Pincode"
}  
}  

//validate name
function CheckName()   
{  
  var firstName = document.getElementById('firstName');
var decimal=  /^[a-zA-Z ]{2,30}$/;
var message = document.getElementById('checkName');
 var goodColor = "#66cc66";
    var badColor = "#ff4d4d";
if(firstName.value.match(decimal))   
{   
 firstName.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your first Name is Ok!" 
}  
else  
{   
firstName.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid Name"
}  
}

//validate midddleName
function CheckMiddleName()   
{  
  var middleName = document.getElementById('middleName');
var decimal=  /^[a-zA-Z ]{2,30}$/;
var message = document.getElementById('checkMiddleName');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(middleName.value.match(decimal))   
{   
 middleName.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your Middle Name is Ok!" 
}  
else  
{   
middleName.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid Name"
}  
}


//validate last name
function CheckLastName()   
{  
  var lastName = document.getElementById('lastName');
var decimal=  /^[a-zA-Z ]{2,30}$/;
var message = document.getElementById('checkLastName');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(lastName.value.match(decimal))   
{   
 lastName.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your Last Name is Ok!" 
}  
else  
{   
lastName.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid Name"
}  
}


//validate Mobile
function CheckPhoneNumber()   
{  
  var phoneNumber = document.getElementById('phoneNumber');
var decimal=  /^\d{4}\d{4}\d{2}$/g;
var message = document.getElementById('checkPhoneNumber');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(phoneNumber.value.match(decimal))   
{   
 phoneNumber.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Contact number is Ok!" 
}  
else  
{   
phoneNumber.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid contact number"
}  
}  

//validate email
function CheckEmail()   
{  
  var email = document.getElementById('email');
var decimal=  /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
var message = document.getElementById('checkEmail');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(email.value.match(decimal))   
{   
 email.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your Email is Ok!" 
}  
else  
{   
email.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid Email"
}  
}  


//validate name
function CheckCity()   
{  
  var city = document.getElementById('city');
var decimal=  /^[a-zA-Z ]{2,30}$/;
var message = document.getElementById('checkCity');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(city.value.match(decimal))   
{   
 city.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your city Name is Ok!" 
}  
else  
{   
city.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid  city Name"
}  
}

//validate state
function CheckState()   
{  
  var state = document.getElementById('state');
var decimal=  /^[a-zA-Z ]{2,30}$/;
var message = document.getElementById('checkState');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(state.value.match(decimal))   
{   
 state.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your State Name is Ok!" 
}  
else  
{   
state.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid  State Name"
}  
}


//validate Street1
function CheckStreet1()   
{  
  var street1 = document.getElementById('street1');
var decimal= /.*\S.*/;
var message = document.getElementById('checkStreet1');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(street1.value.match(decimal))   
{   
 street1.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your Street location is Ok!" 
}  
else  
{   
street1.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid  Street location"
}  
}

//validate Street2
function CheckStreet2()   
{  
  var street1 = document.getElementById('street2');
var decimal= /.*\S.*/;
var message = document.getElementById('checkStreet2');
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(street2.value.match(decimal))   
{   
 street2.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Your Street location is Ok!" 
}  
else  
{   
street2.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Please enter valid  Street location"
}  
}

function validateMessage() {
  var message = document.getElementById('contact-message').value;
  var required = 30;
  var left = required - message.length;

  if (left > 0) {
    producePrompt(left + ' more characters required','message-error','red');
    return false;
  }

  producePrompt('Valid', 'message-error', 'green');
  return true;

}

(function() {
    $('contact_form > input').keyup(function() {

        var empty = false;
        $('contact_form > input').each(function() {
            if ($(this).val() == '') {
                empty = true;
            }
        });

        if (empty) {
            $('#register').attr('disabled', 'disabled'); // updated according to http://stackoverflow.com/questions/7637790/how-to-remove-disabled-attribute-with-jquery-ie
        } else {
            $('#register').removeAttr('disabled'); // updated according to http://stackoverflow.com/questions/7637790/how-to-remove-disabled-attribute-with-jquery-ie
        }
    });
})()