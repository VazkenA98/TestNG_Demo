package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"a","b"})
    public void add(int c, int d)
    {
        int sum=c+d;
        System.out.println("Sum of two numbers : "+sum);
    }

    @Test
    @Parameters({"a","b"})
    public void subtract(int c, int d)
    {
        int subtract=c-d;
        System.out.println("Subtraction of two numbers : "+subtract);
    }

    @Test
    @Parameters("word")
    public void saySomething(String str)
    {
        System.out.println(str);
    }
}
