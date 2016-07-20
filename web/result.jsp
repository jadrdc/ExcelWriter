<%@ page import="edu.unapec.opensource.models.ViewInformation" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 19/07/2016
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
<%   ViewInformation data=(ViewInformation)request.getAttribute("information");
%>
<div>
 <h1>Resultado de Procesamiento de la hoja de Calculo</h1>
    <label>Cantidad de Elementos </label><%=data.getGrandTotal()%> </br>

    <label>Total Facturado sin Impuesto </label><%=data.getGrandTotalTax()%> </br>

    <label>Total Pagado en Impuestos </label> <%=data.getProductQuantity() %> </br>

    <label>Subtotal </label> <%=  data.getTaxttotal() %> </br>
<a href="index.jsp">Regresar  a la Pagina Principal</a>
</div>
</body>
</html>
