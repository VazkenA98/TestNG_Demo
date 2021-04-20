package TestNG;


import org.testng.annotations.Test;

public class TimeOutDescriptionTest {

    @Test(description = "This is test 1")
    public void func1(){
        System.out.println("func1");
    }

    @Test(description = "This is test 1",testName = "function 2")
    public void func2(){
        System.out.println("func2");
    }

    @Test(timeOut = 500)
    public void func3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("func3");
    }

    @Test(timeOut = 1500)
    public void func4() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("func4");
    }
}
