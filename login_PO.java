package pageObjects_T24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_PO {
	public WebElement txtUserName(WebDriver driver) {
		WebElement el = driver.findElement(By.cssSelector("#signOnName"));
		return el;
	}

	public WebElement password(WebDriver driver) {
		WebElement el = driver.findElement(By.cssSelector("input#password.input_box"));
		return el;

	}

	public WebElement btnLogin(WebDriver driver) {
		WebElement el = driver.findElement(By.xpath("//*[@id=\"sign-in\"]"));
		return el;
	}

	public WebElement messError(WebDriver driver) {
		WebElement el = driver.findElement(By.cssSelector("/#error"));
		return el;

	}
}
