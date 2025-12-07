<%@ include file="navigator.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #555;
}
</style>
</head>
<body style="background-image:url('https://www.desktopbackground.org/download/1366x768/2011/01/11/140250_hd-wallpapers-desktop-simple-plain-hd-desktop-wallpapers_1600x1000_h.jpg'); ">

<h2 style="color:orange; ">TECHNO ELEVATE</h2>
<p></p>
<br>

 <div class="column">
    <div class="card">
      <img src ="https://www.linkpicture.com/q/VEN.jpg" alt="Mike" style="size:1%;width:76%;padding-left:130px  ">
      <div class="container">
        <h2>Venkatesh Chowdary</h2>
        <p class="title">CEO & Founder>
        <p>Working as a developer at technoelevate.</p>
        <p>venkateshchowdary606@gmail.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

<div class="row">
  <div class="column">
    <div class="card">
      <img src="data:image/jpeg;base64,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" alt="Jane" style="size:50%; padding-left: 130px ">
      <div class="container">
        <h2>Dhananjay</h2>
        <p class="title">Director</p>
        <p>Working as Delivery manager for test yantra since my training</p>
        <p>dhananjay606@techno.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

 
  
  <div class="column">
    <div class="card">
      <img src="https://www.linkpicture.com/q/WhatsApp-Image-2021-12-18-at-2.44.53-PM.jpeg" alt="John" style="size:1%;width:76%;padding-left:130px">
      <div class="container">
        <h2>Sandesh Naik</h2>
        <p class="title">Developerr</p>
        <p>Working as a developer at technoelevate</p>
        <p>sandeshbee@techno.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
</div>

</body>
</html>
