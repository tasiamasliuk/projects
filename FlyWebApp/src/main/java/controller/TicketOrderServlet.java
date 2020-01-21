package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Passenger;
import data.Ticket;
/**
 * Servlet implementation class TicketOrderServlet
 */
@WebServlet("/TicketOrderServlet")
public class TicketOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Start servlet @WebServlet(\"/TicketOrderServlet\")");
		
		String passport_seria = request.getParameter("passport_seria");
		int passport_number = Integer.parseInt(request.getParameter("passport_number"));
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String bitrhday_date = request.getParameter("bitrhday_date");
		
		Ticket ticket = new Ticket();
		Passenger passenger = new Passenger(passport_seria, passport_number, name, surname, bitrhday_date);
		ticket.setPassenger(passenger);
		
		request.setAttribute("ticket", ticket);
        request.getRequestDispatcher("WEB-INF/ticket.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
