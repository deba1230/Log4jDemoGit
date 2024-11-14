package Demo;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoggerDemo
{
        static Logger log=LogManager.getLogger("LoggerDemo.class");
        public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        log.info("Maximize window");
        driver.get("https://www.saucedemo.com/");
        log.info("Open application");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        log.info("Entered username");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        log.info("Entered password");
        //log.error("for error message");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        log.info("clicked Log in button");
        System.out.println("Completed");
        Thread.sleep(3000);
        driver.close();
        log.info("Window is closed");
    }
}
