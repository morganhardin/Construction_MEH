public class Mall extends Business
{
	/** These variables are established here so that they can be
	 * used, instantiated, and manipulated within the Mall class.
	 * 
	 */
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/** This empty constructor takes the private variables and instantiates
	 * them so that they are all equal to 0.
	 * 
	 */
	public Mall()
	{
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}
	/** This preferred constructor calls the same method in the parent class Business
	 * (which also called its parent class Building) so that it allows the parameter
	 * variables to be used within this class.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	/** This draw method calls the previous parent class method, but overrides it
	 * so that the object type is more specific and agrees with the object type.
	 * 
	 */
	public void draw()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Drawing code for <<MALL>>.");
		System.out.println(sb.toString());
	}
	/** This method calls the parent class method in the Business class (which called its
	 * parent class method in the Building class). Therefore, it was able to use the
	 * same strings in those classes, but also add that to the new strings within
	 * this method so that they can all be returned in one string.
	 * 
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		super.displayData();
		sb.append("Number of Rented Units: " + getNumRentedUnits() + "\n");
		sb.append("Median Unit Size: " + getMedianUnitSize() + "\n");
		sb.append("Number of Parking Spaces: " + getNumParkingSpaces());
		return sb.toString();
	}
	/** This getter calls the numRentedUnits from the setter and returns the integer.
	 * 
	 * @return
	 */
	public int getNumRentedUnits() 
	{
		return numRentedUnits;
	}
	/** This setter takes the user inputed numRentedUnits integer and sets it equal to 
	 * this numRentedUnits, allowing it to be called from the getter method.
	 * 
	 * @param numRentedUnits
	 */
	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}
	/** This getter calls the medianUnitSize from the setter and returns the double value.
	 * 
	 * @return
	 */
	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}
	/** This setter takes the user inputed medianUnitSize double value and sets it equal
	 * to this medianUnitSize, allowing it to be called from the getter method.
	 * 
	 * @param medianUnitSize
	 */
	public void setMedianUnitSize(double medianUnitSize) 
	{
		this.medianUnitSize = medianUnitSize;
	}
	/** This getter calls the numParkingSpaces from the setter and returns the integer.
	 * 
	 * @return
	 */
	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}
	/** This setter takes the user inputed numParkingSpaces integer and sets it equal to
	 * this numParkingSpaces, allowing it to be called from the getter method.
	 * 
	 * @param numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) 
	{
		this.numParkingSpaces = numParkingSpaces;
	}
}
