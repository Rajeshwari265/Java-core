package oopsconcept;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		ClassA obj1 = new ClassB();
        obj1.animal();    
        ((ClassB) obj1).flower();  
        System.out.println("");
        ClassA obj2 = new ClassD();
        obj2.animal();     
        ((ClassD) obj2).birds(); 

	}

}
class ClassA {
    void animal() {
        System.out.println("Tiger is the animal");
    }
}

class ClassB extends ClassA {
    void flower() {
        System.out.println("Lotus is the flower");
    }
}

class ClassD extends ClassA {
    void birds() {
        System.out.println("Dove is the bird");
    }
}