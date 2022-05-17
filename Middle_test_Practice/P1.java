package Middle_test_Practice;
// 팩토리얼
import java.util.Scanner;
public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력: ");
        int a = sc.nextInt();
        System.out.println("sum: " + fact(a));
        sc.close();
    }
    static int fact(int n){
        return n *= fact(n - 1);
    }
}