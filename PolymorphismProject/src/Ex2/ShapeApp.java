package Ex2;

public class ShapeApp {
	public static void doActivity(Shape sh)
	{
		sh.draw();
		{
			System.out.println(sh.findArea());
		}
		if(sh instanceof Square)
		{
			System.out.println(((Square)(sh)).findSqPer());
		}
		else if(sh instanceof Circle)
		{
			System.out.println(((Circle)(sh)).findCirPer());
		}
		else
		{
			System.out.println(((Rectangle)(sh)).findRecPer());
		}
	}

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle rec=new Rectangle();
		Circle cir=new Circle();
		doActivity(sq);
		System.out.println("--------------------------------------");
		doActivity(cir);
		System.out.println("--------------------------------------");
		doActivity(rec);




	}

}
