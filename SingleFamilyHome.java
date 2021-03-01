public class SingleFamilyHome extends Residential
{
	/** This private boolean variable is established here so that
	 * it can be used, instantiated, and returned in this class.
	 * 
	 */
	private boolean garage;
	
	/** This empty constructor method instantiates and sets the 
	 * private boolean variable garage equal to true. 
	 * 
	 */
	public SingleFamilyHome()
	{
		garage = true;
	}
	/** This preferred constructor calls the parent class method in
	 * the Residential class (which also calls its parent class method
	 * in the Building class). This passes the variables into this
	 * method so that they can be used and returned within
	 * this class.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	/** The draw method overrides the parent class's draw method so
	 * that the object type matches the class (it will be more specific
	 * and say single family home instead of residential or
	 * building).
	 * 
	 */
	public void draw()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Drawing code for <<SINGLE FAMILY HOME>>.");
		System.out.println(sb.toString());
	}
	/** The display data method calls the parent class's method and takes
	 * the string in that class and adds it to the new strings in
	 * this class. It then puts them into one string to be returned
	 * with all the past information from the parent method and
	 * also includes the new information from this class.
	 * 
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		super.displayData();
		sb.append("Garage: " + isGarage());
		return super.displayData() + "\n" + sb.toString();
	}
	/** This boolean getter takes the garage variable from the setter method,
	 * tests whether it is true or false, and then returns true or false.
	 * 
	 * @return
	 */
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
	/** This setter takes the user inputed garage variable and sets it equal to
	 * this garage, allowing it to then be called and used by the getter method.
	 * 
	 * @param garage
	 */
	public void setGarage(boolean garage) 
	{
		this.garage = garage;
	}
}
