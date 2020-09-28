<#import "/spring.ftl" as spring>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Product page</title>
</head>
<style>
h1{
   margin-top: 50px;
    text-align: center;
    color: red;
}
ul{
 margin-top: 70px;
 margin-right: 50px;
 margin-left: 50px;
 text-align: center;
 list-style: none;
 border : 1px solid black;
 background-color: gray;
 color: white;
 font-size:150%;
 
}
a{
text-decoration: none;
}
table, th, td {
  border: 1px solid black;
}
</style>
<body>
    <button class="btn btn-success" style="float: right; margin-top: 20px; margin-right: 20px;"><a href="/logout" style="color: white">Logout</a></button>
	<h1 style="margin-left: 150px;">Employee List</h1>
	<ul>
	<br>
	<#list employees as employee>
	    <li style="border-bottom-style: solid; padding-bottom: 10px; margin-right: 30px;">${employee}</li>
	    <br>
	</#list>
	</ul>
	<br>
	

</body>
</html>