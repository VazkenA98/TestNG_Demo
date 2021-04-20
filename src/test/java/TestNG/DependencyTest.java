package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test()
    public void func1(){
        System.out.println("func1");
    }

    @Test(dependsOnMethods = {"func1"})
    public void func2(){
        System.out.println("func2");
        Assert.assertEquals(1,2);
    }

    @Test(dependsOnMethods = {"func2"})
    public void func3(){
        System.out.println("func3");
    }

    @Test(dependsOnMethods = {"func2","func3"})
    public void func4(){
        System.out.println("func4");
    }
}
