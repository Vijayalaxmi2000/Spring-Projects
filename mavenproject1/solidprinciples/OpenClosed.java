package solidprinciples;

interface A
{
	public  void test();
}
class B implements A
{
	@Override
	public void test()
	{
		System.out.println("Testing");
	}
}
class C extends B
{
	public void sample()
	{
		System.out.println("Sample Testing");
	}
}
public class OpenClosed 
{

	public static void main(String[] args) 
	{
		A a=new C();
		a.test();
		C c=new C();
		c.sample();

	}

}
