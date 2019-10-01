<html>
<head>
    <title>Yahoo!!</title>
</head>

<body>
<p>
    <span style="color: red; ">${errorMessage}</span>
</p>

<form action="/spring-mvc/login" method="POST">
    Name : <input name="name" type="text"/><br>
    Password : <input name="password" type="password"/><br>
    <input type="submit"/>
</form>
</body>
</html>