<%@page import="fr.isima.isimaUnderFlow.Profile"%>
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
		<g:form controller="AskQuestion" action="add">
			<table>
				<tr>
					<td>Titre :</td>
					<td><input type="text" width="200" name="title"></td>
				</tr>
				<tr>
					<td>Question :</td>
					<td><textarea rows="10" name="question"></textarea></td>
				</tr>
				<tr>
					<td>Tags :</td>
					<td><input type="text" width="200" name="tags"></td>
				</tr>
				<tr>
					<td><g:select from="${Profile.getAll()}" optionValue="name"
							name="author" optionKey="id"></g:select> or <g:link controller="Profile"
							action="create">Create new</g:link></td>
				</tr>
			</table>
			<input type="submit" value="Ok">
		</g:form>
	</div>
</body>
</html>