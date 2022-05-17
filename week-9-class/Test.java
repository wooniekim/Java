abstract class Animal{
    abstract void speak();
}
class Dog extends Animal{
    void speak(){System.out.println("멍멍");}
}
class Cat extends Animal{
    void speak(){System.out.println("야옹");}
}
class Cow extends Animal{
    void speak(){System.out.println("음메");}
}
public class Test {
    public static void main(String[] args) {
        Animal[] ani = {new Dog(), new Cat(), new Cat(), new Cow()};
        for(Animal a : ani) // 
            a.speak();
        
    }
}
