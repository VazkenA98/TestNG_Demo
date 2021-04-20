package TestNG;


import org.testng.annotations.Test;

public class AnnotationTest extends BaseTest
{
    @Test()
    public void func1(){
        System.out.println("func1");
    }

    @Test()
    public void func2(){
        System.out.println("func2");
    }
    @Test()
    public void func3(){
        System.out.println("func3");
    }
}
