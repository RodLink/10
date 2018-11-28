package com.wzy.servlet.Class6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DispatcherforwardServlet",urlPatterns="/DispatcherforwardServlet")
public class DispatcherforwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String company = (String) request.getAttribute("company");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("这是一个被请求转发的servlet，DispatcherforwardServlet");
        printWriter.println(company);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
