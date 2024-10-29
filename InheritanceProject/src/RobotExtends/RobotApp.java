package RobotExtends;


public class RobotApp {

	public static void main(String[] args) {
		ChefRobot cr=new ChefRobot();
		cr.talk();
		cr.walk();
		cr.charge();
		cr.Chef();
		System.out.println("------------------------------------------");
		DoctorRobot dr=new DoctorRobot();
		dr.talk();
		dr.walk();
		dr.charge();
		dr.Doctor();
		System.out.println("------------------------------------------");
		TeacherRobot tr=new TeacherRobot();
		tr.talk();
		tr.walk();
		tr.charge();
		tr.Teacher();

		

	}

}

