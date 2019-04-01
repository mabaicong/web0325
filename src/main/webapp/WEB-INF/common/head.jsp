<%--
  Created by IntelliJ IDEA.
  User: mabaicong
  Date: 2019/3/31
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <%
        String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
        pageContext.setAttribute("basepath",basepath);
    %>
</body>
</html>
