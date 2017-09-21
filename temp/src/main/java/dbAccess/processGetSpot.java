package dbAccess;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class processGetSpot
 */
public class processGetSpot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public processGetSpot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("processGetSpot: Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String theStreet = request.getParameter("street");
		String spotNo = request.getParameter("spotNo");
		System.out.println("---------------------------");
		System.out.println(theStreet);
		System.out.println(spotNo);
		try {
		request.setAttribute( "myStreet", theStreet );
		request.setAttribute( "mySpot", spotNo );				
		//
		RequestDispatcher rdx = getServletContext().getRequestDispatcher( "/handleSpotPayment.jsp"  );
		//
		rdx.forward( request, response );		
		/*****/
		}
		catch (Exception e) {
			System.out.println("-------oh no----xxxxxxxxxxxcption----------");
		}

	}

}
