package testNG;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://teccorps.com/");
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int brokenlinkscount = 0;
		for (int i = 0; i < Links.size(); i++) {
			WebElement link = Links.get(i);
			String attribute = link.getAttribute("href");
			
			URL u = new URL(attribute);
			HttpURLConnection s = (HttpURLConnection) new URL(attribute).openConnection();
			int responseCode = s.getResponseCode();
			if (responseCode >=400&&responseCode<500) {
				
				System.out.println(attribute+"broken link");
				
				brokenlinkscount++;
			}
		}
		System.out.println("the number of broken links are"+ brokenlinkscount);
				
			}
			
		
		
		
	
	
}
