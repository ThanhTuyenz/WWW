package com.example.session01.ex01;

import com.example.session01.bean.LoginBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String us=req.getParameter("us");
        String psw=req.getParameter("psw");
        LoginBean lg=new LoginBean();
        boolean result=lg.login(us,psw);
        resp.setContentType("Text/html");
        PrintWriter out= resp.getWriter();
        if(result)
            out.println("Dang nhap thanh cong");
        else
            out.println("Dang nhap that bai");
    }
}
