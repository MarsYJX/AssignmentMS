<%--
  Created by IntelliJ IDEA.
  User: Listen
  Date: 2020/3/13
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加学生信息</title>
</head>
<body>
<div align="center">
    <h2>添加学生</h2>
    <form action="${pageContext.request.contextPath}/AddStudentServlet" method="post">
        <table style="line-height: 40px">
            <tr>
                <th>学号：</th>
                <td><input type="number" name="sno" maxlength="10" style="font-family: arial" required></td>
            </tr>
            <tr>
                <th>姓名：</th>
                <td><input type="text" name="sname" maxlength="20" style="font-family: arial" required></td>
            </tr>

            <tr>
                <td><input type="reset" value="清空"></td>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
