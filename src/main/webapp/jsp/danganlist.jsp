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
        <th>市场部</th>
        <th>籍贯</th>
        <th>民族</th>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>电话</th>
    </tr>
    <c:forEach items="${danganList}" var="dangan">
        <tr>
            <td>${dangan.shichangbu}</td>
            <td>${dangan.jiguan}</td>
            <td>${dangan.minzu}</td>
            <td>${dangan.students.studentCode}</td>
            <td>${dangan.students.studentName}</td>
            <td>
                <c:if test="${dangan.students.sex == '1'}">男</c:if>
                <c:if test="${dangan.students.sex == '2'}">女</c:if>
            </td>
            <td>${dangan.students.age}</td>
            <td>${dangan.students.phone}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
