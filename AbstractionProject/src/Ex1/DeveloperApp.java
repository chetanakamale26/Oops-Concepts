package Ex1;

public class DeveloperApp {
	public static void doActivity(Developer dev)
	{
		dev.attendMeeting();
		dev.doProject();
		if(dev instanceof JavaDeveloper)
		{
			((JavaDeveloper)(dev)).learnJava();
		}
		if(dev instanceof PythonDeveloper)
		{
			((PythonDeveloper)(dev)).learnPython();
		}
		
	}

	public static void main(String[] args) {
		JavaDeveloper jd=new JavaDeveloper();
		PythonDeveloper pd=new PythonDeveloper();
		doActivity(jd);
		doActivity(pd);
	}

}
