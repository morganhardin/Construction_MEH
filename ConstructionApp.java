public class ConstructionApp 
{
	public static void main(String[] args) 
	{
		Building aBuilding = new Building();
		SingleFamilyHome aSingleFamilyHome = new SingleFamilyHome();
		Apartment aApartment = new Apartment();
		Business aBusiness = new Business();
		Mall aMall = new Mall();
		
		aBuilding.setProjectName("Gaines House");
		aBuilding.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		aBuilding.setTotalSquareFeet(2540);
		aBuilding.setOccupancyGroup("Residential");
		aBuilding.setSubgroup("R1");
		aSingleFamilyHome.setNumBedrooms(4);
		aSingleFamilyHome.setNumBathrooms(3);
		aSingleFamilyHome.setLaundryRoom(true);
		aSingleFamilyHome.setGarage(true);
		
		System.out.println(aBuilding.displayData());
		System.out.println(aSingleFamilyHome.displayData());
		System.out.println();
		
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
		
		System.out.println(aBuilding.displayData());
		System.out.println(aApartment.displayData());
		System.out.println();
		
		aBuilding.setProjectName("Preston Mall");
		aBuilding.setCompleteAddress("8635 Preston Highway | Louisville, Kentucky 40227");
		aBuilding.setTotalSquareFeet(1830946.63);
		aBuilding.setOccupancyGroup("Business");
		aBuilding.setSubgroup("F2");
		aBusiness.setNumRentableUnits(19);
		aMall.setNumRentedUnits(25);
		aMall.setMedianUnitSize(3642.39);
		aMall.setNumParkingSpaces(8294);
		
		System.out.println(aBuilding.displayData());
		System.out.println(aBusiness.displayData());
		System.out.println(aMall.displayData());
	}

}
