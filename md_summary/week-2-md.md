## 반복문
- 이벤트 루프
    - 반복횟수 불명확
    - while문
- 카운트 루프
    - 반복횟수 명확
        for문
- 이중루프
- 분기문 : break문, continue문

### while문
- 조건식이 참이면 반복을 계속함
- 초기값, 조건식, 변경문(반복을 멈출 수 있게 함)
```java
while(조건식){
    문장1;
    문장2;
}
```
### 연습문제
- 최대 공약수 찾기
- 순서
    - 두 수 가운데 큰 수를 x, 작은 수를 y라 함
    - y가 0이면 공약수는 x와 같음
    - r <-- x % y
    - x <-- y
    - y <-- r
    - 단계2로 되돌아감
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("두개의 정수를 입력하시오(큰수, 작은수)");
        a = sc.nextInt(); // 정수1
        b = sc.nextInt(); // 정수2
        while(b != 0){ 
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println("최대 공약수는: " + a);
        sc.close();
    }
}
```

### 연습문제
- 정수를 입력받아, 각 자리수의 합을 출력
- 예) 정수입력: 12345, 각 자리수의 합 = 15
- 조건) 이벤트루프문제 => while문으로 작성
- 힌트) n % 10 ~ 1의 자리수 추출

```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int a = sc.nextInt();
        int sum = 0; // 초기값

        while(a > 0){ // 조건식
            sum += a%10; // 1의 자리 골라내기를 반복
            a /= 10;
        }
        System.out.println("각 자리수의 합: " + sum);
        sc.close();
    }
}
```

## do-while문
- Pre-Test
    - 조건체크 후 반복
    - while문, for문
- Post-Test
    - 1회 수행 후 추가 반복 여부를 조건체크(한 번은 무조건 수행함)
    - do-while문
```java
do{
    문장1;
    문장2;
} while(조건); // 반복 조건을 가장 아래에서 검사
```

### 연습문제
- 숫자 추측게임
    - 사용자로부터 1 - 100사이의 정수를 입력받아, 추측결과 출력
- 1 ~ 100 임의의 정수
    - Math.random(): [0, 1)
    - (int)(Math.random()*100) + 1
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random()*100) + 1; // 정답
        int guess;
        int tries = 0;

        do {
            System.out.println("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            tries++;

            if (guess > answer)
                System.out.println("제시한 정수가 높습니다");
            if (guess < answer)
                System.out.println("제시한 정수가 낮습니다");
        } while(guess != answer);

        System.out.println("축하합니다. 시도횟수=" + tries);

        sc.close();
    }
}
```
## for문
- 정해진 횟수만큼 반복
```java
for(초기식; 조건식; 증감식){
    반복문장;
}
```
### 연습문제
- 팩토리얼 계산하기
- n! 1*2*3*...*n --> 1~n까지의 누적 곱
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        long fact = 1; // 21부터 오버플로
        int n;

        System.out.println("정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i<= n; i++) // 팩토리얼은 정수를 전부 곱해서 계산하므로 초기값은 0이면 안된다
            fact *= i;
        System.out.printf("%d!은 %d입니다.", n, fact);
        sc.close();

    }
}
```

### 연습문제
- 약수 계산하기
- 사용자로부터 양의 정수 n을 입력 받아, n의 모든 약수들을 출력하는 프로그럄
- i가 n의 약수이면 --> n%i==0
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수를 입력하시오: ");
        int n = sc.nextInt();

        System.out.println(n + "의 약수는 다음과 같습니다.");
        for(int i = 1; i <= n; ++i){
            if(n%i == 0){
                System.out.println(" " + i);
            }
        }
        sc.close();
    }
}
```

## 중첩반복문

### 실습
```java
public class week1{
    public static void main(String[] args) {
        for(int i=1; i <= 5; i++){
            for(int j=1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i <= 5; i++){
            for(int j=1; j <= 5; j++){
                if(i<=j) // 대각선 위 영역
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
```

### 연습문제
- 구구단 출력
- 구구단을 세로로 출력(9행, 8열), 2단부터 9단까지
```java
```

## 분기문
- break문
    - 반복문을 벗어남
    - 반복문 다음 문장으로 제어 이동
- continue문
    - 현 반복 단계를 skip
    - 다음 반복 단계로 제어 이동
- return문(반환문)



