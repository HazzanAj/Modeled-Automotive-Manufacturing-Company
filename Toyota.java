public class Toyota extends VehicleProductionCompany {
    public Toyota () {
        super( Category.PREMIUM);
    }

    public void produceHeadQuarterInformation() {
        System.out.println("Company's Name :" + NAME );
        System.out.println("Company's Name :" + ESTABLISHED );
        System.out.println("Company's Name :" + CAPACITY );
        System.out.println("Company's Name :" + WORTH);
    }

    @Override
    public void produceBranchInformation(){
        System.out.println("Company's Name : Mercedes Benz USA" );
        System.out.println("Location : 12B XYZ Street" );

    }
    @Override
    public void produceManufacturingInformation(){
        System.out.println("Operating Hours: 6:00AM - 10PM" );
        System.out.println("Number of Shifts: 2 Shifts (Morning and Evening)" );
        System.out.println("Total Employees: 10,000 " );
        System.out.println("Production Capacity: Estimated Per day (350 - 400) Per day" );
    }
}

