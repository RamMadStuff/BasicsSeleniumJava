import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Assignment7 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		js.executeScript("window.scroll(0,500)");
		List<WebElement> Row = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		List<WebElement> Column = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));

		System.out.println(Row.size());
		System.out.println(Column.size());
		for (int i = 0; i < Row.size(); i++) {
			String store = Row.get(i).getText();
			// System.out.println(store);

			if (store.contains("Appium")) {
				System.out.println(store);

			}

		}
	}

}
