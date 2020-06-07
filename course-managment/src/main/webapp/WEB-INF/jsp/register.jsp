<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select,[type=password] ,[type=number]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>

<h3>Student Registration</h3>

<div>
  <form action="studentDetail" method="post">
  
  	 <label for="fname">Registration Number</label>
    <input type="text" id="regNumber" name="regNumber" placeholder="Your Registration Number">
  
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="fName" placeholder="Your name..">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lName" placeholder="Your last name..">
    
     <label for="lname">Password</label>
    <input type="password" id="password" name="password" placeholder="New Password">
    
     <label for="lname">Repeat Password</label>
    <input type="password" id="repeatPassword" name="repeatPassword" placeholder="Repeat New Password">
    
    
     <label for="lname">Mobile Number</label>
    <input type="number" id="mobileNumber" name="mobileNumber" placeholder="Your Mobile Number">
    

    
  
    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>