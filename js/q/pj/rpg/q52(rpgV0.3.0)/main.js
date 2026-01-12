function Monster(name, hp, attack) {
  //속성, 프로퍼티
  this.name = name; // 이름
  this.hp = hp; // 체력
  this.attack = attack; // 공격력

  this.info = function () {
    hr();
    dw("[" + this.name + "][hp: " + this.hp + "][atk:" + this.attack + "]");
    hr();
  };
}

function Character(name, hp, attack, mp) {
  //속성, 프로퍼티
  this.name = name; // 이름
  this.hp = hp; // 체력
  this.attack = attack; // 공격력
  this.mp = mp;

  this.info = function () {
    hr();
    dw(
      "[" +
        this.name +
        "][hp:" +
        this.hp +
        "][atk:" +
        this.attack +
        "][mp:" +
        this.mp +
        "]"
    );
    hr();
  };
}

var orc = new Monster("오크전사", 100, 10);

var elf = new Character("엠피스", 200, 20, 100);

orc.info();
elf.info();
hr();
document.write("전투시작");

// 오크와 엘프 간 전투 처리 (서로 한번씩만 때려 피해를 입히는 처리)
var elf_attack = r(elf.attack);
var orc_attack = r(orc.attack);
orc.hp = orc.hp - elf_attack;
elf.hp = elf.hp - orc_attack;

hr();
// 각 객체의 info 를 호출하여 현재 정보 출력
orc.info();
elf.info();

// - 공격력을 해당 공격력 수치와 0사이의 값이 랜덤으로 나오도록 수정하였습니다.
// 1.다음 함수를 추가

// common.js에 r로 대체
// function getRandomAttackValue(attack) {
//   attack = attack + 1; //ex. 공격력이 10이라고 하면 0~10의 수치로 나와야 하므로
//   var random = Math.floor(Math.random() * attack); // ex. 공격력이 11이고 이 랜덤처리를 하면 랜덤 값은 0~10이 나옴
//   return random;
// }

// - [x] 2.공격력으로 상대 체력을 깍는 처리를 하던 부분을 위 함수를 거친 attack 값으로 처리
// - 공격 메세지 출력 추가( ex. 오크전사가 엠피스에게 데미지를 10 입혔습니다. )
document.write(
  orc.name,
  "가 ",
  elf.name,
  "에게 ",
  orc_attack,
  "데미지를 입혔습니다."
);
hr();
document.write(
  elf.name,
  "가 ",
  orc.name,
  "에게 ",
  elf_attack,
  "데미지를 입혔습니다."
);
// 서로 데미지를 입힐 때 누가 누구에게 몇의 데미지를 입혔는지를 출력 처리
