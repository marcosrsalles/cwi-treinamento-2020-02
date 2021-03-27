package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccountElementMapper {


    @FindBy(css = "h1[page-heading]")
    public WebElement CREATEANACCOUNT;

    @FindBy(className = "login")
    public WebElement login;

    @FindBy(id = "email_create")
    public WebElement emailCreat;

    @FindBy(id = "SubmitCreate")
    public WebElement SubmitCreate;

    @FindBy(id = "id_gender1")
    public WebElement idGenderMr;

    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement id_state;

    @FindBy(id = "id_country")
    public WebElement id_country;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "phone_mobile")
    public WebElement phone_mobile;

    @FindBy(id = "alias")
    public WebElement alias;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;


}
