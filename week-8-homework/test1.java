class Student {
    private int number; // -학번?
    public String name; // +이름
    public int getNumber(){ // number접근자
        return number;
    }
    public void setNumber(int number) { // number설정자
        this.number = number; 
    }
    public String getName(){ // name접근자
        return name;
    }
    public void setName(String name) { // name 설정자
        this.name = name; 
    }
    public String toString(){
        return String.format("학생이름은 %s\n학번은 %d", name, number);
    }
}
public class test1 extends Student {
    public String lab; // +강의실?
    public String getLab(){
        return lab;
    }
    public void setLab(String lab){
        this.lab = lab;
    }
    public static void main(String[] args) {
        Student std = new Student();
        test1 t1 = new test1();
        std.setName("woonie");
        std.setNumber(1901028);
        t1.setLab("410호");
        System.out.println(std.getName() + std.getNumber() + t1.getLab());
    }
}