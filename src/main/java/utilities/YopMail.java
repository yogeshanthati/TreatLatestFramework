package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YopMail extends Common {

	private Data data;

	public YopMail(Data data) {
		this.data = data;
	}

	WebDriver browser = null;

	public String getVerificationCode() {

		String verificationCode = "";
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless", "window-size=1366x728");
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			browser = new ChromeDriver(options);
			browser.get(GlobalKeys.configData.get("YOPMailURL"));

			WebElement txtLogIn = browser.findElement(By.xpath("//input[@name='login']"));

			WebElement btnEnter = browser.findElement(By.xpath("//button[contains(@title,'@yopmail.com')]"));

			if (txtLogIn.isDisplayed()) {

				String EmailAddress = data.get("EmailAddress");

				txtLogIn.clear();

				txtLogIn.sendKeys(EmailAddress);

			} else {
				failed(browser, "Login text box is not displayed");
			}
			if (btnEnter.isDisplayed()) {

				btnEnter.click();

			} else {
				failed(browser, "btn Enter is not displayed");
			}

			browser.switchTo().frame("ifmail");

			WebElement txtVerificationCode = browser.findElement(
					By.xpath("//td[contains(text(),'your password reset code')]//parent::tr//following-sibling::tr/td"));

			
			verificationCode = txtVerificationCode.getText().trim();
			
			browser.quit();
		} catch (Exception e) {

			failed(browser, "Exeception caught As" + e.getMessage());
		}

		return verificationCode;
	}

	public String[] getSharedArticleLinkDetails() {

		String[] sharedArticleLink = new String[2];
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless", "window-size=1366x728");
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			browser = new ChromeDriver(options);
			browser.get(GlobalKeys.configData.get("YOPMailURL"));
			
			Thread.sleep(3000);

			WebElement txtLogIn = browser.findElement(By.xpath("//input[@name='login']"));

			WebElement btnEnter = browser.findElement(By.xpath("//button[contains(@title,'@yopmail.com')]"));

			if (txtLogIn.isDisplayed()) {
				String EmailAddress = data.get("ShareEmailAddress");
				txtLogIn.clear();
				Thread.sleep(1465);
				txtLogIn.sendKeys(EmailAddress);
				Thread.sleep(2050);

			} else {
				failed(browser, "Login text box is not displayed");
			}
			if (btnEnter.isDisplayed()) {

				btnEnter.click();
				Thread.sleep(1934);

			} else {
				failed(browser, "btn Enter is not displayed");
			}

			Thread.sleep(1786);

			WebElement btnRefresh = browser.findElement(By.xpath("//button[@id='refresh']"));
			
			if (btnRefresh.isDisplayed()) {

				btnRefresh.click();

			} else {
				failed(browser, "btn refresh is not displayed");
			}

			Thread.sleep(1320);
			
			WebElement WesharedArticleLink;

			browser.switchTo().frame("ifmail");
			
			Thread.sleep(5765);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				WesharedArticleLink = browser.findElement(By.xpath("//div[@id='mail']//a"));
			} else {
				WesharedArticleLink = browser.findElement(By.xpath("//div[@id='mail']//pre"));
			}

			sharedArticleLink[0] = WesharedArticleLink.getText();

			browser.switchTo().parentFrame();
			
			Thread.sleep(1040);

			browser.switchTo().frame("ifinbox");

			Thread.sleep(1320);

			WebElement WesharedArticleSubject = browser.findElement(By.xpath("(//div[@class='lms'])[1]"));

			sharedArticleLink[1] = WesharedArticleSubject.getText();

			// Thread.sleep(3000);

			browser.quit();

		} catch (Exception e) {

			failed(browser, "Exeception caught As" + e.getMessage());
		}

		return sharedArticleLink;
	}

}
