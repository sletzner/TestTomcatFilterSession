/**
 * 
 */
package fr.s2e.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author XS2E0397
 *
 */
public class LoginServlet extends HttpServlet {
    
     /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service(request,response);
    }
    
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void service(HttpServletRequest pRequest, HttpServletResponse pResponse) throws ServletException, IOException {
        String html = "<html></head></head><body>Logged in !<br><a href=\"/testFilterSessionMaven/logout\">Logout</a></body></htmL>";
        
        pResponse.getOutputStream().print(html);
    }
}
