package mavenproject2;

public class Company 
{
	private int companyId;
	private String companyName;
	private String location;
	
	public int getCompanyId()
	{
		return companyId;
	}
	public void setCompanyId(int companyId) 
	{
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", location=" + location + "]";
	}
	
}
