// 또 다른 문43 함수를 하나 더 호출하면서 이 함수의 매개변수에 위 함수(바로 윗행 함수)를 넣기
// var a = 10;

function one_plus(a) {
  return a + 1;
}

var answer = one_plus(7); // 함수를 7을 넣어 호출하기

document.writeln(answer); // 위 결과를 출력하기
