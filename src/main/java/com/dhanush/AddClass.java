package com.dhanush;
import jakarta.servlet.*;
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


        //servlet-context
//        ServletContext cont = getServletContext();
//       String namevalue= cont.getInitParameter("name");
//        System.out.println(namevalue);


//servlet-config (supose both servelt config and context written in web.xml means it take the config only.

      ServletConfig scg=  getServletConfig();
      String name= scg.getInitParameter("name");
        System.out.println(name);



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
