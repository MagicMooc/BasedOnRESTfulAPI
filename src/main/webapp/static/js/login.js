function loginIndex() {
    let name = document.getElementById("name").value;
    let password = document.getElementById("password").value;
    axios.post(`http://127.0.0.1:8085/api/validateLogin`,
        {
            name: name,
            password: password
        }
        )
        .then(res => {
            if (res.data.code === 0) {
                alert("用户不存在");
            } else if(res.data.code === 1){
                alert("密码不正确");
                // 登录成功，跳转到studentManage.html
            } else if(res.data.code === 2) {
                jumpStudentManage();
            }
        })
        .catch(res => {
        })
}

// 登录成功跳转
function jumpStudentManage() {
    window.location.href = "static/html/studentManage.html";
}
// 跳转到注册页面
function jumpRegister() {
    window.location.href = "static/html/register.html";
}