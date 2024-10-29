package Ex2;

public class Square extends Shape {
	double side=5.5;
	@Override
	double findArea()
	{
		double area=side*side;
		System.out.println("Area of Square: ");
		return area;
	}
	double findSqPer()
	{
		double per=4*side;
		System.out.println("Perimeter of Square: ");
		return per;

	}
	

}
