package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFacebook extends TestBase {
    @Test
    public void test() {


        // facebook login sayfasina gidin
driver.get("https://wwww.facebook.com");

        FacebookPage facebookPage=new FacebookPage(driver);

        // page sayfasinda cookiesGec() method'u olusturun
facebookPage.cookiesskip();
        // kullanici adi : techproed@hotmail.com
facebookPage.mailbox.sendKeys("techproed@hotmail.com");
facebookPage.loginTusu.click();
        // sifre : 12345
        facebookPage.passwordBox.sendKeys("12345");
        facebookPage.loginTusu.click();
        // yazdigimizda giris yapamadigimizi test edin
        Assert.assertTrue(facebookPage.keinkontoverkrüpft.isDisplayed());
    }
}
