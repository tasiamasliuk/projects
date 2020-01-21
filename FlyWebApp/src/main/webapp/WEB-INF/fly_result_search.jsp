
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="data.Fly" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<script src="js/script.js"></script>

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
    <div class = "container bg">
        <div class = "row searchrow">
            <div class = "col-lm-12">
                <form action="Login_passenger" method="get" class="form-container searchform row justify-content-center">
                    <table class="table table-bordered">
                        <tr>
                            <th>Date</th>
                            <th>Time</th>
                            <th>From</th>
                            <th>Where</th>
                            <th>Cost</th>
                            <td rowspan="2">
                                <!-- Button -->
                                <div class="form-group">
                                    <div>
                                        <button id="singlebutton" name="buy_ticket" class="btn btn-primary btn-block">BUY</button>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <%
                            Fly fly = (Fly)request.getAttribute("fly");
                            if(fly != null)
                             {
                        %>
                            <tr>
                                <td><input type="hidden" name ="data_fly" value = "<%= fly.getDate_fly() %>" /> <%= fly.getDate_fly() %></td>
                                <td><input type="hidden" name ="time_fly" value = "<%= fly.getTime_fly() %>" /> <%= fly.getTime_fly() %></td>
                                <td><input type="hidden" name ="city_from" value = "<%= fly.getName_city_from() %>" /> <%= fly.getName_city_from() %></td>
                                <td><input type="hidden" name ="city_where" value = "<%= fly.getName_city_where() %>" /> <%= fly.getName_city_where() %></td>
                                <td><input type="hidden" name ="cost" value = "<%= fly.getCost() %>" /><%= fly.getCost() %></td>
                            </tr>
                        <%
                                }
                        %>
                    </table>
                </form>
            </div>
        </div>

 		<%
            Fly fly_return = (Fly)request.getAttribute("fly_return");
            if(fly_return != null)
            {
        %>
        <div class = "row searchrow">
            <div class = "col-lm-12">
                <form action="" class="form-container searchform row justify-content-center">
                    <table class="table table-bordered">
                        <tr>
                            <th>Date</th>
                            <th>Time</th>
                            <th>From</th>
                            <th>Where</th>
                            <th>Cost</th>
                            <td rowspan="2">
                                <!-- Button -->
                                <div class="form-group">
                                    <div>
                                        <button id="singlebutton" name="buy_ticket" class="btn btn-primary btn-block">BUY</button>
                                    </div>
                                </div>
                            </td>
                        </tr>
                       
                            <tr>
                                <td><%= fly_return.getDate_fly() %></td>
                                <td><%= fly_return.getTime_fly() %></td>
                                <td><%= fly_return.getName_city_from() %></td>
                                <td><%= fly_return.getName_city_where() %></td>
                                <td><%= fly_return.getCost() %></td>
                            </tr>
                        <%
                                }
                        %>
                        </table>
                </form>
                    
            </div>
        </div>

    </div>
	
</body>
</html>