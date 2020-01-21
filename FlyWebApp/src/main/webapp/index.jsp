<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fly</title>
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
	<!-- <a href="SqlServlet?get=show">GoFly</a> -->
	<header>
    </header>
    <main>
            <div class="row justify-content-center" style="padding-top: 17%">
                <form action="SqlServlet" method="get" class="form-container mainform row justify-content-center">
                    <table>
                        <tr>
                            <td>							
                                <div class="form-check-inline">
                                    <label class="form-check-label">
                                      <input type="radio" class="form-check-input" name="way" value="return" checked="checked">return
                                    </label>
                                </div>
                               
                                <div class="form-check-inline">
                                    <label class="form-check-label">
                                      <input type="radio" class="form-check-input" name="way" value="one_way">one way
                                    </label>
                                </div>

                                <script type="text/javascript">
								    $(".form-check-input").click(function() {
								    	$('input[name="date_return"]').attr("disabled", true);
								    	if($("input[name=way]:checked").val() == "return"){
								    		$('input[name="date_return"]').attr("disabled",false);
								    	}
								    });
								</script>

                            </td>
                        </tr>
                        <br>
                        <tr>
                            <td>
                                <!-- Search input-->
                                <div class="form-group">
                                    <label class="control-label" for="searchinput">from:</label>
                                    <div>
                                        <input id="searchinput_from" name="searchinput_from" type="search" placeholder="origin" class="form-control input-md">
                                    </div>
                                </div>
                            </td>
                            <td>
                                <!-- Search input-->
                                <div class="form-group">
                                    <label class="control-label" for="searchinput">to:</label>
                                    <div>
                                        <input id="searchinput_to" name="searchinput_to" type="search" placeholder="destination" class="form-control input-md">
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div class="form-group">
                                    <!-- Date input -->
                                    <label class="control-label" for="date">depart:</label>
                                    <div>
                                        <input class="form-control data-main-form" id="date" name="date_depart" placeholder="YYYY/MM/DD" type="text" />
                                    </div>
                                </div>
                            </td>
                            <td>
                                <div class="form-group">
                                    <!-- Date input -->
                                    <label class="control-label" for="date">return:</label>
                                    <div>
                                        <input class="form-control data-main-form" id="date" name="date_return" placeholder="YYYY/MM/DD" type="text" />
                                    </div>
                                </div>
                            </td>
                        </tr>

                        <script type="text/javascript">
	                        $(document).ready(function() {
						        var date_input = $('input[id="date"]'); //our date input has the id "date"
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
             
                        <tr>
                            <td colspan="3"></td>
                            <td>
                                <!-- Button -->
                                <div class="form-group">
                                    <div>
                                        <button id="singlebutton" name="singlebutton" class="btn btn-primary btn-block" type="submit">SEARCH</button>
                                    </div>
                                </div>
                            </td>

                        </tr>
                    </table>
                </form>


            </div>
    </main>

    <footer>
    </footer>
</body>
</html>
