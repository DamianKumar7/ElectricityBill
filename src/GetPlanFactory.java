public class GetPlanFactory {
    private String planType;

    GetPlanFactory(String planType){
        this.planType = planType;
    }
    public Plan getPlan() throws InvalidPlanTypeException {
        if(planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        }
        if(planType.equalsIgnoreCase("Institutional")){
            return new InstitutionalPlan();
        }
        if(planType.equalsIgnoreCase("Commercial")){
            return new CommercialPlan();
        }
        throw new InvalidPlanTypeException("the plan type does not exist");
    }


}
