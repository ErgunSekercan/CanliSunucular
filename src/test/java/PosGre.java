
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class PosGre extends Driver1{
    PEYK_Pages peyk_pages = new PEYK_Pages();
@Test
    public void a() throws InterruptedException, AWTException {

    WebDriver driver = new ChromeDriver();

    Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
    peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
    peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
    peyk_pages.giris.click();
    BrowserUtils.waitFor(5);
    
    String kolay = peyk_pages.sistem.getText();    
    Assert.assertEquals("KOLAYSOFT TEKNOLOJI A.Ş",kolay);
    BrowserUtils.waitFor(1);

    peyk_pages.portalYonetimi.click();
    BrowserUtils.waitFor(1);

    peyk_pages.musteriIslemleri.click();
    BrowserUtils.waitFor(1);

    peyk_pages.yeniOlustur2.click();
    BrowserUtils.waitFor(1);

    peyk_pages.vknTckn.sendKeys("63140011152");
    BrowserUtils.waitFor(1);

    peyk_pages.unvan.sendKeys("SUBARU FORESTER");
    BrowserUtils.waitFor(1);

    peyk_pages.adi.sendKeys("Subaru");
    BrowserUtils.waitFor(1);

    peyk_pages.soyAdi.sendKeys("Forester");
    BrowserUtils.waitFor(1);

    peyk_pages.musteriAdi.sendKeys("Subaru Forester");
    BrowserUtils.waitFor(1);

    peyk_pages.musteriTipi.sendKeys("Özel");
    BrowserUtils.waitFor(1);
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    peyk_pages.kurumsalEposta.sendKeys("ergun.sekercan@kolaysoft.com.tr");
    BrowserUtils.waitFor(1);

    peyk_pages.kurumsalCepTel.sendKeys("5425837419");
    BrowserUtils.waitFor(1);

    peyk_pages.personelSayisi.sendKeys("50");
    BrowserUtils.waitFor(1);

    peyk_pages.ozlukDosyaBoyutu.sendKeys("200");
    BrowserUtils.waitFor(1);

    peyk_pages.yillikYuklenecekSMS.sendKeys("1000000");
    BrowserUtils.waitFor(1);

    peyk_pages.vergiDairesiIl.sendKeys("Ankara");
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    peyk_pages.vergiDairesiIlce.sendKeys("Çankaya");
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    peyk_pages.subeBilgileri.click();
    BrowserUtils.waitFor(1);

    peyk_pages.subeEkle.click();
    BrowserUtils.waitFor(1);

    peyk_pages.subeAdi.sendKeys("Kolaysoft");
    BrowserUtils.waitFor(1);

    peyk_pages.sehir.sendKeys("Ankara");
    BrowserUtils.waitFor(1);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    peyk_pages.ilce.sendKeys("Çankaya");
    BrowserUtils.waitFor(1);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    peyk_pages.ePosta.sendKeys("ergun.sekercan@kolaysoft.com.tr");
    BrowserUtils.waitFor(1);

    peyk_pages.onayla2.click();
    BrowserUtils.waitFor(1);

    peyk_pages.sozlesmeBilgileri.click();
    BrowserUtils.waitFor(1);

    peyk_pages.sozBaslangicTar.sendKeys("06-01-2025");
    BrowserUtils.waitFor(1);

    peyk_pages.yilYukSmsKontor.sendKeys("1000000");
    BrowserUtils.waitFor(1);

    peyk_pages.ozlDosyaBoy.sendKeys("200");
    BrowserUtils.waitFor(1);

    peyk_pages.perSayisi.sendKeys("50");
    BrowserUtils.waitFor(1);

    peyk_pages.ikPlatformu.click();
    BrowserUtils.waitFor(1);

    peyk_pages.altHizmetler.sendKeys("SMS");
    BrowserUtils.waitFor(1);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    peyk_pages.altHizmetler.sendKeys("HSM");
    BrowserUtils.waitFor(1);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    peyk_pages.kaydet7.click();
    BrowserUtils.waitFor(3);

    peyk_pages.musteriyiKaydet.click();
    BrowserUtils.waitFor(1);

    closeDriver();
}
@Test

    public void b() throws InterruptedException, AWTException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://peyktest3.kolaysoft.com.tr//accounting/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
    username.sendKeys("111111444");
    BrowserUtils.waitFor(1);
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys("1");
    BrowserUtils.waitFor(1);
    WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
    giris.click();
    BrowserUtils.waitFor(1);

    WebElement sistem = driver.findElement(By.xpath("//span[contains(text(), \"Kolaysoft Teknoloji A.Ş\")]"));
    String kolay = sistem.getText();
    Assert.assertEquals("KOLAYSOFT TEKNOLOJI A.Ş",kolay);
    BrowserUtils.waitFor(1);

    WebElement portalYonetimi = driver.findElement(By.xpath("//p[contains(text(), \"Portal Yönetimi\")]"));
    portalYonetimi.click();
    BrowserUtils.waitFor(1);

    WebElement musteriIslemleri = driver.findElement(By.xpath("//span[contains(text(), \"Müşteri İşlemleri\")]"));
    musteriIslemleri.click();
    BrowserUtils.waitFor(1);

    WebElement seciniz = driver.findElement(By.xpath("(//button[contains(text(), \"Seçİnİz\")])[1]"));
    seciniz.click();
    BrowserUtils.waitFor(1);

    WebElement kullaniciPortalinaGit = driver.findElement(By.xpath("(//a[contains(text(), \" Kullanıcı Portalına Git\")])[1]"));
    kullaniciPortalinaGit.click();
    BrowserUtils.waitFor(1);

    WebElement kullaniciSeciniz = driver.findElement(By.xpath("//input[@aria-expanded=\"false\"]"));
    kullaniciSeciniz.sendKeys("admin_000003-Subaru Forester");
    BrowserUtils.waitFor(1);
    Robot robot1 = new Robot();
    robot1.keyPress(KeyEvent.VK_ENTER);
    robot1.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    WebElement girisYap = driver.findElement(By.xpath("//button[contains(text(), \"Giriş Yap\")]"));
    girisYap.click();
    Thread.sleep(10000);

    driver.quit();
}

    @Test
    public void AnaSayfa() throws InterruptedException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        //Bordro
        peyk_pages.bordroGonder.click();
        BrowserUtils.waitFor(3);
        String bordroYukle = peyk_pages.ucretBordrosuYukle.getText();
        Assert.assertEquals(bordroYukle,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(3);

        //Form
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.taslakHazirla.click();
        String form = peyk_pages.formuOnizle.getText();
        Assert.assertEquals(form,"Formu Önizle");
        BrowserUtils.waitFor(3);

        //Taslak Hazırla
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.taslakHazirla.click();
        String form1 = peyk_pages.formuOnizle.getText();
        Assert.assertEquals(form1,"Formu Önizle");
        BrowserUtils.waitFor(2);

        //Aylık Bildirimler-Bordro Arşiv
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bordro.click();
        String ozlukBordrolar = peyk_pages.ozlukBordrolarArsiv.getText();
        Assert.assertEquals(ozlukBordrolar, "Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);

        //Aylık Bildirimler-Formlar Arşiv
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.form.click();
        String formlar = peyk_pages.formlarArsiv.getText();
        Assert.assertEquals(formlar, "Formlar Arşiv");
        BrowserUtils.waitFor(2);

        closeDriver();
    }


}
