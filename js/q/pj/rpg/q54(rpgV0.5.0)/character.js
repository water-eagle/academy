// - 케릭터 정보 표시를 수정하였습니다. ex. [엠피스(70/100)]
function Monster(name, hp_recent, hp_max, attack) {
  //속성, 프로퍼티
  this.name = name; // 이름
  this.hp_recent = hp_recent; // 현재 체력
  this.hp_max = hp_max; // 최대 체력
  this.attack = attack; // 공격력

  this.info = function () {
    hr();
    dw("[" + this.name + "(" + this.hp_recent + "/" + this.hp_max + ")]");
  };
}

function Character(name, hp_recent, hp_max, attack, mp) {
  //속성, 프로퍼티
  this.name = name; // 이름
  this.hp_recent = hp_recent; // 현재 체력
  this.hp_max = hp_max; // 최대 체력
  this.attack = attack; // 공격력
  this.mp = mp;

  this.info = function () {
    dw(
      "[" +
        this.name +
        "(" +
        this.hp_recent +
        "/" +
        this.hp_max +
        ")][mp:" +
        this.mp +
        "]"
    );
    hr();
  };
}

var orc = new Monster("오크전사", 100, 100, 10);
var elf = new Character("엠피스", 200, 200, 20, 100);
