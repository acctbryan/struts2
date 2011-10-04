<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here  test merge2 master continue1 手動merge</title>
</head>
<script type="text/javascript">
function onLogin(){
	document.forms[0].action="sso!login.action";
	document.forms[0].submit();
}
function onLogout(){
	document.forms[0].action="sso!logout.action";
	document.forms[0].submit();
}
</script>
<body>
<s:form action="sso" >
org:<s:textfield name="org"></s:textfield><br/>
name:<s:textfield name="name"></s:textfield><br/>
pwd:<s:textfield name="pwd"></s:textfield><br/>
res:<s:textarea name="res" ></s:textarea><br/>
<input type="button"  name="btnLogin" value="btnLogin" onclick="onLogin()"/>
<input type="button"  name="btnLogout" value="btnLogout"  onclick="onLogout()"/>
</s:form>

</body>
</html>
