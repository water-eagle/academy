// 2. 1번을 응용해서 10면체, 100면체 주사위를 만들어서 각각 출력해보세요.

var random = Math.floor(Math.random() * 6) + 1; // 1 ~ 100까지 범위 내에서 랜덤한 숫자 출력

var s = "주사위를 굴려 ( " + random + " ) 이 나왔습니다.";

document.write(s);
