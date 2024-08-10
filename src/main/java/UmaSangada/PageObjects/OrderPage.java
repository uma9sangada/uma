package UmaSangada.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UmaSangada.AbstractComponents.AbstractComponents;

/**
 * Hello world!
 *
 */
public class OrderPage extends AbstractComponents
{
    
	WebDriver driver ;
	public OrderPage(WebDriver driver)//by default default constructor is called    
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(css = "tr td:nth-child(3)")
	List<WebElement> ProductNames;
	

	
	public Boolean verifyOrderDisplayed(String ProductName)
	{
	Boolean match = ProductNames.stream().anyMatch(pname -> pname.getText().equals(ProductName));
	return match;
	}
	
	
}
