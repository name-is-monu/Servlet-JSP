

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/dopostmethod")
public class DoPostMethod2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		
		writer.println("Hello "+name);
		writer.println("Your location is "+city);
		
		writer.println("Data Comming from doGet() methdo");
	
	}

}


/*Note : doPost() method mostly use for post the data to the server it is  method of HTTP
  request .
   if we use the doPost() method for post any data to the server all data will be goes to the 
   server from request body .
   it is not visible to the URL it is safe for sensitive data. 
   
  
 */