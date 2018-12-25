// 获取数据
function getData() {
    axios.get('http://127.0.0.1:8085/student/findStudentList')
        .then(function (response) {
            var app = new Vue({
                el: '#app',
                data: {
                    dataInfo: response.data.result
                }
            })
        })
        .catch(function (error) {
            console.log(error);
        });
}
// 传form表单时的写法
// function insert() {
//     var params = new URLSearchParams();
//     params.append('id', document.getElementById('insertId').value);
//     params.append('name', document.getElementById('insertName').value);
//     params.append('sex', document.getElementById('insertSex').value);
//     params.append('major', document.getElementById('insertMajor').value);
//     axios.put('http://127.0.0.1:8085/student/insertStudent', params)
//         .then(function (response) {
//         })
//         .catch(function (error) {
//             console.log(error)
//         })
// }
// 传json格式的写法


// // 编辑更新一整条信息
// function updateInfo() {
//     let id = document.getElementById("updateId").value;
//     let name = document.getElementById("updateName").value;
//     let sex = document.getElementById("updateSex").value;
//     let major = document.getElementById("updateMajor").value;
//     axios.put(`http://127.0.0.1:8085/student/updateStudent`,
//         {
//             id: id,
//             name: name,
//             sex: sex,
//             major: major
//         }
//         )
//         .then(res => {
//             if (res.data.code === 1) {
//                 alert("更新成功");
//                 // 强制刷新页面
//                 window.location.href = window.location.href;
//             } else {
//                 alert('更新失败');
//             }
//         })
//         .catch(res => {
//         })
// }
