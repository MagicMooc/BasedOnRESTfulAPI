// 登录
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
                // 登录成功后，将后端返回的token转换为cookie，实现免登录
                // 跳转到studentManage.html
            }else if(res.data.code === 2) {
                document.cookie = res.data.token;
                window.location.href = "../html/studentManage.html";
            }
        })
        .catch(res => {
        })
}
// 跳转到注册页面
function jumpRegister() {
    window.location.href = "../html/register.html";
}
// 验证浏览器中是否存在cookie
function checkWhetherExistCookie() {
    var token =document.cookie.split(";")[0];
    // 如果存在token，则跳转首页
    if (token) {
        window.location.href = "static/html/studentManage.html";
    }
}
