

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

/**
 * Servlet implementation class Products
 */
@WebServlet("/products")
public class Products extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {

		    response.setContentType("text/html");
		   // response.setCharacterEncoding("UTF-8");

		    PrintWriter out = response.getWriter();
		    out.print("The Products of FULL CREATIVE are <br>");
		    out.print("AnswerConnect<br>" + "AnywhereWorks<br>"+ 
		    		                   "AnswerForce<br>" +  "Teleport.Video<br>" + 
		    		                    "AnywhereWorks<br>" + "Distributed Source<br>"+
		    		                   "HelloSells<br>" + "LexReception<br>" + 
		    		                   "Setmore<br>" + "YoCoBoard<br>" + 
		    		                   "Switchboard<br>" + "Form Creator<br>");

		    out.println("<br><br/><form action =\"/index1.html\"><input type=\"submit\" value=\"Back\"></form>");
}

}