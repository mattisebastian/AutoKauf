<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAutoKaufProxyid" scope="session" class="org.example.www.AKWS1011GXX.AutoKaufProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAutoKaufProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAutoKaufProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAutoKaufProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.example.www.AKWS1011GXX.AutoKauf getAutoKauf10mtemp = sampleAutoKaufProxyid.getAutoKauf();
if(getAutoKauf10mtemp == null){
%>
<%=getAutoKauf10mtemp %>
<%
}else{
        if(getAutoKauf10mtemp!= null){
        String tempreturnp11 = getAutoKauf10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String autoID_1id=  request.getParameter("autoID16");
        long autoID_1idTemp  = Long.parseLong(autoID_1id);
        boolean kaufeAuto13mtemp = sampleAutoKaufProxyid.kaufeAuto(autoID_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(kaufeAuto13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String autoID_2id=  request.getParameter("autoID21");
        long autoID_2idTemp  = Long.parseLong(autoID_2id);
        boolean verkaufeAuto18mtemp = sampleAutoKaufProxyid.verkaufeAuto(autoID_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(verkaufeAuto18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 23:
        gotMethod = true;
        String in_3id=  request.getParameter("in26");
            java.lang.String in_3idTemp = null;
        if(!in_3id.equals("")){
         in_3idTemp  = in_3id;
        }
        AKWS1011GXX.AutoKauf.Types.Auto[] alleAutosAnzeigen23mtemp = sampleAutoKaufProxyid.alleAutosAnzeigen(in_3idTemp);
if(alleAutosAnzeigen23mtemp == null){
%>
<%=alleAutosAnzeigen23mtemp %>
<%
}else{
        String tempreturnp24 = null;
        if(alleAutosAnzeigen23mtemp != null){
        java.util.List listreturnp24= java.util.Arrays.asList(alleAutosAnzeigen23mtemp);
        tempreturnp24 = listreturnp24.toString();
        }
        %>
        <%=tempreturnp24%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>