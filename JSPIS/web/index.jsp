<%-- 
    Document   : Index
    Created on : Dec 11, 2022, 8:05:56 PM
    Author     : Laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            *{text-align: center;}
        </style>
        <div>
            <form action="Odgovor.jsp" method="POST">
                <img style="width:300px;height:300px" src="C:\Users\Laptop\Desktop\Java\JSPIP\JSPIS\Slike\Slika1.PNG" alt="25+45"><br>
                <label for="odgovor">Vas prvi odgovor:</label>
                <input type="number" name="Broj1"><br>
                <img style="width:300px;height:300px" src="C:\Users\Laptop\Desktop\Java\JSPIP\JSPIS\Slike\Slika2.PNG" alt="100+300"><br>
                <label for="odgovor">Vas drugi odgovor:</label>
                <input type="number" name="Broj2"><br>
                <img style="width:300px;height:300px" src="C:\Users\Laptop\Desktop\Java\JSPIP\JSPIS\Slike\Slika3.PNG" alt="325+177"><br>
                <label for="odgovor">Vas treci odgovor:</label>
                <input type="number" name="Broj3"><br>
                <img style="width:300px;height:300px" src="C:\Users\Laptop\Desktop\Java\JSPIP\JSPIS\Slike\Slika4.PNG" alt="450+85"><br>
                <label for="odgovor">Vas cetvrti odgovor:</label>
                <input type="number" name="Broj4"><br>
                <img style="width:300px;height:300px" src="C:\Users\Laptop\Desktop\Java\JSPIP\JSPIS\Slike\Slika5.PNG" alt="90+124"><br>
                <label for="odgovor">Vas peti odgovor:</label>
                <input type="number" name="Broj5"><br>
                <input type="submit" value="submit" name="submit">
            </form>
        </div>
    </body>
</html>
