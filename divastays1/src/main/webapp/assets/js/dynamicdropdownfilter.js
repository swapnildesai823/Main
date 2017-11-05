          function dynamicdropdown(listindex)
            {
                document.getElementById("subcategory").length = 0;
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
						document.getElementById("subcategory").options[8]=new Option("pune","pune");
				}
				else if((/Kolhapur/.test(listindex))||(/kolhapur/.test(listindex)))
				{
						document.getElementById("subcategory").options[0]=new Option("Please select area","");
                        document.getElementById("subcategory").options[1]=new Option("Shahupari","Shahupuri");
                        document.getElementById("subcategory").options[2]=new Option("LaxmiPuri","LaxmiPuri");
                        document.getElementById("subcategory").options[3]=new Option("Rajarampuri","Rajarampuri");
                        document.getElementById("subcategory").options[4]=new Option("Vidyanager","Vidyanager");
                       	document.getElementById("subcategory").options[5]=new Option("Shivaji Peth","Shivaji Peth");
                       	document.getElementById("subcategory").options[6]=new Option("Kolhapur","Kolhapur");
				}
				else if((/mumbai/.test(listindex))||(/Mumbai/.test(listindex)))
				{
						document.getElementById("subcategory").options[0]=new Option("Please select area","");
                        document.getElementById("subcategory").options[1]=new Option("Shahupari","Shahupuri");
                        document.getElementById("subcategory").options[2]=new Option("LaxmiPuri","LaxmiPuri");
                        document.getElementById("subcategory").options[3]=new Option("Rajarampuri","Rajarampuri");
                        document.getElementById("subcategory").options[4]=new Option("Vidyanager","Vidyanager");
                       	document.getElementById("subcategory").options[5]=new Option("Shivaji Peth","Shivaji Peth");
				}
				
				
                return true;
            }