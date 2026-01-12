// for - break/continue (label 사용)

var r = Math.floor(Math.random() * 9) + 1; // 1 ~ 10 랜덤값 준비
document.writeln(r);
for (var i = 1; i <= 10; ++i) {
  if (r == i) {
    continue;
  } else {
    document.write(i);
  }
}

// // 간단한 중첩 반복문 예제 (라벨이 유용한 경우):
// let target = 7;

// outer: for (let i = 1; i <= 10; i++) {
//   for (let j = 1; j <= 3; j++) {
//     if (i === target) {
//       // 내부에서 바깥 반복문의 다음 i로 건너뛴다
//       continue outer;
//     }
//     console.log(`i=${i}, j=${j}`);
//   }
// }

// // break 예제 (조건 만족하면 모든 반복 종료):
// outer: for (let i = 1; i <= 10; i++) {
//   for (let j = 1; j <= 3; j++) {
//     if (i === 7) {
//       break outer; // 바깥 반복문 전체 종료
//     }
//     console.log(i, j);
//   }
// }

// // 사용자 파일에 바로 적용 가능한 간단 수정(원래 의도: 1~10 랜덤, 해당 숫자만 건너뛰기):
// var r = Math.floor(Math.random() * 10) + 1; // 1 ~ 10
// document.writeln(r);

// for (var i = 1; i <= 10; ++i) {
//   if (r == i) {
//     continue; // 같은 동작: 같은 루프에서라면 라벨 불필요
//   } else {
//     document.write(i);
//   }
// }
