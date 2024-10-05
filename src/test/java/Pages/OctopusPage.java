package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OctopusPage {
    public OctopusPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(partialLinkText = "LinkedIn")
    public WebElement LinkedIn;

    @FindBy(partialLinkText = "Twitter")
    public WebElement X;

    @FindBy(partialLinkText = "Instagram")
    public WebElement Instagram;

    @FindBy(partialLinkText = "Facebook")
    public WebElement Facebook;

    @FindBy(partialLinkText = "YouTube")
    public WebElement YouTube;

}
