package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException,
            IOException{
        res.setContentType("text/html");

      String name =  req.getParameter("name");

      System.out.println("name of the user" + name);

     PrintWriter out =  res.getWriter();
     out.println("<h1>Registered Successfully</h1>");

    }
}
