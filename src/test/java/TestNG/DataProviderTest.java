package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider="getData")
    public void instanceDbProvider(int p1, String p2) {
        System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
    }

    @Test(dataProvider="dataProvider2")
    public void instanceDbProvider2(String p1, String p2) {
        System.out.println("Instance DataProvider Example 2: Data(" + p1 + ", " + p2 + ")");
    }


    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {5, "five"},
                {6, "six"}
        };
    }

    @DataProvider(name = "dataProvider2")
    public Object[][] getData2() {
        return new Object[][]{
                {"5", "five"}
        };
    }
}
