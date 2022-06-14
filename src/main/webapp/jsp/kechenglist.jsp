<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>课程名</th>
    </tr>
    <c:forEach items="${kechengList}" var="kecheng">
        <tr>
            <td>${kecheng.keName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
