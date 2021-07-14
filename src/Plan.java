public abstract class Plan {
    double rate;
    abstract void setRate();
    public double calculateBill(int units){
        return units*rate;
    }

}
