// 注册
function registerUser() {
    let name = document.getElementById("name").value;
    let password = document.getElementById("password").value;
    axios.post(`http://127.0.0.1:8085/api/register`,
        {
            name: name,
            password: password
        }
    )
        .then(res => {
            if (res.data.code === 0) {
                alert("注册失败,用户名已经存在,请重新注册");
            } else if(res.data.code === 1){
                alert("注册成功");
                jumpToLogin();
            }
        })
        .catch(res => {
        })
}
// 注册成功后跳转到登录界面
function jumpToLogin() {
    window.location.href = "../../index.html"
}