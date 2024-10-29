package Constructorchaningusingthis;

class JavaDev extends Dev{
	int sal=65000;
	public JavaDev(int sal)
	{
		this();
		this.sal=sal;
	}
	public JavaDev()
	{
		super();
	}

}
