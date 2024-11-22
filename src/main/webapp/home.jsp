<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
	<form action="addAlien">
		<input type="number" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="text" name="atech"><br>
		<input type="submit"><br>
	</form>
	
	<br>
	
	<text>find by id</text>
	<form action="getAlien">
		<input type="number" name="aid"><br>
		<input type="submit"><br>
	</form>
	
	<br>
	
	<text>get all aliens</text>
	<form action="getAliens">
		<input type="submit"><br>
	</form>
	
	<br>
	<text>delete an alien</text>
	<form action="deleteAlien">
		<input type="number" name="aid"><br>
		<input type="submit"><br>
	</form>
</body>
</html>
