package dataproviders;

import org.testng.annotations.DataProvider;

public class SearchBookDataProvider {
    @DataProvider(name = "bookSearchData")
    public Object[][] bookSearchData() {
        return new Object[][] {
                { "   Harry Potter and the Order of the Phoenix  ", "Harry Potter and the Order of the Phoenix" },
                { "HARRY POTTER AND THE ORDER OF THE PHOENIX", "Harry Potter and the Order of the Phoenix" },
                { "thisisnotabookname", "No books directly matched your search. Add a new book?" }
        };
    }
}
