package linnbank.stepdefinitions;

import io.cucumber.java.en.Then;
import linnbank.pages.US_015;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;
import org.junit.Assert;

public class US015_stepdef {

    US_015 us_015=new US_015();
    @Then("user enters linnbank home page")
    public void user_enters_linnbank_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }
    @Then("user clicks on human icon")
    public void user_clicks_on_human_icon() {
        us_015.accountIcon.click();
    }
    @Then("user enters sign in button")
    public void user_enters_sign_in_button() {
        us_015.signinButton.click();
    }
    @Then("user enters a valid customer username {string}")
    public void user_enters_a_valid_customer_username(String string) {
        us_015.userName.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }
    @Then("user enters a valid password {string}")
    public void user_enters_a_valid_password(String string) {
        us_015.passWord.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }
    @Then("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        us_015.submitButton.click();
    }
    @Then("user clicks on my operations button")
    public void user_clicks_on_my_operations_button() {
        us_015.myOperations.click();
    }
    @Then("user clicks on my accounts")
    public void user_clicks_on_my_accounts() {
        us_015.myAccounts.click();
    }
    @Then("user should see customer accounts")
    public void user_should_see_customer_accounts() {
       String headername = us_015.customerAccounts.getText();
       Assert.assertEquals(us_015.customerAccounts.getText(),headername);
    }
}