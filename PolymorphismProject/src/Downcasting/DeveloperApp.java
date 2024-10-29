package Downcasting;

public class DeveloperApp {

	public static void main(String[] args) {
		Developer dev;
		BackendDev bd=new BackendDev();
		dev=bd;//Upcasting BaclendDev object toDeveloper dev reference
		dev.attendMeeting();//calling inherited method
		dev.project();//calling overidden method
                      //Performing down casting-converting dev(parent ref) to BackendDev (child object)
		((BackendDev)(dev)).learnJava();//calling child-specific method

		DatabaseDev dd=new DatabaseDev();
		dev=bd;//Upcasting BaclendDev object toDeveloper dev reference
		dev.attendMeeting();//calling inherited method
		dev.project();//calling overidden method
		              //Performing down casting-converting dev(parent ref) to BackendDev (child object)
		((DatabaseDev)(dev)).learnSQL();//calling child-specific method
		
		WebDev wd=new WebDev();
		dev=bd;//Upcasting BaclendDev object toDeveloper dev reference
		dev.attendMeeting();//calling inherited method
		dev.project();//calling overidden method
		              //Performing down casting-converting dev(parent ref) to BackendDev (child object)
		((WebDev)(dev)).learnHTML();//calling child-specific method
		
	}

}
