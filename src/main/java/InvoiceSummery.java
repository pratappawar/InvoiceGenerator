class InvoiceSummary {
    private final double totalFare;
    private final int numOfRides;
    private final double average;

    /**
     * Parameterized constructor
     * @param numOFRides
     * @param totalFare
     */
    public InvoiceSummary(int numOFRides, double totalFare) {
        this.numOfRides = numOFRides;
        this.totalFare = totalFare;
        this.average = this.numOfRides/this.totalFare ;
    }

    /**
     * overridden equal method to check two objects are equal or not
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return Double.compare(that.totalFare, totalFare) == 0 && numOfRides == that.numOfRides && Double.compare(that.average, average) == 0;
    }
}
