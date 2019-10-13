
$(document).ready( function () {
    var table = $('#activeContractsTable').DataTable({
        "sAjaxSource": "/bluesoftrecruitmentapplictation_war/api/activeContracts",
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