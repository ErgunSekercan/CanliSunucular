
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.module.Configuration;
import java.util.concurrent.TimeUnit;

public class CanliSunucular {

@Test
    public void sunucu1() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get(ConfigurationReader.getProperty("app1"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
    username.sendKeys(ConfigurationReader.getProperty("username"));
    Thread.sleep(2000);
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys(ConfigurationReader.getProperty("password"));
    Thread.sleep(2000);
    WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
    giris.click();
    Thread.sleep(2000);


     WebElement sistem = driver.findElement(By.xpath("//span[contains(text(), \"SİSTEM\")]"));
     String kolay = sistem.getText();
        Assert.assertEquals("SİSTEM HESABI - KOLAYSOFT TEKNİK",kolay);
        System.out.println("Giris islemi basarili. Sunucu1 calisiyor");
        driver.quit();
}
@Test

    public void sunucu2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(ConfigurationReader.getProperty("app2"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys(ConfigurationReader.getProperty("username"));
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);
        WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
        giris.click();
        Thread.sleep(2000);


        WebElement sistem = driver.findElement(By.xpath("//span[contains(text(), \"SİSTEM\")]"));
        String kolay = sistem.getText();
        Assert.assertEquals("SİSTEM HESABI - KOLAYSOFT TEKNİK",kolay);
        System.out.println("Giris islemi basarili. Sunucu2 calisiyor");
        driver.quit();
}
    @Test

    public void sunucu3() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get(ConfigurationReader.getProperty("app3"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
            username.sendKeys(ConfigurationReader.getProperty("username"));
            Thread.sleep(2000);
            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys(ConfigurationReader.getProperty("password"));
            Thread.sleep(2000);
            WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
            giris.click();
            Thread.sleep(2000);

            WebElement sistem = driver.findElement(By.xpath("//span[contains(text(), \"SİSTEM\")]"));
            String kolay = sistem.getText();
            Assert.assertEquals("SİSTEM HESABI - KOLAYSOFT TEKNİK",kolay);
            System.out.println("Giris islemi basarili. Sunucu3 calisiyor");
            driver.quit();

    }
    @Test

    public void sunucu4() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get(ConfigurationReader.getProperty("app4"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
            username.sendKeys(ConfigurationReader.getProperty("username"));
            Thread.sleep(2000);
            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys(ConfigurationReader.getProperty("password"));
            Thread.sleep(2000);
            WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
            giris.click();
            Thread.sleep(2000);

            WebElement sistem = driver.findElement(By.xpath("//span[contains(text(), \"SİSTEM\")]"));
            String kolay = sistem.getText();
            Assert.assertEquals("SİSTEM HESABI - KOLAYSOFT TEKNİK",kolay);
            System.out.println("Giris islemi basarili. Sunucu4 calisiyor");
            driver.quit();

    }

    @Test

    public void test1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://peyktest.kolaysoft.com.tr/accounting/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("111111444");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("1");
        Thread.sleep(2000);
        WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
        giris.click();
        Thread.sleep(2000);

        WebElement sistem = driver.findElement(By.xpath("//span[contains(text(), \"Kolaysoft\")]"));
        String kolay = sistem.getText();
        Assert.assertEquals("KOLAYSOFT TEKNOLOJI A.Ş",kolay);
        System.out.println("Giris islemi basarili. Test2 calisiyor");
        driver.quit();

    }

    @Test

    public void peyk_iga() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://peyk-iga.kolaysoft.com.tr/accounting/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("peykmssql");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("1");
        Thread.sleep(2000);
        WebElement giris = driver.findElement(By.xpath("//button[contains(text(), \"GİRİŞ\")]"));
        giris.click();
        Thread.sleep(2000);

        WebElement sistem1 = driver.findElement(By.xpath("//span[contains(text(), \"SİSTEM\")]"));
        String igaSistem = sistem1.getText();
        Assert.assertEquals("SİSTEM",igaSistem);
        System.out.println("Giris islemi basarili. Peyk-iga calisiyor");
        driver.quit();

    }

}
