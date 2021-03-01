public class ConstructionApp 
{
	public static void main(String[] args) 
	{
		/** These instantiate new variations of these classes so that 
		 * this application method can use, call, and execute them.
		 * 
		 */
		Building aBuilding = new Building();
		Residential aResidential = new Residential();
		SingleFamilyHome aSingleFamilyHome = new SingleFamilyHome();
		Apartment aApartment = new Apartment();
		Business aBusiness = new Business();
		Mall aMall = new Mall();
		
		/** These call the setters and allow the user to input strings and values that
		 * will set each variable equal to the input. It also allows it to be 
		 * called within the program to be printed.
		 * 
		 * This section shows the Residential and Single Family Home information.
		 * 
		 */
		aBuilding.setProjectName("Gaines House");
		aBuilding.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		aBuilding.setTotalSquareFeet(2540);
		aBuilding.setOccupancyGroup("Residential");
		aBuilding.setSubgroup("R1");
		aSingleFamilyHome.setNumBedrooms(4);
		aSingleFamilyHome.setNumBathrooms(3);
		aSingleFamilyHome.setLaundryRoom(true);
		aSingleFamilyHome.setGarage(true);
		
		/** These print statements execute the code with the inputed information.
		 * 
		 */
		System.out.println("------------------------------------------------------------");
		System.out.println("SINGLE FAMILY HOME");
		System.out.println("------------------------------------------------------------");
		System.out.println(aBuilding.displayData());
		aResidential.draw();
		System.out.println("------------------------------------------------------------");
		System.out.println(aBuilding.displayData());
		System.out.println(aSingleFamilyHome.displayData());
		aSingleFamilyHome.draw();
		System.out.println("------------------------------------------------------------");
		System.out.println();
		
		/** These call the setters and allow the user to input strings and values that
		 * will set each variable equal to the input. It also allows it to be 
		 * called within the program to be printed.
		 * 
		 * This section shows the Residential and Apartment information.
		 * 
		 */
		aBuilding.setProjectName("Hilton Inn");
		aBuilding.setCompleteAddress("4567 Westview Road | Indianapolis, Indiana 36592");
		aBuilding.setTotalSquareFeet(1083);
		aBuilding.setOccupancyGroup("Residential");
		aBuilding.setSubgroup("R2");
		aApartment.setNumBedrooms(2);
		aApartment.setNumBathrooms(1);
		aApartment.setLaundryRoom(false);
		aApartment.setNumRentableUnits(7);
		aApartment.setAvgUnitSize(1000);
		aApartment.setParkingAvailable(true);
		
		/** These print statements execute the code with the inputed information.
		 * 
		 */
		System.out.println("------------------------------------------------------------");
		System.out.println("APARTMENT");
		System.out.println("------------------------------------------------------------");
		System.out.println(aBuilding.displayData());
		aResidential.draw();
		System.out.println("------------------------------------------------------------");
		System.out.println(aBuilding.displayData());
		System.out.println(aApartment.displayData());
		aApartment.draw();
		System.out.println("------------------------------------------------------------");
		System.out.println();
		
		/** These call the setters and allow the user to input strings and values that
		 * will set each variable equal to the input. It also allows it to be 
		 * called within the program to be printed.
		 * 
		 * This section shows the Business and Mall information.
		 * 
		 */
		aBuilding.setProjectName("Preston Mall");
		aBuilding.setCompleteAddress("8635 Preston Highway | Louisville, Kentucky 40227");
		aBuilding.setTotalSquareFeet(1830946.63);
		aBuilding.setOccupancyGroup("Business");
		aBuilding.setSubgroup("F2");
		aBusiness.setNumRentableUnits(19);
		aMall.setNumRentedUnits(25);
		aMall.setMedianUnitSize(3642.39);
		aMall.setNumParkingSpaces(8294);
		
		/** These print statements execute the code with the inputed information.
		 * 
		 */
		System.out.println("------------------------------------------------------------");
		System.out.println("MALL");
		System.out.println("------------------------------------------------------------");
		System.out.println(aBuilding.displayData());
		aBusiness.draw();
		System.out.println("------------------------------------------------------------");
		System.out.println(aBuilding.displayData());
		System.out.println(aBusiness.displayData());
		System.out.println(aMall.displayData());
		aMall.draw();
		System.out.println("------------------------------------------------------------");
	}

}
