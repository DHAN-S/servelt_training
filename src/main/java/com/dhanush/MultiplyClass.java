package com.dhanush;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyClass extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter ss=res.getWriter();
        int values=(int)(req.getAttribute("mul"));
        System.out.println(values);
        ss.println("in  multilpy  "+values);
    }
}
