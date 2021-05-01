package oar.org.UIproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
@SuppressWarnings("serial")
public class FirstUIpro extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body><h1>Success</h1></body></html>");
		out.println("<html><body bgcolor='orange'>"
				+ "<font color='yellow' size='20'>Welcome "
				+ name+" to " +place+"</font></body></html>");
		
		out.flush();
		out.close();
		
		
		
		
	}

}
