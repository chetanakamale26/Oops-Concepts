package Shape;

class Circle extends Shape{
	double rad=55;
	double calArea()
	{
		return Math.PI*rad*rad;
	}
	double calPer()
	{
		return 2*Math.PI+rad;
	}

}
