public class Residential extends Building
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential()
	{
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = true;
	}
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
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
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Laundry Room: " + isLaundryRoom());
		return sb.toString();
	}
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}
	public int getNumBathrooms() 
	{
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) 
	{
		this.numBathrooms = numBathrooms;
	}
	public boolean isLaundryRoom() 
	{
		if (laundryRoom == true)
		{
			return laundryRoom;
		}
		else
		{
			return laundryRoom;
		}
	}
	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}
}
