package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class ListenerTest {

    @Test
    public void func1(){
        System.out.println("func 1");
        Assert.assertEquals(1,1);
    }

    @Test
    public void func2(){
        System.out.println("func 2");
        Assert.fail();
    }

    @Test
    public void func3(){
        System.out.println("func 3");
        throw new SkipException("skipping the test case");
    }
}
