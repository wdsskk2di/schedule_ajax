<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- ajax 사용을 위한 연결 -->
	<script type="text/javascript" src="resources/jquery-3.4.1.min.js"></script>
	
	<script type="text/javascript">
	function test(){
		$.ajax({
			url:"ajax",
			type: "GET",
			success: function(data){
				console.log("성공")
			},
			error:function(){
				console.log("실패")
			}
		});
	}
	</script>
	
</head>
<body>
	ajax.jsp<br>
	<h1>1</h1> <h1>2</h1> <h1>3</h1>
	<h1>4</h1> <h1>5</h1> <h1>6</h1>
	<h1>7</h1> <h1>8</h1> <h1>9</h1>
	<button type="button" onclick="test()">클릭</button>
</body>
</html>