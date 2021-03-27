package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage(){

        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }

    public void ClickBtnLogin(){
        login.click();

    }

    public void clickSearch_Query_Top(){
        search_query_top.click();

    }

    public void sendKeysSearch_query_top(String Keys){

        search_query_top.sendKeys(Keys);
    }

    public void clickSubmit_search(){
        submit_search.click();

    }

    public void doSearch(String quest){
        clickSearch_Query_Top();
        sendKeysSearch_query_top(quest);
        clickSubmit_search();


    }

    public void clickCategoryTShirts(){
        menuTShirts.click();
    }

    public void clickCreatAccount(){


    }
}
