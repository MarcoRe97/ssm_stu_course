$.submitForAddCourse=function () {
    $.ajax({url:"/course/addcourse.do",
        type:"post",
        data:{"cName":$("#cname-ipt").val(),"cWeek":$("#cweek-ipt").val(),"cNum":$("#cnum-ipt").val()},
        success:function (data) {
            if(data == "success") {
                window.location.replace("/html/homepages.html");
            }
            else{
                alert("课程不存在");
            }
        },
        error:function () {
            alert("系统错误");
        }
    });
}