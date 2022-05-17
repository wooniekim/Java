import java.util.*;
//Person 이라는 클래스를 정의하라. Person은 본문에 나오는 Comparable 인터페이스를 구현한다.
class Person implements Comparable {
	// Person은 이름(name)과 키(height)를 필드로 가진다.
	private String name;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Person(String name,int height) {
		this.name = name;
		this.height = height;
	}
	public int compareTo(Object obj) {
		Person other = (Person) obj;
		if (height > other.height)
		   return 1; else if (height < other.height)
		   return -1; else
		   return 0;
	}
	public String toString() {
		return name+","+height;
	}
}
public class test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person[] people = new Person[5];
		for (int i=0; i< people.length; i++) {
			System.out.print(" 이름 입력 : ");
			people[i] = new Person(input.nextLine(),(int)(Math.random()*30)+160);
			System.out.println(people[i].toString());
		}
		System.out.printf("가장 키가 큰 사람은 %s 입니다.\n",getMaximum(people));
	}
	//이 Comparable 인터페이스를 이용하여서 가장 키 큰 사람의 이름을 반환하는 메소드 getMaximum(Person[] array)를 구현하고 테스트하라.
	public static String getMaximum(Person[] array) {
		int mostarray = 0;
		String mostname;
		for (int i=1; i<array.length; i++) {
			if(array[i].compareTo(array[mostarray]) == 1) {
				mostarray = i;
				mostname = array[i].getName();
			}
		}
		return array[mostarray].getName();
	}
}