

    import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

    public class Hooks {

        @Before
        public void setUp() {
            // Test öncesi hazırlıklar (driver başlatma burada yapılabilir)
            Driver.getDriver();
        }

        @After
        public void tearDown() {
            // Sadece senaryolar bittikten sonra driver kapat
            Driver.closeDriver();
        }
    }


