<%--
  Created by IntelliJ IDEA.
  User: pkania
  Date: 2019-10-11
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h3>Add new Contract form</h3>
<form action="addContract" method="post">
    <div class="row">
        <div class="col">
            <label>Contract number</label>
            <input type="String" name="contractNumber"class="form-control" placeholder="ContractNumber">
        </div>
    </div>
    <div class="row">
        <div class="col">
            <label>Start date</label>
            <input type="date" name="startDate"class="form-control" placeholder="Start date">
        </div>
        <div class="col">
            <label>End date</label>
            <input type="date" name="endDate" class="form-control" placeholder="End date">
        </div>
    </div>

    <div class="row">
        <div class="col">
            <label>Settlement</label>
            <input type="text" name="settlement" class="form-control" placeholder="Monthly, Annual, Quarterly....">
        </div>
        <div class="col">
            <label>Payment</label>
            <input type="text" name="payment"class="form-control" placeholder="Payment">
        </div>
    </div>

    <div class="row">
        <div class="col-2">
            <label>System Name</label>
            <input type="text" name="systemName" class="form-control" placeholder="System name"><br>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Add Contract</button>
</form>

