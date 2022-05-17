# 절차지향 프로그래밍

<hr>

## 메소드
- 메소드 정의
```java
int add (int x, int y){ // 반환형 메소드이름(매개변수1..)
    return x + y // 반환문
}
```
- 설계를 잘 해야 함 --> 활용가치가 높아짐
### 연습문제
- 1 ~ 1000 소수 출력
```java
public class Primenumber {
    public static void main(String[] args) {
        int cnt = 0;
        for(int i = 1;  i <= 1000; i++){
            if(isPrime(i)){
                System.out.printf("$3d", i);
                cnt++;
                if(cnt % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
    static boolean isPrime(int n){
        if(n == 1)
            return false;
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;
        return true;
    }
}
```

### 연습문제
- 두 정수를 입력받아, 최대공약수와 최소공배수 출력
- 예 : 두 정수 입력 : 36, 24 최대공약수 = 12, 최소공배수 = 36 * 24 / 12 = 72
```java
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세용");
        int a = sc.nextInt();
        System.out.println("정수를 입력하세용");
        int b = sc.nextInt();
        System.out.println("최대공약수 = " + gcd(a, b));
        System.out.println("최소공배수 = " + (a * b / gcd(a, b)));
        sc.close();

    }
    static int gcd(int x, int y){
        int r;
        while(y != 0){
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
```

### 연습문제
- 오일러 수
- 반복문 안에 반복문을 써야하면 안의 반복문은 함수로 바꾸자
```java
public class Primenumber {
    public static void main(String[] args) {
       double e = 1.0;

       for(int i = 1; i <= 20;i++)
       e += 1.0 / factorial(i);

       System.out.println("오일러 수 = " + e);
    }
    static long factorial(int n){
        long fact = 1;
        for(int i = 1; i <= n; i++)
        fact *= i;
        return fact;
    }
}
```
<hr>

## 재귀호출
- 함수 내부에서 자기 자신을 다시 호툴하는 함수
- 함수를 재귀 호출 할 때는 문제의 크기를 줄여서 호출해야 함
- 재귀호출 함수 구성
    - Base case : 재귀호출함수를 벗어나는 부분
    - General case : 자기 자신을 다시 호출 하는 부분
- 속도는 반복문이 훨씬 더 빠르지만 더 직관적이고 이해하기 쉽기 때문에 사용
- 깔끔해야함

### 연습문제
- 두 정수를 입력 받아, 두 정수를 포함한 두 정수 사이의 모든 정수들의 합을 출력
```java
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("정수를 입력하세용:");
       int a = sc.nextInt();
       System.out.println("정수를 입력하세용:");
       int b = sc.nextInt();
       System.out.println(sum(a, b));
       sc.close();

    }
    static int sum(int x, int y){
        if(x == y)
            return x;
        return sum(x + 1, y) + x;
    }
}
```

### 연습문제
- 피보나치 수열
- 재귀호출은 아름답지만 귀찮을 수 있다

### 연습문제
- 아래 수열의 합을 재귀호출로 계산
- 1/1 + 1/2 + 1/3 + ... + 1/n
## 문자열
- String 클래스의 객체 생성
- String s = new String("Hello world!"); ~ 선언과 동시에 초기화
```java
public class yay{
    public static void main(String[] args){
        String s1 = "Hello!";
        String s2 = new String("Hello!");
    }
}
```
```java
public class week1{
    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = new String("Hello!");
        String s3 = "Hello!"; // 두번 할당하지 않고 기존에 있던 것을 가져다 씀(같은 주소를 가짐)
        String s4 = new String("Hello!");
        System.out.println(s2 == s4); // false
        System.out.println(s1 == s3); // true
    }
}
```
- String 클래스는 주로 상수 문자열
    - 변경이 불가능한 문자열
- StringBuffer와 StringBuilder 클래스는 변경 가능한 문자열
- 반복문안에서 문자열 붙일 때는 StringBuffer사용

### 연습문제
- 영문장을 입력받아, 대문자, 소문자, 빈칸 개수 출력
- 예: Hello world ~ 대문자2개, 소문자3개, 빈칸1개
