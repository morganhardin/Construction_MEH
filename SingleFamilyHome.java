public class SingleFamilyHome extends Residential
{
	private boolean garage;
	
	public SingleFamilyHome()
	{
		garage = true;
	}
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
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
		sb.append("Garage: " + isGarage());
		return super.displayData() + "\n" + sb.toString();
	}
	public boolean isGarage() 
	{
		if (garage == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setGarage(boolean garage) 
	{
		this.garage = garage;
	}
}
