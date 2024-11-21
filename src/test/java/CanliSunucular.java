
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

    try {
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
        System.out.println("Giriş işlemi başarılı. Sunucu1 çalışıyor");
        driver.quit();
    }catch (Exception e){
        System.out.println("Sunucu1 Bozuk");
    }
}
@Test

    public void sunucu2() throws InterruptedException {

    try {
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
        System.out.println("Giriş işlemi başarılı. Sunucu2 çalışıyor");
        driver.quit();
    }catch (Exception e){
        System.out.println("Sunucu2 Bozuk");
    }
}

    @Test

    public void sunucu3() throws InterruptedException {

        try {
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
            System.out.println("Giriş işlemi başarılı. Sunucu3 çalışıyor");
            driver.quit();
        }catch (Exception e){
            System.out.println("Sunucu3 Bozuk");
        }
    }

    @Test

    public void sunucu4() throws InterruptedException {
        try {
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
            System.out.println("Giriş işlemi başarılı. Sunucu4 çalışıyor");
            driver.quit();
        }catch (Exception e){
            System.out.println("Sunucu4 Bozuk");
        }

    }

}
