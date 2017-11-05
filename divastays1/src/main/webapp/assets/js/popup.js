
	 <!-- user email expire popup function-->
	
		function emailExpirePopup1() {
			var modal = document.getElementById('userEmailExpire');
			modal.style.display = "block";
			var span = document.getElementsByClassName("close1")[0];
			span.onclick = function() {
				modal.style.display = "none";
			}
		}
	
<!--end user email expire popup code --> 
	<!-- owner email expire popup function-->

		function ownerEmailExpirePopup1() {
			var modal = document.getElementById('ownerEmailExpire');
			modal.style.display = "block";
			var span = document.getElementsByClassName("close2")[0];
			span.onclick = function() {
				modal.style.display = "none";
			}
		}

 <!--end owner email expire popup code --> 
 <!--User Login popup function-->

		function popup() {
			var modal = document.getElementById('myModal11');
			modal.style.display = "block";
			var span = document.getElementsByClassName("close3")[0];
			span.onclick = function() {
				modal.style.display = "none";
			}
		}
