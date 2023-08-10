package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO {
    private @FindBy(id = "text") WebElement username_TextField;
    private @FindBy(id = "password") WebElement password_TextField;
    private @FindBy(css = "#login-button") WebElement loginButton_TextField;

    public Login_PO() {
        super();
    }

    public void navigateTo_WebdriverIniversity_Login_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNI_HOMEPAGE_URL + "/Login-Portal/index.html?");
    }

    public void setUserName(String username) {
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_LoginButton() {
        waitForWebElementAndClick(loginButton_TextField);
    }

    public void validate_SuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation succeeded");
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation failed");
    }
}
