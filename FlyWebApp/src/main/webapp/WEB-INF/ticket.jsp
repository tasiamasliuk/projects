<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="data.Fly, data.Passenger, data.Ticket"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
<style>
   body{ 
    background: url('img/bc.jpg') no-repeat;
    height: 100%;
    background-position: center;
    background-size: cover;
   }
    #ticket {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 80%;
    
        border-radius: 10px;
        -webkit-box-shadow: 0px 0px 35px -2px rgba(29, 34, 61, 0.7);
        -moz-box-shadow: 0px 0px 35px -2px rgba(29, 34, 61, 0.7);
        box-shadow: 0px 0px 35px -2px rgba(29, 34, 61, 0.7);
    }
    
    #ticket td, #ticket th {
      border: 1px #ddd;
      padding: 8px;
    }
    
    #ticket #action{background-color: #d1d6db;}
    

    #ticket th {
      padding-top: 12px;
      padding-bottom: 12px;
      text-align: left;
      background-color: rgb(240, 191, 100);
      color: white;
    }
    .row{
        padding-top: 10%;
    }
    </style>
</head>
<body>
    <div class="bg">
        <div class="row justify-content-center">
                <table id="ticket">
                    <tr>
                        <th colspan="3"><h3 style="text-align: center;">Boarding Pass</h3> </th>
                        <% Ticket ticket = (Ticket)request.getAttribute("ticket"); %>
					    <% Fly fly = (Fly)ticket.getFly(); %>
					    <% Passenger passenger = (Passenger)ticket.getPassenger(); %>
                    </tr>
                    <tr>
                        <td>Name of Passenger</td>
                        <td>Date</td>
                        <td>Time</td>
                    </tr>
                    <tr id="action">
                        <td><%= passenger.getName()%> <%= passenger.getSurname()%></td>
                        <td><%= fly.getDate_fly() %></td>
                        <td><%= fly.getTime_fly() %></td>
                    </tr>
                    <tr>
                        <td>Passport</td>
                        <td>Series</td>
                    </tr>
                    <tr id="action">
                        <td><%= passenger.getPassport_number() %></td>
                        <td><%= passenger.getPassport_seria() %></td>
                        
                    </tr>
                    <tr>
                        <td>From</td>
                    </tr>
                    <tr id="action">
                        <td><%= fly.getName_city_from() %></td>
                    </tr>
                    <tr>
                        <td>Destination</td>
                    </tr>
                    <tr id="action">
                        <td><%= fly.getName_city_where() %></td>
                    </tr>
               </table>
        </div>
    </div> 
</body>
</html>