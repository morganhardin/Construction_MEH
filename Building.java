public class Building 
{
	/** These protected variables are in the parent class because 
	 * they will be called upon in the child classes and instantiated
	 * based on which child class is calling them.
	 * 
	 */
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	/** This empty constructor method instantiated each string as an empty string
	 * and sets the double to 0. This is instantiated now so that it can be overridden
	 * in the child classes and makes the preferred constructor have the user
	 * instantiate these variables.
	 * 
	 */
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subgroup = "";
	}
	/** This preferred constructor instantiates the variables in the parameter to the
	 * entered value. It also will be called upon with these variables being passed 
	 * down through the child class so that they all have the same instantiation.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	/** The draw method will also be overridden by the child classes because the string inside
	 * the << >> will be updated based on the class that is called.
	 * 
	 */
	public void draw()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Drawing code for <<BUILDING>>.");
		System.out.println(sb.toString());
	}
	/** The displayData method uses String Builder to allow the variables to change based on
	 * user input. It will also be called upon and overridden in the child classes so that
	 * the variables change based on which class and input is being called.
	 * 
	 * @return
	 */
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
	/** This getter calls the project name from the setter and returns the string.
	 * 
	 * @return
	 */
	protected String getProjectName() 
	{
		return projectName;
	}
	/** This setter takes the inputed string and sets in equal to project name
	 * so that it then can be called from the getter method.
	 * 
	 * @param projectName
	 */
	protected void setProjectName(String projectName) 
	{
		this.projectName = projectName;
	}
	/** This getter calls the complete address from the setter and returns the string.
	 * 
	 * @return
	 */
	protected String getCompleteAddress() 
	{
		return completeAddress;
	}
	/** This setter takes the inputed string and sets it equal to complete address
	 * so that it then can be called from the getter method.
	 * 
	 * @param completeAddress
	 */
	protected void setCompleteAddress(String completeAddress) 
	{
		this.completeAddress = completeAddress;
	}
	/** This getter calls the total square feet from the setter and returns the value.
	 * 
	 * @return
	 */
	protected double getTotalSquareFeet() 
	{
		return totalSquareFeet;
	}
	/** This setter takes the inputed value and sets it equal to total square feet
	 * so that it then can be called from the getter method.
	 * 
	 * @param totalSquareFeet
	 */
	protected void setTotalSquareFeet(double totalSquareFeet) 
	{
		this.totalSquareFeet = totalSquareFeet;
	}
	/** This getter calls the occupancy group from the setter and returns the string.
	 * 
	 * @return
	 */
	protected String getOccupancyGroup() 
	{
		return occupancyGroup;
	}
	/** This setter takes the inputed string and sets it equal to occupancy group
	 * so that it then can be called from the getter method.
	 * 
	 * @param occupancyGroup
	 */
	protected void setOccupancyGroup(String occupancyGroup) 
	{
		this.occupancyGroup = occupancyGroup;
	}
	/** This getter calls the subgroup from the setter and returns the string.
	 * 
	 * @return
	 */
	protected String getSubgroup() 
	{
		return subgroup;
	}
	/** This setter takes the inputed string and sets it equal to subgroup 
	 * so that it then can be called from the getter method.
	 * 
	 * @param subgroup
	 */
	protected void setSubgroup(String subgroup) 
	{
		this.subgroup = subgroup;
	}
}
