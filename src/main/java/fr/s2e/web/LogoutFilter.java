/**
 * 
 */
package fr.s2e.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;



/**
 * @author XS2E0397
 *
 */
public class LogoutFilter implements Filter {

    @Override
    public void destroy() {
        
    }

    @Override
    public void doFilter(ServletRequest pRequest, ServletResponse pResponse, FilterChain pFilterChain) throws IOException,
            ServletException {
        
        // On invalide la session et on crée une nouvelle session
        ((HttpServletRequest) pRequest).getSession().invalidate();
        ((HttpServletRequest) pRequest).getSession(true);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        
    }

  

}
