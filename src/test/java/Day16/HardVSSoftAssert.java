package Day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSSoftAssert {
//@Test
    void test_hardassert()
    {
        System.out.println("Test1");
        System.out.println("Test2");

        //Methods inside assert class are static method. thats why it can accessible directly from class
        Assert.assertEquals(1,2);

        System.out.println("Test3");
        System.out.println("Test4");

    }
@Test
    void test_softAssert()
    {
        System.out.println("Test1");
        System.out.println("Test2");

        // In soft assert class, methods are not static. thats why can create an object of class and after that we can access the method
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(1,2);

        System.out.println("Test3");
        System.out.println("Test4");

        sa.assertAll();  // mandatory. otherwise everytime assert condition will true and test pass

    }
}
