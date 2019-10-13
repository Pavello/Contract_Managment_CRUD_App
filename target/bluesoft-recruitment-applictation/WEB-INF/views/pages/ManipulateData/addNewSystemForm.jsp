<%--
  Created by IntelliJ IDEA.
  User: pkania
  Date: 2019-10-12
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<h3>Add new System
    form</h3>
<form action="addSystem" method="post">
    <div class="row">
        <div class="col-3">
            <label>Name</label>
            <input type="text" name="name"class="form-control" placeholder="Name">
        </div>
    </div>

    <div class="row">
        <div class="col-3">
            <label>Description</label>
            <input type="text" name="description" class="form-control" placeholder="Description...">
        </div>
        <div class="col-3">
        <label>Technologies</label>
        <input type="text" name="technologies" class="form-control" placeholder="Technologies..."><br>
    </div>
</div>

    <button type="submit" class="btn btn-primary">Add System</button>
</form>
    <h3>${SystemMessage}</h3>