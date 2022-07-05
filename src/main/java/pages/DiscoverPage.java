
package pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utilities.Constants;
import utilities.ContentAPI;
import java.time.Duration;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;
import utilities.YopMail;

public class DiscoverPage extends TestBase {

	protected DiscoverPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Discover')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Discover']")
	private MobileElement lblDiscover;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'id/myAccount')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='accountInactive']")
	private MobileElement btnMyAccount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Travel']//following-sibling::XCUIElementTypeScrollView[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]")
	private List<MobileElement> eleTravelContent1;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Health']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Health']//following-sibling::XCUIElementTypeScrollView[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]")
	private List<MobileElement> eleHealthContent1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wellness']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wellness']//following-sibling::XCUIElementTypeScrollView[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]")
	private List<MobileElement> eleWellnessContent1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
	@iOSXCUITFindBy(accessibility = "becomeATreatMemberArticleImage")
	private MobileElement eleNonMemberContent;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup//android.widget.ImageView[2]")
	@iOSXCUITFindBy(accessibility= "treatLogo")
	private MobileElement eleNonMemberTreatLogo;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/bt_know_more')]")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name='Know More']")
	private MobileElement btnNonMemberKnowMore;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/text_view_view_all')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='VIEW ALL POSTS']")
	private MobileElement btnViewAll;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnNavigateBack;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button)[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Read More'])[1]")
	private MobileElement btnTravelReadMore1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Health']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button)[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Read More'])[6]")
	private MobileElement btnHealthReadMore1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Wellness']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button)[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Read More'])[11]")
	private MobileElement btnWellnessReadMore1;

	@AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Read More')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Read More'][1]")
	private MobileElement btnTrvlReadMoreInviewAll;

	@AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Read More')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Read More'][1]")
	private MobileElement btnHlthReadMoreInViewAll;

	@AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Read More')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Read More'][1]")
	private MobileElement btnWellnessReadMoreInViewAll;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,':id/toolbar')]//following-sibling::android.widget.ImageButton[contains(@resource-id,'id/image_button_share')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='share'])[16]")
	private MobileElement EleShareInReadMore;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id,'id/image_button_share')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='share'])[16]")
	private MobileElement btnTrvlShareInviewAll;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id,'id/image_button_share')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='share'])[1]")
	private MobileElement btnHlthShareInviewAll;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id,'id/image_button_share')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='share'])[1]")
	private MobileElement btnWellnessShareInviewAll;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeImage")
	private List<MobileElement> imglstInViewAllArticle;
	
	
	//new screens
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_login')]")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name='Become a Member']")
	private MobileElement btnBcomeAMemberForGuestInBecomeAMemberCard;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_leading')]")
	@iOSXCUITFindBy(accessibility= "treatLogoSmall")
	private MobileElement eleGuestTreatLogoInBecomeAMemberCard;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_account_item')]")	
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeImage[@name='treatLogoSmall']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleGuestTitleInBecomeAMemberCard;
	

	@AndroidFindBy(xpath = "//	android.widget.TextView[contains(@resource-id,'id/tv_become_member_desc')]")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeImage[@name='treatLogoSmall']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleGuestDescInBecomeAMemberCard;
	
	
	public void ValidateButtonTextfieldsInDiscoverPage()
	{
		ValidateElementTextInPage(btnTravelReadMore1, Constants.DiscoverPage_ReadMoreButton_text, "DiscoverPage", "Read More Button");
		
		ValidateElementTextInPage(btnTrvlReadMoreInviewAll, Constants.DiscoverPage_ViewAllPosts_text, "DiscoverPage", "View All Posts Link text");
	}

	public void NavigateToTravelArticleReadMorePage() {

		try {
			waitForElement(btnTravelReadMore1);

			if (isElementPresent(btnTravelReadMore1)) {

				clickOn(btnTravelReadMore1, "Readmore button in Travel Article inside Discover Page");
			}

			waitForElement(EleShareInReadMore);

			sleep(3000);

			if (isElementPresent(EleShareInReadMore)) {

				passed("Travel Article Successfully loaded in Read More  from Discover Page ");

				takeScreenshot(driver);
			} else {

				failed(driver, "Travel Article Fail To loaded In Read More from Discover Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void NavigateToHealthArticleReadMorePage() {

		try {
			waitForElement(btnHealthReadMore1);

			if (isElementPresent(btnHealthReadMore1)) {

				clickOn(btnHealthReadMore1, "Readmore button in Health Article inside Discover Page");
			}

			waitForElement(EleShareInReadMore);

			sleep(3000);

			if (isElementPresent(EleShareInReadMore)) {

				passed("Health Article Successfully loaded in Read More  from Discover Page ");

				takeScreenshot(driver);
			} else {

				failed(driver, "Health Article Fail To loaded In Read More from Discover Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void NavigateToWellnessArticleReadMorePage() {

		try {
			waitForElement(btnWellnessReadMore1);

			if (isElementPresent(btnWellnessReadMore1)) {

				clickOn(btnWellnessReadMore1, "Readmore button in Wellness Article inside Discover Page");
			}

			waitForElement(EleShareInReadMore);

			sleep(3000);

			if (isElementPresent(EleShareInReadMore)) {

				passed("Wellness Article Successfully loaded in Read More  from Discover Page ");

				takeScreenshot(driver);
			} else {

				failed(driver, "Wellness Article Fail To loaded In Read More from Discover Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateBecomeTreatMemberButtonInDiscoverForNonMember() {

		try {
			waitForElement(eleNonMemberContent);

			if (isElementPresent(eleNonMemberContent)) {

				passed("Successfully  validated the BecomeA TreatMembetArticle Image in Discover page For NonMember user");

			} else {

				failed(driver, "Failed To validate  BecomeA TreatMembetArticle Image in Discover page For NonMember user");
			}
			waitForElement(eleNonMemberTreatLogo);

			if (isElementPresent(eleNonMemberTreatLogo)) {

				passed("Successfully  validated the Treat Logo in Discover page For NonMember user");

			} else {

				failed(driver, "Failed To validate  Treat Logo in Discover page For NonMember user");
			}

			waitForElement(btnNonMemberKnowMore);

			if (isElementPresent(btnNonMemberKnowMore)) {
				passed("Successfully  validated the Know More button in Discover page For NonMember user");

			} else {

				failed(driver, "Failed To validate Know More button  in Discover page For NonMember user");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void TestMAkeFail() {
		failed(driver, "Exception caught As ");
	}
	
public void ValidateBecomeTreatMemberButtonInDiscoverForMember() {
		
	try {
		waitForElement(eleNonMemberContent);

		if (!isElementPresent(eleNonMemberContent)) {

			passed("Successfully  validated the BecomeA TreatMembetArticle Image is not present in Discover page For NonMember user");

		} else {

			failed(driver, "Failed To validate  BecomeA TreatMembetArticle Image is not present in Discover page For NonMember user");
		}
		waitForElement(eleNonMemberTreatLogo);

		if (isElementPresent(eleNonMemberTreatLogo)) {

			passed("Successfully  validated the Treat Logo is not present in Discover page For NonMember user");

		} else {

			failed(driver, "Failed To validate  Treat Logo is not present in Discover page For NonMember user");
		}

		waitForElement(btnNonMemberKnowMore);

		if (isElementPresent(btnNonMemberKnowMore)) {
			passed("Successfully  validated the Know More button is not present in Discover page For NonMember user");

		} else {

			failed(driver, "Failed To validate Know More button is not present in Discover page For NonMember user");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}


		
	}

public void SwipeDownToViewKnowMoreButton() {
	
	try {
		SwipeDown();
		
		SwipeDown();
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
}




public void ValidateBecomeAMemberCardForGuestUser() {
	
	try {
		
		
		waitForElement(btnBcomeAMemberForGuestInBecomeAMemberCard);
		
		if(isElementPresent(btnBcomeAMemberForGuestInBecomeAMemberCard)) {
			
			passed("Successfully validated the Become A Member button In Discover Screen For guest User ");
		}
		else {
			failed(driver, "Failed To Validate the Become A Member button In Discover Screen For guest User ");
		}
		
if(isElementPresent(eleGuestTreatLogoInBecomeAMemberCard)) {
			
			passed("Successfully validated the treat Logo In Become A Member Card  In Discover Screen For guest User ");
		}
		else {
			failed(driver, "Failed To Validate the treat Logo In Become A Member Card  In Discover Screen For guest User");
		}
		
waitForElement(eleGuestTitleInBecomeAMemberCard);

if(eleGuestTitleInBecomeAMemberCard.getText().replaceAll("\\s+", "").equals(Constants.GuestBecomeAMemberCardTitle.replaceAll("\\s+", ""))) {
		
		passed("Successfully Validated Become A Member Card title for A Guest In Discover As"+eleGuestTitleInBecomeAMemberCard.getText());
		
}
else {
		failed(driver,"Failed To Validate Become A Member Card title for A Guest In Discover,Expected As"+Constants.GuestBecomeAMemberCardTitle+"Actual is "+eleGuestTitleInBecomeAMemberCard.getText());
}
waitForElement(eleGuestDescInBecomeAMemberCard);

if(eleGuestDescInBecomeAMemberCard.getText().replaceAll("\\s+", "").equals(Constants.GuestBecomeAMemberCardDesc.replaceAll("\\s+", ""))) {
		
		passed("Successfully Validated Become A Member Card Description for A Guest In Discover As"+eleGuestTitleInBecomeAMemberCard.getText());
		
}
else {
		failed(driver,"Failed To Validate Become A Member Card Description for A Guest In Discover,Expected As"+Constants.GuestBecomeAMemberCardTitle+"Actual is "+eleGuestTitleInBecomeAMemberCard.getText());
}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());

	}
	
}
	public void ValidateLatestTravelArticleContentInDiscoverPage() {

		try {
			ContentAPI ContentAPI = new ContentAPI(data);

			ContentAPI.getCategoryContentDetails("travel");
			
			NavigateToTravelArticleReadMorePage();

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnTravelReadMore1);

			if (isElementPresent(btnTravelReadMore1)) {

				passed("Successfully Validated Navigate Back Button functionality for Travel Article In Discover screen ");

				takeScreenshot(driver);
			}

			else {
				failed(driver,
						"Failed to validate the Navigate Back Button functionality for Travel Article In Discover screen ");
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				// ------------------------------------------Android---------------------------------------------------

				waitForElement(eleTravelContent1.get(0));

				if (isElementPresent(eleNonMemberContent)) {

					SwipeByCoordinates(eleTravelContent1.get(0).getLocation().x,
							eleTravelContent1.get(0).getLocation().y,

							eleNonMemberContent.getLocation().x, eleNonMemberContent.getLocation().y);

				}

				for (int i = 0; i <= 4; i++) {

					List<WebElement> eleTravelContent = driver.findElementsByXPath(
							"//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup");

					WebElement contentTitle = driver.findElement(By.xpath(
							"//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'id/text_view_content_title')]"));

					List<WebElement> AuthorName = driver.findElements(By.xpath(
							"//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'id/text_view_author')]"));

					if (contentTitle.getText().trim().replaceAll("\\s+", "")
							.equalsIgnoreCase(ContentAPI.API_title.get(i).replaceAll("\\s+", ""))) {

						passed("Successfully validated the " + (i + 1) + "Travel Article Content Title as"
								+ contentTitle.getText().trim());

						takeScreenshot(driver);

					} else {
						failed(driver, "Failed To validate the " + (i + 1) + "Travel Article Content Title, Expected "
								+ ContentAPI.API_title.get(i) + "but Actual is" + contentTitle.getText().trim());
					}

					String UIAuthorName;

					System.out.println(AuthorName.size());

					if (!AuthorName.get(0).getText().isEmpty()) {

						String[] UIAuthorNameArr = AuthorName.get(0).getText().split("by");

						UIAuthorName = UIAuthorNameArr[1];

					} else {
						UIAuthorName = "";
					}

					if (UIAuthorName.replaceAll("\\s+", "")
							.equalsIgnoreCase(ContentAPI.API_AuthorName.get(i).replaceAll("\\s+", ""))) {

						passed("Successfully validated the " + (i + 1) + "Travel Article Content Author Name"
								+ UIAuthorName);

					} else {
						failed(driver,
								"Failed To validate the " + (i + 1) + "Travel Article Content Author Name, Expected "
										+ ContentAPI.API_AuthorName.get(i) + "but Actual is" + UIAuthorName);
					}
					if (eleTravelContent.size() > 1) {

						SwipeByCoordinates(eleTravelContent.get(1).getLocation().x,
								eleTravelContent.get(1).getLocation().y, eleTravelContent.get(0).getLocation().x,
								eleTravelContent.get(0).getLocation().y);

					}

					else {
						waitForElement(btnViewAll);

						clickOn(btnViewAll, "ViewAll button");

						break;

					}

				}

				sleep(5000);
				
				waitForElement(btnTrvlReadMoreInviewAll);

				List<WebElement> els1 = driver.findElementsByXPath(
						"//android.widget.TextView[contains(@resource-id,'id/text_view_content_title')]");
				Point p1 = els1.get(0).getLocation();
				Point p2 = els1.get(1).getLocation();

				for (int i = 0; i <= 10; i++) {

					WebElement eleImage = driver.findElementByXPath("(//android.widget.ImageView)[1]");
					waitForElement(eleImage);

					if (isElementPresent(eleImage)) {
						passed("Travel Article Content Image loaded successfully ");
					}

					passed("Scolling Down in Travel Article View All Posts");

					TouchAction action = new TouchAction(driver);

					action.press(new PointOption().point(p2.x, p2.y))
							.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
							.moveTo(new PointOption().point(p1.x, p1.y)).release().perform();

				}

				takeScreenshot(driver);
				passed("user Successfully validated Travel articles Scrolling in View all Screen");

				waitForElement(btnTrvlReadMoreInviewAll);

				if (isElementPresent(btnTrvlReadMoreInviewAll)) {

					clickOn(btnTrvlReadMoreInviewAll, "Readmore button in Travel Article View All Screen");
				}

				sleep(3000);
				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					passed("Travel Article Successfully loaded in Read More  from Discover Page ");

					takeScreenshot(driver);
				} else {

					failed(driver, "Travel Article Fail To loaded In Read More from Discover Page");

				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnTrvlReadMoreInviewAll);

				if (isElementPresent(btnTrvlReadMoreInviewAll)) {

					takeScreenshot(driver);
					passed("Successfully Validated Navigate Back Button functionality for Travel Article In View All screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Travel Article In View All screen ");
				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnTravelReadMore1);

				if (isElementPresent(btnTravelReadMore1)) {
					takeScreenshot(driver);
					passed("Successfully Validated Navigate Back Button functionality for Travel Article In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Travel Article In Discover Screen ");
				}

			}
//-------------------------------------------iOS--------------------------------------------------------
			else {

				waitForElement(eleTravelContent1.get(0));

				int ele1X = eleTravelContent1.get(0).getLocation().x;

				int ele1Y = eleTravelContent1.get(0).getLocation().y;

				int ele2X = eleTravelContent1.get(1).getLocation().x;

				int ele2Y = eleTravelContent1.get(1).getLocation().y;

				List lstUITrvlArticlecontentTitle = new ArrayList();

				List lstUITrvlArticlecontentAuthor = new ArrayList();

				List lstAPITrvlArticlecontentTitle = new ArrayList();

				List lstAPITrvlArticlecontentAuthor = new ArrayList();




					List<WebElement> elemsTravelContent = driver.findElementsByXPath(
							"(//XCUIElementTypeStaticText[@name='Travel']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]");

					List<WebElement> elemsTravelContentAuthors = driver.findElementsByXPath(
							"(//XCUIElementTypeStaticText[@name='Travel']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'by')]");

					int contentLength = elemsTravelContent.size();
					int authorLength = elemsTravelContentAuthors.size();

					for (int i = 0; i < contentLength; i++) {
						lstUITrvlArticlecontentTitle
								.add(elemsTravelContent.get(i).getText().replaceAll("\\s+", ""));
					}
					for (int i = 0; i < authorLength; i++) {

						lstUITrvlArticlecontentAuthor
								.add(elemsTravelContentAuthors.get(i).getText().replaceAll("\\s+", "").split("by")[1]);

					}


					for (int i = 0; i < 5; i++) {

						lstAPITrvlArticlecontentTitle.add(ContentAPI.API_title.get(i).replaceAll("\\s+", ""));
						if (!ContentAPI.API_AuthorName.get(i).isEmpty()) {
							lstAPITrvlArticlecontentAuthor.add(ContentAPI.API_AuthorName.get(i).replaceAll("\\s+", ""));
						}
					}

					System.out.println(lstAPITrvlArticlecontentTitle);

					System.out.println(lstAPITrvlArticlecontentAuthor);

					if (lstUITrvlArticlecontentTitle.containsAll(lstAPITrvlArticlecontentTitle)) {

						passed("User Successfully validated the content titles  as" + lstUITrvlArticlecontentTitle);

					} else {

						failed(driver, "Failed to  validated the Content Title Expected as"
								+ lstAPITrvlArticlecontentTitle + "but actual is" + lstUITrvlArticlecontentTitle);
					}

					if (lstUITrvlArticlecontentAuthor.containsAll(lstAPITrvlArticlecontentAuthor)) {

						passed("User Successfully validated the Author Names as" + lstUITrvlArticlecontentAuthor);

					} else {

						failed(driver, "Failed to  validated the Author Names Expected as"
								+ lstAPITrvlArticlecontentAuthor + "but actual is" + lstUITrvlArticlecontentAuthor);
					}

				

				// ------------------------------------------------------------------------------------
				waitForElement(btnViewAll);

				clickOn(btnViewAll, "ViewAll button");

				sleep(5000);

				int eleimg1X = imglstInViewAllArticle.get(0).getLocation().x;

				int eleimg1Y = imglstInViewAllArticle.get(0).getLocation().y;

				int eleimg2X = imglstInViewAllArticle.get(1).getLocation().x;

				int eleimg2Y = imglstInViewAllArticle.get(1).getLocation().y;

				if (isElementPresent(imglstInViewAllArticle.get(0))) {

					passed("Article Content Image loaded successfully ");

				}

				if (isElementPresent(imglstInViewAllArticle.get(1))) {
					passed("Article Content Image loaded successfully ");

				}

				for (int i = 0; i <= 10; i++)

				{
					SwipeByCoordinates(eleimg2X, eleimg2Y, eleimg1X, eleimg1Y);

					WebElement eleImg = driver.findElementByXPath("(//XCUIElementTypeOther/XCUIElementTypeImage)[3]");

					if (isElementPresent(eleImg)) {
						passed("Article Content Image loaded successfully ");

					}

					passed("Scolling Down in Travel Article View All Posts");

				}

				takeScreenshot(driver);
				passed("user Successfully validated Travel articles Scrolling in View all Screen");

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnTrvlReadMoreInviewAll);

				if (isElementPresent(btnTrvlReadMoreInviewAll)) {

					passed("Successfully Validated Navigate Back Button functionality for Travel Article In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Travel Article In View All screen ");
				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnTravelReadMore1);

				if (isElementPresent(btnTravelReadMore1)) {

					passed("Successfully Validated Navigate Back Button functionality for Travel Article In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Travel Article In Discover Screen ");
				}

				sleep(3000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);

				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateLatestHealthArticleContentInDiscoverPage() {
		try {
			Thread.sleep(3000);

			if(!isElementPresent(btnBcomeAMemberForGuestInBecomeAMemberCard)) {
			HalfSwipeUp();
			}else {
				SwipeUp();
			}

			ContentAPI ContentAPI = new ContentAPI(data);

			ContentAPI.getCategoryContentDetails("health");

			waitForElement(btnHealthReadMore1);

			if (isElementPresent(btnHealthReadMore1)) {

				clickOn(btnHealthReadMore1, "Readmore button in Health Article inside Discover Page");
			}

			waitForElement(EleShareInReadMore);

			sleep(3000);

			if (isElementPresent(EleShareInReadMore)) {

				passed("Health Article Successfully loaded in Read More  from Discover Page ");

				takeScreenshot(driver);
			} else {
				failed(driver, "Health Article Fail To loaded In Read More from Discover Page");

			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnHealthReadMore1);

			if (isElementPresent(btnHealthReadMore1)) {

				passed("Successfully Validated Navigate Back Button functionality for Health Article In Discover screen ");
			}

			else {
				failed(driver,
						"Failed to validate the Navigate Back Button functionality for Health Article In Discover screen ");
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				for (int i = 0; i < 5; i++) {

					List<WebElement> eleTravelContent = driver.findElementsByXPath(
							"//android.widget.TextView[@text='Health']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup");

					WebElement contentTitle = driver.findElement(By.xpath(
							"//android.widget.TextView[@text='Health']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'id/text_view_content_title')]"));

					List<WebElement> AuthorName = driver.findElements(By.xpath(
							"//android.widget.TextView[@text='Health']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'id/text_view_author')]"));

					if (contentTitle.getText().trim().replaceAll("\\s+", "")
							.equalsIgnoreCase(ContentAPI.API_title.get(i).replaceAll("\\s+", ""))) {

						passed("Successfully validated the " + (i + 1) + "Health Article Content Title as"
								+ contentTitle.getText().trim());

						takeScreenshot(driver);

					} else {
						failed(driver, "Failed To validate the " + (i + 1) + "Health Article Content Title, Expected "
								+ ContentAPI.API_title.get(i) + "but Actual is" + contentTitle.getText().trim());
					}

					String UIAuthorName;

					System.out.println(AuthorName.size());

					if (!AuthorName.get(0).getText().isEmpty()) {

						String[] UIAuthorNameArr = AuthorName.get(0).getText().split("by");

						UIAuthorName = UIAuthorNameArr[1];

					} else {
						UIAuthorName = "";
					}

					if (UIAuthorName.replaceAll("\\s+", "")
							.equalsIgnoreCase(ContentAPI.API_AuthorName.get(i).replaceAll("\\s+", ""))) {

						passed("Successfully validated the " + (i + 1) + "Health Article Content Author Name"
								+ UIAuthorName);

					} else {
						failed(driver,
								"Failed To validate the " + (i + 1) + "Health Article Content Author Name, Expected "
										+ ContentAPI.API_AuthorName.get(i) + "but Actual is" + UIAuthorName);
					}
					if (eleTravelContent.size() > 1) {

						SwipeByCoordinates(eleTravelContent.get(1).getLocation().x,
								eleTravelContent.get(1).getLocation().y, eleTravelContent.get(0).getLocation().x,
								eleTravelContent.get(0).getLocation().y);

					}

					else {
						waitForElement(btnViewAll);

						clickOn(btnViewAll, "ViewAll button");

						break;

					}

				}

				sleep(5000);
				
				waitForElement(btnHlthReadMoreInViewAll);

				List<WebElement> els1 = driver.findElementsByXPath(
						"//android.widget.TextView[contains(@resource-id,'id/text_view_content_title')]");
				Point p1 = els1.get(0).getLocation();
				Point p2 = els1.get(1).getLocation();

				for (int i = 0; i <= 10; i++) {

					WebElement eleImage = driver.findElementByXPath("(//android.widget.ImageView)[1]");
					waitForElement(eleImage);

					if (isElementPresent(eleImage)) {
						passed("Health Article Content Image loaded successfully ");
					}

					passed("Scolling Down in Health Article View All Posts");

					TouchAction action = new TouchAction(driver);

					action.press(new PointOption().point(p2.x, p2.y))
							.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
							.moveTo(new PointOption().point(p1.x, p1.y)).release().perform();

				}

				takeScreenshot(driver);
				passed("user Successfully validated Health articles Scrolling in View all Screen");

				waitForElement(btnHlthReadMoreInViewAll);

				if (isElementPresent(btnHlthReadMoreInViewAll)) {

					clickOn(btnHlthReadMoreInViewAll, "Readmore button in Health Article View All Screen");
				}

				sleep(3000);
				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					passed("Health Article Successfully loaded in Read More  from Discover Page ");

					takeScreenshot(driver);
				} else {

					failed(driver, "Health Article Fail To loaded In Read More from Discover Page");

				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnHlthReadMoreInViewAll);

				if (isElementPresent(btnHlthReadMoreInViewAll)) {

					takeScreenshot(driver);
					passed("Successfully Validated Navigate Back Button functionality for Health Article In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Health Article In View All screen ");
				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnHealthReadMore1);

				if (isElementPresent(btnHealthReadMore1)) {
					takeScreenshot(driver);
					passed("Successfully Validated Navigate Back Button functionality for Health Article In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Health Article In Discover Screen ");
				}

			}

			else {

				sleep(3000);

				waitForElement(eleHealthContent1.get(0));

				int ele1X = eleHealthContent1.get(0).getLocation().x;

				int ele1Y = eleHealthContent1.get(0).getLocation().y;

				int ele2X = eleHealthContent1.get(1).getLocation().x;

				int ele2Y = eleHealthContent1.get(1).getLocation().y;

				List lstUIHealthArticlecontentTitle = new ArrayList();

				List lstUIHealthArticlecontentAuthor = new ArrayList();

				List lstAPIHealthArticlecontentTitle = new ArrayList();

				List lstAPIHealthArticlecontentAuthor = new ArrayList();
				List<WebElement> elemsBeforeSwipeContent = driver.findElementsByXPath(
						"(//XCUIElementTypeStaticText[@name='Health']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]");

				List<WebElement> elemsBeforeSwipeAuthors = driver.findElementsByXPath(
						"(//XCUIElementTypeStaticText[@name='Health']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'by')]");

				int contentLength = elemsBeforeSwipeContent.size();

				int authorLength = elemsBeforeSwipeAuthors.size();

				for (int i = 0; i < contentLength; i++) {
					lstUIHealthArticlecontentTitle.add(elemsBeforeSwipeContent.get(i).getText().replaceAll("\\s+", ""));
				}
				for (int i = 0; i < authorLength; i++) {

					lstUIHealthArticlecontentAuthor
							.add(elemsBeforeSwipeAuthors.get(i).getText().replaceAll("\\s+", "").split("by")[1]);

				}

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				sleep(2000);

			
//			
//				int contentLength1 = elemsAfterSwipeContent.size();
//				int authorLength1 = elemsAfterSwipeAuthors.size();
//
//				for (int i = 0; i < contentLength1; i++) {
//					lstUIHealthArticlecontentTitle
//							.add((elemsAfterSwipeContent.get(i).getText().replaceAll("\\s+", "")));
//				}
//
//				for (int i = 0; i < authorLength1; i++) {
//
//					lstUIHealthArticlecontentAuthor
//							.add(elemsAfterSwipeAuthors.get(i).getText().replaceAll("\\s+", "").split("by")[1]);
//				}

				System.out.println(lstUIHealthArticlecontentTitle);

				System.out.println(lstUIHealthArticlecontentAuthor);

				for (int i = 0; i < 5; i++) {

					lstAPIHealthArticlecontentTitle.add(ContentAPI.API_title.get(i).replaceAll("\\s+", ""));
					if (!ContentAPI.API_AuthorName.get(i).isEmpty()) {
						lstAPIHealthArticlecontentAuthor.add(ContentAPI.API_AuthorName.get(i).replaceAll("\\s+", ""));
					}
				}

				System.out.println(lstAPIHealthArticlecontentTitle);

				System.out.println(lstAPIHealthArticlecontentAuthor);

				if (lstUIHealthArticlecontentTitle.containsAll(lstAPIHealthArticlecontentTitle)) {

					passed("User Successfully validated the content titles  as" + lstUIHealthArticlecontentTitle);

				} else {

					failed(driver, "Failed to  validated the Content Title Expected as"
							+ lstAPIHealthArticlecontentTitle + "but actual is" + lstUIHealthArticlecontentTitle);
				}

				if (lstUIHealthArticlecontentAuthor.containsAll(lstAPIHealthArticlecontentAuthor)) {

					passed("User Successfully validated the Author Names as" + lstUIHealthArticlecontentAuthor);

				} else {

					failed(driver, "Failed to  validated the Author Names Expected as"
							+ lstAPIHealthArticlecontentAuthor + "but actual is" + lstUIHealthArticlecontentAuthor);
				}

				List<WebElement> btnViewAll = driver
						.findElements(By.xpath("//XCUIElementTypeButton[@name='VIEW ALL POSTS']"));

				if (btnViewAll.size() > 1) {
					waitForElement(btnViewAll.get(1));

					clickOn(btnViewAll.get(1), "ViewAll button");

				} else {
					waitForElement(btnViewAll.get(0));

					clickOn(btnViewAll.get(0), "ViewAll button");

				}

				sleep(3000);

				Point eleimg1 = imglstInViewAllArticle.get(0).getLocation();

				Point eleimg2 = imglstInViewAllArticle.get(1).getLocation();

				int eleimg1X = eleimg1.x;

				int eleimg1Y = eleimg1.y;

				int eleimg2X = eleimg2.x;

				int eleimg2Y = eleimg2.y;

				if (isElementPresent(imglstInViewAllArticle.get(0))) {
					passed("Article Content Image loaded successfully ");

				}

				if (isElementPresent(imglstInViewAllArticle.get(1))) {
					passed("Article Content Image loaded successfully ");

				}

				for (int i = 0; i <= 10; i++)

				{
					SwipeByCoordinates(eleimg2X, eleimg2Y, eleimg1X, eleimg1Y);

					WebElement eleImg = driver.findElementByXPath("(//XCUIElementTypeOther/XCUIElementTypeImage)[3]");

					if (isElementPresent(eleImg)) {
						passed("Article Content Image loaded successfully ");

					}

					passed("Scolling Down in Health Article View All Posts");

				}

				takeScreenshot(driver);
				passed("user Successfully validated Health articles Scrolling in View all Screen");
				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate Back Button");
				}

				sleep(3000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);

				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateLatestWellnessArticleContentInDiscoverPage() {

		try {

			SwipeUp();

			SwipeUp();

			ContentAPI ContentAPI = new ContentAPI(data);

			ContentAPI.getCategoryContentDetails("wellness");

			waitForElement(btnWellnessReadMore1);

			if (isElementPresent(btnWellnessReadMore1)) {

				clickOn(btnWellnessReadMore1, "Readmore button in Wellness Article inside discover Page");
			}

			waitForElement(EleShareInReadMore);

			sleep(3000);

			if (isElementPresent(EleShareInReadMore)) {

				passed("Wellness Article Successfully loaded in Read More  from Discover Page ");

				takeScreenshot(driver);
			} else {
				failed(driver, "Wellness Article Fail To loaded In Read More from Discover Page");

			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnWellnessReadMore1);

			if (isElementPresent(btnWellnessReadMore1)) {

				passed("Successfully Validated Navigate Back Button functionality for Wellness Article In Discover screen ");
			}

			else {
				failed(driver,
						"Failed to validate the Navigate Back Button functionality for Wellness Article In Discover screen ");
			}

			SwipeUp();

			SwipeUp();

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				for (int i = 0; i <= 4; i++) {

					List<WebElement> eleTravelContent = driver.findElementsByXPath(
							"//android.widget.TextView[@text='Wellness']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup");

					WebElement contentTitle = driver.findElement(By.xpath(
							"//android.widget.TextView[@text='Wellness']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'id/text_view_content_title')]"));

					List<WebElement> AuthorName = driver.findElements(By.xpath(
							"//android.widget.TextView[@text='Wellness']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'id/text_view_author')]"));

					if (contentTitle.getText().trim().replaceAll("\\s+", "")
							.equalsIgnoreCase(ContentAPI.API_title.get(i).replaceAll("\\s+", ""))) {

						passed("Successfully validated the " + (i + 1) + "Wellness Article Content Title as"
								+ contentTitle.getText().trim());

						takeScreenshot(driver);

					} else {
						failed(driver, "Failed To validate the " + (i + 1) + "Wellness Article Content Title, Expected "
								+ ContentAPI.API_title.get(i) + "but Actual is" + contentTitle.getText().trim());
					}

					String UIAuthorName;

					System.out.println(AuthorName.size());

					if (!AuthorName.get(0).getText().isEmpty()) {

						String[] UIAuthorNameArr = AuthorName.get(0).getText().split("by");

						UIAuthorName = UIAuthorNameArr[1];

					} else {
						UIAuthorName = "";
					}

					if (UIAuthorName.replaceAll("\\s+", "")
							.equalsIgnoreCase(ContentAPI.API_AuthorName.get(i).replaceAll("\\s+", ""))) {

						passed("Successfully validated the " + (i + 1) + "Wellness Article Content Author Name"
								+ UIAuthorName);

					} else {
						failed(driver,
								"Failed To validate the " + (i + 1) + "Wellness Article Content Author Name, Expected "
										+ ContentAPI.API_AuthorName.get(i) + "but Actual is" + UIAuthorName);
					}

					if (eleTravelContent.size() > 1) {

						SwipeByCoordinates(eleTravelContent.get(1).getLocation().x,
								eleTravelContent.get(1).getLocation().y, eleTravelContent.get(0).getLocation().x,
								eleTravelContent.get(0).getLocation().y);

					}

					else {
						waitForElement(btnViewAll);

						clickOn(btnViewAll, "ViewAll button");

						break;

					}

				}

				sleep(5000);
				
				waitForElement(btnWellnessReadMoreInViewAll);

				
				List<WebElement> els1 = driver.findElementsByXPath(
						"//android.widget.TextView[contains(@resource-id,'id/text_view_content_title')]");
				Point p1 = els1.get(0).getLocation();
				Point p2 = els1.get(1).getLocation();

				for (int i = 0; i <= 10; i++) {

					WebElement eleImage = driver.findElementByXPath("(//android.widget.ImageView)[1]");
					waitForElement(eleImage);

					if (isElementPresent(eleImage)) {
						passed("Wellness Article Content Image loaded successfully ");
					}

					passed("Scolling Down in wellness Article View All Posts");

					TouchAction action = new TouchAction(driver);

					action.press(new PointOption().point(p2.x, p2.y))
							.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
							.moveTo(new PointOption().point(p1.x, p1.y)).release().perform();

				}
				takeScreenshot(driver);
				passed("user Successfully validated Wellness articles Scrolling in View all Screen");

				waitForElement(btnWellnessReadMoreInViewAll);

				if (isElementPresent(btnWellnessReadMoreInViewAll)) {

					clickOn(btnWellnessReadMoreInViewAll, "Readmore button in Wellness Article View All Screen");
				}

				sleep(3000);
				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					passed("Wellness Article Successfully loaded in Read More  from Discover Page ");

					takeScreenshot(driver);
				} else {

					failed(driver, "Wellness Article Fail To loaded In Read More from Discover Page");

				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnWellnessReadMoreInViewAll);

				if (isElementPresent(btnWellnessReadMoreInViewAll)) {

					takeScreenshot(driver);
					passed("Successfully Validated Navigate Back Button functionality for  Wellness In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Wellness Article In View All screen ");
				}

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnWellnessReadMore1);

				if (isElementPresent(btnWellnessReadMore1)) {
					takeScreenshot(driver);
					passed("Successfully Validated Navigate Back Button functionality for Wellness Article In Discover screen ");
				}

				else {
					failed(driver,
							"Failed to validate the Navigate Back Button functionality for Wellness Article In Discover Screen ");
				}

			}

			else {

				sleep(3000);

				waitForElement(eleWellnessContent1.get(0));

				Point ele1 = eleWellnessContent1.get(0).getLocation();

				Point ele2 = eleWellnessContent1.get(1).getLocation();

				int ele1X = ele1.x;

				int ele1Y = ele1.y;

				int ele2X = ele2.x;

				int ele2Y = ele2.y;

				List lstUIWellnessArticlecontentTitle = new ArrayList();

				List lstUIWellnessArticlecontentAuthor = new ArrayList();

				List lstAPIWellnessArticlecontentTitle = new ArrayList();

				List lstAPIWellnessArticlecontentAuthor = new ArrayList();
				List<WebElement> elemsBeforeSwipeContent = driver.findElementsByXPath(
						"(//XCUIElementTypeStaticText[@name='Wellness']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]");

				List<WebElement> elemsBeforeSwipeAuthors = driver.findElementsByXPath(
						"(//XCUIElementTypeStaticText[@name='Wellness']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'by')]");

				int contentLength = elemsBeforeSwipeContent.size();
				int authorLength = elemsBeforeSwipeAuthors.size();

				for (int i = 0; i < contentLength; i++) {
					lstUIWellnessArticlecontentTitle
							.add(elemsBeforeSwipeContent.get(i).getText().replaceAll("\\s+", ""));
				}
				for (int i = 0; i < authorLength; i++) {

					lstUIWellnessArticlecontentAuthor
							.add(elemsBeforeSwipeAuthors.get(i).getText().replaceAll("\\s+", "").split("by")[1]);

				}

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				sleep(2000);

				List<WebElement> elemsAfterSwipeContent = driver.findElementsByXPath(
						"(//XCUIElementTypeStaticText[@name='Wellness']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[not(contains(@name,'by'))]");

				List<WebElement> elemsAfterSwipeAuthors = driver.findElementsByXPath(
						"(//XCUIElementTypeStaticText[@name='Wellness']//following-sibling::XCUIElementTypeScrollView)[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'by')]");

				int contentLength1 = elemsAfterSwipeContent.size();
				int authorLength1 = elemsAfterSwipeAuthors.size();

				for (int i = 0; i < contentLength1; i++) {
					lstUIWellnessArticlecontentTitle
							.add((elemsAfterSwipeContent.get(i).getText().replaceAll("\\s+", "")));
				}

				for (int i = 0; i < authorLength1; i++) {

					lstUIWellnessArticlecontentAuthor
							.add(elemsAfterSwipeAuthors.get(i).getText().replaceAll("\\s+", "").split("by")[1]);
				}

				System.out.println(lstUIWellnessArticlecontentTitle);

				System.out.println(lstUIWellnessArticlecontentAuthor);

				for (int i = 0; i < 5; i++) {

					lstAPIWellnessArticlecontentTitle.add(ContentAPI.API_title.get(i).replaceAll("\\s+", ""));

					if (!ContentAPI.API_AuthorName.get(i).isEmpty()) {
						lstAPIWellnessArticlecontentAuthor.add(ContentAPI.API_AuthorName.get(i).replaceAll("\\s+", ""));
					}
				}

				System.out.println(lstAPIWellnessArticlecontentTitle);

				System.out.println(lstAPIWellnessArticlecontentAuthor);

				if (lstUIWellnessArticlecontentTitle.containsAll(lstAPIWellnessArticlecontentTitle)) {

					passed("User Successfully validated the content titles  as" + lstUIWellnessArticlecontentTitle);

				} else {

					failed(driver, "Failed to  validated the Content Title Expected as"
							+ lstAPIWellnessArticlecontentTitle + "but actual is" + lstUIWellnessArticlecontentTitle);
				}

				if (lstUIWellnessArticlecontentAuthor.containsAll(lstAPIWellnessArticlecontentAuthor)) {

					passed("User Successfully validated the Author Names as" + lstUIWellnessArticlecontentAuthor);

				} else {

					failed(driver, "Failed to  validated the Author Names Expected as"
							+ lstAPIWellnessArticlecontentAuthor + "but actual is" + lstUIWellnessArticlecontentAuthor);
				}

				List<WebElement> btnViewAll = driver
						.findElements(By.xpath("//XCUIElementTypeButton[@name='VIEW ALL POSTS']"));

				if (btnViewAll.size() > 1) {
					waitForElement(btnViewAll.get(1));

					clickOn(btnViewAll.get(1), "ViewAll button");

				} else {
					waitForElement(btnViewAll.get(0));

					clickOn(btnViewAll.get(0), "ViewAll button");

				}

				sleep(3000);

				int eleimg1X = imglstInViewAllArticle.get(0).getLocation().x;

				int eleimg1Y = imglstInViewAllArticle.get(0).getLocation().y;

				int eleimg2X = imglstInViewAllArticle.get(1).getLocation().x;

				int eleimg2Y = imglstInViewAllArticle.get(1).getLocation().y;

				if (isElementPresent(imglstInViewAllArticle.get(0))) {
					passed("Article Content Image loaded successfully ");

				}

				if (isElementPresent(imglstInViewAllArticle.get(1))) {
					passed("Article Content Image loaded successfully ");

				}

				for (int i = 0; i <= 10; i++)

				{
					SwipeByCoordinates(eleimg2X, eleimg2Y, eleimg1X, eleimg1Y);

					WebElement eleImg = driver.findElementByXPath("(//XCUIElementTypeOther/XCUIElementTypeImage)[3]");

					if (isElementPresent(eleImg)) {
						passed("Article Content Image loaded successfully ");

					}

					passed("Scolling Down in Health Article View All Posts");

				}

				takeScreenshot(driver);
				passed("user Successfully validated Health articles Scrolling in View all Screen");
				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate Back Button");
				}

				sleep(3000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);

				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				
				sleep(2000);

				SwipeByCoordinates(ele1X, ele1Y, ele2X, ele2Y);
				

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	// ----------------share button
	// functionality.---------------------------------------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='share'][1]")
	private MobileElement btnTravelShare;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Health']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='share'])[6]")
	private MobileElement btnHealthShare;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wellness']//following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='share'])[11]")
	private MobileElement btnWellnessShare;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Gmail')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Mail']")
	private MobileElement btnMailApp;
	

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Gmail')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Mail']")
	private MobileElement btnMailApp2;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Gmail')]")
	private List<MobileElement> lstbtnMailApp;

	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='To']//following-sibling::android.view.ViewGroup/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='toField']")
	private MobileElement txtToEmail;  
 
	@AndroidFindBy(id = "com.google.android.gm:id/subject")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name='subjectField']")
	private MobileElement txtSubject;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'id/wc_body_layout')]//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Message Body']")
	private MobileElement txtBody;

	@AndroidFindBy(id = "com.google.android.gm:id/send")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Mail.sendButton']")
	private MobileElement btnSend;

	@AndroidFindBy(id = "com.google.android.gm:id/peoplekit_avatars_avatar")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Contact photo')]")
	private MobileElement btnAvatar;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/image_button_search')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='search']")
	private MobileElement btnSearch;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancel;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_text')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='searchLight']//following-sibling::XCUIElementTypeTextField")
	private MobileElement txtSearch;
	
	
	
	

	public void validateTheTravelArticleShareFunctionality() {

		try {
			
			SwipeUp();

			ValidateTravelArticleShareFromDiscover();

			SwipeRightInTravelArticleForNonMemberUser();

			NavigateToTravelArticleReadMorePage();

			ValidateTravelArticleSharefromDiscoverInArticle();

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				SwipeRightInTravelArticleForNonMemberUser();

				SwipeTillViewAllPostsInTravelArticle();

				ValidateTravelArticleShareFromViewAllPosts();

				ValidateTravelArticleShareFromViewAllInArticleScreen();

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}
	}

	public void ValidateTheHealthArticleShareFunctionality() {

		try {
			SwipeUp();

			ValidateHealthArticleShareFromDiscover();

			NavigateToHealthArticleReadMorePage();

			ValidateHealthArticleSharefromDiscoverInArticle();

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				SwipeTillViewAllPostsInHealthArticle();

				ValidateHealthArticleShareFromViewAllPosts();

				ValidateHealthArticleShareFromViewAllInArticleScreen();

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

	}

	public void ValidateTheWellnessArticleShareFunctionality() {

		try {
			SwipeUp();

			SwipeUp();

			ValidateWellnessArticleShareFromDiscover();

			NavigateToWellnessArticleReadMorePage();

			ValidateWellnessArticleSharefromDiscoverInArticle();

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				SwipeTillViewAllPostsInWellnessArticle();

				ValidateWellnessArticleShareFromViewAllPosts();

				ValidateWellnessArticleShareFromViewAllInArticleScreen();

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

	}

	public void SwipeRightInTravelArticleForNonMemberUser() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (isElementPresent(eleNonMemberContent)) {

					SwipeByCoordinates(eleTravelContent1.get(0).getLocation().x,
							eleTravelContent1.get(0).getLocation().y,

							eleNonMemberContent.getLocation().x, eleNonMemberContent.getLocation().y);

				}
			}

			else {

				if (isElementPresent(eleNonMemberContent)) {

					SwipeByCoordinates(eleTravelContent1.get(1).getLocation().x,
							eleTravelContent1.get(1).getLocation().y,

							eleNonMemberContent.getLocation().x, eleNonMemberContent.getLocation().y);

				}

			}

		}

		catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void swipeTillViewAllPostsInHealthArticleIos() {

		try {
			waitForElement(eleTravelContent1.get(1));

			int ele1X = eleTravelContent1.get(1).getLocation().x;

			int ele1Y = eleTravelContent1.get(1).getLocation().y;

			int ele2X = eleTravelContent1.get(3).getLocation().x;

			int ele2Y = eleTravelContent1.get(3).getLocation().y;

			SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

			SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

			SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

			SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SwipeTillViewAllPostsInTravelArticle() {

		try {

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				Thread.sleep(3000);
				waitForElement(eleNonMemberContent);
				if (isElementPresent(eleNonMemberContent)) {

					int StartX = eleTravelContent1.get(0).getLocation().x;

					int StartY = eleTravelContent1.get(0).getLocation().y;

					int EndX = eleNonMemberContent.getLocation().x;

					int EndY = eleNonMemberContent.getLocation().y;

					for (int i = 0; i <= 4; i++) {

						SwipeByCoordinates(StartX, StartY, EndX, EndY);

					}
				}

				else {

					waitForElement(eleTravelContent1.get(1));

					int StartX = eleTravelContent1.get(1).getLocation().x;

					int StartY = eleTravelContent1.get(1).getLocation().y;

					int EndX = eleTravelContent1.get(0).getLocation().x;

					int EndY = eleTravelContent1.get(0).getLocation().y;

					for (int i = 0; i <= 4; i++) {

						SwipeByCoordinates(StartX, StartY, EndX, EndY);

					}
				}
			} else {

				waitForElement(eleTravelContent1.get(1));

				int ele1X = eleTravelContent1.get(1).getLocation().x;

				int ele1Y = eleTravelContent1.get(1).getLocation().y;

				int ele2X = eleTravelContent1.get(3).getLocation().x;

				int ele2Y = eleTravelContent1.get(3).getLocation().y;

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

				SwipeByCoordinates(ele2X, ele2Y, ele1X, ele1Y);

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SwipeTillViewAllPostsInHealthArticle() {

		try {
			int StartX = eleHealthContent1.get(1).getLocation().x;

			int StartY = eleHealthContent1.get(1).getLocation().y;

			int EndX = eleHealthContent1.get(0).getLocation().x;

			int EndY = eleHealthContent1.get(0).getLocation().y;

			for (int i = 0; i <= 4; i++) {

				SwipeByCoordinates(StartX, StartY, EndX, EndY);

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SwipeTillViewAllPostsInWellnessArticle() {

		try {
			int StartX = eleWellnessContent1.get(1).getLocation().x;

			int StartY = eleWellnessContent1.get(1).getLocation().y;

			int EndX = eleWellnessContent1.get(0).getLocation().x;

			int EndY = eleWellnessContent1.get(0).getLocation().y;

			for (int i = 0; i <= 4; i++) {

				SwipeByCoordinates(StartX, StartY, EndX, EndY);

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateTravelArticleShareFromViewAllPosts() {

		try {

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(btnViewAll);

				clickOn(btnViewAll, "ViewAll button");

				waitForElement(btnTrvlShareInviewAll);

				if (isElementPresent(btnTrvlShareInviewAll)) {

					takeScreenshot(driver);
					clickOn(btnTrvlShareInviewAll, "Share button viewAll posts");

				}

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article Share From view All posts");

//				waitForElement(btnTrvlShareInviewAll);
//
//				toggleWifiInAndroid();
//
//				if (isElementPresent(btnTrvlShareInviewAll)) {
//
//					TapOnElement(btnTrvlShareInviewAll, "Share button viewAll posts");
//
//					takeScreenshot(driver);
//				}
//				toggleWifiInAndroid();
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article offline Share From view All posts");

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateHealthArticleShareFromViewAllPosts() {

		try {
			waitForElement(btnViewAll);

			clickOn(btnViewAll, "ViewAll button");

			waitForElement(btnHlthShareInviewAll);

			if (isElementPresent(btnHlthShareInviewAll)) {

				takeScreenshot(driver);
				clickOn(btnHlthShareInviewAll, "Share button viewAll posts");
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From view All posts");

//			waitForElement(btnHlthShareInviewAll);
//			
//			toggleWifiInAndroid();
//			
//			if (isElementPresent(btnHlthShareInviewAll)) {
//
//				takeScreenshot(driver);
//				clickOn(btnHlthShareInviewAll, "Share button viewAll posts");
//			}
//			
//			toggleWifiInAndroid();
//			
//			SelectSharedEmailAddress();
//
//			ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Offline Share From view All posts");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateWellnessArticleShareFromViewAllPosts() {

		try {
			waitForElement(btnViewAll);

			clickOn(btnViewAll, "ViewAll button");

			waitForElement(btnWellnessShareInviewAll);

			takeScreenshot(driver);
			if (isElementPresent(btnWellnessShareInviewAll)) {

				clickOn(btnWellnessShareInviewAll, "Share button viewAll posts");
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Share From view All posts");
			
		

//			waitForElement(btnWellnessShareInviewAll);
//			
//			toggleWifiInAndroid();
//
//			takeScreenshot(driver);
//			if (isElementPresent(btnWellnessShareInviewAll)) {
//
//				clickOn(btnWellnessShareInviewAll, "Share button viewAll posts");
//			}
//
//			toggleWifiInAndroid();
//			
//			SelectSharedEmailAddress();
//
//			ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Offline Share From view All posts");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateTravelArticleShareFromViewAllInArticleScreen() {
		waitForElement(btnTrvlReadMoreInviewAll);

		if (isElementPresent(btnTrvlReadMoreInviewAll)) {

			clickOn(btnTrvlReadMoreInviewAll, "Read More button In ViewAll");
		}

		waitForElement(EleShareInReadMore);

		if (isElementPresent(EleShareInReadMore)) {

			clickOn(EleShareInReadMore, "Share button In Read More");
		}

		SelectSharedEmailAddress();

		ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article Share From InArticle ViewAll posts ");

//		waitForElement(EleShareInReadMore);
//
//		toggleWifiInAndroid();
//
//		if (isElementPresent(EleShareInReadMore)) {
//
//			TapOnElement(EleShareInReadMore, "Share button In Read More");
//
//			takeScreenshot(driver);
//		}
//
//		toggleWifiInAndroid();
//		SelectSharedEmailAddress();
//
//		ValidateSharedArticleSubjectAndArticleLinkFromMail(
//				"Travel Article offline Share From InArticle view All posts");

		waitForElement(btnNavigateBack);

		if (isElementPresent(btnNavigateBack)) {

			clickOn(btnNavigateBack, "Navigate back button");
		}

		waitForElement(btnNavigateBack);

		if (isElementPresent(btnNavigateBack)) {

			clickOn(btnNavigateBack, "Navigate back button");
		}

		waitForElement(btnNavigateBack);

		if (isElementPresent(btnNavigateBack)) {

			clickOn(btnNavigateBack, "Navigate back button");
		}
	}

	public void ValidateHealthArticleShareFromViewAllInArticleScreen() {

		try {
			waitForElement(btnHlthReadMoreInViewAll);

			if (isElementPresent(btnHlthReadMoreInViewAll)) {

				clickOn(btnHlthReadMoreInViewAll, "Read More button In ViewAll");
			}

			waitForElement(EleShareInReadMore);

			if (isElementPresent(EleShareInReadMore)) {

				clickOn(EleShareInReadMore, "Share button In Read More");
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From InArticle ViewAll posts ");

//			waitForElement(btnHlthReadMoreInViewAll);
//			
//			toggleWifiInAndroid();
//
//			if (isElementPresent(btnHlthReadMoreInViewAll)) {
//
//				clickOn(btnHlthReadMoreInViewAll, "Read More button In ViewAll");
//			}
//
//			waitForElement(EleShareInReadMore);
//
//			if (isElementPresent(EleShareInReadMore)) {
//
//				clickOn(EleShareInReadMore, "Share button In Read More");
//			}
//			toggleWifiInAndroid();
//			
//			SelectSharedEmailAddress();
//
//			ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Offline Share From InArticle ViewAll posts ");
//
//			
			
			
			
			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateWellnessArticleShareFromViewAllInArticleScreen() {

		try {
			waitForElement(btnWellnessReadMoreInViewAll);

			if (isElementPresent(btnWellnessReadMoreInViewAll)) {

				clickOn(btnWellnessReadMoreInViewAll, "Read More button In ViewAll");
			}

			waitForElement(EleShareInReadMore);

			if (isElementPresent(EleShareInReadMore)) {

				clickOn(EleShareInReadMore, "Share button In Read More");
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Share From InArticle ViewAll posts ");
			
//			waitForElement(btnWellnessReadMoreInViewAll);
//			
//			toggleWifiInAndroid();
//
//			if (isElementPresent(btnWellnessReadMoreInViewAll)) {
//
//				clickOn(btnWellnessReadMoreInViewAll, "Read More button In ViewAll");
//			}
//
//			waitForElement(EleShareInReadMore);
//
//			if (isElementPresent(EleShareInReadMore)) {
//
//				clickOn(EleShareInReadMore, "Share button In Read More");
//			}
//
//			toggleWifiInAndroid();
//			
//			SelectSharedEmailAddress();
//
//			ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Offline Share From InArticle ViewAll posts ");



			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_read_more')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Read More'])[1]")
	private MobileElement btnSearchReadMore;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/image_button_share')]")
	// android.widget.ImageButton
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='share'][1]")
	private MobileElement btnSearchShare;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Go']")
	private MobileElement btnGo;

	public void ValidateTravelArticleShareFromSearchResults() {

		try {
			waitForElement(btnSearch);

			if (isElementPresent(btnSearch)) {

				clickOn(btnSearch, "Search button");
			}

			waitForElement(txtSearch);

			if (isElementPresent(txtSearch)) {

				enterText(txtSearch, "Search text box", "Travel");
			}

			takeScreenshot(driver);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				// --------------------------------------------
				//TapByCoordinates(977, 2095);

				// TapByCoordinates(984, 2235);

				waitForElement(btnSearchShare);

				if (isElementPresent(btnSearchShare)) {

					clickOn(btnSearchShare, "Share button In Search");
				}

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article Share From Search Results ");

				waitForElement(btnSearchReadMore);

				if (isElementPresent(btnSearchReadMore)) {

					clickOn(btnSearchReadMore, "Readmore button  In Search");
				}

				takeScreenshot(driver);
				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					clickOn(EleShareInReadMore, "Share button In Read More");
				}

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail(
						"Travel Article Share From InArticle Search Results ");

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnCancel);

				if (isElementPresent(btnCancel)) {

					clickOn(btnCancel, "Cancel button");
				}

			} else {

				// ----------------ios---------------------------
				clickOn(btnGo, "Go button");
				waitForElement(btnSearchShare);

				if (isElementPresent(btnSearchShare)) {

					Point pSearch = btnSearchShare.getLocation();

					// TapByCoordinates(pSearch.getX() - 323, pSearch.getY() + 2);

				}

			//	TapByCoordinates(350, 507);
				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article Share From Search Results");
				takeScreenshot(driver);

				waitForElement(btnSearchReadMore);

				if (isElementPresent(btnSearchReadMore)) {

					Point pSearchRead = btnSearchReadMore.getLocation();

					// TapByCoordinates(pSearchRead.getX() - 290, pSearchRead.getY() + 8);

				}

			//	TapByCoordinates(109, 502);

				takeScreenshot(driver);

				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					clickOn(EleShareInReadMore, "Share button In Read More");
				}

			//	TapByCoordinates(369, 72);

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail(
						"Travel Article Share From InArticle Search Results ");

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnCancel);

				if (isElementPresent(btnCancel)) {

					clickOn(btnCancel, "Cancel button");
				}

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateHealthArticleShareFromSearchResults() {

		try {
			waitForElement(btnSearch);

			if (isElementPresent(btnSearch)) {

				clickOn(btnSearch, "Search button");
			}

			waitForElement(txtSearch);

			if (isElementPresent(txtSearch)) {

				enterText(txtSearch, "Search text box", "Health");
			}

			takeScreenshot(driver);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				//TapByCoordinates(977, 2095);

				// TapByCoordinates(984, 2235);
				waitForElement(btnSearchShare);
				if (isElementPresent(btnSearchShare)) {

					clickOn(btnSearchShare, "Share button In Search");
				}
				SelectSharedEmailAddress();
				ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From Search Results ");
				waitForElement(btnSearchReadMore);
				if (isElementPresent(btnSearchReadMore)) {

					clickOn(btnSearchReadMore, "Readmore button  In Search");
				}
				takeScreenshot(driver);
				waitForElement(EleShareInReadMore);
				if (isElementPresent(EleShareInReadMore)) {

					clickOn(EleShareInReadMore, "Share button In Read More");
				}

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail(
						"Health Article Share From InArticle Search Results ");

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnCancel);

				if (isElementPresent(btnCancel)) {

					clickOn(btnCancel, "Cancel button");

				}

			}

			else {

				// ----------------ios---------------------------
				clickOn(btnGo, "Go button");
				waitForElement(btnSearchShare);

				if (isElementPresent(btnSearchShare)) {

					Point pSearch = btnSearchShare.getLocation();

					// TapByCoordinates(pSearch.getX() - 323, pSearch.getY() + 2);

				}

				//TapByCoordinates(350, 507);
				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From Search Results");
				takeScreenshot(driver);

				waitForElement(btnSearchReadMore);

				if (isElementPresent(btnSearchReadMore)) {

					Point pSearchRead = btnSearchReadMore.getLocation();

					// TapByCoordinates(pSearchRead.getX() - 290, pSearchRead.getY() + 8);

				}

				//TapByCoordinates(109, 502);

				takeScreenshot(driver);

				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					clickOn(EleShareInReadMore, "Share button In Read More");
				}

				//TapByCoordinates(369, 72);

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail(
						"Health Article Share From InArticle Search Results ");

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnCancel);

				if (isElementPresent(btnCancel)) {

					clickOn(btnCancel, "Cancel button");
				}

				// XCUIElementTypeButton[@name='Read More'][1]
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateWellnessArticleShareFromSearchResults() {

		try {
			waitForElement(btnSearch);

			clickOn(btnSearch, "Search button");

			waitForElement(txtSearch);

			enterText(txtSearch, "Search text box", "Wellness");

			takeScreenshot(driver);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				//TapByCoordinates(977, 2095);

				// TapByCoordinates(984, 2235);

				waitForElement(btnSearchShare);
				clickOn(btnSearchShare, "Share button In Search");

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Share From Search Results ");

				waitForElement(btnSearchReadMore);

				clickOn(btnSearchReadMore, "Readmore button  In Search");

				takeScreenshot(driver);

				waitForElement(EleShareInReadMore);

				clickOn(EleShareInReadMore, "Share button In Read More");

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail(
						"Wellness Article Share From InArticle Search Results ");

				waitForElement(btnNavigateBack);

				clickOn(btnNavigateBack, "Navigate back button");

				waitForElement(btnCancel);

				clickOn(btnCancel, "Cancel button");
			} else {

				clickOn(btnGo, "Go button");
				waitForElement(btnSearchShare);

				if (isElementPresent(btnSearchShare)) {

					Point pSearch = btnSearchShare.getLocation();

					// TapByCoordinates(pSearch.getX() - 323, pSearch.getY() + 2);
					//TapByCoordinates(350, 507);

				}

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From Search Results");

				takeScreenshot(driver);

				waitForElement(btnSearchReadMore);

				if (isElementPresent(btnSearchReadMore)) {

					Point pSearchRead = btnSearchReadMore.getLocation();

					// TapByCoordinates(pSearchRead.getX() - 290, pSearchRead.getY() + 8);

				}

				//TapByCoordinates(109, 502);

				takeScreenshot(driver);

				waitForElement(EleShareInReadMore);

				if (isElementPresent(EleShareInReadMore)) {

					clickOn(EleShareInReadMore, "Share button In Read More");
				}

				//TapByCoordinates(369, 72);

				SelectSharedEmailAddress();

				ValidateSharedArticleSubjectAndArticleLinkFromMail(
						"Health Article Share From InArticle Search Results ");

				waitForElement(btnNavigateBack);

				if (isElementPresent(btnNavigateBack)) {

					clickOn(btnNavigateBack, "Navigate back button");
				}

				waitForElement(btnCancel);

				if (isElementPresent(btnCancel)) {

					clickOn(btnCancel, "Cancel button");
				}

				// XCUIElementTypeButton[@name='Read More'][1]

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SelectSharedEmailAddress() {
		try {
			
			Thread.sleep(2000);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			if(lstbtnMailApp.size()<=1) {
			
			waitForElement(btnMailApp);

			takeScreenshot(driver);
			

			clickOn(btnMailApp, "Mail App Button");
			
			}
			else {
				waitForElement(btnMailApp2);

				takeScreenshot(driver);
				
				clickOn(btnMailApp2, "Mail App Button");
			}
			
			}else {
			
			waitForElement(btnMailApp);

			takeScreenshot(driver);
			

			clickOn(btnMailApp, "Mail App Button");
			}
			waitForElement(txtToEmail);

			enterText(txtToEmail, "To Email Address", data.get("ShareEmailAddress"));

			if (isElementPresent(txtSubject)) {

				clickOn(txtSubject, "Mail Avatar button");

			}

		//	waitForElement(btnAvatar);

			if (isElementPresent(btnAvatar)) {

				clickOn(btnAvatar, "Mail Avatar button");

			}

			 takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateTravelArticleSharefromDiscoverInArticle() {

		try {
			waitForElement(EleShareInReadMore);

			if (isElementPresent(EleShareInReadMore)) {

				clickOn(EleShareInReadMore, "Share button In Read More");

				takeScreenshot(driver);
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article Share From InArticle Discover ");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				waitForElement(EleShareInReadMore);
//
//				toggleWifiInAndroid();
//
//				if (isElementPresent(EleShareInReadMore)) {
//
//					TapOnElement(EleShareInReadMore, "Share button In Read More");
//
//					takeScreenshot(driver);
//				}
//
//				toggleWifiInAndroid();
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail(
//						"Travel Article offline Share From InArticle Discover");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
				takeScreenshot(driver);
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateHealthArticleSharefromDiscoverInArticle() {

		try {
			waitForElement(EleShareInReadMore);

			if (isElementPresent(EleShareInReadMore)) {

				clickOn(EleShareInReadMore, "Share button In Read More");

				takeScreenshot(driver);
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From InArticle Discover ");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

//				waitForElement(EleShareInReadMore);
//
//				toggleWifiInAndroid();
//
//				if (isElementPresent(EleShareInReadMore)) {
//
//					clickOn(EleShareInReadMore, "Share button In Read More");
//
//					takeScreenshot(driver);
//				}
//
//				toggleWifiInAndroid();
//				
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail(
//						"Health Article Offline Share From  InArticle Discover ");

			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
				takeScreenshot(driver);
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateWellnessArticleSharefromDiscoverInArticle() {

		try {
			waitForElement(EleShareInReadMore);

			clickOn(EleShareInReadMore, "Share button In Read More");

			takeScreenshot(driver);

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Share From InArticle Discover ");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				waitForElement(EleShareInReadMore);
//
//				toggleWifiInAndroid();
//
//				clickOn(EleShareInReadMore, "Share button In Read More");
//
//				takeScreenshot(driver);
//
//				toggleWifiInAndroid();
//
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail(
//						"Wellness Article Offline Share From  InArticle Discover ");

			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate back button");
				takeScreenshot(driver);
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateTravelArticleShareFromDiscover() {

		try {

			waitForElement(btnTravelShare);

			if (isElementPresent(btnTravelShare)) {

				clickOn(btnTravelShare, "Travel Article share button");

				takeScreenshot(driver);
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article Share From Discover");

//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				waitForElement(btnTravelShare);
//
//				toggleWifiInAndroid();
//
//				if (isElementPresent(btnTravelShare)) {
//
//					clickOn(btnTravelShare, "Travel Article share button");
//
//					takeScreenshot(driver);
//				}
//
//				toggleWifiInAndroid();
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail("Travel Article offline Share From Discover");
//			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateHealthArticleShareFromDiscover() {

		try {
			waitForElement(btnHealthShare);

			if (isElementPresent(btnHealthShare)) {

				clickOn(btnHealthShare, "Health Article share button");

				takeScreenshot(driver);
			}

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Share From Discover");

//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				waitForElement(btnHealthShare);
//
//				toggleWifiInAndroid();
//
//				if (isElementPresent(btnHealthShare)) {
//
//					clickOn(btnHealthShare, "Health Article share button");
//
//					takeScreenshot(driver);
//				}
//
//				toggleWifiInAndroid();
//				
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail("Health Article Offline Share From Discover");
//
//			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateWellnessArticleShareFromDiscover() {

		try {
			waitForElement(btnWellnessShare);

			clickOn(btnWellnessShare, "Wellness Article share button");

			takeScreenshot(driver);

			SelectSharedEmailAddress();

			ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Share From Discover");

//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				waitForElement(btnWellnessShare);
//				
//				toggleWifiInAndroid();
//				
//				waitForElement(btnWellnessShare);
//				
//				clickOn(btnWellnessShare, "Wellness Article share button");
//
//				takeScreenshot(driver);
//				
//				toggleWifiInAndroid();
//				
//				SelectSharedEmailAddress();
//
//				ValidateSharedArticleSubjectAndArticleLinkFromMail("Wellness Article Offline Share From Discover");
//
//			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	
	
 public AppNavPage ReturnAppNavPage() {
	 
	 return new AppNavPage(driver,data);
 }
	public void ValidateSharedArticleSubjectAndArticleLinkFromMail(String subject) {

		try {
			waitForElement(txtSubject);

			enterText(txtSubject, "To Email Address", subject);

			String ArticleURL = txtBody.getText().trim();

			takeScreenshot(driver);

			sleep(2000);

			waitForElement(btnSend);

			clickOn(btnSend, "send Button");

			Thread.sleep(3000);
			YopMail ym = new YopMail(data);
			Thread.sleep(3000);

			String[] ShareArticleLinkDetails = ym.getSharedArticleLinkDetails();

			if (ArticleURL.trim().replaceAll("\\s+", "")
					.contains(ShareArticleLinkDetails[0].trim().replaceAll("\\s+", ""))) {

				passed("Successfully validated the " + subject);

			} else {

				failed(driver, "Failed To validate the" + subject);
			}

			if (subject.trim().replaceAll("\\s+", "")
					.equals(ShareArticleLinkDetails[1].trim().replaceAll("\\s+", ""))) {

				passed("Successfully validated the subject of" + subject);

			} else {
				failed(driver, "Failed To validate the subject of" + subject);

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

//	public MyProfilePage clickOnMyAccountButton() {
//
//		try {
//			waitForElement(btnMyAccount);
//
//			if (isElementPresent(btnMyAccount)) {
//
//				clickOn(btnMyAccount, "My Account button");
//			}
//
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//		return new MyProfilePage(driver, data);
//
//	}

	
	public AppNavPage returnAppNavPageInDiscover() {
		
		return new AppNavPage(driver, data);
	}
	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblDiscover);

			if (isElementPresent(lblDiscover)) {

				passed("User Successfully Navigated To Discover Page");
			} else {
				failed(driver, "User Failed To navigate to Discover Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
