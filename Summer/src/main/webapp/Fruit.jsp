<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h2>Fruit Entry Form</h2>
<form action="submitFruit" method="post">
    Fruit Name: <input type="text" name="name"><br>
    Color: <input type="text" name="color"><br>
    Price (per kg): <input type="text" name="price"><br>
    Weight: <input type="text" name="weight"><br>
    Taste: <input type="text" name="taste"><br>
    Is Seasonal: <input type="text" name="seasonal"><br>
    Country of Origin: <input type="text" name="origin"><br>
    Vitamin Content: <input type="text" name="vitamin"><br>
    Shelf Life (days): <input type="text" name="shelfLife"><br>
    Type (Citrus/Berry/etc): <input type="text" name="type"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
