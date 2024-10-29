package Upcasting;

public class DeveloperApp {

	public static void main(String[] args) {
		Developer dev;
		BackendDev bd=new BackendDev();
		dev=bd;//Upcasting BaclendDev object toDeveloper dev reference
		dev.attendMeeting();//calling inherited method
		dev.project();//calling overidden method
		dev.learnJava();//calling child-specific method

		DatabaseDev dd=new DatabaseDev();
		dev=bd;//Upcasting BaclendDev object toDeveloper dev reference
		dev.attendMeeting();//calling inherited method
		dev.project();//calling overidden method
		dev.learnSQL();//calling child-specific method
		
		WebDev wd=new WebDev();
		dev=bd;//Upcasting BaclendDev object toDeveloper dev reference
		dev.attendMeeting();//calling inherited method
		dev.project();//calling overidden method
		dev.learnHTML();//calling child-specific method
		
	}

}
