public class Testjul {
    public static void main(String[] args) {
        int w = 10, h = 20, d = 30;
        System.out.println("부피 = " + volume(w, h, d));
        System.out.println("겉넓이 = " + area(w, h, d));
    }
    static int volume(int w, int h, int d){
        return w * h * d; // 부피 반환
    }
    static int area(int w, int h, int d){
        return (w * h + h * d + d * w) * 2; // 겉넓이 반환
    }
    
}
