public class Volkswagen extends VehicleProductionCompany {
    public Volkswagen() {
        super(Category.PREMIUM);
    }

    public void produceHeadQuarterInformation() {
        System.out.println("Company's Name :" + NAME);
        System.out.println("Company's Date of Establishment :" + ESTABLISHED);
        System.out.println("Company's Staff Capacity :" + CAPACITY);
        System.out.println("Company's Worth :" + WORTH);
    }

    @Override
    public void produceBranchInformation() {
        System.out.println("Company's Name : VOLKSWAGEN POLAND");
        System.out.println("Location : 14B XYZ Street POLAND");

    }

    @Override
    public void produceManufacturingInformation() {
        System.out.println("Operating Hours: 6:00AM - 10PM");
        System.out.println("Number of Shifts: 2 Shifts (Morning and Evening)");
        System.out.println("Total Employees: 10,000 ");
        System.out.println("Production Capacity: Estimated Per day (350 - 400) Per day");
    }


}

