package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.sql.Timestamp;

import static driver.DriverFactory.cleanUpDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
      @Before
    public void setup() {
        getDriver();

    }
    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
          if (scenario.isFailed()) {
              Timestamp timestamp = new Timestamp(System.currentTimeMillis());
              String timeMiliSeconds = Long.toString(timestamp.getTime());

              byte[] screenShot = ((TakesScreenshot) getDriver())
                      .getScreenshotAs(OutputType.BYTES);
              scenario.attach(screenShot, "image/png", timeMiliSeconds);
          }

    }

    @After
    public void tearDown() {
        cleanUpDriver();

    }
}
