<%@page import="org.omg.CORBA.LongHolder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="proxy" scope="session" class="org.example.www.AKWS1011GXX.AutoKaufProxy" />
<br/>
<h1 align="center">Portal - Autokauf</h1>
<%


String methodname = request.getParameter("method");
String farbe = request.getParameter("color");
long autoID = (long)Long.valueOf(request.getParameter("autoID"));

if (methodname.equals("kaufeAuto")) {
boolean kaResponse = proxy.kaufeAuto(autoID);
%>
<p>Die Buchung der Limo konnte <%=kaResponse?"":"leider <b>nicht</b>"%> erfolgreich durchgeführt werden.</p>
<%
}
else if (methodname.equals("verkaufeAuto")) {
boolean vkaResponse = proxy.verkaufeAuto(autoID);
%>
<p>Die Buchung der Limo konnte <%=vkaResponse?"":"leider nicht" %> erfolgreich durchgeführt werden.</p>
<%
}
else if (methodname.equals("rotLackieren")) {
	javax.xml.rpc.holders.LongHolder autoID_long = new javax.xml.rpc.holders.LongHolder(autoID);
	boolean lackResponse = proxy.farbeAendern(farbe, autoID_long);
	%>
	<p>Die Limo wurde <%=lackResponse?"":"leider nicht" %> überlackiert.</p>
	<%
}
else {
%>
<p>Unbekannter Fehler!</p>
<%
}
%>
<input type="button" value="Weiter" onclick="location.href='AutoKauf.jsp'"> </body>
</html>