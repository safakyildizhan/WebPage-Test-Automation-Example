package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Login_PO;


public class Login_Steps extends Base_PO {
    private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;


    }

    @Given("access the webdriwer university login page")
    public void access_the_webdriwer_university_login_page() {
        login_po.navigateTo_WebdriverIniversity_Login_Page();
        // navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");

    }

    @When("enter a username {word}")
    public void enter_a(String userName) {
        //   driver.findElement(new By.ById("text")).sendKeys(userName);
        //   sendKeys(By.id("text"), userName);
        login_po.setUserName(userName);

    }

    @When("enter a username {string}")
    public void enter_a_username_webdriver(String userName) {
        // driver.findElement(new By.ById("text")).sendKeys(userName);
        login_po.setUserName(userName);
    }

    @When("enter a password {word}")
    public void enter_a_password(String password) {
        // driver.findElement(new By.ById("password")).sendKeys(password);
        login_po.setPassword(password);
    }


    @When("enter a password {string}")
    public void enter_a_password_webdriver123(String password) {
        // driver.findElement(new By.ById("password")).sendKeys(password);
        login_po.setPassword(password);
    }


    @When("click on the login button")
    public void click_on_the_login_button() {
        // driver.findElement(new By.ByCssSelector("#login-button")).click();
        login_po.clickOn_LoginButton();

    }

    @Then("should be presented with a successful login message {string}")
    public void should_be_presented_with_a_successful_login_message(String string) {
        //  String validationAlert = driver.switchTo().alert().getText();
        //  Assert.assertEquals(validationAlert,"validation succeeded");
        //  waitForAlert_And_ValidateText(string);
        login_po.validate_SuccessfulLogin_Message();
    }

    @Then("should be presented with an unsuccessful message {string}")
    public void should_be_presented_with_an_unsuccessful_message(String string) {
        // String validationAlert = driver.switchTo().alert().getText();
        // Assert.assertEquals(validationAlert,"validation failed");
        // waitForAlert_And_ValidateText(string);
        login_po.validate_UnsuccessfulLogin_Message();
    }

    @Then("should be presented with a login message {}")
    public void should_be_presented_with_a_login_message(String expectedMessage) {
        waitForAlert_And_ValidateText(expectedMessage);
    }

}
