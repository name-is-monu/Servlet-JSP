

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		
		writer.println("Hello "+name);
		writer.println("Your location is "+city);
	}

}
