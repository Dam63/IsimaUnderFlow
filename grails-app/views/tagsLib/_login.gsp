<g:link action="show" controller="AskQuestion">Poser une question</g:link>
<sec:ifNotLoggedIn><g:link controller="Profile" action="add">Inscription</g:link></sec:ifNotLoggedIn>
<sec:ifLoggedIn><g:link controller="logout"><g:message code="default.logout"/></g:link></sec:ifLoggedIn>
<sec:ifNotLoggedIn><g:link controller="login"><g:message code="default.login"/></g:link></sec:ifNotLoggedIn>
