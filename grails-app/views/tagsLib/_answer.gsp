<div class="answer">
	<g:profileMini profile="${answer.author}"></g:profileMini>
	<div class="votes"><g:link action="addVote" id="${answer.id}"><g:img file="add.png" /></g:link> - <strong>${answer.votes}</strong> - <g:link action="minusVote" id="${answer.id}"><g:img file="minus.png" /></g:link></div>
	<div class="date"><prettytime:display date="${answer.publishDate}" /></div>
	<div>
		<div class="answer-content">${answer.content}</div>
		<div>
		<g:each in="${question.comments}" var="comment">
			<g:comment comment="${comment}" ></g:comment>
		</g:each>
		</div>
	</div>
</div>