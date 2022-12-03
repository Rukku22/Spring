 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Customers List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Mobile.No</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="cus" items="${list}">   
   <tr>  
   <td>${cus.id}</td>  
   <td>${cus.name}</td>  
   <td>${cus.mobileno}</td>  
    <td><a href="editcus/${cus.id}">Edit</a></td>  
   <td><a href="deletecus/${cus.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="cusform">Add New Employee</a>  