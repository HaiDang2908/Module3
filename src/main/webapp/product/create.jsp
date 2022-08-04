<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/4/2022
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Product</h1>

<h1>Create new Product</h1>
<form action="/product?action=create" method="post">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="price">Price</label></td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
        <tr>
            <td><label for="quantity">Quantity</label></td>
            <td><input type="text" name="quantity" id="quantity"></td>
        </tr>
        <tr>
            <td><label for="color">Color</label> </td>
            <td><input type="text" name="color" id="color"> </td>
        </tr>
        <tr>
            <td><label for="description">Description</label></td>
            <td><input type="text" name="description" id="description"></td>
        </tr>
        <tr>
            <td><label for="category">Category</label></td>
            <td>
                <select name="category" id="category">
                    <c:forEach items="${categories}" var="c">
                        <option value="${c.getId()}">${c.getName()}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Create</button>
            </td>
        </tr>
    </table>
</form>



</body>
</html>
