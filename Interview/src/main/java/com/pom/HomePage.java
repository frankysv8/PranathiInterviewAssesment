package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	
	WebDriverWait wa;
	
	@FindBy(xpath = "//a[contains(@href,'hotels')]")
	private WebElement hotels;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getFromDate() {
		return fromDate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getRoomDropDown() {
		return roomDropDown;
	}

	public WebElement getRoomCnt() {
		return roomCnt;
	}

	public WebElement getAdultsDropDown() {
		return adultsDropDown;
	}

	public WebElement getAdultsCnt() {
		return adultsCnt;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id = "city")
	private WebElement destination;
	
	@FindBy(xpath = "//p[@class='sr_city']/span/b[contains(text(),'Sing')]")
	private WebElement singaporeLocation;
	
	@FindBy(xpath = "//input[@placeholder='Where do you want to stay?']")
	private WebElement location;

	@FindBy(id = "checkin")
	private WebElement fromDate;

	@FindBy(xpath = "//div[contains(@class,'DayPicker-Day') and contains(@aria-label,'Wed Aug 21 2024')]")
	private WebElement date;

	@FindBy(xpath = "//p[text()='Rooms']//parent::div//following-sibling::div/div/span")
	private WebElement roomDropDown;
	
	@FindBy(xpath = "//div[text()='23']")
	private WebElement checkOutDate;

	@FindBy(xpath = "//p[text()='Rooms']//parent::div//following-sibling::div/child::ul/li[text()='2']")
	private WebElement roomCnt;

	@FindBy(xpath = "//p[text()='Adults']//parent::div//following-sibling::div/div/span")
	private WebElement adultsDropDown;

	@FindBy(xpath = "//p[text()='Adults']//parent::div//following-sibling::div/div//following-sibling::ul/li[text()='2']")
	private WebElement adultsCnt;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;

	@FindBy(id = "hsw_search_button")
	private WebElement search;
	
	@FindBy(id="guest")
	private WebElement roomAndGuest;
	
	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement alertTab;

	public void navigateToHotels() {
		
		wa.until(ExpectedConditions.visibilityOf(alertTab));
		alertTab.click();
		
		wa.until(ExpectedConditions.visibilityOf(hotels));
		hotels.click();

	}

	public void enterDetailsToSearchHotel() throws InterruptedException {
		
		wa.until(ExpectedConditions.visibilityOf(destination));
		destination.sendKeys("Singapore");
		Thread.sleep(3000);
		location.sendKeys("Singapore");
		singaporeLocation.click();
		fromDate.click();
		wa.until(ExpectedConditions.visibilityOf(date));
		date.click();
		checkOutDate.click();
		wa.until(ExpectedConditions.visibilityOf(roomDropDown));
		roomDropDown.click();
		roomCnt.click();
		adultsDropDown.click();
		adultsCnt.click();
		apply.click();
		search.click();
	}

	public HomePage(WebDriver init) {
		this.driver = init;
		PageFactory.initElements(driver, this);
		wa = new WebDriverWait(driver, 10);
	}
}
