package dataproviders;

import org.testng.annotations.DataProvider;

public class AuthDataProviders {
    @DataProvider(name = "negativeLoginData")
    public static Object[][] negativeLoginData() {
        return new Object[][] {
                // email, password, expectedErrorMsg
                { "zk7832456@gmail.com", "wrongPass123!", "Wrong password. Please try again" },
                { "zaidkhan@gmail.com", "zk7832456pw", "No account was found with this email. Please try again" },
                { "", "", null },
                { "zk7832456@gmail.com", "", null },
                { "zk7832456@", "zk7832456pw", null }
        };
    }
}
