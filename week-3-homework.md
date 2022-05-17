## 1번
```java
public class week1 {
    public static void main(String[] args) {
        int a=900, b=1000, i, n=0, max=0;
        for(;a<=b;a++){ //입력한 a부터 b까지 연산하기위해
            for(n=1, i=a; i>1; n++){ //하나의 수를 1이 나올때까지 연산, n구하기
                if(i%2==0){
                    i/=2;
                }
                else {
                    i=i*3+1;
                } //연산
            } 
            if(max<n) max=n; //연산 중 최대의 n구하기
        }
        System.out.println("가장 긴 사이클의 길이 : " + max); //출력
    }
}
```
## 2번
```java
public class week1{
    public static void main(String[] args) {
        long jesus = 0;
        for(int k = 1; k <= 5000; k++){
            if(isgenerator(k)){
                jesus += k;
            }
        }
        System.out.println(jesus);
    }
    static int generator(int x){
        int sum = 0;
        while(x != 0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
    static boolean isgenerator(int x){
        for(int i = 1; i <= x; i++){
            if(i + generator(i) == x)
                return false;
        }
        return true;
    }
}
```
## 3번
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10진수 입력: ");
        int x = sc.nextInt();
        recursive(x);
        sc.close();
    }
    static void recursive(int x){
        if(x == 0) 
        return;

        recursive(x / 2);
        System.out.print(x % 2);
    }
}
```
## 4번
```java
import java.util.Scanner;
public class Primenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2진수 입력 : ");
        int a = sc.nextInt();
        System.out.println("10진수 : " + convertDecimal(a));
        sc.close();
    }
    static int convertDecimal(int x){
        if(x == 0)
            return 0;
        else
        return (x % 10 + 2 * convertDecimal(x / 10));
        }
    }

```
## 5번
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String x = sc.nextLine();
        if(isPalindrome(x)) System.out.println("회문여부 : True");
        else System.out.println("회문여부 : False");
        sc.close();
    }
    static boolean isPalindrome(String a){
        if(a.length() == 0 || a.length() == 1) return true;
        if(a.charAt(0) == a.charAt(a.length() - 1)) 
        return isPalindrome(a.substring(1, a.length() - 1));
        return false;
    }
}
```
## 6번
```java
import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int a = sc.nextInt();
        String str = String.format("%,d", a);
        System.out.println("금액 출력: " + str + "원");
        sc.close();
    }
}
```