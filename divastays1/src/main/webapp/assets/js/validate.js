//validate name
function CheckName()   
{  
  var name = document.getElementById('name');
var decimal=  /^[a-zA-Z ]{2,30}$/;
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(name.value.match(decimal))   
{   
	name.style.backgroundColor = goodColor;
}  
else  
{   
	name.style.backgroundColor = badColor;
}  
}

//validate email
function CheckEmail()   
{  
  var email = document.getElementById('email');
var decimal=  /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(email.value.match(decimal))   
{   
	email.style.backgroundColor = goodColor;
}  
else  
{   
	email.style.backgroundColor = badColor;
}  
}  

//validate Mobile
function CheckPhone()   
{  
  var phone = document.getElementById('phone');
var decimal=  /^\d{4}\d{4}\d{2}$/g;

 var goodColor = "#66cc66";
    var badColor = "#ff6666";
if(phone.value.match(decimal))   
{   
	phone.style.backgroundColor = goodColor;
      
}  
else  
{   
	phone.style.backgroundColor = badColor;
  
}  
}  


//validate visit now
function submitVisit()
{
	var name = document.getElementById('name');
    var decimalName=  /^[a-zA-Z ]{2,30}$/;
	 var email = document.getElementById('email');
     var decimalMail=  /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	 var phone = document.getElementById('phone');
     var decimalPhone=  /^\d{4}\d{4}\d{2}$/g;

	if(name.value.match(decimalName) && email.value.match(decimalMail) && phone.value.match(decimalPhone))
	{
		document.write("Success");
	}
	else
	{
		document.write("Fail");
	}	
}

