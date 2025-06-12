package Day16;

import org.testng.annotations.*;

public class AllAnnotations {


    @BeforeSuite
    void bs()
    {
        System.out.println("This is Before suite");
    }

    @AfterSuite
    void as()
    {
        System.out.println("This is after suite");
    }

    @BeforeTest
    void bt()
    {
        System.out.println("This is before test");
    }

    @AfterTest
    void at()
    {
        System.out.println("This is after test");
    }

@BeforeMethod
    void bm()
{
    System.out.println("This is before method");
}

    @AfterMethod
    void am()
    {
        System.out.println("This is after method");
    }



    @BeforeClass
    void bc()
    {
        System.out.println("This is before class");
    }

    @AfterClass
    void ac()
    {
        System.out.println("This is after class");
    }

    @Test(priority = 1)
    void test1()
    {
        System.out.println("This is test1 ");
    }

    @Test(priority = 2)
    void test2()
    {
        System.out.println("This is test2 ");
    }
}