

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ServletLyfe")
public class ServletLyfe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static
	{
		System.out.println("Servlet class is Loaded .. Phase 1");
	}
	
	public ServletLyfe() 
	{
		System.out.println("Instance is created of Servlet class..Phase 2");
	}
	
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("Servlet class Instance is Initialized .. Phase 3");
	}

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Service method to handle HTTP requsta and to responce back .. Phase 4");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}
	
	public void destroy() //this is Phase 5 of servlet lyfe cycle it will not print any thing ..
	{
		
	}


}
