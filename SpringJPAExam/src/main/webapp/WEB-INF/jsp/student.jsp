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
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>나이</th>
					<th>주소</th>
					<th>등록일시</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="/updateForm?sid=">[수정]</a></td>
					<td><a href="/delete?sid=">[삭제]</a></td>
				</tr>
			</tbody>
		</table>	
	</div>
	<div>
		<input type="button" value="등록" onclick="location.href='/insertForm';"/>
	</div>
</body>
</html>