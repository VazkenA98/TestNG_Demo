package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test(priority = 1)
    public void func1(){
        System.out.println("func1");
    }

    @Test(priority = 3)
    public void func2(){
        System.out.println("func2");
    }

    @Test(priority = 2)
    public void func3(){
        System.out.println("func3");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 4, enabled = false)
    public void func4(){
        System.out.println("func4");
    }

}
