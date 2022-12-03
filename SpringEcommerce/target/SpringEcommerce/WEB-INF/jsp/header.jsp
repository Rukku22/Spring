<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.img
{
   width:150px;
    margin-top: -10px;
    margin-left: 230px;
}
 .dropdown {
  position: relative;
  display: inline-block;
  margin-left:0px;
}
.h1{
 display:inline-flex;
 }
.dropdown-content {
  display: none;
  position: absolute;
  z-index: 1;
  background-color:white;
  box-shadow: 0px -5px 10px 0px rgba(0, 0, 0, 0.5);
  margin-top: 40px;
  padding: 65px;
 }
 * {
  box-sizing: border-box;
}

form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background:pink;
  color:white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
  height:41px;
}

  form.example button:hover {
   background:pink;
}

 form.example::after {
  content: "";
  clear: both;
  display: table;
}
.dropdown:hover .dropdown-content {
       display: block;
}
.se{
   width:500px;
}
 
</style>
<body>
<div class="h1">
	<img class=img src="https://etimg.etb2bimg.com/photo/86809724.cms"> 
<div class="se"><form class="example" action="/action_page.php" style="margin:auto;max-width:500px; margin-left: 80px;margin-top: 20px;">
	  <input type="text" placeholder="Search.." name="search2">
	  <button type="submit"><img style=width:30px; src="https://cdn1.iconfinder.com/data/icons/hawcons/32/698956-icon-111-search-512.png"></button>
	</form></div>
	<div style="display:flex;"> 
	<div class="dropdown">
	<div><img style="width:50px;margin-top: 20px;margin-left:80px" src="https://cdn4.iconfinder.com/data/icons/digital-1/100/Plan_de_travail_40-512.png"></div>
  <div style="margin-top:-45px;margin-left:128px;">DownloadApp</div> 
  
</div> 
  <div class="dropdown">
  <div style="margin-top:31px;margin-left:57px;">Become a Supplier</div> 
</div>
 <div class="dropdown">
  <div><img style="width:50px;margin-top: 20px;margin-left:100px" src="https://www.freeiconspng.com/thumbs/cart-icon/basket-cart-icon-27.png"></div>
  <div style="margin-top:-39px;margin-left:150px;">Cart</div> 
 </div>  
 <div class="dropdown">
 <img style="width:50px;margin-top: 20px;margin-left:65px" src="https://thumbs.dreamstime.com/b/default-avatar-profile-icon-vector-social-media-user-image-182145777.jpg">
 <div style="margin-top:-40px;margin-left:110px;">profile</div> 
  <div class="dropdown-content">
  <h2>Hello User</h2>
<h5>To access your Meesho account</h5>
<div class="sign"><button style="width: 224px;height: 36px;  background-color:hotpink;border: none;color: white;border-radius: 8px;">Sign Up</button> </div>
 <hr size="1" width="90%" color="black"> 
 <a style="text-decoration: none;color:black;border: none;margin-left: 20px;href="#"> My Orders</a>
 </div>
  </div>
   </div>
      </div>
</body>
</html>