import java.util.*;
class MyCalender{
    private int year, month, day;

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }

    static boolean isLeap(int y) { // y년은 윤년?
        if((y % 4 == 0 & y % 100 != 0) || (y % 400 == 0))
            return true;
        return false;
    }
    

    static int lastDate(int y, int m) { // y년 m월의 마지막 날짜
        if(isLeap(y))
            if(m == 2)
                return 29;
        int[] dArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        return dArr[m-1];
    }

    static int whatDay(int y, int m, int d) { // 1년 1월 1일에서 y년 m월 d일까지의 날짜수
        int date = 365 * (y - 1);
        for(int i = 1; i < y; i++)
            if(isLeap(i))
                date++;
        for(int i = 1; i < m; i++)
            date += lastDate(y, i);
        date += d;
        return date;
    }

    public void drawCalender(int year, int month) { // 달력 출력
        System.out.println(" 일 월 화 수 목 금 토");
        int end = lastDate(year, month); // 해당 년,월의 마지막날을 변수로 지정
        int dayOfWeek = whatDay(year, month, 1) % 7; // y년 m월 1일의 요일을 숫자로 (일 : 0, 월 : 1, ..., 토 : 6)
        for(int i = 0; i < dayOfWeek; i++) // 해당월 1일의 요일까지 공백으로
            System.out.print("   ");
        for(int i = 1; i <= end; i++){ 
            System.out.printf("%3d", i);
            dayOfWeek++;
            if(dayOfWeek%7==0)
                System.out.println();
        }
    }
}

public class week6test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalender m = new MyCalender();
        System.out.print("년월 입력 : ");
        m.setYear(sc.nextInt());
        m.setMonth(sc.nextInt());
        m.drawCalender(m.getYear(), m.getMonth());
        sc.close();
    }
}   