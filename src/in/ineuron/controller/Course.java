package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Course extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String useremail = request.getParameter("useremail");
		String useraddr = request.getParameter("useraddr");
		String[] courses = request.getParameterValues("course");

		PrintWriter out = response.getWriter();

		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Student Registration details</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>NAME</th><td>" + username + "</td></tr>");
		out.println("<tr><th>EMAIL</th><td>" + useremail + "</td></tr>");
		out.println("<tr><th>ADDR</th><td>" + useraddr + "</td></tr>");
		out.println("<tr><th>COURSE</th>");
		String data = "";
		for (String course : courses)
			data += course + " ";
		out.println("<td>" + data + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
