package collection.setter.list;

import java.util.List;

public class Employee 
{
	private int empId;
	private String empName;
	private List<String> projects;
	
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public List<String> getProjects()
	{
		return projects;
	}
	public void setProjects(List<String> projects) 
	{
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", projects=" + projects + "]";
	}
	
	
	

}
