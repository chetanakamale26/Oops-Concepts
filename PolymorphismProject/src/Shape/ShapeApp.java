package Shape;

public class ShapeApp {

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle rec=new Rectangle();
		Circle cir=new Circle();
		Geometry gr=new Geometry();
		gr.activity(sq);
		gr.activity(rec);
		gr.activity(cir);



	}

}
