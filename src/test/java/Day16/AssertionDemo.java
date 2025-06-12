package Day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
@Test
    void testTitle()
    {
        String expTitle="OpenCart";
        String actTitle="OpensCart";

      /*  if(expTitle.equals(actTitle))
        {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }

       */
        Assert.assertEquals(expTitle,actTitle);




    }



}
