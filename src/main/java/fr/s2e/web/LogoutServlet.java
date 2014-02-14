package fr.s2e.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service(request,response);
    }
    
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void service(HttpServletRequest pRequest, HttpServletResponse pResponse) throws ServletException, IOException {
        // Invalidation de la session et création d'une nouvelle sesssion
        //pRequest.getSession().invalidate();
        //pRequest.getSession(true);
        
        String html = "<html></head></head><body>Logged out !<br><a href=\"/testFilterSessionMaven/login\">Login</a></body></htmL>";
        
        pResponse.getOutputStream().print(html);
    }

}
