### 1번
- 자바 언어에서 사용 되는 8개의 기초 자료형은 무엇인가
- byte, short, int, long, float, double, char, boolean

<hr>

### 2번
- 결과들을 적으시오
    - 100200
    - 300
    - 100200

<hr>

### 3번
- 참조형 변수의 크기는 얼마일까? 즉 몇 바이트일까?
- 4byte로 객체의 주소 값을 가진다

<hr>

### 4번
- 2개의 값을 비교할 때 =와 ==중 무엇을 사용하여야하는가?
- =는 변수에 값을 대입할 떄 사용 하는 대입연산자이므로, 비교연산자인 == 를 사용해야한다.

<hr>

### 5번
- 5. 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에서는 10% 부가세와 잔돈 등이 인쇄되어 있다. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성하여 보자.
```java
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력해주세요: ");
        int totalMoney = sc.nextInt(); // 상품의 총액
        System.out.println("지불할 금액을 입력해주세요: ");
        int getMoney = sc.nextInt(); // 받은 돈
        int surtax = totalMoney / 10; // 부가세 ~ 10%

        System.out.println("받은 돈: " + getMoney + "원\n"
                            + "상품의 총액: " + totalMoney + "원\n"
                            + "부가세: " + surtax + "원\n"
                            + "잔돈: " + (getMoney - totalMoney) + "원");
        sc.close();
    }
}
```

### 6번
```java
bin = num%2 + bin;
num /=2;
```


### 7번
- 3개의 숫자를 받아서 크기 순으로 정렬하는 프로그램을 작성하여 보자. if-else를 사용한다.
- 앞이 젤 작음
```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("세 정수를 입력하세요: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt(); // 3번 비교??
        if(a > b)
            if(a>c)
                if(b>c)
                    System.out.printf("%d>%d>%d", a, b, c);
                else
                    System.out.printf("%d>%d>%d", a, c, b);
            else
                System.out.printf("%d>%d>%d", c, a, b);
        else
            if(b>c)
                if(a>c)
                    System.out.printf("%d>%d>%d", b, a, c);
                else
                    System.out.printf("%d>%d>%d", b, c, a);
            else
                System.out.printf("%d>%d>%d", c, b, a);
        sc.close();
    }
}
```

```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, temp;
        System.out.println("세 정수를 입력하세요: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b>c){
            temp = b;
            b = c;
            c = temp;
        }
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
    }
}

```

<hr>

### 8번
- 키보드에서 영문자를 읽어서 모음과 자음을 구분하는 프로그램 작성(switch문 사용)

```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("영문자를 하나 입력하세요: ");
        str = sc.nextLine();
        switch(str){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(str + "는 모음입니다...!");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println(str + "는 자음입니다...!");
                break;
            default:
            break;
        }
        sc.close();
    }
}
```
<hr>

### 연습문제 9
- 계산기 프로그램
- 먼저 연산자를 입력받고
- 숫자 두개를 입력받는다
- if-else사용
- 나눗셈을 할때는 분모가 0이 아닌지를 검사하여야한다.
- equals() ~ (메소드)양쪽의 값을 비교한 후 값을 boolean타입으로 반환, 대상의 내용 자체를 비교, ==는 대상의 주소값을 비교
```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        String operator = "";
        System.out.println("어떤 계산을 원하십니까? +, -, *, / 중 입력하세요");
        operator = sc.nextLine();
        System.out.println("숫자 1을 입력하세요");
        num1 = sc.nextInt();
        System.out.println("숫자 2를 입력하세요");
        num2 = sc.nextInt();
        if(operator.equals("+")){ // 더하기
            result = num1 + num2;
            System.out.println("결과는 " + result);
        } else if(operator.equals("-")){ // 빼기
            result = num1 - num2;
            System.out.println("결과는 " + result);
        } else if(operator.equals("*")){ // 곱하기
            result = num1 * num2;
            System.out.println("결과는 " + result);
        } else { // 나누기
            if(num2 == 0){ // 0이 아닌지 검사
                System.out.println("0을 입력하셨습니다.\n다시 입력해주세요");
                System.out.println("숫자 2를 입력하세요");
                num2 = sc.nextInt();
            }
            result = num1 / num2;
            System.out.println("결과는 " + result);
        }
        sc.close();
    }
}
```
### 연습문제 10
- 실수를 입력받아, 반올림한 정수를 출력
```java
import java.util.Scanner;
public class week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        int num;
        System.out.println("실수를 입력하세요: ");
        num1 = sc.nextFloat(); // 실수를 입력받아서 변수에 저장
        if(num1 > 0){ // 양수일 때
            num = Math.round(num1); // Math.round() ~ 전달받은 실수의 소수점 첫번째 자리를 반올림하여 정수로 반환
            System.out.println("반올림한 정수는: " + num);
        } else { // 음수일 때
            num = Math.round((num1 * -1));  // 음수일때 계산이 이상해서 양수로 바꾼 후 변환하고 음수로 다시 변환
            System.out.println("반올림한 정수는: " + (num * -1));
        }
        sc.close();
    }
}
```


