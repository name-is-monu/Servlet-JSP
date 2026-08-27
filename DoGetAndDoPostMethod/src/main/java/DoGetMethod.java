

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/dogetmethod")
public class DoGetMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
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


/*Note : doGet() method mostly use for get the data from the server it is a default method of HTTP
  request .
   if we use the doGet() method for post any data to the server all data will be visible to the 
   URL bar and it is not safe for the sensitive data in senstive data we use Post method..
   
   like this -> http://localhost:8080/SecondWebApp/dogetmethod?uname=Monu&ucity=Varanasi&signUp=Submit
 */