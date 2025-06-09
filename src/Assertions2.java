
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assertions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).isSelected());
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).isSelected());
		// count the check boxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		// driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(2000L);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	}

}
 