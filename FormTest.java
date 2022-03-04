package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("studentname")).sendKeys("Dheeraj");
		driver.findElement(By.id("fathername")).sendKeys("D");
		driver.findElement(By.id("paddress")).sendKeys("Aurangabad");
		driver.findElement(By.id("personaladdress")).sendKeys("Aurangabad");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[6]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[7]/td[2]/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[8]/td[2]/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[9]/td[2]/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
		driver.findElement(By.id("pincode")).sendKeys("431001");
		driver.findElement(By.id("emailid")).sendKeys("abc@gamil.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Submit Form']")).click();
		
		//driver.close();
	}

}
