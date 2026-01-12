// 1~100마리 랜덤하게 나오게 처리
var random = Math.floor(Math.random() * 100) + 1;

document.writeln("고양이 이미지 " + random + "번 출력");

for (i = 1; i <= random; i++) {
  document.writeln("<img src='../../../assets/kabo-p6yH8VmGqxo-unsplash.jpg'>");
}
