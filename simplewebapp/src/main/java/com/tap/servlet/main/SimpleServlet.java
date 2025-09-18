package com.tap.servlet.main;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/simple")
public class SimpleServlet  extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html");
        
        
        String method = request.getMethod();
        
        
        if ("GET".equals(method)) {
            response.getWriter().println("<h1>Hello from GET request!</h1>");
        } else if ("POST".equals(method)) {
            response.getWriter().println("<h1>Hello from POST request!</h1>");
        } else {
            response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            response.getWriter().println("<h1>Unsupported HTTP method: " + method + "</h1>");
        }
    }
}
