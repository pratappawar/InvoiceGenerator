public class InvoiceGenerator {

    /**
     * CONSTANT variable declaration
     */
    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    /**
     * methode to calculate total fare and minimum fare
     * @param distance
     * @param time
     * @return
     */
    public double calculateFare(double distance, int time) {
        double totalFare=distance*MINIMUM_COST_PER_KM+time*COST_PER_TIME;
        return totalFare < MINIMUM_FARE ? MINIMUM_FARE : totalFare;
    }

    /**
     * calculate fare for multiple rides
     * @param rides
     * @return
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare=0;
        for (Ride ride:rides)
            totalFare+=this.calculateFare(ride.distance,ride.time);
        return new InvoiceSummary(rides.length,totalFare);
    }
}
