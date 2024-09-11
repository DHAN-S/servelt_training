package com.dhanush;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddClass  extends HttpServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter pp=res.getWriter();
        int num1=Integer.parseInt(req.getParameter("one"));
        int num2=Integer.parseInt(req.getParameter("two"));
        int num3=num1+num2;
        req.setAttribute("mul",num3);
        RequestDispatcher rd =req.getRequestDispatcher("/multiply");
        rd.forward(req, res);



     }
}
