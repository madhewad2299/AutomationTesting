import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.id("field1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("field1")).sendKeys("Welcome to selenium");
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
	//	act.doubleClick(button).perform();
		act.doubleClick(button).perform();
	}

}
