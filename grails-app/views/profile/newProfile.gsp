<%@page import="fr.isima.isimaUnderFlow.Question"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Isima Under Flow</title>
</head>
<body>
	<a href="#page-body" class="skip"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div id="page-body" role="main">
		<h1>Create profile</h1>
		<g:form controller="Profile" action="add">
			<table>
				<tr>
					<td>Profile :</td>
					<td><input type="text" width="200" name="name"></td>
				</tr>
			</table>
			<input type="submit" value="Ok">
		</g:form>
		<g:if test="${params.message}">
			<div class="info">
				${params.message}
			</div>
		</g:if>
	</div>
</body>
</html>