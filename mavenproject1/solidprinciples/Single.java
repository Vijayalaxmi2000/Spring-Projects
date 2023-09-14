package solidprinciples;

class Create
{
	public static void create()
	{
		System.out.println("Creating operation");
	}
}
class Read
{
	public static void read()
	{
		System.out.println("Reading operation");
	}
}
class Update
{
	public static void update()
	{
		System.out.println("Updating operation");
	}
}
class Delete
{
	public static void delete()
	{
		System.out.println("Deleting operation");
	}
}
public class Single 
{

	public static void main(String[] args)
	{
		Create.create();
		Read.read();
		Update.update();
		Delete.delete();
	}

}
