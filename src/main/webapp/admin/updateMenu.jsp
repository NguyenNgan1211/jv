<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
</style>
</head>
<body>
	<jsp:include page="/admin/adheader.jsp" />
<div style="text-align: center;margin-top: 100px;">
    <h2>Update menu</h2>
    <c:set value="${menu2 }" var="c" />
    <form action="UpdateMenuServlet" method="post">
    <input type="hidden" name="menuid" value="${menu2.menuid}" />
        <label>Enter Name</label>
        <input type="text" name="menuname" value="${c.menuname}"  /><br />
        <label>Enter Description</label>
        <input type="text" name="menudescription" value="${c.menudescription}"  /><br />
        <input type="submit" value="SAVE"><br />
    </form>
</div>

</body>
</html>