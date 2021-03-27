package pageObjects;
import java.time.Instant;
import elementMapper.CreatAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreatAccount extends CreatAccountElementMapper {
    private long unixTimestamp = Instant.now().getEpochSecond();
    public CreatAccount (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }



    public void clickEmailCreat(){
        emailCreat.click();
    }

    public void fillemailCreat(){
        String email = "marcos"+Long.toString(unixTimestamp)+"@gmail.com";
        System.out.println(email);
        emailCreat.sendKeys(email);
    }

    public void clickSubmitCreate() {
        SubmitCreate.click();
    }

    public void idGenderMrClick(){
        idGenderMr.click();
    }
    public void fillcustomer_firstname(){
        customer_firstname.sendKeys("marcos");

    }

    public void fillcustomer_lastname() {
        customer_lastname.sendKeys("marcos");
    }



    public void fillpasswd() {
        passwd.sendKeys("123456");
    }

    public void filldays(){
        days.sendKeys("20");
    }

    public void fillmonths(){
        months.sendKeys("4");

    }

    public void fillyears(){
        years.sendKeys("1993");
    }

    public void fillfirstname(){
        firstname.sendKeys("Marcos");
    }

    public void filllastname(){
        lastname.sendKeys("Salles");
    }

    public void filladdress1(){
        address1.sendKeys("Alpes");
    }

    public void fillcity(){
        city.sendKeys("porto alegre");
    }

    public void fillid_state(){
        id_state.sendKeys("Alabama");
    }

    public void fillid_country(){
        id_country.sendKeys("United States");
    }

    public void fillpostcode(){
        postcode.sendKeys("00000");
    }
     public void fillphone_mobile(){
         phone_mobile.sendKeys("51992852069");
     }

     public void fillalias(){
         alias.sendKeys("My address");
     }
     public void clicksubmitAccount(){
         submitAccount.click();
     }
}
