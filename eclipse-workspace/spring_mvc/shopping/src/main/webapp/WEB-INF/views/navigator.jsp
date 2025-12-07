<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav input[type=text] {
  float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
}

@media screen and (max-width: 600px) {
  .topnav a, .topnav input[type=text] {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}
</style>
</head>
<!--  <body style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTFisFhZxFbPbqK9fTuA18tr8eYNWQmekd5Q&amp;usqp=CAU'); background-size: 100%"><!--  -->

<body style="background-image: url('https://media.istockphoto.com/photos/round-podium-or-pedestal-with-blue-background-picture-id1226478932?b=1&amp;k=20&amp;m=1226478932&amp;s=170667a&amp;w=0&amp;h=hXsvxQilNanpKx7QC_tIsFUOKPl8fdIDfJ_QSKXesGE='); background-size: 100%">

<div class="topnav">
<form action="./find" method="post">
   
  <a class="active" href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="./enter"><i class="fa fa-car"></i> insert</a> 
  <a href="./delete"><i class="fa fa-trash-o"></i> Delete</a> 
  <a href="./update"><i class="fa fa-edit"></i> update</a>
  <a href="./contact"><i class="fa fa-phone"></i>Contact </a>
   
   <input type="text" placeholder="Search.." name="fuel_type">
   <a href="./profile"><i class="fa fa-user-circle-o"></i>My Profile</a>
   <a href="./logout"><i class="fa fa-sign-out"></i>logout </a>
  <!--  <input type="submit" > -->
</form>
</div>


</body>
</html>
