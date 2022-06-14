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
        <th>班级</th>
        <th>查看课程</th>
    </tr>
    <c:forEach items="${classesList}" var="kecheng">
        <tr>
        <td>${kecheng.className}</td>
        <td><a href="${pageContext.request.contextPath }/kecheng/listKechengByClassId?cId=${kecheng.id}">查看本班课程</a> </td>
<%--        <c:forEach items="${classes.studentsList}" var="student">--%>
<%--        <tr>--%>
<%--            <td>${classes.className}</td>--%>
<%--                <td>${student.studentCode}</td>--%>
<%--                <td>${student.studentName}</td>--%>
<%--                <td>${student.age}</td>--%>
<%--                <td>--%>
<%--                    <c:if test="${student.sex == '1'}">男</c:if>--%>
<%--                    <c:if test="${student.sex == '2'}">女</c:if>--%>
<%--                </td>--%>
<%--                <td>${student.phone}</td>--%>
<%--        </tr>--%>
<%--        </c:forEach>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
