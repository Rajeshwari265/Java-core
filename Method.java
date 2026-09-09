package oopsconcept;

public class Method {

	public static void main(String[] args) {
		int a=10,b=30,c=20;
		System.out.println(display1(a,b));
		System.out.println(display2(a,b,c));
}
	public static int display1(int a,int b) {
		return a+b;
	
	}
	public static int display2(int a,int b,int c){
		return a+b+c;

}
}