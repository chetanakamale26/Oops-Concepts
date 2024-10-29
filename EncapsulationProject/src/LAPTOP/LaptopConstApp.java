package LAPTOP;

class LaptopConstApp {

	public static void main(String[] args) {
		LaptopConst l1=new LaptopConst("chetana", 26);
		System.out.println(l1.getprocessor());
		System.out.println(l1.getmemorysize());

		LaptopConst l2=new LaptopConst("meghana", 27);
		System.out.println(l2.getprocessor());
		System.out.println(l2.getmemorysize());

	}

}