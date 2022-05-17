## 1번
```java
public class week1{
    public static void main(String[] args) {
        int sum = 0;
        int sum_sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
            sum_sum = sum_sum+sum;
        }
        System.out.println(sum_sum);
    }
}
```
<hr>

## 2번
```java
public class week1{
    public static void main(String[] args) { // 소수는 1과 자기자신으로만 나눠짐
        int count=0;
        for(int i=2; i<=100; i++){ // 1은 소수가 아니므로 2부터 시작한다
            for(int j=2; j<=i; j++){ 
                if(i%j == 0){ // 자기자신으로 나누어 져야하므로 나머지가 0이어야 한다
                    count ++; // 소수이면 카운트가 1증가한다
                }
            }
            // 핵심 : 1을 제외하고 자기 자신으로 한 번만 나눠질때 소수
            if(count==1){ // 소수이면 카운트가 1증가했으므로 출력된다
                System.out.print(i+" ");
            }
            count=0; // 카운트를 다시 초기화한다
        }
    }
}
```
<hr>

## 3번
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 0, b = 1, c;
        System.out.println("몇 번째 항까지 출력할까요? : ");
        int count = sc.nextInt();
        System.out.print(a+" "+ b+ " ");
        for(int i = 1; i <= count - 2; i++){ // 0과 1을 미리 빼줘서 
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
```
<hr>

## 4번
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n을 입력하세용");
        int n = sc.nextInt();
        double result = 0;
        
        for(int i = 1; i <= n; i++){
            result = result + 1.0/i;
        }
        System.out.println("수열의 합은: " + result);
        sc.close();
    }
}
```

## 5번
```java
public class week1{
    public static void main(String[] args) {
        int = 0;
        
        for(int i = 1; i<= 10000; i++){
            if(i / 1000 == 8)
            count++;
            if((i / 100) % 10 == 8)
            count++;
            if((i / 10) % 10 == 8)
            count++;
            if(i % 10 == 8)
            count++;
        }
        System.out.println("총 갯수 : " + count);
    }
}
```

## 6번
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자연수를 입력하세용: ");
        int num = sc.nextInt();
        for(int i = 2; i <= num; i++){
            while(num % i == 0){
                System.out.print(i + " ");
                num = num/i;
            }
        }
            sc.close();
    }
}
```

## 7번
```java
public class week1{
    public static void main(String[] args) {
        double plus = 0;
        double minus = 0;

        for(double i = 1; i <= 5000; i+=4){
            plus += 4 / i;
        }
        for(double j = 3; j <= 5000; j+=4){
            minus -= 4 / j;
        }

        System.out.println(plus + minus);
    }
}
```