package com.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	void login() {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Test(priority = 2)
	void search() {

		System.out.println("This is search.....");

	}

	@Test(priority = 3)
	void advSearch() {

		System.out.println("This is advsearch.....");
	}

	void close() {

		System.out.println("This is close.....");
		driver.close();

	}

	@DataProvider(name="dp",indices= {0,3})
	Object[][] Logindata() {
		Object[][] data = { { "Hello", "hello" }, { "Hi", "Hirty" }, { "Admin", "admin123" },

		};

		return data;

	}

	
			
}
