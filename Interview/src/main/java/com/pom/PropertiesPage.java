package com.pom;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PropertiesPage {

	private WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//span[contains(text(),'User')]")
	private WebElement userRating;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserRating() {
		return userRating;
	}

	public WebElement getRating() {
		return rating;
	}

	public List<WebElement> getHotelTitles() {
		return hotelTitles;
	}

	@FindBy(xpath = "//span[text()='5 Star']")
	private WebElement rating;

	@FindBy(xpath = "//p[@id='hlistpg_hotel_name']/span[contains(@class,'wordBreak')]")
	private List<WebElement> hotelTitles;

	public void selectFilter() {

		userRating.click();
		rating.click();
	}

	public void validateHotelNames() {
		
		wait.until(ExpectedConditions.visibilityOfAllElements(hotelTitles));
		assertEquals(getHotelTitles().size(), 10);
		for (WebElement hotelTitle : getHotelTitles()) {

			String hotel = hotelTitle.getText();
			System.out.println(hotel);

		}
	}

	public PropertiesPage(WebDriver init) {
		this.driver = init;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
}
