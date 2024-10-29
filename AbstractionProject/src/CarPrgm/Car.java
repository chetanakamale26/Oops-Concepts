package CarPrgm;

abstract class Car {
	void start()
	{
		System.out.println("Car is getting start");
	}
	void stop()
	{
		System.out.println("Car is getting stop");
	}
	abstract void refuel();

}
