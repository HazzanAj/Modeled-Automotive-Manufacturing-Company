public abstract class VehicleProductionCompany {
    public static String NAME = "GENERIC AUTOMOTIVE COMPANY";
    public static final String ESTABLISHED = " 31-08-2020.";
    public static final String CAPACITY = "20,000.";
    public static final String WORTH = "200 BILLION EURO";

    private Category category;

    public abstract void produceHeadQuarterInformation();

    public abstract void produceBranchInformation();

    public abstract void produceManufacturingInformation();

    public VehicleProductionCompany(Category category) {
        this.category = category;
    }
}

