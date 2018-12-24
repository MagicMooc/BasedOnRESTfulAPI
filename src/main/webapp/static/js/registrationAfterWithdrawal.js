// 该JS为退出账号后的注册


function registerOnceAgain() {
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
                jumpToLoginOnceAgain();
            }
        })
        .catch(res => {
        })
}
// 注册成功后跳转到登录界面
function jumpToLoginOnceAgain() {
    window.location.href = "../html/afterOutAccount.html"
}