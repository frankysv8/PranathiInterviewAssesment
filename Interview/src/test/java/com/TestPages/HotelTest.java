package com.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.helper.DataReaderManager;
import com.pom.HomePage;
import com.pom.PropertiesPage;

public class HotelTest extends BaseClass{

	static WebDriver driver;

	@Test
	public void validate_5_Star_Rating() throws IOException, InterruptedException {

		driver = browser_Launch("chrome");
		url_Launch(DataReaderManager.getInstanceDRM().getInstanceDR().getPropUrl());
		HomePage hp = new HomePage(driver);
		hp.navigateToHotels();
		PropertiesPage pp = new PropertiesPage(driver);
		hp.enterDetailsToSearchHotel();
		pp.selectFilter();
		pp.validateHotelNames();

	}

}
