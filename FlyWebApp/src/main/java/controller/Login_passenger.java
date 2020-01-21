package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Fly;
import data.Ticket;

/**
 * Servlet implementation class Login_passenger
 */
@WebServlet("/Login_passenger")
public class Login_passenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_passenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String data_fly = request.getParameter("data_fly");
		String time_fly = request.getParameter("time_fly");
		String city_from = request.getParameter("city_from");
		String city_where = request.getParameter("city_where");
		double cost = Double.parseDouble(request.getParameter("cost"));
		
		Fly fly = new Fly(data_fly, time_fly, city_from, city_where, cost);
		Ticket ticket = new Ticket();
		ticket.setFly(fly);
        request.setAttribute("fly", fly);
        request.getRequestDispatcher("WEB-INF/login_or_buy.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
