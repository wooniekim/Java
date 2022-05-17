import java.util.Scanner;

// 영화 제목, 평점, 감독, 발표된 연도

public class sibal53 {
    public static void main(String[] args) {
        Movie1 mv = new Movie1();
        mv.input();
        mv.print();
    }
}

class Movie1{
    public String title, grade, director, year;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("영화 제목은 무엇인가요?");
        title = sc.next();
        System.out.println("영화의 평점은 몇 점인가요?");
        grade = sc.next();
        System.out.println("영화의 감독은 누구인가요?");
        director = sc.next();
        System.out.println("영화의 발표년도는 몇 년도인가요?");
        year = sc.next();
        sc.close();
    }
    void print(){
        System.out.println(String.format("제목은 %s이고 평점은 %s입니다. 감독은 %s이고 발표년도는 %s년도입니다.", title, grade, director, year));
    }
}