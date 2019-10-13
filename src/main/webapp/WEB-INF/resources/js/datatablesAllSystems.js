$(document).ready( function () {
    var table = $('#allSystemsTable').DataTable({
        "sAjaxSource": "/bluesoftrecruitmentapplictation_war/api/allSystems",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "name"},
            { "mData": "description" }
        ]
    })
});
