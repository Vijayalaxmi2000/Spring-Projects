package solidprinciples;
  interface Machine1
  {
	  void scan();
  }
  interface Machine2
  {
	  void print(); 
  }
  interface Machine3
  {
	  void fax();
  }
  class Canon implements Machine1
  {
	@Override
	public void scan() 
	{
		System.out.println("Scan of Canon");
	}  
  }
  class Epson implements Machine1,Machine2
  {
	@Override
	public void scan() 
	{
	  System.out.println("Scan of Epson");	
	}
	@Override
	public void print() 
	{
	  System.out.println("Print of Epson");	
	}  
  }
  class Nikon implements Machine1,Machine2,Machine3
  {
	  @Override
	  public void scan()
	  {
		  System.out.println("Scan of Nikon");
	  }
	  @Override
	  public void print()
	  {
		  System.out.println("Print of Nikon");
	  }
	  @Override
	  public void fax()
	  {
		  System.out.println("Fax of Nikon");
	  }
	  
  }
public class InterfaceSeggregation 
{

	public static void main(String[] args) 
	{
		Canon c=new Canon();
		c.scan();
		Epson e =new Epson();
		e.scan();
		e.print();
		Nikon n=new Nikon();
		n.scan();
		n.print();
		n.fax();
	}

}
