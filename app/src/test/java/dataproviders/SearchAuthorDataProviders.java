package dataproviders;

import org.testng.annotations.DataProvider;

public class SearchAuthorDataProviders {
    @DataProvider(name = "authorSearchData")
    public static Object[][] authorSearchData() {
        return new Object[][] {
                { "  JK Rowling  ", "J.K. Rowling" },
                { "14232433", "No authors directly matched your search" }
        };
    }
}
