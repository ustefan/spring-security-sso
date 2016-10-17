<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
<h3>Success login !</h3>
<sec:authentication var="principal" property="principal"/>
<h3>Hello ${principal.username}</h3>
<a href="<c:url value='/logout' />">Logout</a>
</body>
</html>
