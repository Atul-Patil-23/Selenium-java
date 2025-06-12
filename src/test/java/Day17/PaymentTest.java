package Day17;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test(priority = 1, groups = {"sanity", "regression"})
    void paymentRupees()
    {
        System.out.println("Payment in rupees");
    }

    @Test(priority = 2, groups = {"sanity", "regression"})
    void paymentDoller()
    {
        System.out.println("Payment in Doller");
    }

}
