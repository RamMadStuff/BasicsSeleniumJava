
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender2 {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        String targetDate = "02";
        String targetMonth = "November";
        String targetYear = "1998";

        // Open the calendar
        driver.findElement(By.xpath("//input[@name='month']")).click();

        // Select year
        while (!driver.findElement(By.className("react-calendar__navigation__label")).getText().contains(targetYear)) {
            driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
        }

        // Select month
        while (!driver.findElement(By.className("react-calendar__navigation__label")).getText().contains(targetMonth)) {
            driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
        }

        // Select date
        driver.findElement(By.xpath("//button[normalize-space()='" + targetDate + "']")).click();

        // Verify the selected date
        String selectedDate = driver.findElement(By.xpath("//input[@placeholder='Choose Date']")).getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

        driver.quit();
    }
}
