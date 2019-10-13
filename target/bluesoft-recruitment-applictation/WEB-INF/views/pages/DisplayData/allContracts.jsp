<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<meta charset="utf-8" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
<script src="<c:url value="/resources/js/datatablesAllContracts.js" />"></script>

<table id="allContractsTable" class="display">

    <!-- Header Table -->
    <thead>
    <tr>
        <th>Number</th>
        <th>System</th>
        <th>Start date</th>
        <th>End Date</th>
        <th>Settlement</th>
        <th>Payment</th>
        <th>Active?</th>
    </tr>
    </thead>
    <!-- Footer Table -->
    <tfoot>
    <tr>
        <th>Number</th>
        <th>System</th>
        <th>Start date</th>
        <th>End Date</th>
        <th>Settlement</th>
        <th>Payment</th>
        <th>Active?</th>
    </tr>
    </tfoot>
</table>
