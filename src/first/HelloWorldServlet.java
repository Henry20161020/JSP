package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorldServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		  response.getWriter().append("Served at: ").append(request.getContextPath());
//		  response.getWriter().append("<h1>Welcome, My Friend!</h1>"); 
		PrintWriter out = response.getWriter(); 
//		  out.println("Nothing"+request.getContextPath());
		
		 
		Enumeration<String> params = request.getParameterNames();
		if (!params.hasMoreElements()) out.println("No Parameters");
		else {
			out.println("<!DOCTYPE html>");
			out.println("<ul>");
			
			while (params.hasMoreElements())  {
				String variableName=params.nextElement();
				out.println("<li>"+variableName + ":"+request.getParameter(variableName)+"</li>");
			} 
			out.println("</ul>");
			out.println("</html>");
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
