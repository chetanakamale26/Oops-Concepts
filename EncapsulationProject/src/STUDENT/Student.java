package STUDENT;

class Student {
	//private data members
	private int rollNo;
	private String name;
	private int age;
	
	//public setter method
	public void setData(int x, String y, int z)
	{
		rollNo=x;
		name=y;
		age=z;
	}
	//public getter methods
	public int getrollNo()
	{
		return rollNo;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}

}
