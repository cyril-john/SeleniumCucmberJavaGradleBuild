import pages.ford_UK_page;

import io.cucumber.java.en.*;

public class ford_UK_steps
{
    ford_UK_page fordUkPage= new ford_UK_page();

    @Given("^navigate to ford UK site$")
    public void navigateTofordUKsite()
    {
        ford_UK_page.navigateToFord_UK_page();
        ford_UK_page.maximizeWindow();

    }


    @Then("accepts FORD UK cookies")
    public void acceptsFORDUKCookies()
    {
        String cookiesAgree =  "//a[@data-acc-context-type='cookiesAgree']";
        ford_UK_page.acceptUKcookies(cookiesAgree);
    }

    @Then("close window")
    public void closeWindow()
    {
        ford_UK_page.closeBrowser();
    }
}
