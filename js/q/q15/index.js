// 준비. html body 내에 <div id="a"> </div> 를 추가 해 놓기

// 1. while(true) {  }를 이용해서 무한 루프 걸기. 이 안에 아래를 코딩하기.
// 2. prompt 함수를 이용하여 숫자 값을 하나 입력 받기
// 3. 숫자가 100이면 while 반복문을 끝내도록 처리
// 4. 입력 받은 값 중 마지막 값을 div 태그 내에 출력하기.

var t = document.getElementById("a");
var s = "";
while (true) {
  s = prompt("값을 입력하세요: ");
  if (s == 100) {
    break;
  } else {
    t.innerHTML = "마지막 입력값: " + s + "<br>";
  }
}
// window.onload = function () {};
