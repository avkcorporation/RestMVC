var prefix = 'services/request.php';

var RestCalc = function () {
    var a = (document.getElementById("int1").value != '')? document.getElementById("int1").value :0;
    var b = (document.getElementById("int2").value != '')? document.getElementById("int2").value :0;
    $.ajax({
        type: 'GET',
        url: prefix + '?a='+a+'&b='+b,
        dataType: 'json',
        async: true,
        success: function (result) {
            var str = 'Result: '
                + '<br>' + 'a= ' + result.a
                + '<br>' + 'b= ' + result.b
                + '<br>' + 'sum= ' + result.sum;
            document.getElementById("result").innerHTML = str;
        },
        error: function (jqXHR, textStatus, errorThrown) {
            document.getElementById("result").innerHTML = ('Error:'
                + '<br>' + 'code: ' + jqXHR.status
                + '<br>' + 'msg: ' + jqXHR.responseText);
        }
    });
};


