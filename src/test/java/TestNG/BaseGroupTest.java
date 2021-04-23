package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;

public class BaseGroupTest {

    @BeforeGroups("Group A")
    public void before_it()
    {
        System.out.println("This method will be executed before group A");
    }

    @AfterGroups("Group A")
    public void after_it()
    {
        System.out.println("This method will be executed after group A");
    }
}
