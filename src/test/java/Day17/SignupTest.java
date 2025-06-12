package Day17;

import org.testng.annotations.Test;

public class SignupTest {

    @Test(priority = 1, groups = "regression")
    void signupByEmail()
    {
        System.out.println("This is signup by email");
    }

    @Test(priority = 2, groups = "regression")
    void signupByFacebook()
    {
        System.out.println("This is login by facebook");
    }


    @Test(priority = 3, groups = "regression")
    void signupByTwitter()
    {
        System.out.println("This is login by twitter");
    }


}
