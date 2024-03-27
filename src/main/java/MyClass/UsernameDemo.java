package MyClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernameDemo {

	public static void main(String[] args) {
		
		        WebDriver driver = new ChromeDriver();

		        try {
		            // Open the login page
		            driver.get("https://www.tutorialspoint.com/market/login.jsp");

		            // Find the username and password input fields
		            WebElement usernameField = driver.findElement(By.id("login_email"));
		            WebElement passwordField = driver.findElement(By.id("login_password"));

		            // Enter the username and password
		            usernameField.sendKeys("ashvinisusar2001@gmail.com");
		            passwordField.sendKeys("ashvini@1.");

		            // Submit the login form
		            passwordField.submit(); // Assuming the form gets submitted with the password field

		            // Wait for the login process to complete (you could use explicit waits here)
		            Thread.sleep(3000);

		            // Check if login was successful based on the presence or absence of certain elements or URLs
		            if (driver.getCurrentUrl().contains("dashboard")) {
		                System.out.println("Login successful!");
		            } else {
		                System.out.println("Login failed: Incorrect username or password.");
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
		

	}


