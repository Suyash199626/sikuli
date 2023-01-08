package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wordtopdf 
{
public static void main(String[] args) throws IOException {
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 107 exe\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#pickfiles > span")).click();
	
	Runtime.getRuntime().exec("C:\\Users\\suyas\\OneDrive\\Desktop\\autoitpractice\\Autoi3.exe");
	
	
}
}
