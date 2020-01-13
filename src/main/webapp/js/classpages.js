$(document).ready(function () {
    $.ajax({url:"/student/keeplogin.do",
        type:"post",
        success:function (data) {
            $(".stuname-show").html(data);
            $.studentClass(data);
        },
        error:function (data) {
            alert(data);
        }
    });
});
$.studentClass=function (sNum) {
    var classes = {};
    $.ajax({url:"/class/getclass.do",
        type:"post",
        data:{"sNum":sNum},
        success:function (data) {
            classes = JSON.parse(data);
            for(var i=0;i<classes.length;i++){
                $(".myclass-info").append("<button onclick='$.gotoMyClass' value='"+classes[i].cLname+"'>"+classes[i].cLname+"</button>")
            }
        },
        error:function (data) {
            alert(data);
        }
    });
}
$.gotoMyClass=function () {

}
$.stuGetIntoClass=function () {
    $.ajax({url:"/class/addstuforclass.do",
        type:"post",
        data:{"cLnum":$("#classNum").val(),"sNum":$(".stuname-show").val()},
        success:function (data) {
            location.replace("/html/classpages.html");
        },
        error:function () {

        }
    });
}