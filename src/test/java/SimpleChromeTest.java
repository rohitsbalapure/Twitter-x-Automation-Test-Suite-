import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleChromeTest {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    ChromeDriver driver = new ChromeDriver();
    

        // Navigate to a URL
        driver.get("https://www.google.com");

        System.out.println("Title of the page is :"+ driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
