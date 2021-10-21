package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C02_CHNegativeTest extends TestBase {

    @Test
    public  void  Test() {
        //https://www.concorthotel.com/ adresine git
     driver.get("https://www.concorthotel.com/");
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);


//login butonuna bas
concortHotelPage.firstLoginLink.click();
//test data username:manager1
        concortHotelPage.usernameBox.sendKeys("manager1");

//test data password:manager1!
        concortHotelPage.passwordBox.sendKeys("manager1!");
        concortHotelPage.loginButton.click();

//Degerleri girildiginde sayfaya girilmedigini test et
        Assert.assertTrue(concortHotelPage.loginFailedYazisi.isDisplayed());

    }
}