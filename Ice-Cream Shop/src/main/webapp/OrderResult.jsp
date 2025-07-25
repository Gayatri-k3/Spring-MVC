<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Order Result</title>
</head>
<body>
<h2> Ice Cream Order Confirmation</h2>

<h3> Customer Name: ${name}</h3>
<h3> Order Placed Successfully!</h3>

<p><strong>Flavour:</strong> ${type}</p>
<p><strong>Quantity:</strong> ${quantity}</p>
<p><strong>Take Away:</strong> ${takeAway}</p>
<p><strong>Add-Ons:</strong> ${addOns}</p>
<p><strong>Coupon Used:</strong> ${coupon}</p>

<h3> Total Amount: ${total} Rs</h3>

<br>
<a href="Order.jsp">Place Another Order</a>
</body>
</html>
