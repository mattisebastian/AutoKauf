<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="./js/script.js"></script>

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

<title>Limo Service</title>
</head>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">LimoLeasing</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <form method=POST action="SaveName.jsp" class="navbar-form navbar-right">
        <div class="form-group">
          <input type="text" class="form-control" name=username placeholder="Username">
        </div>
        <button type="submit" class="btn btn-default">Login</button>
      </form>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<body>
	<div class="container-fluid">
		<jsp:useBean id="proxy" scope="session"
			class="org.example.www.AKWS1011GXX.AutoKaufProxy" />
		<h1 align="center">LimoLeasing</h1>
		<% if (session.getAttribute("userName") == null) { %>
		<h2> Welcome anonymous user!</h2>
		<% } else {%>
		<h2> Welcome, <%= session.getAttribute("userName") %></h2>
		<% } %>
		
		
		<table class="table table-bordered">
			<tr class="tr_head">
				<th>Limo ID</th>
				<th>Limo Farbe</th>
				<th>Sitzplštze</th>
				<th>Bereits gebucht</th>
				<th>Ausleiher</th>
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
				<td><%=autos[i].getUserID()%></td>
				
			</tr>
			<%
				}
			%>
		</table>
		<p>
		<form method="post" action="Ergebnis.jsp">
			<input type="hidden" name="method" value="" /> <input type="hidden"
				name="autoID" value="" /> <input type="hidden"
				name="color" value="" />
			<div class="form-group">
				<input type="button" class="btn btn-success" name="kaufeAuto"
					value="Buchen" onclick="sendRequest(this)" /> <input type="button"
					class="btn btn-warning" name="verkaufeAuto" value="Stornieren"
					onclick="sendRequest(this)" />
			</div>
			<div class="form-group">
				<label for="farbeEintragen">Farbe</label> <input id="farbeEintragen"
					class="form-control" type="text" name="farbe"
					placeholder="Farbe eintragen" /> 
			</div>
			<input type="button"
					class="btn btn-danger" name="rotLackieren" value="Umlackieren"
					onclick="sendRequest(this)" />
		</form>
		</p>
	</div>
</body>
</html>