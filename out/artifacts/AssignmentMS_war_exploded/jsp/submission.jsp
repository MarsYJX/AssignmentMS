<%@ page import="com.model.AssignmentInfo" %><%--
  Created by IntelliJ IDEA.
  User: Listen
  Date: 2020/3/13
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>提交作业</title>
</head>
<body>
<h2 align="center" style="margin:50px">提交作业</h2>
<div align="center">
    <form methord="post" action="${pageContext.request.contextPath}/SubmissionServlet">
        <table style="line-height : 40px">
            <tr>
                <th width="30%">学号：</th>
                <td width="70%"><input type="number" name="sno" maxlength="10" style="font-family: arial" required></td>
            </tr>
            <tr>
                <th width="30%">作业id：</th>
                <td width="70%"><input type="number" name="sno" maxlength="10" style="font-family: arial" required></td>
            </tr>
            <tr>
                <th width="30%">答案：</th>
                <td width="70%"><textarea type="content"  style="font-family: arial;width: 100%" rows="10"required></textarea></td>
            </tr>
            <tr style="border: none">
                <td align="center"><input type="reset" value="清空"></td>
                <td align="center"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
