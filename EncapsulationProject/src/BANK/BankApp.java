package BANK;

class BankApp {

	public static void main(String[] args) {
		Bank b=new Bank();
		//Directly accessing private data mem
		//b.monay=5000; //Error
		//System.out.println("Taking the money "+b.money); //Error
		//Indirectly accessing the private data mem using public setters & public
		//getters
		b.setMoney(5000);
		System.out.println("Taking monay "+b.getMoney());
	}
}
