
$(document).ready( function () {
    var table = $('#allContractsTable').DataTable({
        "sAjaxSource": "/bluesoftrecruitmentapplictation_war/api/allContracts",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "number"},
            { "mData": "system.name"},
            { "mData": "startDate" },
            { "mData": "endDate" },
            { "mData": "settlement" },
            { "mData": "payment" },
            { "mData": "status" }
        ]
    })
});