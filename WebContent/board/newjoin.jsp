<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>

<body>
	
<h2>회원가입</h2>
<form action="Test2-insert-process.do" name="boardtest" method="post">
	<p> 아이디 : <input type="text" name="id"> <input type="button" value="아이디 중복 검사"></p>
	<p> 비밀번호 : <input type="password" name="password"></p>
	<p> 이름 : <input type="text" name="name"></p>
	<p> 생년월일 : <input type ="text" name="birth"> ( 예 : 1990년 1월 1일 → 19900101 )</p>
	<P> 나이 : <input type="text" name="age"></P>
	<p> 연락처 : <input type="text" maxlength="4" size="4" name="tel1"> -
				<input type="text" maxlength="4" size="4" name="tel2"> -
				<input type="text" maxlength="4" size="4" name="tel3">		
	</p>
	<p> <input type ="submit" value="가입하기"></p>
</form>

</body>
</html>