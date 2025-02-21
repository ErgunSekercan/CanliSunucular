
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PosGre extends Driver1{
    PEYK_Pages peyk_pages = new PEYK_Pages();

@Test

    public void a_musteriOlusturma() throws InterruptedException, AWTException {

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
    BrowserUtils.waitFor(1);
    peyk_pages.hsm.click();
    BrowserUtils.waitFor(1);
    peyk_pages.hsmKullaniciAdi.sendKeys("kolaysoft");
    peyk_pages.kaydet7.click();
    BrowserUtils.waitFor(3);

    peyk_pages.musteriyiKaydet.click();
    BrowserUtils.waitFor(1);

    closeDriver();
}
@Test

    public void b_musteriyeLoginOlma() throws InterruptedException, AWTException {

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

    peyk_pages.vknTckn1.sendKeys("3522339122");
    BrowserUtils.waitFor(1);

    peyk_pages.aramaYap1.click();
    BrowserUtils.waitFor(1);

    peyk_pages.seciniz.click();
    BrowserUtils.waitFor(1);

    peyk_pages.kullaniciPortalinaGit.click();
    BrowserUtils.waitFor(1);

    peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
    BrowserUtils.waitFor(1);
    Robot robot1 = new Robot();
    robot1.keyPress(KeyEvent.VK_ENTER);
    robot1.keyRelease(KeyEvent.VK_ENTER);
    BrowserUtils.waitFor(1);

    peyk_pages.girisYap.click();
    BrowserUtils.waitFor(1);

    closeDriver();}

    @Test

    public void c_AnaSayfa() throws InterruptedException, AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(1);

        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(1);

        //Bordro
        peyk_pages.bordroGonder.click();
        BrowserUtils.waitFor(3);
        String bordroYukle = peyk_pages.ucretBordrosuYukle.getText();
        Assert.assertEquals(bordroYukle,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(3);

        //Form
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.formGonder.click();
        String form = peyk_pages.formGon.getText();
        Assert.assertEquals(form,"Form Gönder");
        BrowserUtils.waitFor(3);

        //Taslak Hazırla
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.taslakHazirla.click();
        String form1 = peyk_pages.formuOnizle.getText();
        Assert.assertEquals(form1,"Formu Önizle");
        BrowserUtils.waitFor(2);

        //Özlük Form Onayı
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukFormOnayi.click();
        String ozluk = peyk_pages.ozlukIslemleri.getText();
        Assert.assertEquals(ozluk,"Özlük İşlemleri");
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

    @Test

    public void d_OnayBekleyenler() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(1);

        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(1);

        peyk_pages.onayBekleyenler.click();
        String onayBek = peyk_pages.onayBekleyenler.getText();
        Assert.assertEquals(onayBek,"Onay Bekleyenler");
        BrowserUtils.waitFor(1);

        try {

            if (peyk_pages.onayBekleyen1.isDisplayed()) {
                peyk_pages.onayBekleyen1.click();
                peyk_pages.secilenleriOnayla.click();
                BrowserUtils.waitFor(1);
                peyk_pages.evet.click();
                BrowserUtils.waitFor(1);
            }
        }catch (Exception e){
            System.out.println("Kayıt bulunamadı");
        }

        closeDriver();
    }

    @Test

    public void e_Peyk() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("" +
                "");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(3);

        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(1);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);
        String tanim = peyk_pages.tanimlar.getText();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(tanim,"Tanımlar");
        BrowserUtils.waitFor(2);

        //Tanımlar
        peyk_pages.tanimlar.click();
        BrowserUtils.waitFor(2);
        String departman = peyk_pages.departmanTanimi.getText();
        Assert.assertEquals(departman,"Departman Tanımı");
        BrowserUtils.waitFor(2);

        //Departman Tanımı
        peyk_pages.departmanTanimi.click();
        BrowserUtils.waitFor(2);
        String departList = peyk_pages.departmanListesi.getText();
        Assert.assertEquals(departList,"Departman Listesi");
        BrowserUtils.waitFor(2);

        //Departman Oluşturma
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bagliOldDepMerkez.click();
        BrowserUtils.waitFor(3);
        peyk_pages.merkezDepartman.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanTur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.turMerkez.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanAdi.sendKeys("Kolaysoft");
        BrowserUtils.waitFor(2);
        peyk_pages.departmanKodu.sendKeys("001");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ikinciSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);

        //Departman Tür Tanımlama
        peyk_pages.departmanTurTanimi.click();
        BrowserUtils.waitFor(2);
        String depturu = peyk_pages.departmanTuruListesi.getText();
        Assert.assertEquals(depturu,"Departman Türü Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanTuruOlustur.sendKeys("Farilya");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanTuruSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);

        //Çalışan Tanımları
        peyk_pages.calisanTanimlari.click();
        BrowserUtils.waitFor(2);
        String calisanlar = peyk_pages.calisanlar.getText();
        Assert.assertEquals(calisanlar,"Çalışanlar");
        BrowserUtils.waitFor(2);

        //Çalışan oluşturma
        peyk_pages.calisanlar.click();
        BrowserUtils.waitFor(2);
        String calisanListesi = peyk_pages.calisanListesi.getText();
        Assert.assertEquals(calisanListesi,"Çalışan Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.calisanAdi.sendKeys("Mert");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSoyadi.sendKeys("Kaya");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanTckn.sendKeys("57229496688");
        BrowserUtils.waitFor(2);
        peyk_pages.departman.sendKeys("Merkez");
        BrowserUtils.waitFor(2);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.bildirimTuru.sendKeys("SMS");
        BrowserUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.telefonNumarasi.sendKeys("5425837419");
        BrowserUtils.waitFor(3);
        peyk_pages.kaydet5.click();
        BrowserUtils.waitFor(3);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);
        peyk_pages.calisanSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);

        //Çalışan Şifre Yönetimi
        peyk_pages.calisanSifreYon.click();
        BrowserUtils.waitFor(2);
        String calisanSifreYonetimi = peyk_pages.calSifYon.getText();
        Assert.assertEquals(calisanSifreYonetimi,"Çalışan Şifre Yönetimi");
        BrowserUtils.waitFor(3);
        peyk_pages.calisanBlokeListesi.click();
        BrowserUtils.waitFor(2);
        String calisanBlokeListesi = peyk_pages.calBlokList.getText();
        Assert.assertEquals(calisanBlokeListesi,"Çalışan Bloke Listesi");
        BrowserUtils.waitFor(3);
        peyk_pages.IkAdminBlokeListesi.click();
        BrowserUtils.waitFor(2);
        String IkAdminBlokeListesi = peyk_pages.IkAdmlBlokList.getText();
        Assert.assertEquals(IkAdminBlokeListesi,"IK Admin Hesabı Bloke Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniSifreTalebi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ilkCalisan.click();
        BrowserUtils.waitFor(2);
        peyk_pages.exceleAktar.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sifreTekrarGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.anaSayfaLinkiGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kayitBildirisiGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.hayir.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sonucYenile.click();
        BrowserUtils.waitFor(2);

        //Firma Bilgileri
        peyk_pages.firmaBilgileri.click();
        BrowserUtils.waitFor(2);
        String logoYukle = peyk_pages.logoYukle.getText();
        Assert.assertEquals(logoYukle,"Logo Yükle");
        BrowserUtils.waitFor(2);
        peyk_pages.logoYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.chooseFile.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.antentliKagYuk.click();
        BrowserUtils.waitFor(2);
        peyk_pages.chooseFile.isDisplayed();
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sifrePolitikasiBelirle.click();
        BrowserUtils.waitFor(2);
        String sifrePolitikasiEkrani = peyk_pages.sifrePolitikasiEkrani.getText();
        Assert.assertEquals(sifrePolitikasiEkrani,"Şifre Politikası Ekranı");
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.indirilebilirDosyaYükle.click();
        BrowserUtils.waitFor(2);
        String indirilebilirDosyaniziYükleyiniz = peyk_pages.indirilebilirDosyaniziYükleyiniz.getText();
        Assert.assertEquals(indirilebilirDosyaniziYükleyiniz,"İndirilebilir dosyanızı yükleyiniz.");
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bildirimTasarimEkrani.click();
        BrowserUtils.waitFor(2);
        String eslestirilenGonderim = peyk_pages.eslestirilenGonderim.getText();
        Assert.assertEquals(eslestirilenGonderim,"Eşleştirilen Gönderim :");
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);

        //Firma Parametreleri
        peyk_pages.firmaParametreleri.click();
        BrowserUtils.waitFor(2);
        String parametreAdi = peyk_pages.parametreAdi.getText();
        Assert.assertEquals(parametreAdi,"Parametre Adı");
        BrowserUtils.waitFor(2);

        //Bilgilendirme Durumu
        peyk_pages.bilgilendirmeDurumu.click();
        BrowserUtils.waitFor(2);
        String calisanBilgilendirmeList = peyk_pages.calisanBilgilendirmeList.getText();
        Assert.assertEquals(calisanBilgilendirmeList,"Çalışan Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSec.click();
        BrowserUtils.waitFor(2);
        peyk_pages.baslangicTarihi.sendKeys("07-02-2025");
        BrowserUtils.waitFor(1);
        peyk_pages.bitisTarihi.sendKeys("09-02-2025");
        BrowserUtils.waitFor(2);
        peyk_pages.aramaYap.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bilgilendirmeTel.isDisplayed();
        BrowserUtils.waitFor(2);

        //Onay Akışı
        peyk_pages.onayAkisi.click();
        BrowserUtils.waitFor(2);
        String yeniOnayAkisi = peyk_pages.yeniOnayAkisi.getText();
        Assert.assertEquals(yeniOnayAkisi,"Yeni Oluştur");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.belgeTuruSeciniz.sendKeys("AKIŞ");
        //Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(3);
        peyk_pages.kaydet6.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);
        peyk_pages.akisSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);

        //e-imza Doğrulama
        peyk_pages.eImzaDog.click();
        BrowserUtils.waitFor(2);
        String eImzaDogrulama = peyk_pages.AkilliKart.getText();
        Assert.assertEquals(eImzaDogrulama,"Akıllı kart markası");
        BrowserUtils.waitFor(2);

        //Form Tanımları
        peyk_pages.formTanimlari.click();
        BrowserUtils.waitFor(2);
        String formSablonlari = peyk_pages.formSablonlari.getText();
        Assert.assertEquals(formSablonlari,"Form Şablonları");
        BrowserUtils.waitFor(2);

        //Form Şablonları
        peyk_pages.formSablonlari.click();
        BrowserUtils.waitFor(2);
        String formSablon = peyk_pages.formSablon.getText();
        Assert.assertEquals(formSablon,"Form Şablonları");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru.sendKeys("BİLDİRİM");
        //Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.formAdi.sendKeys("Kolaysoft");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanParametreleri.click();
        BrowserUtils.waitFor(1);
        peyk_pages.calisanAd.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formuKaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formAdi_Kolaysoft.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.sil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);

        //Form Türü Tanımı
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuruTanimi.click();
        BrowserUtils.waitFor(2);
        String formTuruListesi = peyk_pages.formTuruListesi.getText();
        Assert.assertEquals(formTuruListesi,"Form Türü Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru2.sendKeys("ALACAK");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru3.sendKeys("ALACAK");
        //Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.alacakTuru.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.sil2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);

        //Talep Form Editör
        peyk_pages.talepFormEditor.click();
        BrowserUtils.waitFor(2);
        String talepFormlari = peyk_pages.talepFormlari.getText();
        Assert.assertEquals(talepFormlari,"Talep Formları");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(3);
        peyk_pages.baslik.click();
        BrowserUtils.waitFor(2);
        peyk_pages.basliginIci.sendKeys("Otomasyon Test Formu");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet6.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.talepFormAdi.sendKeys("Otomasyon Test Formu");
        BrowserUtils.waitFor(2);
        peyk_pages.aramaYap2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sil2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(5);
        peyk_pages.kayitBulunamadi.isDisplayed();
        BrowserUtils.waitFor(5);

        /*JavascriptExecutor jm = (JavascriptExecutor) getDriver();
        jm.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.rolIslemleri);
        BrowserUtils.waitFor(2);*/
        //getDriver().quit();
        //closeDriver();
        getDriver().quit();
    }

    @Test

    public void f_Bordro() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(1);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ucretBordrosu.click();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(peyk_pages.ucretBordrosuYukle2.getText(),"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(2);

        peyk_pages.ucretBordrosuYukle2.click();
        BrowserUtils.waitFor(2);
        String ucBordYuk = peyk_pages.ucretBordrosuYukle2.getText();
        Assert.assertEquals(ucBordYuk,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(2);

        peyk_pages.donem.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tem.click();
        peyk_pages.evet.click();
        BrowserUtils.waitFor(3);

        peyk_pages.bordroPdfYukleyiniz.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\CanliSunucularinKontrolu\\AliVeli-66362170898.pdf");
        BrowserUtils.waitFor(2);

        peyk_pages.dokumanlariYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.checkBox.click();
        BrowserUtils.waitFor(3);

        peyk_pages.imzalaGonder.click();
        BrowserUtils.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.kayitSayisi);
        BrowserUtils.waitFor(2);

        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
        }

        peyk_pages.imzala.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(5);
        Assert.assertEquals(peyk_pages.bilgi.getText(),"Bilgi");
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);

        peyk_pages.donemIslemleri.click();
        BrowserUtils.waitFor(2);
        String ucBordDonIslemText = peyk_pages.ucBordDonIslem.getText();
        Assert.assertEquals(ucBordDonIslemText, "Ücret Bordrosu Dönem İşlemleri");
        BrowserUtils.waitFor(1);

        closeDriver();
    }

    @Test

    public void g_Form() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(3);


        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);
        peyk_pages.Form.click();

        BrowserUtils.waitFor(2);
        String formGonder = peyk_pages.formGonder.getText();
        Assert.assertEquals(formGonder,"Form Gönder");
        BrowserUtils.waitFor(2);

        //Şablonlu Form Gönderimi
        peyk_pages.formGonder.click();
        BrowserUtils.waitFor(2);
        String formGon = peyk_pages.formGon.getText();
        Assert.assertEquals(formGon,"Form Gönder");
        BrowserUtils.waitFor(2);
        peyk_pages.sec.click();
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.aliVeli.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet.click();
        BrowserUtils.waitFor(2);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(7);

        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
                peyk_pages.imzalaGonder.click();
                peyk_pages.evet.click();
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
            //peyk_pages.onayla.click();
            BrowserUtils.waitFor(2);
            peyk_pages.imzalaGonder.click();
            BrowserUtils.waitFor(2);
            peyk_pages.evet.click();
            BrowserUtils.waitFor(5);
        }

        Assert.assertEquals(peyk_pages.pdfGonderiliyor.getText(),"PDF imzalandı ve gönderiliyor");
        BrowserUtils.waitFor(2);

        //Şablonsuz Form Gönderimi
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.anaFormGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sablonsuzGonderim.click();
        BrowserUtils.waitFor(2);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\CanliSunucularinKontrolu\\3_kişininMetni.pdf");
        BrowserUtils.waitFor(2);
        peyk_pages.dokumanYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.dokumanEkle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\CanliSunucularinKontrolu\\AliVeli-66362170898.pdf");
        BrowserUtils.waitFor(2);
        peyk_pages.dokumanYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ePostaKonusu.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ePostaKonusu.sendKeys("1");
        BrowserUtils.waitFor(2);
        peyk_pages.ePostaIcerigi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ePostaIcerigi.sendKeys("2");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.aliVeli.click();
        BrowserUtils.waitFor(3);
        peyk_pages.kaydet.click();
        BrowserUtils.waitFor(2);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(7);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(5);
        peyk_pages.ucKisininMetni.click();
        BrowserUtils.waitFor(2);
        peyk_pages.aliVeliPdf.click();
        BrowserUtils.waitFor(2);
        peyk_pages.topluFormGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sablonsuz1.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sablonsuz2.click();
        BrowserUtils.waitFor(2);
        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(3);
                peyk_pages.imzalaGonder.click();
                peyk_pages.evet.click();
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
            peyk_pages.imzalaGonder.click();
            BrowserUtils.waitFor(1);
            peyk_pages.evet.click();
            BrowserUtils.waitFor(13);
        }
        Assert.assertEquals(peyk_pages.kayitBulunamadi.getText(),"Kayıt bulunamadı.");
        BrowserUtils.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.PEYK);
        BrowserUtils.waitFor(2);

        //Form İşlemleri
        peyk_pages.formIslemleri.click();
        BrowserUtils.waitFor(2);
        String topluformGonder = peyk_pages.topluFormGonder.getText();
        Assert.assertEquals(topluformGonder,"Toplu Form Gönder");
        BrowserUtils.waitFor(2);

        closeDriver();
    }

    @Test

    public void h_Arsivler() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(3);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);
        peyk_pages.arsivler.click();
        BrowserUtils.waitFor(2);
        String ucretBordrolarıArsiv = peyk_pages.ucretBordrolariArsiv.getText();
        Assert.assertEquals(ucretBordrolarıArsiv,"Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);

        peyk_pages.ucretBordrolariArsiv.click();
        BrowserUtils.waitFor(2);
        String ucretBordArs = peyk_pages.ucretBordArs.getText();
        Assert.assertEquals(ucretBordArs,"Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);

        peyk_pages.formlarArs.click();
        BrowserUtils.waitFor(2);
        String formArs = peyk_pages.formArs.getText();
        Assert.assertEquals(formArs,"Formlar Arşiv");
        BrowserUtils.waitFor(2);

        closeDriver();
    }

    @Test
    public void i_IslemGecmisi() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(3);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);
        peyk_pages.islemGecmisi.click();
        BrowserUtils.waitFor(2);
        String islemGecmisi = peyk_pages.isGec.getText();
        Assert.assertEquals(islemGecmisi, "İşlem Geçmişi");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanIslemKaydi.click();
        String calisanIslemKaydi = peyk_pages.calisanIslemKaydi.getText();
        Assert.assertEquals(calisanIslemKaydi, "Çalışan İşlem Kaydı");
        BrowserUtils.waitFor(2);

        //Kayıt Belgesi İndirme
        peyk_pages.calisanIslemKaydiIndir.click();
        BrowserUtils.waitFor(2);
        peyk_pages.startDate.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bir.click();
        BrowserUtils.waitFor(2);
        peyk_pages.endDate.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sekiz.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kayitBelgesiIndir.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bekleyenIndirmeler.click();
        BrowserUtils.waitFor(2);
        peyk_pages.indir.click();
        BrowserUtils.waitFor(2);
        peyk_pages.close.click();
        BrowserUtils.waitFor(3);

        closeDriver();
    }

    @Test
    public void j_OzlukIslemleri() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(3);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        BrowserUtils.waitFor(2);
        peyk_pages.OzlukIslemleri.click();
        BrowserUtils.waitFor(2);
        String ozlukFormOnay = peyk_pages.ozlukFormOnay.getText();
        Assert.assertEquals(ozlukFormOnay,"Özlük Form Onay");
        BrowserUtils.waitFor(2);

        peyk_pages.ozlukFormOnay.click();
        BrowserUtils.waitFor(2);
        String ozlukArsiv = peyk_pages.ozlukArsiv.getText();
        Assert.assertEquals(ozlukArsiv,"Özlük Arşiv");
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukArsiv.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukDosyalari.click();
        BrowserUtils.waitFor(2);
        String ozlukIndir = peyk_pages.ozlukIndir.getText();
        Assert.assertEquals(ozlukIndir, "Özlük İndir");
        BrowserUtils.waitFor(2);

        //Özlük Oluşturma
        /*peyk_pages.tanimlar.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formTanimlari.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formSablonlari.click();
        BrowserUtils.waitFor(1);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuruTanimi.click();
        BrowserUtils.waitFor(2);
        String formTuruListesi = peyk_pages.formTuruListesi.getText();
        Assert.assertEquals(formTuruListesi,"Form Türü Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru2.sendKeys("ÖZLÜK");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(1);
        peyk_pages.talepFormEditor.click();
        BrowserUtils.waitFor(2);
        String talepFormlari = peyk_pages.talepFormlari.getText();
        Assert.assertEquals(talepFormlari,"Talep Formları");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(3);
        peyk_pages.ozlukFormuKutucugu.click();
        BrowserUtils.waitFor(1);

        peyk_pages.baslik.click();
        BrowserUtils.waitFor(2);
        peyk_pages.basliginIci.sendKeys("Özlük Formu");
        BrowserUtils.waitFor(2);
        peyk_pages.fotografSatiri.click();
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanSatiri.click();
        BrowserUtils.waitFor(1);
        peyk_pages.metinalani.click();
        peyk_pages.kaydet6.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formSablonlarinaGit.click();
        BrowserUtils.waitFor(1);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formTuru.sendKeys("ÖZLÜK");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.formAdi.sendKeys("Özlük Formu");
        BrowserUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        peyk_pages.talep_ozluk_Kutucugu.sendKeys("ÖZLÜK FORMU");
        BrowserUtils.waitFor(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(1);
        peyk_pages.calisanParametreleri.click();
        BrowserUtils.waitFor(1);
        peyk_pages.calisanAd.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formuKaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.onayAkisinaGit.click();
        BrowserUtils.waitFor(1);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.belgeTuruSeciniz.sendKeys("ÖZLÜK");
        //Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(3);
        peyk_pages.onaylayacak.sendKeys("Sabit IK Admin");
        BrowserUtils.waitFor(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(1);
        peyk_pages.sabitIkAdminHesabi.sendKeys("Subaru Forester (IK Admin)");
        BrowserUtils.waitFor(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        peyk_pages.kaydet6.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);*/

        //Kırmızı Buton
        //peyk_pages.ozlukDosyalari.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kirmiziBtn.click();
        BrowserUtils.waitFor(2);
        peyk_pages.dosyaSec.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\CanliSunucularinKontrolu\\3_kişininMetni.pdf");
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukSecme.sendKeys("Özlük Formu");
        peyk_pages.ozlukSecme.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.yuklenecekYer.sendKeys("Doküman Satırı");
        BrowserUtils.waitFor(2);
        peyk_pages.yuklenecekYer.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.degistir.click();
        BrowserUtils.waitFor(4);
        //peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);

        //Mavi Buton
        peyk_pages.maviBtn.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ozlukSec.sendKeys("ÖZLÜK FORMU");
        BrowserUtils.waitFor(1);
        peyk_pages.ozlukSec.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(1);
        peyk_pages.duzenle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.metinSatiri.sendKeys("a");
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet3.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
        //peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);

        /*JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.PEYK);
        BrowserUtils.waitFor(2);*/

        closeDriver();
    }

    @Test
    public void k_RolIslemleri() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(3);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        BrowserUtils.waitFor(2);
        peyk_pages.rolIslemleri.click();
        BrowserUtils.waitFor(2);
        peyk_pages.rolOlusturma.click();
        String rolIslemleri = peyk_pages.rolOlustur.getText();
        Assert.assertEquals(rolIslemleri,"Rol Oluştur");
        BrowserUtils.waitFor(2);

        //Rol Oluşturma
        peyk_pages.rolOlusturma.click();
        BrowserUtils.waitFor(2);
        String rolListesi = peyk_pages.rolListesi.getText();
        Assert.assertEquals(rolListesi,"Rol Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.rolOlustur.click();
        BrowserUtils.waitFor(1);
        peyk_pages.rolAdi.sendKeys("Peyk");
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        String rolPeyk = peyk_pages.rolPeyk.getText();
        Assert.assertEquals(rolPeyk,"Peyk");
        BrowserUtils.waitFor(2);
        peyk_pages.sil.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);

        //Rol Atama
        peyk_pages.rolAtama.click();
        BrowserUtils.waitFor(2);
        String personelListesi = peyk_pages.personelListesi.getText();
        Assert.assertEquals(personelListesi,"Personel Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.personeleRolEkle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.rolSec.sendKeys("Admin");
        BrowserUtils.waitFor(3);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.ekle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);
        String adminRolu = peyk_pages.adminRolu.getText();
        Assert.assertEquals(adminRolu,"Admin");
        BrowserUtils.waitFor(1);
        peyk_pages.sil.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);
        String rolBulunamadi = peyk_pages.rolBulunamadi.getText();
        Assert.assertEquals(rolBulunamadi,"Rol Bulunamadı");
        BrowserUtils.waitFor(1);
        peyk_pages.close.click();
        BrowserUtils.waitFor(1);

        closeDriver();

    }

    @Test
    public void l_VekilYetkilendir() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("username"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("password2"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        String anaSayfa = peyk_pages.anaSayfa.getText();
        Assert.assertEquals(anaSayfa, "Ana Sayfa");
        BrowserUtils.waitFor(2);

        peyk_pages.portalYonetimi.click();
        BrowserUtils.waitFor(1);

        peyk_pages.musteriIslemleri.click();
        BrowserUtils.waitFor(1);

        peyk_pages.vknTckn1.sendKeys("3522339122");
        BrowserUtils.waitFor(1);

        peyk_pages.aramaYap1.click();
        BrowserUtils.waitFor(1);

        peyk_pages.seciniz.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciPortalinaGit.click();
        BrowserUtils.waitFor(1);

        peyk_pages.kullaniciSeciniz.sendKeys("ergun_test");
        BrowserUtils.waitFor(1);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.girisYap.click();
        BrowserUtils.waitFor(3);

        peyk_pages.vekilYetkilendirme.click();
        BrowserUtils.waitFor(2);
        String islemGecmisi = peyk_pages.vekilYet.getText();
        Assert.assertEquals(islemGecmisi,"Vekil Yetkilendirme");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.yetkilendirilecekPersonelSec.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kisiSeciniz.sendKeys("Yıldırım");
        BrowserUtils.waitFor(3);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(3);
        peyk_pages.rolYetkisi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.organizasyonYetkisi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.yetkiGeriTar.sendKeys("08/14/2025 11:48 AM");
        BrowserUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.yetkiyiAlan.isDisplayed();
        BrowserUtils.waitFor(3);
        peyk_pages.sil2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(7);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(5);

        closeDriver();
    }
    @Test
    public void Veli_Ali_Calisan_66362170898() throws AWTException {

        Driver1.getDriver().get(ConfigurationReader.getProperty("env"));

        peyk_pages.TcNo.sendKeys("66362170898");
        peyk_pages.sifre.sendKeys("Aa,12345");
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.onayBekleyenler.click();
        String onayBek = peyk_pages.onayBekleyenler.getText();
        Assert.assertEquals(onayBek,"Onay Bekleyenler");
        BrowserUtils.waitFor(3);

        try {

            if (peyk_pages.onayBekleyen1.isDisplayed()) {
                peyk_pages.secOpsiyonu.click();
                BrowserUtils.waitFor(2);
                peyk_pages.sayfadakileriSec.click();
                BrowserUtils.waitFor(2);
                peyk_pages.tamam.click();
                BrowserUtils.waitFor(2);
                peyk_pages.secilenleriOnayla.click();
                BrowserUtils.waitFor(3);
                peyk_pages.evet.click();
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("Kayıt bulunamadı");
        }
        BrowserUtils.waitFor(2);

        //Talep Formu Gönderme
        peyk_pages.talepFormlariCalisan.click();
        BrowserUtils.waitFor(2);
        peyk_pages.yeniTalep.click();
        BrowserUtils.waitFor(2);
        peyk_pages.talepFormu.sendKeys("GÜNLÜK İZİN FORMU");
        BrowserUtils.waitFor(2);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.sayiAlani.sendKeys("1");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydetVeGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(3);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);

        closeDriver();
    }


}
