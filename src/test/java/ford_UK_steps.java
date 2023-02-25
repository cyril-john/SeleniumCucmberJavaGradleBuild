import pages.ford_UK_page;

import io.cucumber.java.en.*;

public class ford_UK_steps
{
    ford_UK_page fordUkPage= new ford_UK_page();

    @Given("^navigate to ford UK site$")
    public void navigateTofordUKsite()
    {
        fordUkPage.navigateToFord_UK_page();
        fordUkPage.maximizeWindow();

    }


    @Then("accepts FORD UK cookies")
    public void acceptsFORDUKCookies()
    {
        String cookiesAgree =  "//a[@data-acc-context-type='cookiesAgree']";
        fordUkPage.acceptUKcookies(cookiesAgree);
    }

    @Then("close window")
    public void closeWindow()
    {
        fordUkPage.closeBrowser();
    }

    @And("for mustang machE click on View Stock")
    public void forMustangMachEClickOnViewStock() {
    }
    
}
