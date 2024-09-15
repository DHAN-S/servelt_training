package com.dhanush;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class AddClass  extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int num1=Integer.parseInt(req.getParameter("one"));
        int num2=Integer.parseInt(req.getParameter("two"));
        int num3=num1+num2;


        Cookie cook =new Cookie("c1",String.valueOf(num3));
        // cookie is string value only snd
    res.addCookie(cook);
        res.sendRedirect("multiply");



//session
      //  HttpSession sess = req.getSession();
     //   sess.setAttribute("num3",num3);
      //  res.sendRedirect("multiply");
        //send redirect method url method
       // res.sendRedirect("multiply?answer="+num3);


//request dispatcher method

        //        req.setAttribute("mul",num3);
//        PrintWriter out= res.getWriter();
//        RequestDispatcher rd =req.getRequestDispatcher("home.jsp");
//        rd.forward(req,res);
//        System.out.println("in add");
    }
}
