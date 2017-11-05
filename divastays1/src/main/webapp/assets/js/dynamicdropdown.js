//city
function dynamicdropdown(listindex)
{
  document.getElementById("subcategory").length = 0;
   document.getElementById("subcategory1").length = 0;
    document.getElementById("subcategory2").length = 0;
  
   
if((/pune/.test(listindex))||(/Pune/.test(listindex)))
	{
						document.getElementById("subcategory").options[0]=new Option("Please select area","");
                        document.getElementById("subcategory").options[1]=new Option("Pimpari","Pimpari");
                        document.getElementById("subcategory").options[2]=new Option("Akurdi","Akurdi");
                        document.getElementById("subcategory").options[3]=new Option("Baner","Baner");
                        document.getElementById("subcategory").options[4]=new Option("Pune Station","Pune Station");
                       	document.getElementById("subcategory").options[5]=new Option("Hadapsar","Hadapsar");
						document.getElementById("subcategory").options[6]=new Option("Aundh","Aundh");
						document.getElementById("subcategory").options[7]=new Option("Katarj","Katraj");
						
                        document.getElementById("subcategory1").options[0]=new Option("Maharashtra","Maharashtra");
						  document.getElementById("subcategory2").options[0]=new Option("India","India");
						
				}
				else if((/kolhapur/.test(listindex))||(/Kolhapur/.test(listindex)))
				{
						document.getElementById("subcategory").options[0]=new Option("Please select area","");
                        document.getElementById("subcategory").options[1]=new Option("Shahupari","Shahupuri");
                        document.getElementById("subcategory").options[2]=new Option("LaxmiPuri","LaxmiPuri");
                        document.getElementById("subcategory").options[3]=new Option("Rajarampuri","Rajarampuri");
                        document.getElementById("subcategory").options[4]=new Option("Vidyanager","Vidyanager");
                       	document.getElementById("subcategory").options[5]=new Option("Shivaji Peth","Shivaji Peth");
						document.getElementById("subcategory1").options[0]=new Option("Maharashtra","Maharashtra");
						  document.getElementById("subcategory2").options[0]=new Option("India","India");
				}
				else if((/mumbai/.test(listindex))||(/Mumbai/.test(listindex)))
				{
						document.getElementById("subcategory").options[0]=new Option("Please select area","");
                        document.getElementById("subcategory").options[1]=new Option("Bandra","Bandra");
                        document.getElementById("subcategory").options[2]=new Option("Nerul","Nerul");
                        document.getElementById("subcategory").options[3]=new Option("Vashi","Vashi");
                        document.getElementById("subcategory").options[4]=new Option("Kandivali","Kandivali");
                       	document.getElementById("subcategory").options[5]=new Option("Mulund","Mulund");
						 document.getElementById("subcategory1").options[0]=new Option("Maharashtra","Maharashtra");
						   document.getElementById("subcategory2").options[0]=new Option("India","India");
				}
				else if((/Nagpur/.test(listindex))||(/nagpur/.test(listindex)))
				{
						document.getElementById("subcategory").options[0]=new Option("Please select area","");
                        document.getElementById("subcategory").options[1]=new Option("Gandhibagh","Gandhibagh");
                        document.getElementById("subcategory").options[2]=new Option("Nandanvan","Nandanvan");
                        document.getElementById("subcategory").options[3]=new Option("Lakadganj","Lakadganj");
                        document.getElementById("subcategory").options[4]=new Option("Pardi","Pardi");
                       	document.getElementById("subcategory").options[5]=new Option("Giripeth","Giripeth");
						 document.getElementById("subcategory1").options[0]=new Option("Maharashtra","Maharashtra");
						   document.getElementById("subcategory2").options[0]=new Option("India","India");
				}
				
				        
            return true;
            }





