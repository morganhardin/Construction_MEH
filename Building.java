public class Building 
{
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subgroup = "";
	}
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	public void draw()
	{
		System.out.println("Drawing code for <<Object Type>>.");
	}
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "");
		return sb.toString();
	}
	protected String getProjectName() 
	{
		return projectName;
	}
	protected void setProjectName(String projectName) 
	{
		this.projectName = projectName;
	}
	protected String getCompleteAddress() 
	{
		return completeAddress;
	}
	protected void setCompleteAddress(String completeAddress) 
	{
		this.completeAddress = completeAddress;
	}
	protected double getTotalSquareFeet() 
	{
		return totalSquareFeet;
	}
	protected void setTotalSquareFeet(double totalSquareFeet) 
	{
		this.totalSquareFeet = totalSquareFeet;
	}
	protected String getOccupancyGroup() 
	{
		return occupancyGroup;
	}
	protected void setOccupancyGroup(String occupancyGroup) 
	{
		this.occupancyGroup = occupancyGroup;
	}
	protected String getSubgroup() 
	{
		return subgroup;
	}
	protected void setSubgroup(String subgroup) 
	{
		this.subgroup = subgroup;
	}
}
