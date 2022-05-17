class Student{
    private String name; // 이름
    private int snum; // 학번
    private String major; // 소속학과
    private int year; // 학년
    private int credit; // 이수 학점 수
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public int getSnum(){ return snum; }
    public void setSnum(int snum){ this.snum = snum; }
    public String getMajor(){ return major; }
    public void setMajor(String major){ this.major = major; }
    public int getYear(){ return year; }
    public void setYear(int year){ this.year = year; }
    public int getCredit(){ return credit; }
    public void setCredit(int credit){ this.credit = credit; }
    public Student(){
        setName("");
        setSnum(0);
        setMajor("");
        setYear(0);
        setCredit(0);
    }
    public Student(String name, int snum, String major, int year, int credit){
        setName(name);
        setSnum(snum);
        setMajor(major);
        setYear(year);
        setCredit(credit);
    }
}
class UnderGraduate extends Student{
    private String club; // 동아리
    public UnderGraduate(String name, int snum, String major, int year, int credit, String club){
        super(name, snum, major, year, credit);
        setClub(club);
    }
    public String getClub(){ return club; }
    public void setClub(String club){ this.club = club; }
    public String toString(){
        return String.format("이름 %s\n학번 %d\n전공 %s\n학년 %d\n이수 학점 수 %d\n동아리 %s", getName(), getSnum(), getMajor(), getYear(), getCredit(), club);
    }
}
class Graduate extends Student{
    private boolean assistant;
    private double scholarship;
    public String getAssistant(){
        if(assistant)
            return "교육조교";
        else
            return "연구조교";
    }
    public void setAssistant(Boolean assistant){ this.assistant = assistant; }
    public double getScholarship(){ return scholarship; }
    public void setScholarship(double scholarship){ this.scholarship = scholarship; }
    public Graduate(String name, int snum, String major, int year, int credit, boolean assistant, double scholarship){
        super(name, snum, major, year, credit);
        setAssistant(assistant);
        setScholarship(scholarship);
    }
    public String toString(){
        return String.format("이름 %s\n학번 %d\n전공 %s\n학년 %d\n이수 학점 수 %d\n조교유형 %s\n장학현황 %f", getName(), getSnum(), getMajor(), getYear(), getCredit(), getAssistant(), getScholarship());
    }
}
public class test3 {
    public static void main(String[] args) {
        Graduate g = new Graduate("김다운", 1901028, "컴퓨터정보", 2, 24, true, 0.3);
        UnderGraduate u = new UnderGraduate("김다운", 1901028, "컴퓨터정보", 2, 24, "축구");
        System.out.println(g);
        System.out.println(u);
    }   
}