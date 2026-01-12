var str_id = "";
var str_pw = "";

var input_id;
var input_pw;

window.onload = function () {
  // html 문서가 다 읽어진 후에 실행되는 함수임. 이걸 써야 아래 h1 태그(id=a)에 대한 접근이 가능해짐

  input_id = document.getElementById("id");
  input_pw = document.getElementById("pw");

  //todo

  // str_id = input_id.value;
  // str_pw = input_pw.value;
};

function login() {
  // alert("id:"+str_id+" pw:"+str_pw);
  // alert("id:" + input_id.value + " pw:" + input_pw.value);
  var local_id = "cat";
  var local_pw = "1234";

  if (local_id == input_id.value && local_pw == input_pw.value) {
    alert("로그인 성공");
  } else {
    alert("아이디 또는 비밀번호를 다시 입력해주세요!");
  }
}
