class Parent {
    public Parent() {System.out.println("P1");}
    public Parent(String m) {System.out.println("P2");}
}
class Child extends Parent {
    public Child() {super("yeah");System.out.println("C1");}
    public Child(String m) {super("yeah"); System.out.println("C2");}
}
public class Test{
    public static void main(String[] args) {
        Child c = new Child();
    }
}
// P1, C1
// P2, C1
// P1, C2
// P2, C2
// 호출할때 전달값이 있는지 보기
// super 보기