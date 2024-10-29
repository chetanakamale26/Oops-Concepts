package EMPLOYEE;

public class EmpConstructor {
	private int empId;
	private String name;
	private float salary;
	public EmpConstructor(int empId, String name, float salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}

	public int getempId()
	{
		return empId;
	}
	public String getname()
	{
		return name;
	}
	public float getsalary()
	{
		return salary;
	}
}
