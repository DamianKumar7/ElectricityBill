import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetPlanFactoryTest {

    @Test
    void getPlan() throws InvalidPlanTypeException {
        GetPlanFactory planType = new GetPlanFactory("commercial");
        Plan plan = planType.getPlan();
        assertTrue(plan instanceof CommercialPlan);
    }
    @Test
    void getBill() throws InvalidPlanTypeException {
        GetPlanFactory planType = new GetPlanFactory("Domestic");
        Plan plan = planType.getPlan();
        plan.setRate();
        assertEquals(35,plan.calculateBill(10));

    }
    @Test
    void getError(){
        GetPlanFactory planType = new GetPlanFactory("Damian");
        assertThrows(InvalidPlanTypeException.class,()->planType.getPlan());
    }
}