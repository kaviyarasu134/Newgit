package vodafone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://facebook.com");
		
		
		//WebElement crtpage=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		
		//String t=crtpage.getText();
		
		//System.out.println(t);
		
		//WebElement  face=driver.findElement(By.xpath("//h2[contains(text(),'Facebook .']"));
		
		//String f=face.getText();
		
		//System.out.println(f);
		
		
		//WebElement username= driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		
		//username.sendKeys("kaviyarazsupohhg");
		
		
		//String s1=username.getAttribute("kaviyarazsupohhg");
		
		//System.out.println(s1);
		
		//WebElement password=driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		
		//password.sendKeys("12345");
		
		//String w=password.getAttribute("123");
		
		
		//String y=driver.getCurrentUrl();
		
		//System.out.println(y);
		
		
		String cc=driver.getTitle();
		
		System.out.println(cc);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
 }

}
