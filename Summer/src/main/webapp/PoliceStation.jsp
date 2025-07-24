<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h2>Police Station Form</h2>
<form action="submitPolice" method="post">
    Station Name: <input type="text" name="stationName"><br>
    Location: <input type="text" name="location"><br>
    Inspector Name: <input type="text" name="inspectorName"><br>
    Jurisdiction Area: <input type="text" name="jurisdiction"><br>
    Total Officers: <input type="number" name="officerCount"><br>
    Emergency Number: <input type="text" name="emergency"><br>
    Email ID: <input type="email" name="email"><br>
    Contact Number: <input type="text" name="contact"><br>
    City: <input type="text" name="city"><br>
    State: <input type="text" name="state"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
