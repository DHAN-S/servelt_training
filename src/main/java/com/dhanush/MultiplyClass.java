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
        int answer= (Integer.parseInt(req.getParameter("answer")));
        ss.println(answer);
        System.out.println("in multiply sendredirect");

//        int values=(int)(req.getAttribute("mul"));
//
//    ss.println("in  multilpy  "+values);

    }
}
