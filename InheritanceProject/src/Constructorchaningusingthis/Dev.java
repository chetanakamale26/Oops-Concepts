package Constructorchaningusingthis;

class Dev {
	String projName;
	String tech;
	
	public Dev()
	{
		this("Instagram");
	}
	public Dev(String projName)
	{
		this("Facebook","JavaTech");
		this.projName=projName;
	}
	public Dev(String projName, String tech)
	{
		super();
		this.projName=projName;
		this.tech=tech;
	}

}
