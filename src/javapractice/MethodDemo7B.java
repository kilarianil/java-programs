package javapractice;

public class MethodDemo7B 
{

	public static void main(String[] args)
	{
		System.out.println("main method of MethodDemo1");
		MethodDemo7A m1=new MethodDemo7A();
		m1.funB();
		MethodDemo7A m2=new MethodDemo7A();
		m1.funB();
		MethodDemo7A m3=new MethodDemo7A();
		m1.funB();
		System.out.println("Done");
	}
	 void funA()
	{
		System.out.println("funA of methodDemo1");
	}
	 void funB()
	{
		System.out.println("funB of methodDemo1");
		funA();
	}

}
