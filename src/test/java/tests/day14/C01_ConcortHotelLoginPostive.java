package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C01_ConcortHotelLoginPostive extends TestBase {
    @Test
    public void positiveLoginTest() {
        //https://www.concorthotel.com/ adresine git
driver.get("https://www.concorthotel.com/");
ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        //login tusuna bas
concortHotelPage.firstLoginLink.click();
        //test data username:manager ,
concortHotelPage.usernameBox.sendKeys("manager");
        //test data password :Manager1!
concortHotelPage.passwordBox.sendKeys("Manager1!");
concortHotelPage.loginButton.click();
        //degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());




    }
}
