package ymsys.cn.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;

/**
 * CAS simple Servlet
 *
 * @author &lt;a href="http://www.micmiu.com"&gt;Michael Sun&lt;/a&gt;
 */

public class HelloWorldExample extends HttpServlet {

	private static final long serialVersionUID = -6593274907821061823L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Assertion assertion = (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
		AttributePrincipal principal = assertion.getPrincipal();
		System.err.println(principal.getName() + "1");
		out.println(principal.getName() + 1);
	}
}