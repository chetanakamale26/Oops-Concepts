package Ex1;

public class ParentChildApp {

	public static void main(String[] args) {
		Parent ref;
		Child c=new Child();
		ref=c;
		ref.display();
		//or
		Parent ref=new Child();
		ref.display();

	}

}
