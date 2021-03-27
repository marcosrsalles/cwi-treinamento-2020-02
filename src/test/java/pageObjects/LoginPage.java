package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {
    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void fillEmail(){
        email.sendKeys("marcosrs805@gmail.com");

    }

    public void fillpasswd(){
        passwd.sendKeys("1234");

    }
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();

    }

}
