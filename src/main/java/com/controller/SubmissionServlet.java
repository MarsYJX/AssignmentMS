package com.controller;

import com.model.SubmissionInfo;
import com.dao.JDBCAMS;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "SubmisssionServlet")
public class SubmissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        SubmissionInfo sub = new SubmissionInfo();
        sub.setSno(Long.parseLong(req.getParameter("sno")));
        sub.setId((Long.parseLong(req.getParameter("id"))));
        sub.setAnswer(req.getParameter("answer"));
        Date date = new Date();
        sub.setSubTime(date);

        JDBCAMS.subAssignment(sub);
        req.setAttribute("type","Submission");
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

}
