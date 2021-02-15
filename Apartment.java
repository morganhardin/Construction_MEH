public class Apartment extends Residential
{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment()
	{
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = true;
	}
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
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
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + getAvgUnitSize() + "\n");
		sb.append("Parking Available: " + isParkingAvailable());
		return super.displayData() + "\n" + sb.toString();
	}
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) 
	{
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) 
	{
		this.parkingAvailable = parkingAvailable;
	}
}
