package task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 

{       public void m1()
      {     
	System.out.println("hi");
       }
        public void m2()
      {     
	System.out.println("hi");
       }

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipce2019\\chromedriver_win32\\chromedriver 100\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
	}
}
