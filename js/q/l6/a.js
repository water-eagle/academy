// 2. 내가 한 게임을 구매했다고 가정하고

// 컴퓨터의 6개의 숫자랑 내꺼랑 비교해서 몇개가 일치하는 지 세어 출력하기					 ex. 3개 일치

// 내 번호 선택
user_answer = new Array(5);
user_answer = [1, 2, 3, 4, 5, 6];

// 컴퓨터 번호 선택
random_answer = [];
random_answer = new Array(5);

/*
while (true) {
  {
    // 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.
    for (var i = 0; i < random_answer.length; ++i) {
      random_answer[i] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지
      for (var j = 0; j < i; ++j) {
        if ((random_answer[i] = random_answer[j])) {
          continue;
        } else {
          document.write(random_answer[i]);
          document.write("<br>");
          break;
        }
      }
    }
  }
}
*/

// random_answer[0] 랜덤 번호 생성
random_answer[0] = Math.floor(Math.random() * 98) + 1; // 1 ~ n 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.
document.write(random_answer[0]);
document.write("<br>");

//// 앞선 번호들과 비교하여 중복된 번호가 나온 경우 다시 번호를 뽑게 하기(그렇게 해서 나온 번호도 또 검사를 계속 해야함)
while (true) {
  random_answer[1] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

  if (random_answer[0] != random_answer[1]) {
    document.write(random_answer[1]);
    document.write("<br>");
    break;
  }
}

while (true) {
  random_answer[2] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

  if (random_answer[0] != random_answer[1]) {
    if (random_answer[1] != random_answer[2]) {
      document.write(random_answer[1]);
      document.write("<br>");
      break;
    } else {
      continue;
    }
  } else {
    continue;
  }
}

while (true) {
  random_answer[3] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

  if (random_answer[0] != random_answer[3]) {
    if (random_answer[1] != random_answer[3]) {
      if (random_answer[2] != random_answer[3]) {
        document.write(random_answer[3]);
        document.write("<br>");
        break;
      } else {
        continue;
      }
    } else {
      continue;
    }
  } else {
    continue;
  }
}

while (true) {
  random_answer[4] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

  if (random_answer[4] != random_answer[0]) {
    if (random_answer[4] != random_answer[1]) {
      if (random_answer[4] != random_answer[2]) {
        if (random_answer[4] != random_answer[3]) {
          document.write(random_answer[4]);
          document.write("<br>");
          break;
        } else {
          continue;
        }
        break;
      } else {
        continue;
      }
    } else {
      continue;
    }
  } else {
    continue;
  }
}

while (true) {
  random_answer[5] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

  if (random_answer[5] != random_answer[0]) {
    if (random_answer[5] != random_answer[1]) {
      if (random_answer[5] != random_answer[2]) {
        if (random_answer[5] != random_answer[3]) {
          if (random_answer[5] != random_answer[4]) {
            document.write(random_answer[5]);
            document.write("<br>");
            break;
          } else {
            continue;
          }
        } else {
          continue;
        }
      } else {
        continue;
      }
    } else {
      continue;
    }
  } else {
    continue;
  }
}

while (true) {
  random_answer[6] = Math.floor(Math.random() * 98) + 1; // 1 ~ 99 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.

  if (random_answer[6] != random_answer[0]) {
    if (random_answer[6] != random_answer[1]) {
      if (random_answer[6] != random_answer[2]) {
        if (random_answer[6] != random_answer[3]) {
          if (random_answer[6] != random_answer[4]) {
            if (random_answer[6] != random_answer[5]) {
              document.write(random_answer[6]);
              document.write("<br>");
              break;
            } else {
              continue;
            }
          } else {
            continue;
          }
        } else {
          continue;
        }
      } else {
        continue;
      }
    } else {
      continue;
    }
  } else {
    continue;
  }
}
