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
    <c:forEach items="${danganList}" var="student">
        <tr>
            <td>${student.shichangbu}</td>
            <td>${student.jiguan}</td>
            <td>${student.minzu}</td>
            <td>${student.students.studentCode}</td>
            <td>${student.students.studentName}</td>
            <td>
                <c:if test="${student.students.sex == '1'}">男</c:if>
                <c:if test="${student.students.sex == '2'}">女</c:if>
            </td>
            <td>${student.students.age}</td>
            <td>${student.students.phone}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
