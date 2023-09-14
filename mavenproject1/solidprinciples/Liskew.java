package solidprinciples;

interface Animal
{
	public void walk();
}
abstract class Bird implements Animal
{
	public abstract void fly();
	@Override
	public void walk()
	{
		System.out.println("Walking");
	}
}
class Parrot extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Parrot can fly");
	}
}
class Sparrow extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Sparrow can fly");
	}
}
class Ostrich implements Animal
{
	@Override
	public void walk()
	{
		System.out.println("Ostrich can walk");
	}
}
public class Liskew
{

	public static void main(String[] args)
	{
		Animal animal =new Ostrich();
		animal.walk();
		Bird bird=new Parrot();
		bird.fly();
		Bird brd=new Sparrow();
		brd.fly();
	}

}
