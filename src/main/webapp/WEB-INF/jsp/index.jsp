<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/css.css">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	
	function text(){
		$.post("text.do",$("form").serialize(),function(data){
			alert("请在控制台查看效果");
		})
	}
</script>
</head>
<body>
	<form action="">
		请输入：<textarea rows="5" cols="20" name="text">
				
		</textarea>
		<input type="button" onclick="text()" value="提交"> 
	</form>
</body>
</html>