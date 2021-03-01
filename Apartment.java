public class Apartment extends Residential
{
	/** These private variables are established here so that
	 * they can be called upon and instantiated within the
	 * Apartment class.
	 * 
	 */
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/** Empty constructor method that sets the private variables equal to 0 and true
	 * where they will be used and manipulated within the class.
	 * 
	 */
	public Apartment()
	{
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = true;
	}
	/** This constructor method calls similar method Residential in the parent class Residential
	 * (which also called that same Building method from the Building class) and allows this 
	 * class to have the same variables and parameters the Building class has. It calls them 
	 * and passes them done to this child (Apartment) class.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	/** This draw method is an updated version of the method in the parents classes.
	 * This method overrides the previous methods to print this string that states
	 * the drawing code is for an apartment.
	 * 
	 */
	public void draw()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Drawing code for <<APARTMENT>>.");
		System.out.println(sb.toString());
	}
	/** This method calls the displayData method in the parent classes and adds these
	 * strings onto new strings to have all the data in one string that will be
	 * returned when the displayData method for apartments is executed.
	 * 
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		super.displayData();
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + getAvgUnitSize() + "\n");
		sb.append("Parking Available: " + isParkingAvailable());
		return super.displayData() + "\n" + sb.toString();
	}
	/** This getter calls the numRentableUnits from the setter to return the integer.
	 * 
	 * @return
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}
	/** This setter takes the parameter numRentableUnits and finds the inputed user integer
	 * to set it equal to this numRentableUnits to then be called by the getter method.
	 * 
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}
	/** This getter calls the avgUnitSize from the setter to return the string.
	 * 
	 * @return
	 */
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}
	/** This setter takes the parameter avgUnitSize and finds the inputed user value
	 * to set it equal to this avgUnitSize to then be called by the getter method.
	 * 
	 * @param avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) 
	{
		this.avgUnitSize = avgUnitSize;
	}
	/** This getter for boolean values calls the parkingAvailable from the setter to return true or false.
	 * 
	 * @return
	 */
	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	}
	/** This setter takes the boolean parameter parkingAvailable and finds the inputed true or false value,
	 * and then sets it equal to this parkingAvailable so that it can be called by the getter method.
	 * 
	 * @param parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) 
	{
		this.parkingAvailable = parkingAvailable;
	}
}
