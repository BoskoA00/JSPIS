<%-- 
    Document   : Odgovor
    Created on : Dec 24, 2022, 4:30:15 PM
    Author     : Laptop
--%>
<%
    String o1,o2,o3,o4,o5;
    int b1,b2,b3,b4,b5,i=0;
    o1=request.getParameter("Broj1");
    o2=request.getParameter("Broj2");
    o3=request.getParameter("Broj3");
    o4=request.getParameter("Broj4");
    o5=request.getParameter("Broj5");
    b1=Integer.parseInt(o1);
    b2=Integer.parseInt(o2);
    b3=Integer.parseInt(o3);
    b4=Integer.parseInt(o4);
    b5=Integer.parseInt(o5);
    if(b1==70){i++;}else{}
    if(b2==400){i++;}else{}
    if(b3==502){i++;}else{}
    if(b4==535){i++;}else{}
    if(b5==214){i++;}else{}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <%if (i==0) {%>
            Pogresni odgovori
            <%}else{%>
            Vas rezultat
            <%}%>
        </title>
    </head>
    <body style='text-align: center;'>
        <%if (i==0){%>
        <h1 style='color:red'>Vasi odgovori su pogresni!!!</h1>
        <%} else if(i==1){%>
        <h1 style='color:green'>Vas rezultat je 1</h1>
        <%} else if(i==2){%>
        <h1 style='color:green'>Vas rezultat je 2</h1>
        <%} else if(i==3){%>
        <h1 style='color:green'>Vas rezultat je 3</h1>
        <%} else if(i==4){%>
        <h1 style='color:green'>Vas rezultat je 5</h1>
        <%} else if(i==5){%>
        <h1 style='color:green'>Vas rezultat je 5</h1>
        <%}%>
    </body>
</html>
