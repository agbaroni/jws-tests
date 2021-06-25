package io.github.agbaroni.tests.jws.app2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/" })
public class Test extends HttpServlet {
    private final long serialVersionUID = 27428286184454L;

    @Override
    protected void service(HttpServletRequest request,
			   HttpServletResponse response) throws ServletException,
								IOException {
	try (var pw = response.getWriter()) {
	    pw.write("hello from app2");
	} catch (IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new ServletException(e);
	}
    }
}