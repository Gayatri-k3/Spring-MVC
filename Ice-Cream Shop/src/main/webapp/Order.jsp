<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Order.jsp</title>

</head>
<body>
<p style="color:red;">${error}</p>
<form action="submitOrder" method="post">
    <div class="order-box">
        <label>Name:
            <input type="text" name="name" required/>
        </label>
        <br><br>
        <label>Flavour:
            <select name="flavour" required>
                <option value="">-- Select --</option>
                <option value="Vanilla">Vanilla</option>
                <option value="Chocolate">Chocolate</option>
                <option value="Strawberry">Strawberry</option>
                <option value="Mango">Mango</option>
            </select>
        </label>
        <br><br>
        <label>Quantity:
            <input type="number" name="quantity" required/>
        </label>
        <br><br>
        <label>Take Away:
            <input type="radio" name="takeAway" value="Yes" required/> Yes
            <input type="radio" name="takeAway" value="No" required/> No
        </label>
        <br><br>
        <label>Add Ons:
            <select name="addOns" required>
                <option value="">-- Select --</option>
                <option value="No">No</option>
                <option value="Nuts">Nuts</option>
                <option value="Choco Chips">Choco Chips</option>
                <option value="Caramel">Caramel</option>
            </select>
        </label>
        <br><br>
        <label>Coupon:
            <input type="text" name="coupon" required/>
        </label>
        <br><br>
        <input type="submit" value="ORDER" class="submit-btn" />
    </div>
</form>

</body>
</html>
