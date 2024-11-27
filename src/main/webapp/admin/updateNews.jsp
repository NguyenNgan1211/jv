<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/admin/adheader.jsp" />
<div style="text-align: center;margin-top: 100px;">
    <h2>Update news</h2>
    <c:set value="${news2 }" var="c" />
    <form action="UpdateNewsServlet" method="post">
    <input type="hidden" name="newsid" value="${news2.newsid}" />
        <label>Enter Newstitle</label>
        <input type="text" name="newstitle" value="${c.newstitle}"  /><br />
        <label>Enter Newscontent</label>
        <input type="text" name="newscontent" value="${c.newscontent}"  /><br />
         <label>Enter authorid</label>
        <input type="text" name="authorid" value="${c.authorid}"  /><br />
        <label>Enter menuid</label>
        <input type="text" name="menuid" value="${c.menuid}"  /><br />
         <label>Enter img</label>
        <input type="text" name="image" value="${c.image}"  /><br />
        <input type="submit" value="SAVE"><br />
    </form>
</div>
</body>
</html>