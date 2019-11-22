//登录
$.loginSubmit=function(){
    var student={};
    student.stuNum =$(".username").val();
    student.stuPwd =$(".password").val();
    $.ajax({url:"/student/login.do",
        type:"post",
        data:{"stuNum":$(".username").val(),"stuPwd":$(".password").val()},
        // dataType:"json",
        // contentType: "application/json; charset=utf-8",
        success:function (data) {
            if(data == "success"){
                alert("登录成功");
            }
            else if(data == "faile-password"){
                alert("密码错误")
            }
            else{
                alert("登录失败")
            }
        },
        error:function (data) {
            alert(data);
        }
    });
}