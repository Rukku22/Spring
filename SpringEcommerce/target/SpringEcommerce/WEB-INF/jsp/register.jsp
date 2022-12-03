<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Register Form</h1>  
       <form:form method="post" action="Regis">    
        <table >    
         <tr>    
          <td>Id: </td>   
          <td><form:input path="id"  /></td>  
         </tr>    
         <tr>    
          <td>FirstName :</td>    
          <td><form:input path="FirstName" /></td>  
         </tr>  
         <tr>    
          <td>LastName :</td>    
          <td><form:input path="LastName" /></td>  
         </tr>
         <tr>    
          <td>Email-Id :</td>    
          <td><form:input path="email" /></td>  
         </tr> 
         <tr>    
          <td>Mobile.No :</td>    
          <td><form:input path="mobileNo" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="submit" /></td>    
         </tr>    
        </table>    
       </form:form>   
</body>
</html>