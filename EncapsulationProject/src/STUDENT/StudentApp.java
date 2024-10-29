package STUDENT;
class StudentApp {

	public static void main(String[] args) {
		Student st=new Student();
		//Error, becz we are accessing the private data members DIRECTLY
		//st.rollNo=11;
		//st.name="Ajay";
		//st.age=24;
		
		//Error, becz we are accessing the private data members DIRECTLY
		//System.out.println(st.rollNo);
		//System.out.println(st.name);
		//System.out.println(st.age);
		
		//Accessing the private data mem Indircetly using public setter method
		st.setData(11,"Ajay",24);
		
		//Accessing the private data mem Indircetly using public setter method
		System.out.println(st.getrollNo());
		System.out.println(st.getname());
		System.out.println(st.getage());




	}

}
