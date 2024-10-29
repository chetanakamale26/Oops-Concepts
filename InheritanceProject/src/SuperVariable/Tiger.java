package SuperVariable;

class Tiger extends Animal{
	String tigerSound="Tiger sound";
	public void makeSound()
	{
		System.out.println("Tiger makes "+tigerSound);
	}
	public void accessParentMethod()
	{
		super.makeSound();
	}

}
