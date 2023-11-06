package create.compte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCompte {
	WebDriver driver;
	By text_prenom = By.id("firstname");
	By text_nom = By.id("lastname");
	By text_societe = By.id("company");
	By text_telephone = By.name("telephone");
	By text_adress = By.id("street_1");
	By text_pays = By.id("country");
	By text_region = By.id("region");
	By text_ville = By.xpath("//select[@id='city']");
	By text_localite = By
			.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]/div[7]/div[1]/select[1]");
	By text_postalcode = By.name("postcode");
	By text_email = By.id("email_address");
	By text_password = By.id("password");
	By text_confirmpassword = By.name("password_confirmation");
	By btn_Createaccount = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");

	public CreateCompte(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName() {
		driver.findElement(text_prenom).sendKeys("oussama");

	}

	public void enterLastName() {
		driver.findElement(text_nom).sendKeys("Taalaoui");
	}

	public void enterCompanyName() {
		driver.findElement(text_societe).sendKeys("talan");
	}

	public void enterPhoneNumber() {
		driver.findElement(text_telephone).sendKeys("20111515");
	}

	public void enterAdress() {
		driver.findElement(text_adress).sendKeys("charguia 1");
	}

	public void enterCountryName() {
		driver.findElement(text_pays).sendKeys("tunisie");
	}

	public void enterStateName() {
		driver.findElement(text_region).sendKeys("Ariana");
	}

	public void enterCityName() {
		driver.findElement(text_ville).sendKeys("ARIANA VILLE");
	}

	public void enterLocalityName() {
		driver.findElement(text_localite).sendKeys("BORJ EL BACCOUCHE");
	}

	public void enterPostalCode() {
		driver.findElement(text_postalcode).sendKeys("2035");
	}

	public void enterEmail() {
		driver.findElement(text_email).sendKeys("oussabn30@gmail.com");
	}

	public void enterPassword() {
		driver.findElement(text_password).sendKeys("Talan12345!");
	}

	public void enterConfirmPassword() {
		driver.findElement(text_confirmpassword).sendKeys("Talan12345!");
	}

	public void Clickbutton() {
		driver.findElement(btn_Createaccount).click();
	}
}
