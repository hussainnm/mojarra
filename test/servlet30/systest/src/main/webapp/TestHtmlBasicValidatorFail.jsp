<%--

    Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.

    This program and the accompanying materials are made available under the
    terms of the Eclipse Public License v. 2.0, which is available at
    http://www.eclipse.org/legal/epl-2.0.

    This Source Code may also be made available under the following Secondary
    Licenses when the conditions for such availability set forth in the
    Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
    version 2 with the GNU Classpath Exception, which is available at
    https://www.gnu.org/software/classpath/license.html.

    SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0

--%>

<html>
<title>Validator Test Page</title>
<head>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<%
  pageContext.setAttribute("hello", new String("hello"), PageContext.REQUEST_SCOPE);
%>


    <c:set scope="application" var="jakarta.faces.VALIDATE_EMPTY_FIELDS"
           value="false" />


<h1>TLV commandButton, no lable or key</h1>
This page should FAIL.
<br>
<br>

<f:view>

  <p>This must have either a label or key attribute.</p>
  <h:commandButton>
    <h:outputText value="#{hello}"/>
  </h:commandButton>

</f:view>

</body>
</head>
</html>
