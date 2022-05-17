## 1번
```java
public class week4{
    public static void main(String[] args) {
    double s[] = {1.0, 2.0, 3.0, 4.0};
    double sum = 0;
    for(int i = 0; i < s.length; i++){
        sum += s[i];
    }
    System.out.println("합은 : " + sum);
    System.out.println("최대값은 : " + maximum(s));
    }
    static double maximum(double x[]){
        double maximum = x[0];
        for(int i = 1; i < x.length; i++){
            if(x[i] > maximum){
                maximum = x[i];
            }
        }
        return maximum;
    }
}
```
## 2번
```java
import java.util.Arrays;

public class week4{
    public static void main(String[] args) {
        int s[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        System.out.println("3의 위치 : " + Arrays.binarySearch(s, 3));
    }
}
```
## 3번
```java
public class week4{
    public static void main(String[] args) {
        String s[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String s1[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int collector1 = (int)((Math.random()*s.length));
        // 다시 해보기
        int collector2 = (int)((Math.random()*s1.length));
        System.out.println(s[collector1] + "의" + s1[collector2]);
    }
}
```

## 4번
```java
import java.util.*;
public class week4 {
    public static void main(String args[]) {
        String[] arr = new String[10];
        int[] num = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1)+"번째 값을 입력하세요.");
            num[i] = scan.nextInt();
            } // 배열 num에 1-100개 정수 10개를 입력받는다.
        for (int i = 0; i < 10; i++) {
            arr[i] = ((i * 10) + 1) + "-" + ((i + 1) * 10) + ":";
            } // arr의 0번째 인덱스에 값의 범위를 표시하는 String을 넣는다.
        for (int i = 0; i < 10; i++)
        for (int j = 0; j < 10; j++)
        if ((i * 10)+1<=num[j] && num[j]<=(i+1)*10)
            arr[i] += "*";
            // 배열 num의 인덱스의 값에 따라 배열arr에 ‘*’를 넣는다.
        for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            } // 배열 arr을 출력한다.
    }
}

```

## 5번
```java
import java.util.Arrays;
import java.util.Scanner;
public class week4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 수를 입력하시오: ");
        int stu_num = sc.nextInt();
        int[] arr = new int[stu_num];
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("학생" + i + 1 + "의 성적을 입력하세요: ");
            int aa = sc.nextInt();
            if(aa > 100){
                System.out.println("잘못된 성적입니다. 다시 입력하시오.");
                aa = sc.nextInt();
            }
            arr[i] = aa;
        }
        double bb = Arrays.stream(arr).sum() / arr.length;

        System.out.println("성적평균은 " + bb + "입니다.");
        sc.close();
    }
}
```

## 6번
```java
import java.util.Scanner;
public class week4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("16진수 문자열을 입력하시오: ");
        String munja = sc.next();
        String[] hexa2bin = {"0000", "0001", "0010", "0011", // 0,1,2,3
                             "0100", "0101", "0110", "0111", // 4,5,6,7
                             "1000", "1001", "1010", "1011", // 8,9,A,B
                             "1100", "1101", "1110", "1111"}; // C,D,E,F
        System.out.print(munja + "에 대한 이진수는 ");
        for(int i = 0; i < munja.length(); i++){
            switch(munja.charAt(i)){
                case '0':
                    System.out.print(hexa2bin[0] + " ");
                    break;
                case '1':
                    System.out.print(hexa2bin[1] + " ");
                    break;
                case '2':
                    System.out.print(hexa2bin[2] + " ");
                    break;
                case '3':
                    System.out.print(hexa2bin[3] + " ");
                    break;
                case '4':
                    System.out.print(hexa2bin[4] + " ");
                    break;
                case '5':
                    System.out.print(hexa2bin[5] + " ");
                    break;
                case '6':
                    System.out.print(hexa2bin[6] + " ");
                    break;
                case '7':
                    System.out.print(hexa2bin[7] + " ");
                    break;
                case '8':
                    System.out.print(hexa2bin[8] + " ");
                    break;
                case '9':
                    System.out.print(hexa2bin[9] + " ");
                    break;
                case 'a':
                    System.out.print(hexa2bin[10] + " ");
                    break;
                case 'b':
                    System.out.print(hexa2bin[11] + " ");
                    break;
                case 'c':
                    System.out.print(hexa2bin[12] + " ");
                    break;
                case 'd':
                    System.out.print(hexa2bin[13] + " ");
                    break;
                case 'e':
                    System.out.print(hexa2bin[14] + " ");
                    break;
                case 'f':
                    System.out.print(hexa2bin[15] + " ");
                    break;
            }
        }
        System.out.print("입니다");
        sc.close();
        
    }
}
```


## 7번
```java
public class week4{
    public static void main(String[] args) {
        int[] baekjegob = new int[31];
        baekjegob[30] = 2;
        for(int i = 1; i < 100; i++){
            for(int j = baekjegob.length - 1; j >= 0; j--){
                baekjegob[j] *= 2;
            }
            for(int k = baekjegob.length - 1; k > 0; k--){
                if(baekjegob[k] >= 10){
                    baekjegob[k - 1]++;
                    baekjegob[k] -= 10;
                }
            }
        }
        for(int y = 0; y < baekjegob.length; y++){
            System.out.print(baekjegob[y]);
        }
    }
}
```