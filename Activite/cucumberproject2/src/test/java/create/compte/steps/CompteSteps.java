package create.compte.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import create.compte.CreateCompte;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompteSteps {
	WebDriver driver;
	CreateCompte create;

	@Given("user is on the account creation page")
	public void is_login_in_page() {
		System.out.println("user is in the account create page");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mytek.tn/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement textButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")));
		textButton.click();

	}

	@When("user enters their first name")
	public void user_enters_their_first_name() {
		System.out.println("ser enters their first name");
		create = new CreateCompte(driver);
		create.enterFirstName();
	}

	@And("user enters their last name")
	public void user_enters_their_last_name() {
		System.out.println("user enters their last name");
		create.enterLastName();
	}

	@And("user enters their company name")
	public void user_enters_their_company() {
		System.out.println("user enters their company name");
		create.enterCompanyName();
		;
	}

	@And("user enters their phone number")
	public void user_enters_their_phone_number() {
		System.out.println("user enters their phone number");
		create.enterPhoneNumber();
	}

	@And("user enters their complete address")
	public void user_enters_their_complete_address() {
		System.out.println("user enters their complete address");
		create.enterAdress();
	}

	@And("user selects the country")
	public void user_selects_the_country() {
		System.out.println("user selects the country");
		create.enterCountryName();
	}

	@And("user selects the state")
	public void user_selects_the_state() {
		System.out.println("user selects the state/region");
		create.enterStateName();
	}

	@And("user selects a city")
	public void user_selects_a_city() {
		System.out.println("user selects a city");
		create.enterCityName();
	}

	@And("user selects a locality")
	public void user_selects_a_locality() {
		System.out.println("user selects a city");
		create.enterLocalityName();
	}

	@And("user selects a postal code")
	public void user_selects_a_postal_code() {
		System.out.println("user selects a postal code");
		create.enterPostalCode();
	}

	@And("user enters their email address")
	public void user_enters_their_email_address() {
		System.out.println("user enters their email address");
		create.enterEmail();
	}

	@And("user enters a password")
	public void user_enters_a_password() {
		System.out.println("user enters a password");
		create.enterPassword();
	}

	@And("user confirms the password")
	public void user_confirms_the_password() {
		System.out.println("user confirms the password");
		create.enterConfirmPassword();
	}

	
	  @And("clicks on the create account button") public void
	  clicks_on_the_create_account_button() {
	  System.out.println("clicks on the create account button");
	  create.Clickbutton(); }
	 

	@Then("user account is successfully created")
	public void user_account_is_successfully_created() {
		System.out.println("user create an account");

		if (driver.getPageSource().contains("Mon compte")) {
			System.out.println("utilisateur à créer le compte");
		} else {
			System.out.println("La création du compte a échoué");
		}

	}
}
