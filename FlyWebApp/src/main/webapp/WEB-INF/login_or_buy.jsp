<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="data.Fly" %>
<%@ page import="data.Ticket" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Include jQuery -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

    <!-- Include Date Range Picker -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>

	<style>
		   body{ 
		    background: url('img/bc.jpg') no-repeat;
		    height: 100%;
		    background-position: center;
		    background-size: cover;
		   }
	 </style>
</head>
<body>
    <div class="col-md-12 bg">
    <% Fly fly = (Fly)request.getAttribute("fly"); %>
        <h4>Choose an option to buy a ticket from <%= fly.getName_city_from() %>  to  <%= fly.getName_city_where() %>:</h4>
        <div class = "row  justify-content-center">
            <div class="col-lg-5 col-sm-12 col-1">
                <form action="TicketOrderServlet" method="get">
                    <table id ="login-syle" style="width: 50%">
                        <tr>
                            <td>Passport seria: </td>
                            <td><input type="text" name="passport_seria" /></td>
                        </tr>
                        <tr>
                            <td>Passport number: </td>
                            <td><input type="text" name="passport_number" /></td>
                        </tr>
                        <tr>
                            <td>Name: </td>
                            <td><input type="text" name="name" /></td>
                        </tr>
                        <tr>
                            <td>Surname: </td>
                            <td><input type="text" name="surname" /></td>
                        </tr>
                        <tr>
                            <td>Bitrhday date:</td>
                            <td><input id="date" name="bitrhday_date" placeholder="YYYY/MM/DD" type="text" /></td>
        
                                <script type="text/javascript">
                                    $(document).ready(function() {
                                        var date_input = $('input[id="date"]'); //our date input has the name "date"
                                        var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                                        date_input.datepicker({
                                            format: 'yyyy/mm/dd',
                                            container: container,
                                            todayHighlight: true,
                                            autoclose: true,
                                            weekStart: 1
                                        })
                                    })
                                </script>
        
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="btn btn-info">BUY NOW</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>



            <div class="col-lg-5 col-sm-12 col-2">
                <form action="login" method="post" class="">
                    <table id ="login-syle" style="width: 50%">
                        <tr>
                            <td>Login</td>
                            <td><input type="text" name="login" /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="password" /></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button id="singlebutton" name="login_btn" class="btn btn-primary" style="width: 170px;">LOGIN</button>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button id="singlebutton" name="registr_btn" class="btn btn-primary" style="width: 170px;">REGISTRATION</button>
                            </td>
                        </tr>
                    </table>
                </form>                
            </div>
        </div>
    </div>
    
</body>
</html>