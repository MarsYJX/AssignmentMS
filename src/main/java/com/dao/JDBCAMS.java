package com.dao;

import com.model.AssignmentInfo;
import com.model.StudentInfo;
import com.model.SubmissionInfo;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCAMS {

    static String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/assignmentms&?useSSL=false&serverTIMEzone=UTC";
    String user = "root";
    String pwd = "root";

    public static void addStudentInfo(StudentInfo sInfo){

        int row = 0;
        String sql = "insert into student (sno,sname) values (?,?)";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection conn = DriverManager.getConnection("url","user","pwd")){

            try(PreparedStatement pst = conn.prepareStatement(sql)){
                pst.setLong(1,sInfo.getSno());
                pst.setString(2,sInfo.getSname());
                row = pst.executeUpdate();
                if(row>0){
                    System.out.println("成功添加学生");
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void subAssignment(SubmissionInfo sInfo){

        int row = 0;
        String sql = "insert into recond (sno,id,answer,subTime) " +
                "values (?.?.?.?)";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection conn = DriverManager.getConnection("url","user","pwd")){

            try(PreparedStatement pst = conn.prepareStatement(sql)){
                pst.setLong(1,sInfo.getSno());
                pst.setLong(2,sInfo.getId());
                pst.setString(3,sInfo.getAnswer());
                pst.setTimestamp(4,new Timestamp(sInfo.getSubTime().getTime()));
                row = pst.executeUpdate();
                if(row>0){
                    System.out.println("成功发布作业");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addAssignmentInfo(AssignmentInfo aInfo){

        int row = 0;
        String sql = "insert into assignment (id,question,releaseTime," +
                "deadline) values (?,?,?,?)";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection conn = DriverManager.getConnection("url","user","pwd")){

            try(PreparedStatement pst = conn.prepareStatement(sql)){
                pst.setLong(1,aInfo.getId());
                pst.setString(2,aInfo.getQuestion());
                pst.setTimestamp(3,new Timestamp(aInfo.getReleaseTime().getTime()));
                row = pst.executeUpdate();
                if(row>0){
                    System.out.println("成功添加作业");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<AssignmentInfo> findAll() {

        String sql = "SELECT * FROM recond";
        List<AssignmentInfo> list = new ArrayList<>();

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection conn = DriverManager.getConnection("url","user","pwd")){

            try(Statement st = conn.createStatement()){

                try(ResultSet rSet = st.executeQuery(sql)){
                    while(rSet.next()){
                        AssignmentInfo aInfo = new AssignmentInfo();
                        aInfo.setId(rSet.getLong("id"));
                        aInfo.setQuestion(rSet.getString("question"));
                        aInfo.setReleaseTime(rSet.getTimestamp("releaseTime"));
                        list.add(aInfo);
                    }
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
