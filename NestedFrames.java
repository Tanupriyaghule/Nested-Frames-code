package test_case.codes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class NestedFrames {
    WebDriver driver;

    public NestedFrames() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.quit();
    }

    public void testcase04() {
        System.out.println("Start test case:testcase04");
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().parentFrame();
        WebElement element = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(element);
        
        WebElement leftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        driver.switchTo().frame(leftframe);
        String text = driver.findElement(By.tagName("body")).getText();
        System.out.println(text);
        driver.switchTo().parentFrame();
        WebElement centerframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(centerframe);
        String text1 = driver.findElement(By.tagName("body")).getText();
        System.out.println(text1);
        driver.switchTo().parentFrame();
        WebElement rightframe = driver.findElement(By.xpath("//frame[@name='frame-right']"));
        driver.switchTo().frame(rightframe);
        String text2 = driver.findElement(By.tagName("body")).getText();
        System.out.println(text2);
        driver.switchTo().parentFrame();
    }
    }
