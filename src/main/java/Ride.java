public class Ride {
    /**
     * class properties declaration
     */
    public final double distance;
    public final int time;

    /**
     * parameterized constructor declaration
     * @param distance
     * @param time
     * @param premium
     */
    public Ride(double distance, int time, PremiumRide premium) {
        this.distance=distance;
        this.time=time;

    }
}
