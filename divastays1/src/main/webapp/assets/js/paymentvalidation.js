//validate CreditCard 
function creditCard(inputtxt)  
{  
  var americanExpressCredit = /^(?:3[47][0-9]{13})$/;  //start with 37 or 34 and require 15  digits
  var visaCreditCardCredit = /^(?:4[0-9]{12}(?:[0-9]{3})?)$/; //starts with 4 and require 13-16-19 digits
  var masterCardCredit = /^(?:5[1-5][0-9]{14})$/;  //starts with 51, 52, 53, 54, 55 and require 14-16 digits
   var goodColor = "#33CC66";
  var badColor = "#ff6666";
  if(inputtxt.value.match(americanExpressCredit) || inputtxt.value.match(visaCreditCardCredit) || inputtxt.value.match(masterCardCredit) )  
        {   
        
	   inputtxt.style.backgroundColor = goodColor;
        }  
      else  
        { 
		 inputtxt.style.backgroundColor = badColor;
         
        }  
}  
//validate DebitCard 
function debitCard(inputtxt1)  
{  
  var americanExpressDebit = /^(?:3[47][0-9]{13})$/;  //start with 37 or 34 and require 15  digits
  var visaCreditCardDebit = /^(?:4[0-9]{12}(?:[0-9]{3})?)$/; //starts with 4 and require 13-16-19 digits
  var masterCardDebit = /^(?:5[1-5][0-9]{14})$/;  //starts with 51, 52, 53, 54, 55 and require 14-16 digits

   var goodColor = "#33CC66";
  var badColor = "#ff6666  ";
  if(inputtxt1.value.match(americanExpressDebit) || inputtxt1.value.match(visaCreditCardDebit) || inputtxt1.value.match(masterCardDebit)  )  
        {   
        
	   inputtxt1.style.backgroundColor = goodColor;
        }  
      else  
        { 
		 inputtxt1.style.backgroundColor = badColor;
       
        }  
}  
//validate CreditName
function CheckCreditName()   
{  
  var creditName = document.getElementById('creditName');  
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#33CC66";
  var badColor = "#ff6666  ";
if(creditName.value.match(decimal))   
{   
 creditName.style.backgroundColor = goodColor; 
}  
else  
{   
creditName.style.backgroundColor = badColor;
}  
}
//validate DebitName
function CheckDebitName()   
{   
  var debitName = document.getElementById('debitName');
  var decimal=  /^[a-zA-Z ]{2,30}$/;
  var goodColor = "#33CC66";
  var badColor = "#ff6666  ";
if( debitName.value.match(decimal))   
{   
 debitName.style.backgroundColor = goodColor;
}  
else  
{   
debitName.style.backgroundColor = badColor;

}  
}
//validate cvv
function CheckCVV()   
{  
  var cardCVC = document.getElementById('cardCVC');
  var decimal=  /^[0-9]{3,4}$/;
  var goodColor = "#33CC66";
  var badColor = "#ff6666  ";
if(cardCVC.value.match(decimal))   
{   
 cardCVC.style.backgroundColor = goodColor;
}  
else  
{   
cardCVC.style.backgroundColor = badColor;
}  
}
//validate debit card cvv
function CheckDebitCVV()   
{  
  var debitcardCVC = document.getElementById('debitcardCVC');
  var decimal=  /^[0-9]{3,4}$/;
  var goodColor = "#33CC66";
  var badColor = "#ff6666  ";
if(debitcardCVC.value.match(decimal))   
{   
 debitcardCVC.style.backgroundColor = goodColor;
}  
else  
{   
debitcardCVC.style.backgroundColor = badColor;
}  
}

//validate creditSubmit
function CreditSubmit()
{
	var cardNumber= document.getElementById('cardNumber');
	var CreditName = document.getElementById('creditName');
    var decimalCreditName =  /^[a-zA-Z ]{2,30}$/;
    var CardCVC = document.getElementById('cardCVC');
    var decimalCreditCVC=  /^[0-9]{3,4}$/;
	var americanExpressCredit = /^(?:3[47][0-9]{13})$/;  
  var visaCreditCardCredit = /^(?:4[0-9]{12}(?:[0-9]{3})?)$/; 
  var masterCardCredit = /^(?:5[1-5][0-9]{14})$/;  
	
	if((cardNumber.value.match(americanExpressCredit) || cardNumber.value.match(visaCreditCardCredit) || cardNumber.value.match(masterCardCredit)) && CreditName.value.match(decimalCreditName) && CardCVC.value.match(decimalCreditCVC) )
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
//validate  debit Submit
function DebitSubmit()
{
	var debitcardNumber= document.getElementById('debitcardNumber');	
	var DebitName = document.getElementById('debitName');
    var decimalDebitName =  /^[a-zA-Z ]{2,30}$/;	
	var DebitCardCVC = document.getElementById('debitcardCVC');
	var decimalDebitCVC=  /^[0-9]{3,4}$/;
	var americanExpressDebit = /^(?:3[47][0-9]{13})$/;  
  var visaCreditCardDebit = /^(?:4[0-9]{12}(?:[0-9]{3})?)$/; 
  var masterCardDebit = /^(?:5[1-5][0-9]{14})$/;  
 
	
	if((debitcardNumber.value.match(americanExpressDebit) || debitcardNumber.value.match(visaCreditCardDebit) || debitcardNumber.value.match(masterCardDebit) ) && DebitName.value.match(decimalDebitName) && DebitCardCVC.value.match(decimalDebitCVC) )
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
//validate net banking
function NetBanking()
{
	if(document.getElementById('andhraBank').checked || document.getElementById('allahabadBank').checked || document.getElementById('bankofBaroda').checked || document.getElementById('canaraBank').checked || document.getElementById('idbiBank').checked || document.getElementById('iciciBank').checked || document.getElementById('indianOverseasBank').checked || document.getElementById('punjabNationalBank').checked || document.getElementById('southIndianBank').checked || document.getElementById('sbi').checked || document.getElementById('cityUnionBank').checked || document.getElementById('hdfcBank').checked || document.getElementById('indusIndBank').checked || document.getElementById('syndicateBank').checked || document.getElementById('deutscheBank').checked || document.getElementById('corporationBank').checked || document.getElementById('ucoBank').checked || document.getElementById('indianBank').checked || document.getElementById('fedralBank').checked || document.getElementById('ingVysya').checked)
	{
		return true;
	}
	else
	{
		return false;
	}
}
//validate wallets
function Wallet()
{
	if(document.getElementById('paytm').checked || document.getElementById('freecharge').checked)
	{
		return true;
	}
	else
	{
		return false;
	}	
}
	
