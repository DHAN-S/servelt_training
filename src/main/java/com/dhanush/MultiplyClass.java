package com.dhanush;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
public class MultiplyClass extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter ss=res.getWriter();



        int ans=9;
          Cookie array[] =req.getCookies();//cookie can get by array
        System.out.println(array.length);
          for (Cookie c:array)
          {
              if(c.getName().equals("c1"))//c.getname used to get the cookie we pass with name
              {
                  ans=Integer.parseInt(c.getValue());
                  System.out.println("ulla vante");
              }
          }
          ss.println(ans);


        //session
       // HttpSession ses = req.getSession();
        //ses.removeAttribute("num3");
        // int num3=(int)ses.getAttribute("num3");
     //   ss.println(num3);











//        int answer= (Integer.parseInt(req.getParameter("answer")));
//        ss.println(answer);
//        System.out.println("in multiply sendredirect");

//        int values=(int)(req.getAttribute("mul"));
//
//    ss.println("in  multilpy  "+values);

    }
}
