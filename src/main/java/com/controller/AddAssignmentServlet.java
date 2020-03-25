package com.controller;

import com.dao.JDBCAMS;
import com.model.AssignmentInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AddAssignmentServlet")
public class AddAssignmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        AssignmentInfo ass = new AssignmentInfo();
        ass.setId(Long.parseLong(req.getParameter("id")));
        ass.setQuestion(req.getParameter("question"));
        Date date = new Date();
        ass.setReleaseTime(date);

        JDBCAMS.addAssignmentInfo(ass);
        req.setAttribute("type","addAssignment");
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
