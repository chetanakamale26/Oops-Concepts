package ParChildPackage;

public class ParentChildApp {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.foodBusiness();
		System.out.println(p.eyecolor);
		
		Child c=new Child();
		c.foodBusiness();
		System.out.println(c.eyecolor);

	}

}

