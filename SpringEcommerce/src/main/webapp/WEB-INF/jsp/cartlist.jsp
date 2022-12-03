 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1 style=" color:hotpink;">Welcome to Cartpage..........</h1>  <br><br><br>
 <a href="homepage" style="text-decoration: none;color:hotpink">------>Back to Homepage</a> <br><br><br>
  
 
 <table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Image</th><th>About-image</th><th>checkout</th></tr>  
   <c:forEach var="emp" items="${cartli}">   
   <tr>  
   <td>${emp.id}</td>  
   <td><img src='${emp.image}'></td>  
   <td>
   <li>${emp.name}</li>
   <li>${emp.cost}</li>
   <li>${emp.description}</li>
   </td>
    <td><a href='checkout?id=${emp.id}&username=${emp.username}' style="text-decoration: none;color:hotpink">------>Checkout</a> 
     
   </td>  
    </tr> 
    </c:forEach>  
   </table>  
 