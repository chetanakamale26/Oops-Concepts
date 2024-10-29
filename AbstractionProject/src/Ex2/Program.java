package Ex2;

abstract class Program {
	static int x,y; //static variables
	static          //static block
	{
		x=10;
		y=20;
	}
	static void display1() //static method
	{
		System.out.println(x+" "+y);
	}
	int a=11,b=22; //non-static variables
	{
		System.out.println("Non static block");
	}
	void display2() //non static block
	{
		System.out.println(a+" "+b);
	}
	abstract void display3(); //abstract method
	public static abstract void display4() //cannot have static abstract method
	Program() //constructor
	{
		System.out.println("Inside constructor");
	}
	public static void main(String[] args) {//
		Program.display1();
		Program p=new Program();
		p.display2();
	}
}
