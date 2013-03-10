<div class="question-mini">
	<div class="votes"><strong>${question.votes}</strong><br/>Votes</div>
	<div class="answers"><strong>${question.answers.size()}</strong><br/>Answers</div>
	<div class="views"><strong>${question.views}</strong><br/>Views</div>
	<div>
		<div class="row1"><g:link action="show" controller="DisplayQuestion" id="${question.id}" >${question.title}</g:link></div>
		<div class="row2">
		<g:if test="${question.tags}">
			<g:each var="tag" in="${question.tags}">
				<span class="label">${tag.label}</span> 
			</g:each>
		</g:if>
		<g:else>
			<g:message code="default.notag"/>
		</g:else>
		</div>
	</div>
</div>