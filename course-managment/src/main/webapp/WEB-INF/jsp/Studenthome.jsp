<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  font-size:1em;
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
a{
  width: 97%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    display: block;
    border-radius: 4px;
    cursor: pointer;
    text-decoration: none;
    text-align: center;
    font-size:0.8em;
}
</style>
<body>

<h3>Student Home</h3><br>
<h2>Welcome: ${message }</h2>

<div>
  <form action="addCourse/${reg }" method="post">
    
    <label for="Course Name">Course Name</label>
    <select id="courseName" name="courseName">
      <option value="WEB">WEB</option>
      <option value="Data Mining">Data Mining</option>
      <option value="Data Base">Data Base</option>
       <option value="Distributed System">Distributed System</option>
    </select>
    
     <label for="credits">Credits</label>
    <select id="credits" name="credits">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
    </select>
    
    
     <label for="teacher">Credits</label>
    <select id="teacher" name="teacher">
      <option value="Ram">Ram</option>
      <option value="Sham">Sham</option>
      <option value="Ola">Ola</option>
      <option value="Bhola">Bhola</option>
    </select>
    
  
    <input type="submit" value="Submit">
  </form>
</div>
<br>
<a href="/course-managment/registered/${reg }">View Registerd Courses</a>

</body>
</html>