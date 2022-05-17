class Student {
    private int number; // -학번?
    public String name; // +이름
    public Student(int number, String name){
        super();
        this.number = number;
        this.name = name;
    }
}
public class test1_1 extends Student {
    public String lab; // +강의실?
    public test1_1(int number, String name, String lab){
        super(number, name);
        this.lab = lab;
    }
    
}