<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <c:forEach var="cart" items="${command}">
   <div class="page1">
   <h1 style="text-align:center"> Your order confirmation page</h1>  <br><br>
   <img src='${cart.image}'>
   <h2>description:${cart.name} </h2>
   <h2>Cost:${cart.cost}</h2>
  <h2>color:${cart.description}</h2>
  <a href="order?id=${cart.id}&image=${cart.image}&name=${cart.name}&cost=${cart.cost}&=${cart.description}"><button style="width:100px;height:50px;background-color:blue">Proceed</button></a>
   </div><br><br><br>  

   </c:forEach> 
</body>
</html>