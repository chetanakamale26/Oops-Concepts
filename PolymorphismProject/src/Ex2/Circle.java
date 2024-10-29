package Ex2;

public class Circle extends Shape{
	double rad=5.5;
	@Override
	double findArea()
	{
		double area=Math.PI*rad;
		System.out.println("Area of Square: ");
		return area;
	}
	double findCirPer()
	{
		double per=2*Math.PI*rad;
		System.out.println("Perimeter of Square: ");
		return per;
	}

}
