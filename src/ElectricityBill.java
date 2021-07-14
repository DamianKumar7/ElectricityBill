public class ElectricityBill {
    private int units;
    private String planType;

    ElectricityBill(String planType, int units){
        this.planType=planType;
        this.units = units;
    }
    public double calculateBill() throws InvalidPlanTypeException {
        Plan plan = new GetPlanFactory(planType).getPlan();
        return plan.calculateBill(units);
    }
}
