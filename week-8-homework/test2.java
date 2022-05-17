class Circle{
    private double radius; // 반지름 --> 넓이(area)
    private String color; // 색?
    Circle(){ };
    Circle(double radius){ // 원의 둘레?
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){ // 원의 넓이
        return radius * radius * 3.14;
    }
}
class Cylinder extends Circle{
    private double height;
    public Cylinder(){ };
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){ 
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){ // 원기둥의 부피
        return super.getArea() * this.height;
    }
}
public class test2 {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder();
        System.out.println(
            String.format(
                "색: %s\n밑면반지름: %f\n밑면넓이: %f\n높이: %f\n부피: %f", 
                obj1.getColor(), obj1.getRadius(), obj1.getArea(), obj1.getHeight(), obj1.getVolume()));
        Cylinder obj2 = new Cylinder(5.0, 3.0);
        obj2.setColor("red");
        System.out.println(String.format("색: %s\n밑면반지름: %f\n밑면넓이: %f\n높이: %f\n부피: %f", 
        obj2.getColor(), obj2.getRadius(), obj2.getArea(), obj2.getHeight(), obj2.getVolume()));
    }
}