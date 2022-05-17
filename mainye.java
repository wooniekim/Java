import java.util.Arrays;
import java.util.Scanner;
public class mainye{
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