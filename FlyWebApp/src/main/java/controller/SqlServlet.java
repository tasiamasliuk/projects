package controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Fly;

/**
 * Servlet implementation class SqlServlet
 */

@WebServlet("/SqlServlet")
public class SqlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Connection Conn = null;
	static PreparedStatement PrepareStat = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SqlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

        makeJDBCConnection();
        String way = request.getParameter("way");
        String searchinput_from = request.getParameter("searchinput_from");
        String searchinput_to = request.getParameter("searchinput_to");
        String date_depart = request.getParameter("date_depart");
            
        if (way.equals("one_way")) {
            Fly fly = getDataAboutFly(searchinput_from, searchinput_to, date_depart);
            request.setAttribute("fly", fly);
            request.getRequestDispatcher("WEB-INF/fly_result_search.jsp").forward(request, response);
        }
          else
            if (way.equals("return")) {
            	String date_return = request.getParameter("date_return");
            	Fly fly = getDataAboutFly(searchinput_from, searchinput_to, date_depart);
            	Fly fly_return = getDataAboutFly(searchinput_to, searchinput_from, date_return);
            		
                request.setAttribute("fly", fly);
                request.setAttribute("fly_return", fly_return);
                request.getRequestDispatcher("WEB-INF/fly_result_search.jsp").forward(request, response);
            }
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private static void makeJDBCConnection() {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Registered!");
		} catch (ClassNotFoundException e) {
			System.out.print("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
			e.printStackTrace();
			return;
		}
 
		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fly_db?serverTimezone=UTC&useSSL=false", "root", "13767");
			if (Conn != null) {
				System.out.println("Connection Successful");
			} else {
				System.out.println("Failed to make connection!");
			}
		} catch (SQLException e) {
			System.out.println("MySQL Connection Failed!");
			e.printStackTrace();
			return;
		}
    }
	
    private static Fly getDataAboutFly(String city_from, String city_where, String date) {
   	 
		try {
			// MySQL Select Query
			String getQueryStatement = "Select FindFly_city_from.date_fly, FindFly_city_from.time_fly, FindFly_city_from.name_city_from, FindFly_city_where.name_city_where, FindFly_city_from.cost\r\n" +
								       "    FROM FindFly_city_from, FindFly_city_where\r\n" + 
									   "    WHERE FindFly_city_from.name_city_from = '" + city_from + "' AND FindFly_city_where.name_city_where = '" + city_where + "' AND\r\n" + 
									   "    FindFly_city_from.date_fly = '" + date + "' AND FindFly_city_where.date_fly = '" + date + "';";
			
			PrepareStat = Conn.prepareStatement(getQueryStatement);
			// Execute the Query, and get a java ResultSet
			ResultSet rs = PrepareStat.executeQuery();
			System.out.println("Select Query done (as Statement)");
			
			String date_fly = null;
			String time_fly = null;
			String name_city_from = null;
			String name_city_where = null;
			double cost = 0;
			
			while(rs.next()) {
				date_fly = rs.getString("date_fly");
				time_fly = rs.getString("time_fly");
				name_city_from = rs.getString("name_city_from");
				name_city_where = rs.getString("name_city_where");
				cost = rs.getDouble("cost");
			}
			
			// Print the results in console
			System.out.format("%s | %s | %s | %s | %.2f\n", date_fly, time_fly, name_city_from, name_city_where, cost);
			
			System.out.println("Packing date into object");
			//packing into object
			Fly fly = new Fly(date_fly, time_fly, name_city_from, name_city_where, cost);
			
			return fly;
 
		} catch (
 
		SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
}
