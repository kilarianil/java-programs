package javapractice;

public class ConsDemo4 
{
	ConsDemo4()
	{
		System.out.println("Cons of ConsDemo4");
		int a=10;
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method of methodDemo4");
		ConsDemo4 c1=new ConsDemo4();
		System.out.println("Done");
	}

}
