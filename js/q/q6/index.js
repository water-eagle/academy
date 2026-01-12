// 이미지 오른쪽에 각 번호 (1 .. 2 .. 3 ... ) 도 표시하기
var random = Math.floor(Math.random() * 100) + 1;

document.writeln("고양이 이미지 ", random, "번 출력<br>");

for (i = 1; i <= random; i++) {
  document.writeln(
    "<img src='../../../assets/kabo-p6yH8VmGqxo-unsplash.jpg' width='200px'>",
    i,
    "<br>"
  );
}
