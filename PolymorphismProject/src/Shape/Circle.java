package Shape;

public class Circle extends Shape{
	void draw()
	{
		System.out.println("Draw circle");
	}
	double findArea()
	{
		return Math.PI*5.5*5.5;
	}

}
