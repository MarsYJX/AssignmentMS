<%@ page import="java.util.List" %>
<%@ page import="com.model.SubmissionInfo" %><%--
  Created by IntelliJ IDEA.
  User: Listen
  Date: 2020/3/13
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业提交情况</title>
</head>
<body>
<h2 align="center" style="margin:50px">作业提交情况</h2>
<form action="${pageContext.request.contextPath}/SubmissionServlet" method="post">
    <table align="center" width="960" border="1">

        <tr>
            <th width="15%">学号</th>
            <th width="15%">作业id</th>
            <th width="50%">学生答案</th>
            <th width="20%">提交时间</th>
        </tr>
        <%
            List<SubmissionInfo> list=(List<SubmissionInfo>)request.getAttribute("list");
            if(list != null && !list.isEmpty()){
                for(SubmissionInfo sub:list){
        %>
        <tr>
            <td width="15%"><%=sub.getSno()%>></td>
            <td width="15%"><%=sub.getId()%>></td>
            <td width="50%" style="word-break: break-all;word-wrap: break-word"><%=sub.getAnswer()%></td>
            <td width="20%"><%=sub.getSubTime()%>></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</form>

</body>
</html>
