<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="./js/script.js"></script>
<style type="text/css"><!--@import url(./css/format.css);--></style>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="proxy" scope="session" class="org.example.www.AKWS1011GXX.AutoKaufProxy" />
<h1 align="center">Portal - Autokauf</h1>
<table>
<tr class="tr_head">
<th>AutoID</th>
<th>Autofarbe</th>
<th>Sitzplätze</th>
<th>Bereits gekauft</th>
</tr>
<%
AKWS1011GXX.AutoKauf.Types.Auto[] autos = proxy.alleAutosAnzeigen("in");
for (int i=0; i< autos.length;i++){
%>
<tr id="tr_<%= autos[i].getAutoID()%>" onmouseover="mouseOver(this)" onmouseout="mouseOut(this)" onclick="selectAuto(this)">
<td><%= autos[i].getAutoID() %></td>
<td><%= autos[i].getFarbe() %></td>
<td><%= autos[i].getAnzahlSitze() %></td>
<td><%= autos[i].isGekauft()?"ja":"nein" %></td>
</tr>
<%
}
%>
</table> 
<p>
<form method="post" action="Ergebnis.jsp">
<input type="hidden" name="method" value=""/>
<input type="hidden" name="autoID" value=""/>
<input type="button" name="kaufeAuto" value="Kaufen" onclick="sendRequest(this)"/>
<input type="button" name="verkaufeAuto" value="Verkaufen" onclick="sendRequest(this)"/>
</form>
</p>
</body>
</html>