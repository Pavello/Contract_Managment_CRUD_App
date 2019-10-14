<%--
  Created by IntelliJ IDEA.
  User: pkania
  Date: 2019-10-11
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<h3>Edit existing Contract</h3>
<form action="editContract" method="post">
    <div class="row">
        <div class="col-3">
            <label>Contract number</label>
            <input type="String" name="contractNumber"class="form-control" placeholder="ContractNumber">
        </div>
    </div>
    <div class="row">
        <div class="col-3">
            <label>Start date</label>
            <input type="date" name="startDate"class="form-control" placeholder="Start date">
        </div>
        <div class="col-3">
            <label>End date</label>
            <input type="date" name="endDate" class="form-control" placeholder="End date">
        </div>
    </div>

    <div class="row">
        <div class="col-3">
            <label>Settlement</label>
            <input type="text" name="settlement" class="form-control" placeholder="Monthly, Annual, Quarterly....">
        </div>
        <div class="col-3">
            <label>Payment</label>
            <input type="text" name="payment"class="form-control" placeholder="Payment">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Update</button><br>
</form>
<h3>${editContractMessage}</h3>
