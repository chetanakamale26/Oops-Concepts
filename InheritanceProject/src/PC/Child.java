package PC;

public class Child extends Parent {
	public Child()
	{
		super(); //Take control from child constructor to parent class constructor
		System.out.println("Child constructor");
	}

}
