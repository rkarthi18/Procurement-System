<%@page import="javax.swing.JDialog"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="POJO_MODEL.Employee"%>
<%@page import="POJO_MODEL.Site"%>
<%@page import="POJO_MODEL.Item"%>
<%@page import="DAO_SERVICE.CRUD.RetreiveDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register a Supplier</title>
<link type="text/css" rel="stylesheet"
	href="resources/css&js&jquery/bootstrap/css/bootstrap.css">
<link type="text/css" rel="stylesheet" href="resources/customized.css">

<%
		ArrayList<Item> itemList = RetreiveDAO.retreiveAllItem();
		ArrayList<Site> siteList = RetreiveDAO.retreiveAllSite();
		Employee employee = (Employee)session.getAttribute("employee");
		
		if(employee == null) {
			JOptionPane pane = new JOptionPane("Session has been closed, Please Login",JOptionPane.OK_OPTION);  
			JDialog dialog = pane.createDialog("Status");  
			dialog.setAlwaysOnTop(true);  
			dialog.show(); 
			
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	%>

<script type="text/javascript">
		  function autoFill() {
			  
			  
		    document.getElementById('companyName').value = "Supplier1";
		    document.getElementById('addressLine1').value = "53/5";
		    document.getElementById('addressLine2').value = "Pieris Lane";
		    document.getElementById('city').value = "Dehiwala";
		    document.getElementById('mobile').value = "0716346044";
		    document.getElementById('email').value = "atheeqrc@gmail";
		    document.getElementById('itemName').value = "Sand";
		    document.getElementById('itemPrice').value = "1200.00";
			    
		  }
		</script>

</head>
<body>

	<nav class="navbar fixed-top navbar-expand-md navbar-dark fixed-stuff">
		<div
			class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2 ">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href=""
					title="Go to Common Homepage">Common Home</a></li>

			</ul>
		</div>
		<div class="mx-auto order-0">
			<a class="navbar-brand mx-auto" href="" title="Go to Common Homepage">Procurement
				System</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target=".dual-collapse2">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item" title="Profile"><span class="nav-link">Hello
						<%=employee.getUsername() %></span></li>
				<li class="nav-item" title="Profile"><a class="nav-link"
					href="ProfileAdmin.jsp"><span class="fa fa-sign-in"></span>
						Profile</a></li>
				<li class="nav-item" title="Logout"><a class="nav-link"
					href="LogoutServlet"><span class="fa fa-sign-in"></span> Logout</a>
				</li>
			</ul>
		</div>
	</nav>

	<header class="page-header" id="header01">
		<div class="header-mid">
			<br>
			<h2 style="color: white; text-decoration: bold; margin-left: 15px">Procurement
				Management System</h2>
		</div>

		<div class="container-fluid" style="margin-top: 10px;">
			<ul class="nav nav-pills  nav-justified nav-header">
				<li class="nav-item" title="Click to See Your Duties"><a
					class="nav-link nav-change" href="Admin_home.jsp" role="button"
					aria-haspopup="true" aria-expanded="false"
					style="border-radius: 15px; text-align: center; background-color: white; color: #111E6C">Policies</a>
				</li>
				<li class="nav-item " title="Click to See Your Duties"><a
					class="nav-link nav-change" href="Admin_register_employee.jsp"
					role="button" aria-haspopup="true" aria-expanded="false"
					style="border-radius: 15px; text-align: center; background-color: white; color: #111E6C">Create
						an employee</a></li>
				<li class="nav-item " title="Click to See Your Duties"><a
					class="nav-link nav-change" href="Admin_register_supplier.jsp"
					role="button" aria-haspopup="true" aria-expanded="false"
					style="border-radius: 15px; text-align: center; background-color: white; color: #111E6C">Create
						a supplier</a></li>
				<li class="nav-item " title="Click to See Your Duties"><a
					class="nav-link nav-change" href="Admin_register_site.jsp"
					role="button" aria-haspopup="true" aria-expanded="false"
					style="border-radius: 15px; text-align: center; background-color: white; color: #111E6C">Create
						a site</a></li>
				<li class="nav-item " title="Click to See Your Duties"><a
					class="nav-link nav-change" href="Admin_register_item.jsp"
					role="button" aria-haspopup="true" aria-expanded="false"
					style="border-radius: 15px; text-align: center; background-color: white; color: #111E6C">Create
						an item</a></li>


			</ul>
		</div>
	</header>

	<!-- Body ---------------------------------------------------------------------------------------------------------------- -->

	<div class="container-fluid"
		style="margin-bottom: 10px; min-height: 510px; overflow: auto">

		<div class="container" style="margin-top: 50px">

			<!-- 
	FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM FORM
 -->
			<form action="AdminCreateSupplier" method="post">
				<div style="float: left; margin-right: 5px;">
					<div
						style="width: 550px; float: left; padding: 5px; border-width: 1px; border-style: solid; border-color: #111E6C; margin-bottom: 5px;">
						<h5>Basic Details</h5>
						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-4 col-form-label" for="EmpForm01BasicDetails02">Company
								Name: *</label>
							<div class="col-8">
								<input type="text" class="form-control" id="companyName"
									required="required" name="companyName">
							</div>
						</div>



					</div>

					<div
						style="width: 550px; padding: 5px; padding: 5px; border-width: 1px; border-style: solid; border-color: #111E6C; clear: both">
						<h5>Contact Details</h5>
						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-4 col-form-label">Street Address:</label>
							<div class="col-8">
								<div class="form-group">
									<label for="EmpForm01ContactDetails01">Line 01: *</label> <input
										type="text" class="form-control" id="addressLine1"
										required="required" placeholder="No 53 " name="addressLine1">
								</div>
								<div class="form-group">
									<label for="EmpForm01ContactDetails02">Line 02: *</label> <input
										type="text" class="form-control" id="addressLine2"
										required="required" placeholder="Street Name"
										name="addressLine2">
								</div>
							</div>
						</div>
						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-2 col-form-label" for="addressLine1">City:
								*</label>
							<div class="col-8">
								<input type="text" class="form-control" id="city"
									required="required" name="city">
							</div>


						</div>


						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-4 col-form-label"
								for="EmpForm01ContactDetails07">Mobile:*</label>
							<div class="col-8">
								<input type="text" class="form-control" required="required"
									id="mobile" name="mobile">
								<!-- pattern="0[0-9]{9}" -->
							</div>
						</div>
						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-4 col-form-label"
								for="EmpForm01ContactDetails08">Company Email: *</label>
							<div class="col-8">
								<input type="email" class="form-control" id="email"
									required="required" name="email">
							</div>
						</div>
					</div>
				</div>

				<div style="float: left;">
					<div
						style="width: 550px; padding: 5px; border-width: 1px; border-style: solid; border-color: #111E6C; margin-bottom: 5px;">
						<h5>Item</h5>
						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-4 col-form-label"
								for="EmpForm01Identification01">Item offered: *</label>

							<div class="col-8">
								<select class="custom-select mr-sm-2" required="required"
									id="itemName" name="itemName">
									<option value="" disabled selected hidden="ture">Choose...</option>
									<%for(Item item :  itemList) {%>
									<option value="<%=item.getItemId()%>"><%=item.getItemName()%></option>
									<%} %>

								</select>
							</div>
						</div>

						<div class="form-group row"
							style="padding: 4px; padding-left: 16px">
							<label class="col-4 col-form-label"
								for="EmpForm01Identification04">Unit Price: *</label>
							<div class="col-8">
								<input type="number" class="form-control" required="required"
									id="itemPrice" name="itemPrice">
							</div>
						</div>
					</div>


					<div
						style="clear: both; float: left; margin-top: 20px; margin-left: 180px">
						<div class="form-group row">
							<div>
								<input type="reset" value="Reset"
									style="background-color: white; border-radius: 10px; color: black; border-color: #111E6C; border-width: 1px; border-style: solid; font-size: 22px; margin-right: 10px; color: #111E6C" />
								<input type="submit" value="Submit"
									style="background-color: white; border-radius: 10px; color: black; border-color: #111E6C; border-width: 1px; border-style: solid; font-size: 22px; margin-right: 20px; color: #111E6C" />
								<button type="button" onClick="autoFill();"
									style="background-color: white; border-radius: 10px; color: black; border-color: #111E6C; border-width: 1px; border-style: solid; font-size: 22px; margin-right: 20px; color: #111E6C">Demo</button>
							</div>
						</div>
					</div>
				</div>

			</form>
		</div>
	</div>

	<footer>
		<div style="color: white; margin-left: 6px;"
			class="footer-copyright text-left py-1 footer_copyright"
			title="Disclaimer">� All Rights Reserved @2019 | CSSE-WE-01 |
			Privacy Policy.</div>
	</footer>



	<!-- Footer -->
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="resources/css&js&jquery/jquery-3.3.1.slim.min.js"></script>
	<script src="resources/css&js&jquery/popper.min.js"></script>
	<script src="resources/css&js&jquery/bootstrap.min.js"></script>
</body>
</html>