abstract class Shape{
    private int x, y;
    public void move(int x, int y){
        this.x  = x;
        this.y = y;
    }
    public abstract void draw();
};

class Rectangle extends Shape {
    private int width, height;
    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
};

class Circle extends Shape{
    private int radius;
    public void draw(){ // 추상메소드 구현
        System.out.println("원 그리기 메소드");
    }
};

public class test8{
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        Circle cc = new Circle();
        rc.draw();
        cc.draw();
    }
}