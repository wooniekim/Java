## 자료형
- 기초형 ~ 실제 값이 저장
    - 정수형 ~ int가 기본, 진수 사용 가능
        - byte
        - short
        - int
        - long
    - 실수형 ~ double이 기본
        - float
        - double
    - 논리형
        - boolean
    - 문자형
        - char
- 참조형 ~ 실제 객체를 가리키는 주소 저장

<hr>

## 형변환
- int + long = long
- int + double = double
- (int) d --> 소수 부분 버림 연산
    - (int)3.9 == 3
- String + int/double --> String + String --> String
- "1" + 2 = "12"

<hr>

## 연습문제
- 빛이 1년동안 가는 거리 출력
- 힌트 ~ 빛의 속도 = 초당 300,000km
```java
public class week1 {
    public static void main(String[] args) {
        final int lightSpeed = 300_000; // 상수 정의
        long distance = (lS * 60L * 60 * 24 * 365); // 오버플로가 발생
        System.out.println("빛이 1년 동안 가는 거리는: " + distance + "km");
    }
}
```

<hr>

- 2진수 4비트 => 16진수 1개 기호
- 0b0000 == 0x0
- 0b0001 == 0x1
- 예 ~ 0b1010_1111_0111_1100 => 0xAF7C 뭔소리여;;

<hr>

## 연습문제
- 자바 정수형 타입별 표현가능한 최대 정수와 최소 정수 출력
```java
public class week1 {
    public static void main(String[] args) {
        System.out.printf("%d, %d, %d\n",
            (byte)0x7F, (byte)0xFF, (byte)0x80);
        System.out.printf("%d, %d, %d\n",
            (short)0x7FFF, (short)0xFFFF, (short)0x80FF);
        System.out.printf("%d, %d, %d\n",
            0x7FFF_FFFF, 0xFFFF_FFFF, 0x8000_0000);
        System.out.printf("%d, %d, %d\n",
            0x7FFF_FFFF_FFFF_FFFFL, 0xFFFF_FFFF_FFFF_FFFFL, 0x8000_0000_0000_0000L);
    }
}
```
- byte --> 0b0111_1111 == 0x7F = 127
    - 0b1111_1111 == 0xFF == -1
    - 0b1000_0000 == 0x80 == -128
- short
- int
- float
        
- 음수 표기법 ~ 2의 보수 = 1의 보수 + 1
- -1 => 1의 1의 보수(1111_1110) + 1
- -2 => 0000_0010 => 1111_1101 + 1 => 1111_1110

<hr>

## 변수 이름 관례
- 클래스명 ~ 각 단어의 첫글자는 대문자로 한다
- 변수명, 메소드명 ~ 첫 번째 단어는 소문자로 시작되어 2번째 단어부터 첫글자는 대문자로 한다
- 상수명 ~ 상수는 모든 글자를 대문자로 한다

<hr>

## 수식
- 상수나 변수, 함수와 같은 피연산자들과 연산자의 조합
- 단항 연산자
- 산술 연산자
- 비교 연산자 ~ 최종결과: 논리
- 논리 연산자 ~ 최종결과: 논리
- 삼항 연산자
- 대입 연산자

<hr>

## 연산자 우선순위
- 단항연산자 > {산술연산 > 관계연산 > 논리연산} > 대입연산

## 연습문제
- 년도를 입력받아, 해당년의 날짜 수 출력
- 윤년체크 (4의 배수이면서 100의 배수가 아님, 400의 배수이면 윤년)
- y % 4 == 0 && y % 100 != 0 && y % 400 == 0
```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.println("년도를 입력하세요: ");
        y = sc.nextInt();
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
            System.out.println("날짜수 = 366");
        } else {
            System.out.println("날짜수 = 365");
        }
        sc.close();
    }
}
```
## 조건식
- 관계연산자(>, >=, <, <=, ==, !=) 활용
- Ex ~ 만약 비가 오지 않으면 테니스를 친다(비가 오는가 오지 않는가?)
- 다중 케이스(if-else)
- 케이스가 3개 이상일 경우
    - if-else문을 중첩해서 사용
        - nested-if(if안의 if)
    - switch문

## 실습
- 크기를 입력받아, 아래와 같이 출력
- 1. 10 미만이면 => small
- 2. 10 이상 ~ 20 미만 => medium
- 3. 20 이상 => large

```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("크기를 입력하세요: ");
        size = sc.nextInt();
        if(size < 10){
            System.out.println("small-size");
        } else if (size < 20){
            System.out.println("medium-size");
        } else {
            System.out.println("large-size");
        }
        sc.close();
    }
}
```

## 연습문제
- 2차 방정식의 계수를 입력받아, 방정식의 근을 출력
- 예 ~ ax^2 + bx + c = 0
```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, D;
        System.out.println("2차 방적식 계수를 입력하세요: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        D = b*b - 4*a*c; // 판별식
        if(D < 0){
            System.out.println("근이 없음");
        } else if(D == 0) {
            System.out.println("중근임ㅋ = " + -b / (2.0 * a));
        } else {
            System.out.printf("두 실근 : %.1f, %.1f\n", // %.1f ~ 소숫점 한자리까지만 출력, \n은 줄바꿈할때
            (-b + Math.sqrt(D)) / (2.0 * a), (-b-Math.sqrt(D))/(2.0 * a));
        }
        sc.close();
    }
}
```

## 연습문제
- 현재 시각을 받아서 적절한 인사말을 출력하는 프로그램 작성
```java
import java.util.Date;
public class week1 {
    public static void main(String[] args) {
        Date date = new Date();
        int currentHour = date.getHours();

        System.out.println("현재 시간은: " + date);
        if(currentHour < 11){
            System.out.println("Good morning!!");
        } else if(currentHour < 15){
            System.out.println("Good afternoon!!");
        } else if(currentHour < 25){
            System.out.println("Good evening!!");
        } else {
            System.out.println("Good night!!!");
        }
    }
}
```

## switch문
- break문이 빠지면 break문을 만날때까지 계속 반복실행된다
- case를 최대한 줄이기

## 연습문제
```java
import java.util.*;
public class week1 {
    public static void main(String[] args) {
        int month;
        int days = 0;

        System.out.println("일수를 알고 싶으면 월을 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("월의 일수는: " + days);
        sc.close();
    }
}
```
## 연습문제
- 점수를 입력받아서, 학점을 출력
- 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 50 이상 F
```java
import java.util.*;
public class week1 {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        switch(result / 10){ // 10으로 나누면 간단하게 구할 수 있다^^(case를 줄임)
            case 10:
            case 9: System.out.println("A"); break;
            case 8: System.out.println("B"); break;
            case 7: System.out.println("C"); break;
            case 6: System.out.println("D"); break;
            default: System.out.println("F");
        }
    }
}
```

## 연습문제
- 시스템에서 오늘 날짜와 현재시각 읽어와 아래와 같이 출력
- 예 ~ 2022/03/08 15:39:23
```java
import java.util.*;
public class week1 {
    public static void main(String[] args) {
        int y, m, d, h, mi, se;
        Date dt = new Date();
        y = dt.getYear() + 1900;
        m = dt.getMonth() + 1;
        d = dt.getDate();
        h = dt.getHours();
        mi = dt.getMinutes();
        se = dt.getSeconds();

        System.out.println(y + "/" + m + "/" + d + " " + h + ":" + mi + ":" + se);
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d\n");
        
    }
}
```
