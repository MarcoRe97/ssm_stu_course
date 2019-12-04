$.registerSubmit=function () {
    $.ajax({
        url:"/student/register.do",
        type:"post",
        data:{"sNum":$("#lNum").val(),"sPwd":$("#lPwd").val(),"sCall":$("#lCall").val()},
        success:function (data) {
            if(data == "success"){
                alert("注册成功");
            }
        },
        error:function () {
            alert("注册失败");
        }
    });
}