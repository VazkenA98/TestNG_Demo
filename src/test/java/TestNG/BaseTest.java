package TestNG;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void startSuite(){
        System.out.println("Starting suite");
    }

    @AfterSuite
    public void endSuite(){
        System.out.println("Ending suite");
    }

    @BeforeTest
    public void startTest(){
        System.out.println("Starting test");
    }

    @AfterTest
    public void endTest(){
        System.out.println("Ending test");
    }

    @BeforeClass
    public void startClass(){
        System.out.println("Starting class");
    }

    @AfterClass
    public void endClass(){
        System.out.println("Ending class");
    }


    @BeforeMethod
    public void startMethod(){
        System.out.println();
        System.out.println("Starting method");
    }

    @AfterMethod
    public void endMethod(){
        System.out.println("Ending method");
        System.out.println();
    }
}
