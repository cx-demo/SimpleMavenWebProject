package org.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SimpleServlet extends HttpServlet {

	static final Logger logger = Logger.getLogger(SimpleServlet.class);

	static {
		// Configure logger
		BasicConfigurator.configure();
		logger.debug("Hello World!");
		logger.info("Info");
		logger.warn("warning!");
		logger.error("error");
	}

	public void doGe(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet Get</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
