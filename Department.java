package oopsconcept;
public class Department {
	public static void main(String[] args) {
		Firstyear obj1=new Firstyear();
		obj1.F1();
		obj1.F2();
		obj1.F3();
		
		Secondyear obj2=new Secondyear();
		obj2.F4();
		obj2.F5();
		obj2.F6();
	}
}
class Firstyear{
	public static void F1() {
		System.out.println("Rahul");
	}
	public static void F2() {
		System.out.println("Riya");
}
	public static void F3() {
		System.out.println("Nila");
	}
}
class Secondyear{
	public static void F4() {
		System.out.println("Rishi");
	}
	public static void F5() {
		System.out.println("Rithika");
}
	public static void F6() {
		System.out.println("Rashmi");
	}
}