import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assighnmentthree {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		String[] itemsNeeded = { "iphone X", "Samsung Note 8","Nokia Edge", "Blackberry" };

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		// Try handling the alert with explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("No alert was present.");
		}

		driver.findElement(By.id("okayBtn")).click();

		WebElement staicDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staicDropdown);
		dropdown.selectByVisibleText("Consultant");

		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-link.btn.btn-primary")));

		addItems(driver, itemsNeeded);
		// Close driver
		// driver.quit();
	}

	public static void addItems(WebDriver driver , String[] itemsNeeded)
    {
		int j=0;
    	List<WebElement> products = driver.findElements(By.cssSelector(".card-title"));
    	

		for (int i = 0; i < products.size(); i++)
		{
			String name = products.get(i).getText();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(name))
			{
				j++;
				driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
				if (j == itemsNeeded.length)

				{

					break;

				}
				
				
			}
			
			
			
			
			
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
    }
		
}
