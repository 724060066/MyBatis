<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/student/insertStudent">
    学号：<input type="text" name="studentCode"><br>
    姓名：<input type="text" name="studentName"><br>
    年龄：<input type="text" name="age"><br>
    性别：<input type="radio" name="sex" value="1">男
    <input type="radio" name="sex" value="2">女<br>
    电话：<input type="text" name="phone"><br>
    所属市场部：<input type="text" name="dangan.shichangbu"><br>
    籍贯：<input type="text" name="dangan.jiguan"><br>
    民族：<input type="text" name="dangan.minzu"><br>
    监护人：<input type="text" name="dangan.jianhuren"><br>
    监护人电话：<input type="text" name="dangan.phone"><br>
    <button type="submit">添加</button>
</form>
</body>
</html>
