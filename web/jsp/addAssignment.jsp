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
    <title>添加作业</title>
</head>
<body>
<div align="center">
    <h2>发布作业</h2>
    <form action="${pageContext.request.contextPath}/AddAssignmentServlet" method="post">
        <table action="line-height:40px">
            <tr>
                <th>作业id</th>
                <td><input type="text" name="id" maxlength="20" size="40" style="font-family: Arial" required></td>
            </tr>
            <tr>
                <th>作业描述</th>
                <td><textarea name="question" rows="10" cols="42" style="font-family: Arial" required></textarea></td>
            </tr>
            <tr align="center">
                <th><input type="reset" value="清空"></th>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
