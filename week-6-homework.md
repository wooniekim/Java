## 1번
```java
import java.util.Scanner;
 
class Date{
    public void print1(int y, int m, int d){
        System.out.println(y+"."+ m+"."+d);
    }
    public void print2(int y, int m, int d){
        String[] s = {"January", "February", "March", "April", "May", "Jun", "July", "August", "September","October", "November", "December"};
        System.out.println(y+" "+ s[m - 1]+","+d);
        }
    }

public class ye {
    public static void main(String[] args) {
        Date nalja = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하시오 :");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("월을 입력하시오 :");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.print("일을 입력하시오 :");
        int day = sc.nextInt();
        sc.nextLine();
        nalja.print1(year, month, day);        
        nalja.print2(year, month, day); 
        sc.close();  
    }
}
```

## 2번
```java
public class week6test { 
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print(); 
    }
    
}
class Complex { 
    double num1; 
    double num2;
    public Complex(double num1) { this.num1 = num1;}
    public Complex(double num1,double num2) {
        this.num1 = num1; this.num2 = num2; 
    } 
    public void print() { 
        System.out.println(num1 +"+"+ num2+"i"); 
    } 
}


```

## 3번
```java
import java.util.Scanner;
public class week6homework{
    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.input();
        mv.Print();
    }
}
class Movie{
    Scanner sc = new Scanner(System.in);
    // 제목, 평점, 감독, 발표년도
    String title;
    double grade;
    String director;
    int year;
    static input(){
        System.out.println("제목을 입력하세요:");
        title = sc.next();
        System.out.println("평점을 입력하세요:");
        grade = sc.nextDouble();
        System.out.println("감독을 입력하세요:");
        director = sc.next();
        System.out.println("발표년도를 입력하세요:");
        year = sc.nextInt();
    }
    static void Print(){
        System.out.println("영화제목: " + title);
        System.out.println("평점: " + grade);
        System.out.println("감독: " + director);
        System.out.println("발표년도: " + year);
    }
}
```