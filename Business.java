public class Business extends Building
{
	protected int numRentableUnits;
	
	public Business()
	{
		numRentableUnits = 0;
	}
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	public void draw()
	{
		System.out.println("Drawing code for <<Object Type>>.");
	}
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		super.displayData();
		sb.append("Number of Rentable Units: " + getNumRentableUnits());
		return sb.toString();
	}
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}
}
