package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.starter.helper.LoginHelper;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
	
	@Steps
	LoginHelper loginHelper;

    @Given("^I launch selenium framework website$")
    public void launchSeleniumWebsite() throws Exception {
    	loginHelper.openLoginPage();
    }
}
