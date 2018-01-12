<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>

<p>
	<!-- -
	<b><liferay-ui:message key="PerfilPortlet.scoreLabel"/></b>  <%= request.getAttribute("score") %>
	 -->
	 <a href="<portlet:actionURL windowState="<%= LiferayWindowState.MAXIMIZED.toString() %>" />"
	 >maximizar</a>
	 
	
	
	
</p>