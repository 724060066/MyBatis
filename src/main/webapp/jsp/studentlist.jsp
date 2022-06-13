<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/student/listStudent">
    姓名：<input type="text" name="studentName" value="${studentName}">
    班级:<select name="classId">
            <option value="">--请选择--</option>
            <c:forEach items="${classesList}" var="classes">
                <option value="${classes.id}">${classes.className}</option>
            </c:forEach>
        </select>
    <button type="submit">查询</button>
</form>
<table>
    <tr>
        <th>班级</th>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>电话</th>
        <th>市场部</th>
        <th>籍贯</th>
        <th>民族</th>
    </tr>
    <c:forEach items="${studentsList}" var="student">
        <tr>
            <td>${student.classes.className}</td>
            <td>${student.studentCode}</td>
            <td>${student.studentName}</td>
            <td>
                <c:if test="${student.sex == '1'}">男</c:if>
                <c:if test="${student.sex == '2'}">女</c:if>
            </td>
            <td>${student.age}</td>
            <td>${student.phone}</td>
            <td>${student.dangan.shichangbu}</td>
            <td>${student.dangan.jiguan}</td>
            <td>${student.dangan.minzu}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
