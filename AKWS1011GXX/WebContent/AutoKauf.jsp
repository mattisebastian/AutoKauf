<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="./js/script.js"></script>
<!-- Latest compiled and minified Bootstrap JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<style type="text/css">
<!--
@import url(./css/format.css);
-->
</style>
<!-- Latest compiled and minified Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<jsp:useBean id="proxy" scope="session"
			class="org.example.www.AKWS1011GXX.AutoKaufProxy" />
		<h1 align="center">Portal - Autokauf</h1>
		<table class="table">
			<tr class="tr_head">
				<th>AutoID</th>
				<th>Autofarbe</th>
				<th>Sitzplätze</th>
				<th>Bereits gekauft</th>
			</tr>
			<%
				AKWS1011GXX.AutoKauf.Types.Auto[] autos = proxy.alleAutosAnzeigen("in");
				for (int i = 0; i < autos.length; i++) {
			%>
			<tr id="tr_<%=autos[i].getAutoID()%>" onmouseover="mouseOver(this)"
				onmouseout="mouseOut(this)" onclick="selectAuto(this)">
				<td><%=autos[i].getAutoID()%></td>
				<td><%=autos[i].getFarbe()%></td>
				<td><%=autos[i].getAnzahlSitze()%></td>
				<td><%=autos[i].isGekauft() ? "ja" : "nein"%></td>
			</tr>
			<%
				}
			%>
		</table>
		<p>
		<form method="post" action="Ergebnis.jsp">
			<input type="hidden" name="method" value="" /> <input type="hidden"
				name="autoID" value="" /> <input type="button"
				class="btn btn-success" name="kaufeAuto" value="Kaufen"
				onclick="sendRequest(this)" /> <input type="button"
				class="btn btn-warning" name="verkaufeAuto" value="Verkaufen"
				onclick="sendRequest(this)" /> <input type="button"
				class="btn btn-danger" name="rotLackieren" value="Rot lackieren"
				onclick="sendRequest(this)" />
		</form>
		</p>
	</div>
</body>
</html>