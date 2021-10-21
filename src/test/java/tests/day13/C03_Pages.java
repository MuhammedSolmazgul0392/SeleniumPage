package tests.day13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.TestBase;

public class C03_Pages extends TestBase {
    @Test
    public  void test() {
      // go to the amazon website

        driver.get("https://amazon.com");
      //dropdown menuden book kategorisine gidin
        AmazonPage amazonPage=new AmazonPage(driver);
        Select select=new Select(amazonPage.dropdownMenu);
        select.selectByVisibleText("Books");
        //java icin arama yapin
        amazonPage.searchBox.sendKeys("java"+ Keys.ENTER);
        //bulunan sonuc saysini yazin
        System.out.println(amazonPage.sonucYazisiElementi.getText());
        //ilk urun isminde java gectigini test ediniz
        Assert.assertTrue(amazonPage.firstproductname.getText().contains("Java"));


    }
}
