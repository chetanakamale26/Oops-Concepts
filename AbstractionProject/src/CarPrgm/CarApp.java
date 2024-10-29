package CarPrgm;

public class CarApp {
	public static void doActivity(Car c)
	{
		c.start();
		c.stop();
		c.refuel();
	}
	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar();
		PetrolCar pc=new PetrolCar();
		DieselCar dc=new DieselCar();
		doActivity(ec);
		doActivity(pc);
		doActivity(dc);


	}

}
