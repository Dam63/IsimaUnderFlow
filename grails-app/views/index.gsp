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
			<div><h3 style="padding-left: 12px"><g:message code="default.lastQuestions"/></h3></div>
			<g:each var="question" in="${Question.getAll()}">
				<g:questionMini question="${question}"></g:questionMini>
			</g:each>
			<div style="clear: both; border-bottom: thin solid #BEBEBE"> </div>
		</div>
	</body>
</html>
