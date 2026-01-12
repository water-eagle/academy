function Monster(name, hp, attack) {
  //속성, 프로퍼티
  this.name = name; // 이름
  this.hp = hp; // 체력
  this.attack = attack; // 공격력

  this.info = function () {
    hr();
    dw("[" + name + "][" + hp + "][atk:" + attack + "]");
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
        "][" +
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
elf.hp = elf.hp - orc.attack;
orc.hp = orc.hp - elf.attack;
hr();
// 각 객체의 info 를 호출하여 현재 정보 출력
orc.info();
elf.info();
