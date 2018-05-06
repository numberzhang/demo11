package com.example.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/7/17.
 */
@WebServlet(urlPatterns = "/myServlet/*" ,description = "servlet的说明")
public class MyServlet extends HttpServlet {
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
        doPost(req, resp);

    }
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
         resp.setContentType("text/html");
         PrintWriter out = resp.getWriter();
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Hello World</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>this is：MyServlet</h1>");
         out.println("</body>");
         out.println("</html>");
    }

}
