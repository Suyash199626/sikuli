package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class facebook 
{
public static void main(String[] args) throws FindFailed {
	System.out.println("hello selenium");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 107 exe\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY2MTYwMTM3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
Screen sc=new Screen();
	Pattern name=new Pattern("C:\\Users\\suyas\\OneDrive\\Desktop\\sikuli practice\\username.png");
	Pattern pass=new Pattern("C:\\Users\\suyas\\OneDrive\\Desktop\\sikuli practice\\password.png");
	Pattern sub=new Pattern("C:\\Users\\suyas\\OneDrive\\Desktop\\sikuli practice\\loginbutton.png");

     sc.type(name,"hchhjx");
     sc.type(pass,"8787huhu");
     sc.click(sub);
	
	
}
}
