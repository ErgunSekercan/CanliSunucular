import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PEYK_Pages {

    public PEYK_Pages(){

        PageFactory.initElements(Driver1.getDriver(),this);
    }

    // Ana Sayfa
    @FindBy(xpath = "//input[@id='username']")
    public WebElement TcNo;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//button[contains(text(), \"G\")]")
    public WebElement giris;

    @FindBy(xpath = "//button[@id='navbarDropdownMenuLink']")
    public WebElement kullanici;

    @FindBy(xpath = "//span[contains(text(), \"Çıkış\")]")
    public WebElement cikis;

    @FindBy(xpath = "//p[contains(text(), \"Ana Sayfa\")]")
    public WebElement anaSayfa;

    @FindBy(xpath = "//p[contains(text(), \"PEYK\")]")
    public WebElement PEYK;

    @FindBy(xpath = "//label[contains(text(), \"Bordro Gönder\")]")
    public WebElement bordroGonder;

    @FindBy(xpath = "//h4[@class='card-title']")
    public WebElement ucretBordrosuYukle;

    @FindBy(xpath = "(//p[contains(text(), \"Form\")])[2]")
    public WebElement Form;

    @FindBy(xpath = "//label[contains(text(), \"Form Gönder\")]")
    public WebElement formGonder;

    @FindBy(xpath = "//button[contains(text(), \"Şablonsuz Gönderim\")]")
    public WebElement sablonsuzGonderim;

    @FindBy(xpath = "//label[contains(text(), \"Taslak Hazırla\")]")
    public WebElement taslakHazirla;

    @FindBy(xpath = "//button[contains(text(), \"Formu Önizle\")]")
    public WebElement formuOnizle;

    @FindBy(xpath = "//label[contains(text(), \"Özlük Form Onayı\")]")
    public WebElement ozlukFormOnayi;

    @FindBy(xpath = "//h4[contains(text(), \"Özlük İşlemleri\")]")
    public WebElement ozlukIslemleri;

    @FindBy(xpath = "//div[contains(@style,'display: inline; padding: 0px; font-weight: bold; color: lightslategrey;') and contains(label,'Bordro')]")
    public WebElement bordro;

    @FindBy(xpath = "//h4[contains(text(), \"Ücret Bordroları Arşiv\")]")
    public WebElement ozlukBordrolarArsiv;

    @FindBy(xpath = "//div[contains(@style,'display: inline; padding: 0px; font-weight: bold; color: lightslategrey;') and contains(label,'Form')]")
    public WebElement form;

    @FindBy(xpath = "//h4[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formlarArsiv;

    @FindBy(xpath = "//span[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formlarArs;



    // Onay Bekleyenler
    @FindBy(xpath = "//p[contains(text(), \"Onay Bekleyenler\")]")
    public WebElement onayBekleyenler;

    @FindBy(xpath = "(//td[@data-label])[1]")
    public WebElement onayBekleyen1;

    @FindBy(xpath = "//button[@label='Seçilenleri Onayla']")
    public WebElement secilenleriOnayla;

    @FindBy(xpath = "//h4[contains(text(), \"Onay Bekleyenler\")]")
    public WebElement onayBekDok;


    // Arsivler
    @FindBy(xpath = "//p[contains(text(), \"Arşivler\")]")
    public WebElement arsivler;

    @FindBy(xpath = "//span[contains(text(), \"Ücret Bordroları Arşiv\")]")
    public WebElement ucretBordrolariArsiv;

    @FindBy(xpath = "//h4[contains(text(), \"Ücret Bordroları Arşiv\")]")
    public WebElement ucretBordArs;

    @FindBy(xpath = "//h4[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formArs;


    // Form

    @FindBy(xpath = "//h4[contains(text(), \"Form Gönder\")]")
    public WebElement formGon;

    @FindBy(xpath = "//span[contains(text(), \" Form İşlemleri\")]")
    public WebElement formIslemleri;

    @FindBy(xpath = "//button[@label='Toplu Form Gönder']")
    public WebElement topluFormGonder;

    @FindBy(xpath = "(//tr/td/div[contains(text(),'BİLDİRİM')])[1]")
    public WebElement bildirim;

    @FindBy(xpath = "//label[contains(text(),'Lütfen çalışan seçimi yapınız.')]")
    public WebElement calisanSecimi;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    public WebElement sezgin;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    public WebElement sezgin2;

    @FindBy(xpath = "//button[@class='btn-sm btn-icon TekBtn kaydet']")
    //button[contains(text(),'Kaydet')]
    public WebElement kaydet;

    @FindBy(xpath = "//button[contains(text(),'Onayla')]")
    public WebElement onayla;

    @FindBy(xpath = "(//button[contains(text(),'Seç')])[4]")
    public WebElement sec;

    @FindBy(xpath = "//span[contains(text(),'PDF imzalandı ve gönderiliyor')]")
    public WebElement pdfGonderiliyor;

    @FindBy(xpath = "//label[contains(text(),'Form Gönder')]")
    public WebElement anaFormGonder;

    @FindBy(xpath = "//input[@accept='.pdf']")
    public WebElement pdfUzantili;

    @FindBy(xpath = "//button[contains(text(), 'Doküman(lar)ı Yükle')]")
    public WebElement dokumanYukle;

    @FindBy(xpath = "//button[contains(text(), 'Doküman Ekle')]")
    public WebElement dokumanEkle;

    @FindBy(xpath = "//textarea[@rows='3']")
    public WebElement ePostaKonusu;

    @FindBy(xpath = "//textarea[@rows='6']")
    public WebElement ePostaIcerigi;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement ucKisininMetni;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    public WebElement aliVeliPdf;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement sablonsuz1;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement sablonsuz2;

    @FindBy(xpath = "//i[@class='fas fa-sync']")
    public WebElement refresh;

    @FindBy(xpath = "//td[contains(text(),'Kayıt bulunamadı.')]")
    public WebElement kayitBulunamadi;


    // Islem Gecmisi
    @FindBy(xpath = "//span[contains(text(), \"İşlem Geçmişi\")]")
    public WebElement islemGecmisi;

    @FindBy(xpath = "//h4[contains(text(), \"İşlem Geçmişi\")]")
    public WebElement isGec;

    @FindBy(xpath = "//a[contains(text(),\"Çalışan İşlem Kaydı\")]")
    public WebElement calisanIslemKaydi;

    @FindBy(xpath = "//i[@class=' fa fa-download']")
    public WebElement calisanIslemKaydiIndir;

    @FindBy(xpath = "(//input[@id='startDate'])[1]")
    public WebElement startDate;

    @FindBy(xpath = "(//td[@data-value='1' and @class='rdtDay'])[7]")
    public WebElement bir;

    @FindBy(xpath = "(//td[@data-value='30' and @class='rdtDay rdtOld'])[7]")
    public WebElement otuz;

    @FindBy(xpath = "(//td[@data-value='8' and @class='rdtDay'])[8]")
    public WebElement sekiz;

    @FindBy(xpath = "(//input[@id='startDate'])[2]")
    public WebElement endDate;

    @FindBy(xpath = "//button[contains(text(),\"Kayıt Belgesi İndir\")]")
    public WebElement kayitBelgesiIndir;

    @FindBy(xpath = "//i[@class='fas fa-download']")
    public WebElement bekleyenIndirmeler;

    @FindBy(xpath = "(//i[@class='BtnIcon fa fa-download'])[1]")
    public WebElement indir;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement close;


    // OzlukIslemleri
    @FindBy(xpath = "//p[contains(text(), \"Özlük İşlemleri\")]")
    public WebElement OzlukIslemleri;

    @FindBy(xpath = "//span[contains(text(), \" Özlük Form Onay\")]")
    public WebElement ozlukFormOnay;

    @FindBy(xpath = "//a[contains(text(), \"Özlük Arşiv\")]")
    public WebElement ozlukArsiv;

    @FindBy(xpath = "//span[contains(text(), \" Özlük Dosyaları\")]")
    public WebElement ozlukDosyalari;

    @FindBy(xpath = "//button[@label='Özlük İndir']")
    public WebElement ozlukIndir;

    @FindBy(xpath = "(//i[@class=' fa fa fa-upload'])[1]")
    public WebElement kirmiziBtn;

    @FindBy(xpath = "//input[@id='files']")
    public WebElement dosyaSec;

    @FindBy(xpath = "//input[@id='react-select-5-input']")
    public WebElement ozlukSecme;

    @FindBy(xpath = "//input[@id='react-select-6-input']")
    public WebElement yuklenecekYer;

    @FindBy(xpath = "//span[contains(text(),\"Kaydet\")]")
    public WebElement kaydet2;

    @FindBy(xpath = "//button[contains(text(),\"DEĞİŞTİR\")]")
    public WebElement degistir;

    @FindBy(xpath = "(//i[@class=' fa fa fa-edit'])[1]")
    public WebElement maviBtn;

    @FindBy(xpath = "(//input[@role='combobox'])[6]")
    public WebElement ozlukSec;

    @FindBy(xpath = "//button[@label='Düzenle']")
    public WebElement duzenle;

    @FindBy(xpath = "//textarea[@id='root_Metin Alanı']")
    public WebElement metinSatiri;

    @FindBy(xpath = "//button[@label='Kaydet']")
    public WebElement kaydet3;



    // Rolislemleri
    @FindBy(xpath = "//p[contains(text(), \"Rol İşlemleri\")]")
    public WebElement rolIslemleri;

    @FindBy(xpath = "//span[contains(text(), \" Rol Oluşturma\")]")
    public WebElement rolOlusturma;

    @FindBy(xpath = "//button[@label='Rol Oluştur']")
    public WebElement rolOlustur;

    @FindBy(xpath = "//input[@name='roleName']")
    public WebElement rolAdi;

    @FindBy(xpath = "//button[@title='Kaydet']")
    public WebElement kaydet4;

    @FindBy(xpath = "//td[contains(text(),\"Peyk\")]")
    public WebElement rolPeyk;

    @FindBy(xpath = "(//i[@class=' fa fa-trash'])[1]")
    public WebElement sil;

    @FindBy(xpath = "//h4[contains(text(), \"Rol Listesi\")]")
    public WebElement rolListesi;

    @FindBy(xpath = "//span[contains(text(), \" Rol Atama\")]")
    public WebElement rolAtama;

    @FindBy(xpath = "//h4[contains(text(), \"Personel Listesi\")]")
    public WebElement personelListesi;

    @FindBy(xpath = "(//button[@title='Personele Rol Ekle'])[1]")
    public WebElement personeleRolEkle;

    @FindBy(xpath = "(//input[@aria-expanded='false'])[5]")
    public WebElement rolSec;

    @FindBy(xpath = "//button[contains(text(),'Ekle')]")
    public WebElement ekle;

    @FindBy(xpath = "//td[contains(text(),'Admin')]")
    public WebElement adminRolu;

    @FindBy(xpath = "//td[contains(text(),'Rol Bulunamadı')]")
    public WebElement rolBulunamadi;


    // Tanimlar
    @FindBy(xpath = "//a[contains(@data-toggle,'collapse') and contains(@href, '#kepTanim') and contains(p, 'Tanımlar')]")
    public WebElement tanimlar;

    @FindBy(xpath = "//span[contains(text(), \"Departman Tanımı\")]")
    public WebElement departmanTanimi;

    @FindBy(xpath = "//button[@label='Yeni Oluştur']")
    public WebElement yeniOlustur;

    @FindBy(xpath = "//h4[contains(text(), \"Departman Listesi\")]")
    public WebElement departmanListesi;
    @FindBy(xpath = "//select[@name='parentId']")
    public WebElement bagliOldDepMerkez;

    @FindBy(xpath = "//option[@value='11']")
    public WebElement merkezDepartman;

    @FindBy(xpath = "//select[@name='typeId']")
    public WebElement departmanTur;

    @FindBy(xpath = "//option[@value='3']")
    public WebElement turMerkez;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement departmanAdi;

    @FindBy(xpath = "//input[@name='integrationCode']")
    public WebElement departmanKodu;

    @FindBy(xpath = "(//i[@class=' fa fa-trash'] )[1]")
    public WebElement departmanSil;

    @FindBy(xpath = "//span[contains(text(), \" Departman Tür Tanımı\")]")
    public WebElement departmanTurTanimi;

    @FindBy(xpath = "//h4[contains(text(), \"Departman Türü Listesi\")]")
    public WebElement departmanTuruListesi;

    @FindBy(xpath = "//input[@name='type']")
    public WebElement departmanTuruOlustur;

    @FindBy(xpath = "(//i[@class=' fa fa-trash'])[3]")
    public WebElement departmanTuruSil;

    @FindBy(xpath = "//p[contains(text(), \"Çalışan Tanımları\")]")
    public WebElement calisanTanimlari;

    @FindBy(xpath = "//span[contains(text(), \"Çalışanlar\")]")
    public WebElement calisanlar;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Listesi\")]")
    public WebElement calisanListesi;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement calisanAdi;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement calisanSoyadi;

    @FindBy(xpath = "//input[@name='tckn']")
    public WebElement calisanTckn;

    @FindBy(xpath = "(//input[@id='autoCompleteList'])[1]")
    public WebElement departman;

    @FindBy(xpath = "//input[@id='employeeNtfResultList']")
    public WebElement bildirimTuru;

    @FindBy(xpath = "//input[@name='telephone']")
    public WebElement telefonNumarasi;

    @FindBy(xpath = "//span[contains(text(),\"KAYDET\")]")
    public WebElement kaydet5;

    @FindBy(xpath = "//button[contains(text(),\"Kaydet\")]")
    public WebElement kaydet6;

    @FindBy(xpath = "(//i[@class=' fa fa-trash'])[1]")
    public WebElement calisanSil;

    @FindBy(xpath = "//span[contains(text(), \" Çalışan Şifre Yönetimi\")]")
    public WebElement calisanSifreYon;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Şifre Yönetimi\")]")
    public WebElement calSifYon;

    @FindBy(xpath = "//a[contains(text(),\"Çalışan Bloke Listesi\")]")
    public WebElement calisanBlokeListesi;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Bloke Listesi\")]")
    public WebElement calBlokList;

    @FindBy(xpath = "//a[contains(text(),\"IK Admin Hesabı Bloke Listesi\")]")
    public WebElement IkAdminBlokeListesi;

    @FindBy(xpath = "//h4[contains(text(), \"IK Admin Hesabı Bloke Listesi\")]")
    public WebElement IkAdmlBlokList;

    @FindBy(xpath = "(//td/input[@type='checkbox'])[1]")
    public WebElement ilkCalisan;

    @FindBy(xpath = "//button[@label=\"Excel'e Aktar\"]")
    public WebElement exceleAktar;

    @FindBy(xpath = "//button[@label=\"Şifre Tekrar Gönder\"]")
    public WebElement sifreTekrarGonder;

    @FindBy(xpath = "//button[@label=\"Anasayfa Linki Gönder\"]")
    public WebElement anaSayfaLinkiGonder;

    @FindBy(xpath = "//button[@label=\"Kayıt Bildirisi Gönder\"]")
    public WebElement kayitBildirisiGonder;

    @FindBy(xpath = "//button[contains(text(), \"Hayır\")]")
    public WebElement hayir;

    @FindBy(xpath = "//button[@label=\"Sonuç Yenile\"]")
    public WebElement sonucYenile;

    @FindBy(xpath = "//span[contains(text(), \" Firma Bilgileri\")]")
    public WebElement firmaBilgileri;

    @FindBy(xpath = "//button[@label='Logo Yükle']")
    public WebElement logoYukle;

    @FindBy(xpath = "//input[@class=\"fileInput\"]")
    public WebElement chooseFile;

    @FindBy(xpath = "//button[@label=\"Antetli Kağıt Yükle\"]")
    public WebElement antentliKagYuk;

    @FindBy(xpath = "//spam[contains(text(),\"!\")]")
    public WebElement boyut;

    @FindBy(xpath = "//button[@label=\"Şifre Politikası Belirle\"]")
    public WebElement sifrePolitikasiBelirle;

    @FindBy(xpath = "//label[contains(text(), \"Şifre Politikası Ekranı\")]")
    public WebElement sifrePolitikasiEkrani;

    @FindBy(xpath = "//a[contains(text(),\"Yeni Şifre Talebi\")]")
    public WebElement yeniSifreTalebi;

    @FindBy(xpath = "//button[@label=\"İndirilebilir Dosya Yükle\"]")
    public WebElement indirilebilirDosyaYükle;

    @FindBy(xpath = "//div[@class=\"dropzoneInnerArea\"]")
    public WebElement indirilebilirDosyaniziYükleyiniz;

    @FindBy(xpath = "//button[@label=\"Bildirim Tasarım Ekranı\"]")
    public WebElement bildirimTasarimEkrani;

    @FindBy(xpath = "//label[contains(text(), \"Eşleştirilen Gönderim :\")]")
    public WebElement eslestirilenGonderim;

    @FindBy(xpath = "//button[@label=\"Firma Parametreleri\"]")
    public WebElement firmaParametreleri;

    @FindBy(xpath = "//div[contains(text(), \"Parametre Adı\")]")
    public WebElement parametreAdi;

    @FindBy(xpath = "//span[contains(text(), \"Bilgilendirme Durumu\")]")
    public WebElement bilgilendirmeDurumu;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Listesi\")]")
    public WebElement calisanBilgilendirmeList;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement calisanSec;

    @FindBy(xpath = "(//div[@class='rdt datepicker']//input)[7]")
    public WebElement baslangicTarihi;

    @FindBy(xpath = "(//div[@class='rdt datepicker']//input)[8]")
    public WebElement bitisTarihi;

    @FindBy(xpath = "(//button[contains(text(), \"Arama Yap\")])[2]")
    public WebElement aramaYap;

    @FindBy(xpath = "//td[@data-label='Telefon Numarası']")
    public WebElement bilgilendirmeTel;

    @FindBy(xpath = "//span[contains(text(), \" Onay Akışı\")]")
    public WebElement onayAkisi;

    @FindBy(xpath = "//button[contains(text(), \"Yeni Oluştur\")]")
    public WebElement yeniOnayAkisi;

    @FindBy(xpath = "(//button[@class='simpleButton trash'])[1]")
    public WebElement akisSil;

    @FindBy(xpath = "(//input[@aria-expanded='false'])[2]")
    public WebElement belgeTuruSeciniz;

    @FindBy(xpath = "//span[contains(text(), \"E-imza Doğrulama\")]")
    public WebElement eImzaDog;

    @FindBy(xpath = "//label[contains(text(), \"Akıllı kart markası\")]")
    public WebElement AkilliKart;

    @FindBy(xpath = "//p[contains(text(), 'Form Tanımları')]")
    public WebElement formTanimlari;

    @FindBy(xpath = "//span[contains(text(), ' Form Şablonları')]")
    public WebElement formSablonlari;

    @FindBy(xpath = "//h4[contains(text(),'Form Şablonları')]")
    public WebElement formSablon;

    @FindBy(xpath = "(//input[@id='autoCompleteList'])[1]")
    public WebElement formTuru;

    @FindBy(xpath = "//input[@name='formName']")
    public WebElement formAdi;

    @FindBy(xpath = "//button[@id='employeeParameters']")
    public WebElement calisanParametreleri;

    @FindBy(xpath = "(//button[@id='drag1'])[1]")
    public WebElement calisanAd;

    @FindBy(xpath = "//button[@label='Formu Kaydet']")
    public WebElement formuKaydet;

    @FindBy(xpath = "//button[contains(text(),'Kapat')]")
    public WebElement kapat;

    @FindBy(xpath = "//div[contains(text(),'Kolaysoft')]")
    public WebElement formAdi_Kolaysoft;

    @FindBy(xpath = "//button[@label='Form Türü Tanımı']")
    public WebElement formTuruTanimi;

    @FindBy(xpath = "//h4[contains(text(),'Form Türü Listesi')]")
    public WebElement formTuruListesi;

    @FindBy(xpath = "//input[@name='category']")
    public WebElement formTuru2;

    @FindBy(xpath = "//div[contains(text(),\"ALACAK\")]")
    public WebElement alacakTuru;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement formTuru3;

    @FindBy(xpath = "//i[@class=' fa fa-trash']")
    public WebElement sil2;

    @FindBy(xpath = "//span[contains(text(),' Firma Parametreleri')]")
    public WebElement firmaParametreleri2;

    @FindBy(xpath = "//h4[contains(text(),'Firma Parametreleri')]")
    public WebElement firmaParam;

    //Talep ve Özlük Formu Oluşturma
    @FindBy(xpath = "//span[contains(text(),' Talep Form Editör')]")
    public WebElement talepFormEditor;

    @FindBy(xpath = "//h4[contains(text(),'Talep Formları')]")
    public WebElement talepFormlari;

    @FindBy(xpath = "//input[@id='personalInfo']")
    public WebElement ozlukFormuKutucugu;

    @FindBy(xpath = "//p[contains(text(),'Başlık')]")
    public WebElement baslik;

    @FindBy(xpath = "//p[contains(text(),'Fotoğraf Satırı')]")
    public WebElement fotografSatiri;

    @FindBy(xpath = "//p[contains(text(),'Doküman Satırı')]")
    public WebElement dokumanSatiri;

    @FindBy(xpath = "//p[contains(text(),'Metin Alanı')]")
    public WebElement metinalani;

    @FindBy(xpath = "//button[contains(text(),'Form Şablonlarına Git')]")
    public WebElement formSablonlarinaGit;

    @FindBy(xpath = "//input[@id='headingElement']")
    public WebElement basliginIci;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement talepFormAdi;

    @FindBy(xpath = "//input[@autocapitalize='none']")
    public WebElement talep_ozluk_Kutucugu;

    @FindBy(xpath = "//button[contains(text(),'Onay Akışına Git')]")
    public WebElement onayAkisinaGit;

    @FindBy(xpath = "//input[@aria-activedescendant='react-select-28--value']")
    public WebElement onaylayacak;

    @FindBy(xpath = "//input[@aria-activedescendant='react-select-36--value']")
    public WebElement sabitIkAdminHesabi;

    @FindBy(xpath = "//button[contains(text(), \"Arama Yap\")]")
    public WebElement aramaYap2;




    // UcretBordrosu
    @FindBy(xpath = "//p[contains(text(),\"Ücret Bordrosu\")]")
    public WebElement ucretBordrosu;

    @FindBy(xpath = "//span[contains(text(),\" Ücret Bordrosu Yükle \")]")
    public WebElement ucretBordrosuYukle2;

    @FindBy(xpath = "(//input)[2]")
    public WebElement donem;

    @FindBy(xpath = "//td[contains(text(), \"Oca\")]")
    public WebElement tem;

    @FindBy(xpath = "//button[contains(text(), \"Evet\")]")
    public WebElement evet;

    @FindBy(xpath = "//input[@accept=\".pdf, .xlsx\"]")
    public WebElement bordroPdfYukleyiniz;

    @FindBy(xpath = "//button[contains(text(), \"Dökümanları Yükle\")]")
    public WebElement dokumanlariYukle;

    @FindBy(xpath = "(//td/input[@type=\"checkbox\"])[1]")
    public WebElement checkBox;

    @FindBy(xpath = "//button[contains(text(), \"İmzala & Gönder\")]")
    public WebElement imzalaGonder;

    @FindBy(xpath = "//li[contains(text(), \"Kayıt Sayısı\")]")
    public WebElement kayitSayisi;

    @FindBy(xpath = "//div[contains(text(), \"Pin\")]")
    public WebElement pin;

    @FindBy(xpath = "//div/div/div/input[@type=\"password\"]")
    public WebElement eImzaPassword;

    @FindBy(xpath = "//button[contains(text(), \"İmzala\")]")
    public WebElement imzala;

    @FindBy(xpath = "//h2")
    public WebElement bilgi;

    @FindBy(xpath = "//button[contains(text(), \"Tamam\")]")
    public WebElement tamam;

    @FindBy(xpath = "//span[contains(text(), \" Dönem İşlemleri\")]")
    public WebElement donemIslemleri;

    @FindBy(xpath = "//h4[contains(text(), \"Ücret Bordrosu Dönem İşlemleri\")]")
    public WebElement ucBordDonIslem;


    // VekilYetkilendirme
    @FindBy(xpath = "//p[contains(text(), \"Vekil Yetkilendirme\")]")
    public WebElement vekilYetkilendirme;

    @FindBy(xpath = "//h4[contains(text(), \"Vekil Yetkilendirme\")]")
    public WebElement vekilYet;

    @FindBy(xpath = "//button[contains(text(), \"Seç\")]")
    public WebElement yetkilendirilecekPersonelSec;

    @FindBy(xpath = "//input[@aria-expanded='false']")
    public WebElement kisiSeciniz;

    @FindBy(xpath = "//input[@id='custom-role-checkbox-0']")
    public WebElement rolYetkisi;

    @FindBy(xpath = "//input[@id='custom-organization-checkbox-0']")
    public WebElement organizasyonYetkisi;

    @FindBy(xpath = "//input[@name='finish_date']")
    public WebElement yetkiGeriTar;

    @FindBy(xpath = "//td[contains(text(),\"Sezgin Kara [ Tckn: 74314067776 ]\")]")
    public WebElement yetkiyiAlan;

    //Veli_Ali_Calisan

    @FindBy(xpath = "//p[contains(text(), \"Talep Formları\")]")
    public WebElement talepFormlariCalisan;

    @FindBy(xpath = "//button[contains(text(), \"Yeni Talep\")]")
    public WebElement yeniTalep;

    @FindBy(xpath = "//input[@aria-expanded=\"false\"]")
    public WebElement talepFormu;

    @FindBy(xpath = "//input[@id=\"root_Sayı Alanı\"]")
    public WebElement sayiAlani;

    @FindBy(xpath = "//button[contains(text(), \"Kaydet ve Gönder\")]")
    public WebElement kaydetVeGonder;

    @FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
    public WebElement secOpsiyonu;

    @FindBy(xpath = "//button[contains(text(), \"Sayfadakileri Seç\")]")
    public WebElement sayfadakileriSec;


    //PosGre
    //Sistem Hesabından müşteri oluşturma

    @FindBy(xpath = "//span[contains(text(), \"Kolaysoft Teknoloji A.Ş\")]")
    public WebElement sistem;

    @FindBy(xpath = "//p[contains(text(), \"Portal Yönetimi\")]")
    public WebElement portalYonetimi;

    @FindBy(xpath = "//span[contains(text(), \"Müşteri İşlemleri\")]")
    public WebElement musteriIslemleri;

    @FindBy(xpath = "(//ul/button[@label='Yeni Oluştur'])[2]")
    public WebElement yeniOlustur2;

    @FindBy(xpath = "//input[@id='tVknTckn']")
    public WebElement vknTckn;

    @FindBy(xpath = "//input[@name='formattedName']")
    public WebElement unvan;

    @FindBy(xpath = "//input[@id='tGivenName']")
    public WebElement adi;

    @FindBy(xpath = "//input[@id='tFamilyName']")
    public WebElement soyAdi;

    @FindBy(xpath = "//input[@id='tCustomerName']")
    public WebElement musteriAdi;

    @FindBy(xpath = "//input[@id='tCustomerType']")
    public WebElement musteriTipi;

    @FindBy(xpath = "//input[@id='tCorporateMail']")
    public WebElement kurumsalEposta;

    @FindBy(xpath = "//input[@id='tCorporateMobilePhone']")
    public WebElement kurumsalCepTel;

    @FindBy(xpath = "//input[@id='tEmployeePredefined']")
    public WebElement personelSayisi;

    @FindBy(xpath = "//input[@id='tStoragePredefined']")
    public WebElement ozlukDosyaBoyutu;

    @FindBy(xpath = "//input[@id='tCreditPredefined']")
    public WebElement yillikYuklenecekSMS;

    @FindBy(xpath = "(//input[@id='tTaxOffice'])[1]")
    public WebElement vergiDairesiIl;

    @FindBy(xpath = "(//input[@id='tTaxOffice'])[2]")
    public WebElement vergiDairesiIlce;

    @FindBy(xpath = "//a[contains(text(),'Şube Bilgileri')]")
    public WebElement subeBilgileri;

    @FindBy(xpath = "//button[@class='TekBtn ekle btn-icon']")
    public WebElement subeEkle;

    @FindBy(xpath = "//input[@id='tBranchName']")
    public WebElement subeAdi;

    @FindBy(xpath = "//input[@id='tCity']")
    public WebElement sehir;

    @FindBy(xpath = "//input[@id='tCitySubdivisionName']")
    public WebElement ilce;

    @FindBy(xpath = "//input[@id='tEmail']")
    public WebElement ePosta;

    @FindBy(xpath = "//button[@class='TekBtn kaydet']")
    public WebElement onayla2;

    @FindBy(xpath = "//a[contains(text(),'Sözleşme Bilgileri')]")
    public WebElement sozlesmeBilgileri;

    @FindBy(xpath = "//input[@id='tContractStartDate']")
    public WebElement sozBaslangicTar;

    @FindBy(xpath = "//input[@id='tSmsPredefined']")
    public WebElement yilYukSmsKontor;

    @FindBy(xpath = "//input[@id='tInitialStoragePredefined']")
    public WebElement ozlDosyaBoy;

    @FindBy(xpath = "//input[@id='tInitialEmployeePredefined']")
    public WebElement perSayisi;

    @FindBy(xpath = "//input[@name='contractCheckbox']")
    public WebElement ikPlatformu;

    @FindBy(xpath = "//input[@id='employeeNtfResultList']")
    public WebElement altHizmetler;

    @FindBy(xpath = "//a[contains(text(), \"HSM\")]")
    public WebElement hsm;

    @FindBy(xpath = "(//input[@type='text'])[42]")
    public WebElement hsmKullaniciAdi;

    @FindBy(xpath = "//button[@class='btn-sm btn-icon TekBtn kaydet']")
    public WebElement kaydet7;

    @FindBy(xpath = "//button[@class='TekBtn kaydet btn-icon']")
    public WebElement musteriyiKaydet;

    @FindBy(xpath = "(//button[contains(text(), \"Seçİnİz\")])[1]")
    public WebElement seciniz;

    @FindBy(xpath = "(//a[contains(text(), \" Kullanıcı Portalına Git\")])[1]")
    public WebElement kullaniciPortalinaGit;

    @FindBy(xpath = "//input[@aria-expanded=\"false\"]")
    public WebElement kullaniciSeciniz;

    @FindBy(xpath = "//button[contains(text(), \"Giriş Yap\")]")
    public WebElement girisYap;
    /*@FindBy(xpath = "(//button[contains(text(), \"Seçİnİz\")])[1]")
    public WebElement seciniz;

    @FindBy(xpath = "(//button[contains(text(), \"Seçİnİz\")])[1]")
    public WebElement seciniz;

    @FindBy(xpath = "(//button[contains(text(), \"Seçİnİz\")])[1]")
    public WebElement seciniz;

    @FindBy(xpath = "(//button[contains(text(), \"Seçİnİz\")])[1]")
    public WebElement seciniz;

    @FindBy(xpath = "(//button[contains(text(), \"Seçİnİz\")])[1]")
    public WebElement seciniz;*/


}
