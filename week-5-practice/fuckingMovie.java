import java.util.Scanner;
public class fuckingMovie{
    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.input();
        System.out.println();
    }
}
class Movie{
    private String title;
    private String director;
    private String grade;
    private String year;
    
    void input(){
        Scanner sc = new Scanner(System.in);
        title = sc.next();
        director = sc.next();
        grade = sc.next();
        year = sc.next();
    }
    public String toString(){
        return String.format("%s %s %s %s", title, director, grade, year);
    }
}