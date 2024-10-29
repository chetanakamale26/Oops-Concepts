package CyclicInheritance;

public class ParentChildApp {

	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println(ch.eyeColor);//Blue
		System.out.println(ch.accNum);//Error, bcz it is private in parent class & cont be used in child class
		ch.displayParent();
	}

}
