package pages;

public class ford_UK_page extends BasePage
{
    //constuctor
    public ford_UK_page() {
        super(driver);

    }
    //methods
    public static void navigateToFord_UK_page()
    {
        navigateTo("https://www.ford.co.uk/");

    }

    public static void acceptUKcookies(String xpath)
    {
        acceptCookies(xpath);
    }
}
