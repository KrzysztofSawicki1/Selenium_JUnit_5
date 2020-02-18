import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestJunitJupiter {

    protected static WebDriver driver;

    @BeforeEach()
    public void BeforeEach() {
    }

    @AfterEach()
    public void AfterEach() {
    }

    @BeforeAll()
    public static void BeforeAll()
    {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

    }
    @AfterAll()
    public static void AfterAll() {
        WebDriver driver = new FirefoxDriver();
        driver.quit();
    }

    @Test
    public void Test() {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.testarena.pl/zaloguj/");
        driver.findElement(By.id("email")).sendKeys("a@wp.pl");
        driver.findElement(By.id("password")).sendKeys("012357gfg");
        driver.findElement(By.id("login")).click();
        Assertions.assertEquals(driver.getTitle(), "Logowanie - TestArena Demo");
        System.out.println("POPRAWNY TEST LOGOWANIA");
    }

    }
