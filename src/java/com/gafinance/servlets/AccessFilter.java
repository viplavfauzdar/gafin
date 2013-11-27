/**
 * 
 */
package com.gafinance.servlets;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Viplav
 *
 */
public class AccessFilter implements Filter {
		
	private String ERROR_REDIRECT = null, HTTP_PORT = null, HTTPS_PORT = null, REDIRECT = null;
	private ArrayList<String> urlList;
	private java.util.logging.Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());
	 
	public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
 
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String url = request.getServletPath();
        logger.info("Audit: " + request.getRemoteAddr() + " - " + request.getRemoteHost() + " - " + request.getRemotePort() + " - " + request.getRemoteUser() + " - " + url);
        if(request.getQueryString()!=null && !request.getQueryString().equals("")) url = url + "?" + request.getQueryString();        
        boolean allowedRequest = false;
                
        
        
         
        //if(urlList.contains(url)) {
       //     allowedRequest = true;
       //     logger.info("Allowed Request: " + allowedRequest);
        //}
        
        for (String temp : urlList) {        	
        	allowedRequest = url.matches(temp);
        	if(url.contains("/save.jsp?action=update")) allowedRequest = false; //block update calls without login
        	logger.config("URL - Regex: " + url + " - " + temp + " ==> Allowed Request: " + allowedRequest);
        	if(allowedRequest) break;
		}                
       
        
        if (!allowedRequest) {
            HttpSession session = request.getSession();
            if(session.getAttribute("userid")==null){
            	//logger.info("Anonymous user. Allowing to contiune!!");
            //session = null;
            //System.out.println("Session: " + session);
            //if (session == null) {
            	//** below works but returns an ugly error message
            	ServletException e =  new ServletException("Access Denied! Please register or login!!");
            	request.setAttribute("javax.servlet.jsp.jspException", e);
            	throw e;
                //request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);            	
            	//logger.severe("Security Restriction: " + e.getMessage());
            	//request.setAttribute("error", "Access Denied! Please register or login!!");
            	//response.sendRedirect(ERROR_REDIRECT + "?error=" + URLEncoder.encode("Access Denied! Please register or login!!","UTF-8"));
                //return; //** need this otherwise throws response committed error on the redirect above
            }
        }
        
        if(REDIRECT.equals("TRUE")){
	        //forcing HTTPS redirection
	        logger.info("Is Secure: " + request.isSecure());
	        String redirectTarget = request.getRequestURL().toString();
	        redirectTarget = redirectTarget.replaceFirst("http", "https");
	        redirectTarget = redirectTarget.replaceFirst(HTTP_PORT, HTTPS_PORT); 
	        if(!request.isSecure()) {                   
	            response.sendRedirect(redirectTarget);  
	        } else {  
	            chain.doFilter(request, response);  
	        }
	    }else{
        	chain.doFilter(request, response);	
        }

    }
    public void init(FilterConfig config) throws ServletException {
        
    	REDIRECT = config.getInitParameter("REDIRECT");
    	logger.config("REDIRECT: " + REDIRECT);
    	HTTP_PORT = config.getInitParameter("HTTP_PORT");
    	logger.config("HTTP_PORT: " + HTTP_PORT);
    	HTTPS_PORT = config.getInitParameter("HTTPS_PORT");
    	logger.config("HTTPS_PORT: " + HTTPS_PORT);
    	ERROR_REDIRECT = config.getInitParameter("ERROR_REDIRECT");
    	logger.config("ERROR_REDIRECT: " + ERROR_REDIRECT);
    	String urls = config.getInitParameter("allowed-urls");
    	logger.config("Allowed URLs: " + urls);
    	
        StringTokenizer token = new StringTokenizer(urls, ",");
 
        urlList = new ArrayList<String>();
 
        while (token.hasMoreTokens()) {        	        	
            urlList.add(token.nextToken());
        }
        logger.config("URL List: " + urlList);
        //for (String temp : urlList) {
        //	logger.info("URL regex: " + temp);
        //}
    }
    public void destroy() {
        //add code to release any resource
    }
	
}//end of class
