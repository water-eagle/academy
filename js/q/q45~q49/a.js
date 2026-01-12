// q45: Cat 클래스를 정의해보세요

function Cat() {
  this.name = "";
  this.age = 0;
  this.weight = 0;
  this.family = "";
  this.color = "";

  // q49: Cat 클래스에 crying() 추가
  this.crying = function () {
    document.write("야옹");
  };
}

// q46
new Cat(); // 1. Cat 클래스 객체를 생성하기.
var kitty = new Cat(); // 2. 변수 kitty 를 선언하고 여기에 위의(1. 에다가) Cat 클래스 객체 생성문을 넣기(대입하기).
kitty.name = "야옹이"; // 3. 이 클래스형 변수 kitty 가 가진 name 변수에 "야옹이" 를 넣기( "야옹이" 라고 이름 지어주기)

// q47: 문46의 키티에 나머지 값들도 넣어주시고 각각 다 출력
kitty.age = 10;
kitty.weight = 25;
kitty.family = "가족";
kitty.color = "white";

document.writeln(kitty.name); // 4. 위 고양이 이름을 출력하기

// q48:
// 추가로 Cat 클래스로 부터 yaongi 객체를 하나 더 만들기(kitty 객체는 두시고). 속성 값들도 임의로 전부 주시고

var yaongi = new Cat();
yaongi.age = 12;
yaongi.weight = 30;
yaongi.family = "가족";
yaongi.color = "white";
yaongi.name = "큰야옹이";

switch ((kitty.age, yaongi.age)) {
  case kitty.age == yaongi.age:
    document.writeln("서로 동갑입니다.");

  case kitty.age > yaongi.age:
    document.writeln("형: 야옹이\n동생: 큰야옹이");

  case kitty.age < yaongi.age:
    document.writeln("형: 큰야옹이\n동생: 야옹이");

  default:
    document.writeln("대부분 버그입니다.");
}

// q49: Cat 클래스에 crying() 각각 호출(실행)
kitty.crying;
yaongi.crying;
