package dbAccess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class makePayment
 */

import dbAccess.DBConnect;
import java.sql.*
;public class makePayment extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private DBConnect newConnection;
	
	
    public makePayment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		doGet(request, response);
		**/
		try {
			newConnection  = new DBConnect();
			
			// newConnection.searchUser("user101","pwd101");
			
			if ( newConnection.searchUser("user101","pwd101") ) {									
				response.sendRedirect("success.jsp");
			}
			else {
				response.sendRedirect("error.jsp");
			}
			
		} catch( SQLException e) {
			
		}catch( Exception e ) {
			
		}
		
		
	}

}
