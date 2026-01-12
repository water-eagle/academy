// 6면체 주사위
var random = Math.floor(Math.random() * 6) + 1; // 1 ~ 6까지 범위 내에서 랜덤한 숫자 출력

var s = "주사위를 굴려 ( " + random + " ) 이 나왔습니다.";

document.write(s);
