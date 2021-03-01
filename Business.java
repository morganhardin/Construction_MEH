public class Business extends Building
{
	/** This protected variable is established here so that it can be
	 * called, instantiated, and used within the child classes.
	 * 
	 */
	protected int numRentableUnits;
	
	/** This empty constructor method instantiates and sets 
	 * the numRentableUnits equal to 0.
	 * 
	 */
	public Business()
	{
		numRentableUnits = 0;
	}
	/** This preferred constructor calls the parent class Building so that the parameter variables
	 * are set equal to their this variable where it can later be returned or used in the child classes.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	/** This draw method is similar to the Building draw method, but overrides it 
	 * so the object type is updated to be business instead of building.
	 * 
	 */
	public void draw()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Drawing code for <<BUSINESS>>.");
		System.out.println(sb.toString());
	}
	/** The displayData method calls the same method in the Building class. It calls the original
	 * strings that were returned and adds them to the new strings that were created within
	 * this class.
	 * 
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Number of Rentable Units: " + getNumRentableUnits());
		return sb.toString();
	}
	/** This getter calls the numRentableUnits from the setter and returns the integer.
	 * 
	 * @return
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}
	/** This setter takes the parameter numRentableUnits from the user input and set it 
	 * equal to this numRentableUnits so that it can be called by the getter method.
	 * 
	 * @param numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}
}
