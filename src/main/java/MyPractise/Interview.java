package MyPractise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Interview {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	//enter the url
	driver.get("https://www.google.com/");
	//To get the title of current web page
	String title = driver.getTitle();
	System.out.println("Title: "+title);
	//To get the url of current web page
	String url = driver.getCurrentUrl();
	System.out.println("URL: "+url);
	//To close the browser
	Thread.sleep(2000);
	driver.close();

}
}