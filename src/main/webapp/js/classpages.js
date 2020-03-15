var stuNum = null;
$(document).ready(function () {
    $.ajax({url:"/student/keeplogin.do",
        type:"post",
        success:function (data) {
        stuNum = data;
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
                $(".myclass-info").append("<button  value='"+classes[i].cLname+"' onclick='$.gotoMyClass(this.value)'>"+classes[i].cLname+"</button>")
            }
        },
        error:function (data) {
            alert(data);
        }
    });
}
//跳转到个人信息页面
$.gotoMyInfo=function(){
    $.clickToMyClass=function () {
        window.location.replace("/html/homepages.html");
    }
}

/*
    进入我的班级，页面跳转
 */
$.gotoMyClass=function (classUrl) {

    window.open("/html/myclassinfo.html");
    //var classUrl = this.value();
    $.getMyClassInfo(classUrl);
}
/*
* 加入班级
* */
$.stuGetIntoClass=function () {
    $.ajax({url:"/class/addstuforclass.do",
        type:"post",
        //data:{"cLnum":$("#classNum").val(),"sNum":$(".stuname-show").val()},
        data:{"cLnum":$("#classNum").val(),"sNum":stuNum},
        success:function (data) {
            location.replace("/html/classpages.html");
        },
        error:function () {

        }
    });
}
/*获取班级信息，并渲染到新的班级页面上*/
$.getMyClassInfo=function (className) {

}