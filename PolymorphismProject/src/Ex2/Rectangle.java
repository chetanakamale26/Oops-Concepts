package Ex2;

public class Rectangle extends Shape{
	double len=5.5, bre=7.5;
	@Override
	double findArea()
	{
		double area=len*bre;
		System.out.println("Area of Square: ");
		return area;
	}
	double findRecPer()
	{
		double per=2*(len+bre);
		System.out.println("Perimeter of Square: ");
		return per;
	}

}
