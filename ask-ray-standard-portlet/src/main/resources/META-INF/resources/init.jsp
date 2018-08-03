<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="ai.config.AiConfiguration"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.demo.apiai.model.ApiAiData"%>
<%@page import="java.util.List"%>




<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
AiConfiguration aiConfiguration = (AiConfiguration) 	renderRequest.getAttribute(AiConfiguration.class.getName());

	String authorisationToken = StringPool.BLANK;
	String numberOfRecordsDisplayed = StringPool.BLANK;
	String sortOrder = StringPool.BLANK;
	String youClass = StringPool.BLANK;
	String rayClass = StringPool.BLANK;
	String useTimeline = StringPool.BLANK;
	String centerTimeline = StringPool.BLANK;

	if (Validator.isNotNull(aiConfiguration)) {
		authorisationToken = portletPreferences.getValue("authorisationToken", aiConfiguration.authorisationToken());
		numberOfRecordsDisplayed = portletPreferences.getValue("numberOfRecordsDisplayed", aiConfiguration.numberOfRecordsDisplayed());
		sortOrder = portletPreferences.getValue("sortOrder", aiConfiguration.sortOrder());
		youClass = portletPreferences.getValue("youClass", aiConfiguration.youClass());
		rayClass = portletPreferences.getValue("rayClass", aiConfiguration.rayClass());
		useTimeline = portletPreferences.getValue("useTimeline", aiConfiguration.useTimeline());
		centerTimeline = portletPreferences.getValue("centerTimeline", aiConfiguration.centerTimeline());
	} else {
		authorisationToken = portletPreferences.getValue("authorisationToken", "");
		numberOfRecordsDisplayed = portletPreferences.getValue("numberOfRecordsDisplayed", "10");
		youClass = portletPreferences.getValue("youClass", "bg-success text-light");
		rayClass = portletPreferences.getValue("rayClass", "bg-primary text-light");
		useTimeline = portletPreferences.getValue("useTimeline", "true");
		centerTimeline = portletPreferences.getValue("centerTimeline", "true");
	}
%>

