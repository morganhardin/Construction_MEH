public class Mall extends Business
{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall()
	{
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	public void draw()
	{
		System.out.println("Drawing Code for <<Object Type>>.");
	}
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		super.displayData();
		sb.append("Number of Rented Units: " + getNumRentedUnits() + "\n");
		sb.append("Median Unit Size: " + getMedianUnitSize() + "\n");
		sb.append("Number of Parking Spaces: " + getNumParkingSpaces());
		return sb.toString();
	}
	public int getNumRentedUnits() 
	{
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}
	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize) 
	{
		this.medianUnitSize = medianUnitSize;
	}
	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) 
	{
		this.numParkingSpaces = numParkingSpaces;
	}
}
