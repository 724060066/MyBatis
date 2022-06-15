<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/student/listStudent">
    学号：<input type="text" name="studentName" value="${studentName}"><br>
    姓名：<input type="text" name="studentName" value="${studentName}"><br>
    年龄：<input type="text" name="studentName" value="${studentName}"><br>
    性别：<input type="radio" name="studentName" value="${studentName}">男
    <input type="radio" name="studentName" value="${studentName}">女<br>
    电话：<input type="text" name="studentName" value="${studentName}"><br>
    所属市场部：<input type="text" name="studentName" value="${studentName}"><br>
    籍贯：<input type="text" name="studentName" value="${studentName}"><br>
    民族：<input type="text" name="studentName" value="${studentName}"><br>
    监护人：<input type="text" name="studentName" value="${studentName}"><br>
    监护人电话：<input type="text" name="studentName" value="${studentName}"><br>

    <button>添加</button>
</form>
</body>
</html>
