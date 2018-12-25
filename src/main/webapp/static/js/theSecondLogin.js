// 退出账号后的第二次登录
function secondLogin() {
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

