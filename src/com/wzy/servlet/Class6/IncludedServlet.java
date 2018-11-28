package com.wzy.servlet.Class6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IncludedServlet",urlPatterns = "/IncludedServlet")
public class IncludedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("中国" + "<br>");
        out.println("UTI:"  + request.getRequestURI() + "<br>");
        out.println("QueryString"+request.getQueryString() +"<br>");
        out.println("parameter p1" + request.getParameter("p1")+"<br>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
