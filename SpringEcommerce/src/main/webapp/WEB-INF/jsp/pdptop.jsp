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
   <c:forEach var="emp" items="${top}">   
  <div class="grid-container">
  <img style="width:300px;height:500px" src='${emp.image}'> 
   <div style="margin-top:-311px;margin-left:338px;">  <h4><b>Name<b>:${emp.name}</h6>  
   <h4><b>Cost:<b>${emp.cost}Rs/-</h6>  
   <h4><b>Description<b>:${emp.description}</h4>  
    </div></div>
 <div ><a style="text-decoration: none;" href='cart?id=${emp.id}&image=${emp.image}&name=${emp.name}&cost=${emp.cost}&description=${emp. description}'><button style="width: 224px;height: 36px;  background-color:hotpink;border: none;color: white;border-radius: 8px;text-decoration: none;margin-top: 185px;">AddCart</button> </a></div>
  <div ><a style="text-decoration: none;" href='order?id=${emp.id}&image=${emp.image}&name=${emp.name}&cost=${emp.cost}&description=${emp. description}'><button style="width: 224px;height: 36px;  background-color:hotpink;border: none;color: white;border-radius: 8px;text-decoration: none;margin-top:-35px;margin-left:281px;">BuyNow</button></a></div> 
   </c:forEach>
 </body>
</html>