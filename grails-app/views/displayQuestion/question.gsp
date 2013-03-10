<%@page import="fr.isima.isimaUnderFlow.Question"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Isima Under Flow</title>
	</head>
	<body>
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div id="page-body" role="main">
			<g:if test="${params.message}">
				<div class="info">${params.message}</div>
			</g:if>
			<g:question question="${question}"></g:question>
		</div>
	</body>
</html>