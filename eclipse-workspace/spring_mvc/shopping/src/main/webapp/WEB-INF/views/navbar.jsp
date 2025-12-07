<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  width: 100%;
  background-color: #555;
  overflow: auto;
}

.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color: #000;
}

.active {
  background-color: #04AA6D;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body style="background-image:url('https://media.istockphoto.com/photos/round-podium-or-pedestal-with-blue-background-picture-id1226478932?b=1&k=20&m=1226478932&s=170667a&w=0&h=hXsvxQilNanpKx7QC_tIsFUOKPl8fdIDfJ_QSKXesGE=');background-size: 100% ">

<h2></h2>


<div class="navbar">
   
  <a class="active" href="http://localhost:4567/mvcproject/carhome.jsp"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="./enter"><i class="fa fa-car"></i> insert</a> 
  <a href="./delete"><i class="fa fa-trash-o"></i> Delete</a> 
  <a href="./update"><i class="fa fa-edit"></i> update</a>
  <a href="adminsearch.jsp"><i class="fa fa-search"></i> Search</a>
  <a href="./contact"><i class="fa fa-phone"></i>Contact </a>
   <a href="./logout"><i class="fa fa-sign-out"></i>logout </a>

</div>

</body>
</html> 
