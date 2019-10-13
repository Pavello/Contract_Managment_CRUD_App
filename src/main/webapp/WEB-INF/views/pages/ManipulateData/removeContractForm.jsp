<%--
  Created by IntelliJ IDEA.
  User: pkania
  Date: 2019-10-11
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<form action="removeContract" method="post">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label>Name of the Contract which you want to remove</label>
            <input type="text" name="number" class="form-control"  placeholder="Contract name">
        </div>
    </div>
    <input type="submit" value="remove" class="btn btn-primary"/>
</form>
<h3>${removeContractMessage}</h3>
