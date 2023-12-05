package luma.ny.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import luma.ny.basepage.BasePage;

public class NewStepDef extends BasePage{
	
@Given("User is able to open the browser")
public void user_is_able_to_open_the_browser() {
	BasePage.getIntinization(); 
    
}
@Given("User is able to enter the URL")
public void user_is_able_to_enter_the_url() {
	//driver.get("https://magento.softwaretestingboard.com");
    
}
@Given("User is able to click on sign in BTN")
public void user_is_able_to_click_on_sign_in_btn() {
	driver.findElement(By.linkText("Sign In")).click();
    
}
@Given("User is able to enter the user name")
public void user_is_able_to_enter_the_user_name() {
	driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("Joyalam204@gmail.com");
    
}
@Given("User is able to enter the password")
public void user_is_able_to_enter_the_password() {
	driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Hassibul1998@");
    
}
@Given("User is able to click on log in BTN")
public void user_is_able_to_click_on_log_in_btn() {
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

}

}
