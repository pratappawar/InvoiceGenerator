import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    InvoiceGenerator invoiceGenerator;
    @BeforeEach
    public void setUp() {
         invoiceGenerator = new InvoiceGenerator();
    }

    @Test
   public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare,0.0);
    }

    @Test
    public void givenLessDistanceOrTimeShouldReturnMinFare() {
        double distance=0.1;
        int time=1;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare,0.0);
    }

//    @Test
//    public void givenMultipleRides_ShouldReturnTotalFare() {
//        Ride[] rides={new Ride(2.0,5),
//                        new Ride(0.1,1)};
//        double fare=invoiceGenerator.calculateFare(rides);
//        Assertions.assertEquals(30,fare, 0.0);
//    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummery() {
        Ride[] rides={new Ride(1.0,5),
                new Ride(0.2,2)};
        InvoiceSummary summary=invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummery=new InvoiceSummary(2,20);
        Assertions.assertEquals(expectedInvoiceSummery,summary);
    }

    @Test
    public void ReturnTotalRidesTotalFareAndAverageFarePerRide() {
        Ride[] rides = {new Ride(1.0, 5),
                        new Ride(0.2, 2)};
        double totalFare = invoiceGenerator.calculateTotalFare(rides);
        int noOfRides = invoiceGenerator.numberOfRides(rides);
        double averageFare = invoiceGenerator.calculateAverageFarePerRide(rides);
        Assertions.assertEquals(20, totalFare, 0.0);
        Assertions.assertEquals(2, noOfRides,0.0);
        Assertions.assertEquals(10, averageFare, 0.0);
    }
}
