package dbAccess;
import java.util.ArrayList;
import java.io.IOException;

import javax.servlet.RequestDispatcher; // -----<<-------
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
	
	private static DBConnect newConnection;
	
	
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
		
		newConnection.populateParkingList();
		
		// next 2 lines debug:
		System.out.println( newConnection.parkingSpotList.size() );		
	    System.out.println("We just printed the size of newConnection.parkingSpotList");	    
	    
	    request.setAttribute( "myAttribute", newConnection.parkingSpotList);	    	    
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher( "/success.jsp"  );
		rd.forward( request, response );

	
	} catch( SQLException e) {
		; //must do
	}catch( Exception e ) {
		; //must do
	}
	} // end of doPost
	
	/**** not here: **/
	public static void processCars() {
		   for (parkingSpot x : newConnection.parkingSpotList ) {
		        System.out.println (x.getstreetName());
		   }
	}
	/****************/ 
}
			
			 
