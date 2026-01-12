// 문20	반복문 - 별찍기

// 세모 거꾸로 된거

for (var i = 1; i <= 10; ++i) {
  for (var k = 10; k >= i; --k) /* z만큼 공백 */ {
    document.write("&nbsp;");
  }
  for (var j = 1; j <= i; ++j) {
    document.write("*");
  }

  document.write("<br>");
}
