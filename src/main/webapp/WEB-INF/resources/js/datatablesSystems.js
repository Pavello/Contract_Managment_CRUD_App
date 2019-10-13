$(document).ready( function () {
    var table = $('#systemsTable').DataTable({
        "sAjaxSource": "/bluesoftrecruitmentapplictation_war/api/allSystems",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "name"},
            { "mData": "description" }
        ]
    })
});
