<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인중입니다.</title>
</head>
<body>
<h1>${sessionScoup.boardtest.u_name}님 로그인 성공</h1>
<p> <input type ="submit" value="글 작성"> <input type ="submit" value="로그아웃"></p>
<a href="/boardmake/board-list.do">돌아가기</a>
</body>
</html>