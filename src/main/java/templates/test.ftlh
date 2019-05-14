<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}<#if user == "Big Joe">, our beloved leader</#if>!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  
  Compare python price
  <h1>Python<#if animals.python.price == 0>Pythons are free today!</#if></h1>
  <h1><#if animals.python.price != 0>Pythons are not free today!</#if></h1>
  
  Compare python price than Elephant
  
	<#if animals.python.price < animals.elephant.price>
	  Pythons are cheaper than elephants today.
	<#elseif animals.elephant.price < animals.python.price>
	  Elephants are cheaper than pythons today.
	<#else>
	  Elephants and pythons cost the same today.
	</#if>

</body>
</html>