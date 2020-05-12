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
			//url:"ajax",	//이동할 경로
			//type: "GET",	//방식
			//success: function(data){	//성공시
			//	console.log("성공")
			//},
			//error:function(){	//실패시
			//	console.log("실패")
			//}
			
			url:"ajax_result",	//controller의 ajax_result로 연결되어 실행
			type: "GET",	//방식
			success: function(data){	//성공시
				$("#result").text(data)	//넘어온 값을 받아와 id가 result인 곳에 넣어줌
				console.log("성공")
			},
			error:function(){	//실패시
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
	
	<!-- 추가 -->
	<label id="result">0</label>
</body>
</html>