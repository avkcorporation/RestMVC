<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Funt
  Date: 19.08.2016
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>JSP-Hello World</title>
    <spring:url value="resources/css/index.css" var="indexCss" />
    <spring:url value="resources/js/ajax.js" var="ajaxJs" />
    <link href="${indexCss}" rel="stylesheet" />
    <script src="${ajaxJs}"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
</head>

<style type="text/css">
</style>


<body>

<h3>Welcome, to the Mini-Calculate</h3>

<table>
    <tr>
        <td><input type="text" name="int1" id="int1" class="calc" value placeholder="0"/></td>
        <td>+</td>
        <td><input type="text" name="int2" id="int2" class="calc" value placeholder="0"/></td>
        <td></td>
        <td>
            <button type="button" name="submit" id="submit" class="calc" onclick="RestCalc()">Summarize</button>
        </td>
    </tr>
</table>
<div id="result"></div>


</body>
</html>
