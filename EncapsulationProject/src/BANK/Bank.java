package BANK;

class Bank {
	private int money; //proving security to data mem
	
	//public Setter method
	public void setMoney(int amount)
	{
		if(amount>0)
		{
			money=amount;
		}
		else
		{
			System.out.println("Kindly enter positive amount");
			System.exit(0);
		}
	}
	//public Getter method
	public int getMoney() //Cashier who can take money from bank & give to customers
	{
		return money;
	}

}
