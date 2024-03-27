package MyPractise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Facebook {
	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569900&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D9179674%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwtJKqBhCaARIsAN_yS_nIrhZSRqXm8_TkcKGxHu-_hIJ1XOI011C-WdeSyLtxDpj0QjvB5KMaArj3EALw_wcB");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vengat");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
	driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}