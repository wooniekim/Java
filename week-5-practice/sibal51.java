import java.util.Scanner;
public class sibal51{
    public static void main(String[] args) {
        MyDate md = new MyDate();
        md.input();
        md.print1();
        md.print2();
    }
}

class MyDate{
    public int y, m, d;
    public String mon[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요 : ");
        y = sc.nextInt();
        System.out.println("월을 입력하세요 : ");
        m = sc.nextInt();
        System.out.println("일을 입력하세요 : ");
        d = sc.nextInt();
        sc.close();
    }
    void print1(){
        System.out.println(y + "." + m + "." + d);
    }
    void print2(){
        System.out.println(mon[m - 1] + " " + d + ", " + y);
    }
}