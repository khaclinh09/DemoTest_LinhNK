package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Test1_WebInfo;

public class FindElement01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Test1_WebInfo.meshUrl);
		driver.close();
		
		
		
	}

}
