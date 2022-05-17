// 실습 Time 클래스 작성, 사용
// 필드: int h, m, s
// 생성자(2개), 접근자, 설정자
// 기본생성자 => 현재 시각으로 초기화
// toString()

import java.util.Date;

public class week6 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(12,20,9);
        System.out.println(t1);
        System.out.println(t2);
    }
}

class Time {
    private int h, m, s;
    public Time(){
        Date d = new Date();
        h = d.getHours();
        m = d.getMinutes();
        s = d.getSeconds();
    }
    public Time(int h, int m, int s){ this.h = h; this.m = m; this.s = s; }
    public int getH(){return h;}
    public void setH(int h){this.h = h;}
    public int getM(){return m;}
    public void setM(int m){this.m = m;}
    public int getS(){return s;}
    public void setS(int s){this.s = s;}
    
    public String toString(){
        return String.format("%02d:%02d:%02d", h, m, s);
}
}
