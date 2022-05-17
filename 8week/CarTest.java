class Car{
    private String model;
    public Car(String model){ this.model = model;}
    public boolean equals(Object obj){
        if(obj instanceof Car)
            return model.equals(((Car)obj).model);
        else
            return false;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car firstcar = new Car("HMW520");
        Car secondcar = new Car("HMW520");

        if(firstcar.equals(secondcar)){
            System.out.println("Same car");
        } else {
            System.out.println("Not same car");
        }
    }
}
