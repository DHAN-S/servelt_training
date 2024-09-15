package com.dhanush;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
public class MultiplyClass extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter ss=res.getWriter();

        //session
        HttpSession ses = req.getSession();
        //ses.removeAttribute("num3");
        int num3=(int)ses.getAttribute("num3");
        ss.println(num3);











//        int answer= (Integer.parseInt(req.getParameter("answer")));
//        ss.println(answer);
//        System.out.println("in multiply sendredirect");

//        int values=(int)(req.getAttribute("mul"));
//
//    ss.println("in  multilpy  "+values);

    }
}
