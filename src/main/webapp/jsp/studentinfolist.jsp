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
        <th>学生行名</th>
        <th>学号</th>
        <th>市场部</th>
        <th>籍贯</th>
        <th>班级名</th>
        <th>课程名</th>
    </tr>
    <c:forEach items="${studentsList}" var="student">
        <tr>
            <td>${student.studentCode}</td>
            <td>${student.studentName}</td>
            <td>${student.dangan.shichangbu}</td>
            <td>${student.dangan.jiguan}</td>
            <td>${student.classes.className}</td>
            <td>${student.classes.kechengList[0].keName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
