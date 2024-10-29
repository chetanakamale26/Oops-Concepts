package EMPLOYEE;

public class EmpConstructorApp {

	public static void main(String[] args) {
	EmpConstructor e1=new EmpConstructor(1,"Ajay",45000.5F);
	System.out.println(e1.getempId());
	System.out.println(e1.getname());
	System.out.println(e1.getsalary());
	
	EmpConstructor e2=new EmpConstructor(2,"Nikhil",55000.5F);
	System.out.println(e1.getempId());
	System.out.println(e1.getname());
	System.out.println(e1.getsalary());


	}

}
