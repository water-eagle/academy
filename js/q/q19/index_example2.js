// 문19	반복문 - 별찍기

/*

**********
*********
********
*******
******
*****
****
***
**
*

이런 모양 나오게

*/

for (var i = 1; i <= 10; i = i + 1) {
  // for(var j=10; j>=i; j=j-1){
  //     document.write("*");
  // }
  for (var j = 1; j <= 11 - i; j = j + 1) {
    document.write("*");
  }

  document.write("<br>");
}
