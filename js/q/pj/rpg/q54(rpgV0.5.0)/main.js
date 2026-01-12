orc.info();
elf.info();
hr();
document.write("전투시작");

// 오크와 엘프 간 전투 처리 (서로 한번씩만 때려 피해를 입히는 처리)
var elf_attack = r(elf.attack);
var orc_attack = r(orc.attack);
orc.hp_recent -= elf_attack;
elf.hp_recent -= orc_attack;

hr();
// 각 객체의 info 를 호출하여 현재 정보 출력
orc.info();
elf.info();

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
