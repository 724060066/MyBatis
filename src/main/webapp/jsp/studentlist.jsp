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
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>电话</th>
        <th>班级</th>
    </tr>
    <c:forEach items="${studentsList}" var="dangan">
        <tr>
            <td>${dangan.studentCode}</td>
            <td>${dangan.studentName}</td>
            <td>
                <c:if test="${dangan.sex == '1'}">男</c:if>
                <c:if test="${dangan.sex == '2'}">女</c:if>
            </td>
            <td>${dangan.age}</td>
            <td>${dangan.phone}</td>
            <td>2108A</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
