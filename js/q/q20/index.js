// 문20	반복문 - 별찍기

// 세모 거꾸로 된거
for (var i = 1; i <= 10; ++i) {
  for (var k = 1; k <= i; ++k) /* i만큼 공백 */ {
    document.write("&nbsp;");
  }
  for (var j = 10; j >= i; --j) {
    document.write("*");
  }
  document.write("<br>");
}
