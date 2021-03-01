public class Residential extends Building
{
	/** These protected variables are established here so 
	 * that they can be used and called upon within this
	 * class and the child classes.
	 * 
	 */
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	/** This empty constructor method instantiates the protected 
	 * variables and set them equal to 0.
	 * 
	 */
	public Residential()
	{
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = true;
	}
	/** This preferred constructor calls the parent class method in the 
	 * Building class and takes those variables and passes them into
	 * this class, allowing these variables to be used and returned
	 * in this class and its child classes.
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super();
	}
	/** This draw method calls the draw method in the parent class,
	 * but this overrides that method where the object type matches
	 * the class.
	 * 
	 */
	public void draw()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Drawing code for <<RESIDENTIAL>>.");
		System.out.println(sb.toString());
	}
	/** This display data method calls the parent class method. It calls the
	 * strings in that method and adds them to the new strings in this method.
	 * This means that it puts both strings into one string that can
	 * then be returned.
	 * 
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Laundry Room: " + isLaundryRoom());
		return sb.toString();
	}
	/** This getter calls the numBedrooms from the setter and returns the integer.
	 * 
	 * @return
	 */
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}
	/** This setter takes the user inputed numBedrooms from the parameter and sets it
	 * equal to this numBedrooms, allowing it to be called with the getter method.
	 * 
	 * @param numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}
	/** This getter calls the numBathrooms from the setter and returns the integer.
	 * 
	 * @return
	 */
	public int getNumBathrooms() 
	{
		return numBathrooms;
	}
	/** This setter takes the user inputed numBathrooms from the parameter and sets it
	 * equal to this numBathrooms, allowing it to be called with the getter method.
	 * 
	 * @param numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) 
	{
		this.numBathrooms = numBathrooms;
	}
	/** This boolean getter uses an if statement so that two possible values of laundryRoom
	 * can be returned. It takes the value from the setter and determines if laundryRoom 
	 * is true or false, then returning that value.
	 * 
	 * @return
	 */
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
	/** This setter takes the user inputed boolean value for laundryRoom from the parameter
	 * and sets it equal to this laundryRoom, allowing it to be called with the getter method.
	 * 
	 * @param laundryRoom
	 */
	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}
}
