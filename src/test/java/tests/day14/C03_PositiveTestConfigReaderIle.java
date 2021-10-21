package  tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReaderIle extends TestBase {
    @Test
    public void positiveTestConfig(){
        //https://www.concorthotel.com/ adresine git
        driver.get(ConfigReader.getProperty("CHUrl"));
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        //login butonuna bas
        concortHotelPage.firstLoginLink.click();
        //test data username :manager ,
        concortHotelPage.usernameBox.sendKeys(ConfigReader.getProperty("CHValidusername"));
        //test data password :Manager1!
        concortHotelPage.passwordBox.sendKeys("CHValidPassword");
        concortHotelPage.loginButton.click();
        //Dgerleri girildiginde sayfaya basarili bir sekilde girilebildigini test et
        Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());


    }
}
