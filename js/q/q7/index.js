// 고양이 사진 선언
const cat =
  "<img src='../../../assets/kabo-p6yH8VmGqxo-unsplash.jpg' id='cat'>";
const cat_lucky =
  "<img src='../../../assets/kabo-p6yH8VmGqxo-unsplash.jpg' id='cat_lucky'>";

// 1~100 랜덤
var random = Math.floor(Math.random() * 100) + 1;

document.writeln("고양이 이미지 ", random, "번 출력<br>");

// random만큼 고양이와 i번째 출력
for (i = 1; i <= random; i++) {
  if (i == 7) {
    document.writeln(cat_lucky, i, "<br>");
  } else {
    document.writeln(cat, i, "<br>");
  }
}
