import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2ETesting2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@value='HYD']")).click();
		// Thread.sleep(10000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Belagavi (IXG)']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR'])"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);

		} else { 
			System.out.println("enabled"); 
			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		WebElement staicDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staicDropdown);
		dropdown.selectByVisibleText("USD");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
