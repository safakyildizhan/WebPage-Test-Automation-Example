package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObject.Base_PO;
import pageObject.Contact_Us_PO;


public class Contact_Us_Steps extends Base_PO {
    private WebDriver driver = getDriver();

    private Contact_Us_PO contact_us_po;

    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;

    }

    @Given("access the webdriwer university contact us page")
    public void access_the_webdriwer_university_contact_us_page() {
    //    navigateTo_URL("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
        contact_us_po.navigeteTo_WebdriverUniversity_ContactUs_Page();

    }

    @When("enter a unique first name")
    public void enter_a_unique_first_name() {
       // driver.findElement(new By.ByXPath("//input[@name='first_name']")).sendKeys("AutoFN" + generateRandomNumber(5));
       // sendKeys(By.xpath("//input[@name='first_name']"), "AutoFN" + generateRandomNumber(5));
        contact_us_po.setUnique_FirstName();
    }

    @And("enter a unique last name")
    public void enter_a_unique_last_name() {
       // driver.findElement(new By.ByXPath("//input[@name='last_name']")).sendKeys("AutoLN" + generateRandomNumber(5));
        contact_us_po.setUnique_LastName();
    }

    @And("enter a unique email aqdress")
    public void enter_a_unique_email_aqdress() {
      //  driver.findElement(new By.ByXPath("//input[@name='email']")).sendKeys("AutoEmail" + generateRandomNumber(10) + "@mail.com");
        contact_us_po.setUnique_Email();

    }

    @And("enter a unique comment")
    public void enter_a_unique_comment() {

       // driver.findElement(new By.ByXPath("//textarea[@name='message']")).sendKeys("Hello world" + generateRandomString(20));
        contact_us_po.setUnique_Comment();
    }

    @When("enter a unique specific name {word}")
    public void enter_a_unique_specific_name(String firstName) {
        // driver.findElement(new By.ByXPath("//input[@name='first_name']")).sendKeys(firstName);
        contact_us_po.setSpecific_FirstName(firstName);
    }

    @When("enter a specific last name {word}")
    public void enter_a_specific_last_name(String lastName) {
        // driver.findElement(new By.ByXPath("//input[@name='last_name']")).sendKeys(lastName);
        contact_us_po.setSpecific_LastName(lastName);
    }

    @When("enter a specific email aqdress {word}")
    public void enter_a_specific_email_aqdress(String email) {
        // driver.findElement(new By.ByXPath("//input[@name='email']")).sendKeys(email);
        contact_us_po.setSpecific_Email(email);
    }

    @When("enter a specific comment {string}")
    public void enter_a_specific_comment(String string) {
        // driver.findElement(new By.ByXPath("//textarea[@name='message']")).sendKeys(string);
        contact_us_po.setUnique_Comment();

    }

    @And("click on the submit button")
    public void click_on_the_submit_button() {
        // driver.findElement(new By.ByXPath("//input[@value='SUBMIT']")).click();
        contact_us_po.clickOn_SubmitButton();
    }

    @Then("should be presented with a successful contact us submission message")
    public void should_be_presented_with_a_successful_contact_us_submission_message() {
       // WebElement contactUs_Submission_Message = driver.findElement(new By.ByXPath("//h1[.='Thank You for your Message!']"));
      //  Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
        contact_us_po.validateSuccessfulSubmissionMessage();

    }
}


