/*$.getStuCourse=function () {
    var sNum = "23";
    $.ajax({
        type:"post",
        url:"/course/getCourse.action",
        data:{"sNum":sNum},
        success:function (data) {
            for(var i=1;i<6;i++){
                for(var j=1;j<6;j++){
                    $("#table_"+j+"_"+i).html("");
                }
            }

            for (var i=0;i<data.length;i++) {
                $("#table_"+data[i].cWeek+"_"+data[i].cNum).html(data[i].cName);
            }
        }
    });
}*/
$(document).ready(function () {
    $.ajax({url:"/student/keeplogin.do",
        type:"post",
        success:function (data) {
            $(".stuname-show").html(data);
            $.studentCourses(data);
        },
        error:function (data) {
            alert(data);
        }
    });
});
$.studentCourses=function (sNum) {
    // var sNum = "23";
    var courses = {};
    $.ajax({url:"/course/getcourse.do",
        type:"post",
        data:{"sNum":sNum},
        success:function (data) {
            // alert(data);
            courses = JSON.parse(data);
            for(var i=1;i<6;i++){
                for(var j=1;j<6;j++){
                    $("#table_"+j+"_"+i).html("");
                }
            }
            for (var i=0;i<courses.length;i++) {
                $("#table_"+courses[i].cWeek+"_"+courses[i].cNum).html(courses[i].cName);
            }
        },
        error:function (data) {
            alert(data);
        }
    });
}