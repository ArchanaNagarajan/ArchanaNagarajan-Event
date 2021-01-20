import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/intro")
public class Intro extends HttpServlet {

@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	 res.setContentType("text/html");
	   
	    PrintWriter out = res.getWriter();

	    out.print("FULL Creative is a foundry for new ideas.Over twenty years, we've evolved from being a long-distance carrier based in our founder's garage into a provider of diverse products and services with a mission to change how the world works.");

	    out.println("<br><br/><form action =\"/index1.html\"><input type=\"submit\" value=\"Back\"></form>");
	
}
}