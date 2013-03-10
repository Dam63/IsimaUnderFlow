<%@page import="fr.isima.isimaUnderFlow.Profile"%>
<div class="question">
	<div class="votes"><g:link action="addVote" id="${question.id}"><g:img file="add.png" /></g:link> - <strong>${question.votes}</strong> - <g:link action="minusVote" id="${question.id}"><g:img file="minus.png" /></g:link></div>
	<div class="views"><strong>${question.views}</strong><br/>Views</div>
	<div class="title">
		<div class="profileMini"><g:profileMini profile="${question.author}"></g:profileMini></div>
		<div class="row1"><strong>${question.title}</strong></div>
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
	<div>
		<div class="question-content">${question.content}</div>
		<g:each in="${question.comments}" var="comment">
			<g:comment comment="${comment}" ></g:comment>
		</g:each>
		<div class="comment">
		<g:form action="addComment" id="${question.id}">
			<g:textArea name="comment"></g:textArea><br>
			<g:select from="${Profile.getAll()}" optionValue="name" name="author"></g:select> or <g:link controller="Profile" action="create">Create new</g:link> | <g:actionSubmit value="Comment"/>
		</g:form>
		</div>
		<div class="date"><prettytime:display date="${question.publishDate}" /></div>
		<g:each in="${question.answers}" var="answer">
			<g:answer answer="${answer}" ></g:answer>
		</g:each>
		<div class="answer">
		<g:form action="addAnswer" id="${question.id}">
			<g:textArea name="answer"></g:textArea><br>
			<g:select from="${Profile.getAll()}" optionValue="name" name="author"></g:select> or <g:link controller="Profile" action="create">Create new</g:link> | <g:actionSubmit value="Answered"/>
		</g:form>
		</div>
	</div>
	
</div>