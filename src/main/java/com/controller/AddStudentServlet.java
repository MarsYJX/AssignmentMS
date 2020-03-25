package com.controller;

import com.dao.JDBCAMS;
import com.model.StudentInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudentServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        StudentInfo stu = new StudentInfo();
        stu.setSno(Long.parseLong(req.getParameter("sno")));
        stu.setSname(req.getParameter("sname"));

        JDBCAMS.addStudentInfo(stu);
        req.setAttribute("type","addStudent");
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
