class Animal{
    public void sound(){
    }
};
class Dog extends Animal {
    @Override // 재정의가 맞는지 쳌흐, 재정의하는 메소드의 형식이 부모 메소드와 다르면 오류가 뜸 
    public void sound(){ // 재정의
        System.out.println("멍멍");
    }
};
public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
