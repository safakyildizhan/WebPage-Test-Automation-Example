package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO {

    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']") WebElement firstNameTextField;
    private @FindBy(how = How.XPATH, using = "//input[@name='last_name']") WebElement lastNameTextField;
    private @FindBy(how = How.XPATH, using = "//input[@name='email']") WebElement emailTextField;
    private @FindBy(how = How.XPATH, using = "//textarea[@name='message']") WebElement commentTextField;
    private @FindBy(how = How.XPATH, using = "//input[@value='SUBMIT']") WebElement submitButton;
    private @FindBy(how = How.XPATH, using = "//h1[.='Thank You for your Message!']") WebElement submissionMessage;

    public Contact_Us_PO() {
        super();
    }


    public void navigeteTo_WebdriverUniversity_ContactUs_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNI_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName() {
        sendKeys(firstNameTextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(lastNameTextField, "AutoLN" + generateRandomNumber(5));
    }

    public void setUnique_Email() {
        sendKeys(emailTextField, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }

    public void setUnique_Comment() {
        sendKeys(commentTextField, "Hello world" + generateRandomString(20));
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firstNameTextField, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastNameTextField, lastName);
    }

    public void setSpecific_Email(String email) {
        sendKeys(emailTextField, email);
    }

    public void setSpecific_Comment(String comment) {
        sendKeys(commentTextField, comment);
    }

    public void clickOn_SubmitButton() {
        waitForWebElementAndClick(submitButton);
    }

    public void validateSuccessfulSubmissionMessage() {
        waitForMessage(submissionMessage);
        Assert.assertEquals(submissionMessage.getText(), "Thank You for your Message!");

    }

}
