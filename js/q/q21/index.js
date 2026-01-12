// 문20	반복문 - 별찍기

// 세모 거꾸로 된거
var z = 10; // 공백 최대값 선언

for (var i = 1; i <= 10; ++i) {
  for (var k = 1; k <= z; ++k) /* z만큼 공백 */ {
    document.write("&nbsp;");
  }
  --z; // 공백의 크기를 1증가
  for (var j = 1; j <= i; ++j) {
    document.write("*");
  }

  document.write("<br>");
}
