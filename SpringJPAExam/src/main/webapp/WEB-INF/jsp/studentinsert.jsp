<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
		<form name="insertForm" action="/insert" method="post">
			<tbody>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="" /></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="text" name="age" value="" /></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="addr" value="" /></td>
				</tr>
			</tbody>
		</form>			
		</table>
	</div>
	<div>
		<input type="button" value="등록" onclick="document.forms['insertForm'].submit();"/>
		 
		<input type="button" value="취소" onclick="history.back();"/>
	</div>
</body>
</html>