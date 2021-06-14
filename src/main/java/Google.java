import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
    public static void main(String[] args) {
        WebDriver driver;
        String baseDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDirectory + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("Java" +"" + Keys.RETURN);
    }
}




