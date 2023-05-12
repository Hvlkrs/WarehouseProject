# WarehouseProject


Projemiz calisan bir fabrikada(dogal sabun) uygulanan bir sistem olan, depo uygulamasidir. Müsteri ZW firmasidir. Müsterinin beklentisi artan müsteri taleplerine düzgün ve hizli cevap vermektir.

Hedef:

1) ZW firmasinin calisanlarinin;

    1.1) ürün tanimlamasi(urunIsmi, uretici, miktar, kategori(vücut-el-yüz), raf, fiyat) yapabilmeleri
    
    1.2) ürün listeleme islemi yapabilmeleri
    
    1.3) ürün miktar güncelleme islemi yapabilmeleri
    
    1.4) ürün raf güncelleme islemi yapabilmeleri (1.rafta el kategorisi var, 2.rafta yüz kategorisi var, 3. vücut kategorisi var, 4. camasir kategorisi var)
    
    1.5) kategorilere ayirma islemi yapabilmeleri (el-yüz-vücut-camasir)
    
    1.6) ürünleri indirime sokma islemi yapabilmeleri
  

2) ZW firmasinin müsterilerinin 

    2.1) ürün satin alma islemi yapabilmeleri
    
    2.2) ürün listeleme islemi yapabilmeleri
    
    2.3) ürün aratma(search) islemi yapabilmeleri
    
    2.4) ürünü sepete atma islemi yapabilmeleri
    

*****************************************************************************************************************************************************


1. "DataBase"  adinda bir Interface olusturuldu.

       1.a. PojoClass turunde urunve sepet adli 2 ArrayList olusturuldu.
      
       1.b. Calisan turunde calisan adli bir ArrayList olusturuldu.
      
       1.c. Kategori Keyword lu PojoClass turunde value leri olan urunIdMap adinda HashMap olusturuldu.
           
       1.d. Scanner Class burda tanimlandi.
      
2. "Musteri_Islemleri" adinda bir Interface olusturuldu.

         2.a. void urunListele();
         
         2.b. void urunSatinAlma();
         
         2.c. void urunArama();
         
         2.d. void sepetGoruntuleme();
         
         2.e. void giris();  adinda methodlar olusturuldu.
         
3. "Calisan_Islemleri " adinda bir Interface olusturuldu.

         3.a calisanlar();
         
         3.b. urunTanimlama();
         
         3.c. miktarGuncelleme();
         
         3.d. rafGuncelleme();
         
         3.e. urunSilme();
         
         3.f. urunListeleme();
         
         3.g. urunArama();
         
         3.h. indirimYapma();
         
         3.i. giris(); adinda methodlar olusturuldu.
         
4. Kategori adinda bir Enum olusturuldu.

         4.a. Burada VUCUT/EL/YUZ/CAMASIR adinda kategoriler olusturuldu. Raf siralari belirlendi.
             
         4.b. int Raf adinda encapsüle edilmis field olusturuldu ve getter i olusturuldu.
         
         4.c. Kategori adinda int rafNo parametreli method olusturuldu.
        
5. PojoClass adinda bir entity Class olusturup, DataBase Interface ine Implement edildi.

         5.a. private int id;
              private String urunIsmi;
              private String ureticiName;
              private int miktar;
              private Kategori birim;
              private int raf;
              private double fiyat; fieldleri olusturuldu.
              Getter ve Setter lar ve toString  olusturuldu.
             
         5.b.Tam parametreli constructor ve parametresiz cons.olusturuldu.
        
         5.c. PojoClass adinda int id parametreli  bir cons. olusturuldu.
        
         5.d. printListe adinda urun leri yazdiran method olusturuldu.
        
6. Musteri Class i olusturuldu ve DataBase ve MusteriIslemleri Interface lerine implement edildi.

        6.a. musteri adinda bir method olusturuldu.
            Musteriye secenekler sunuldu.
        "************ MÜSTERI ISLEMLERI ************\n\n" +
                                "1- Ürün Listeleme\n"+
                                "2- Ürün Satin Alma\n"+
                                "3- Ürun Arama\n"+
                                "4- Sepet Görüntüleme\n"+
                                "5- Ana Menu\n");
        Bu methodun icinde   musteri ile ilgili methodlar
        switch case e yerlestirildi./Yapabilecegi islemler Switch ile sunuldu.
        
         6.b. urunListele()
              urunSatinAlma()
              urunArama()
              sepetGoruntuleme()
              giris() methodlari override edildi.(SwitchCase e yerlestirildi.)
             
7. Calisan Class i olusturuldu. DataBase ve MusteriIslemleri Interface lerine implement edildi.

        7.a.
        public static final String W = "\u001B[37m";
        public static final String R = "\u001B[31m";
        public static final String G = "\u001B[32m";
        public static final String Y = "\u001B[33m";
        public static final String B = "\u001B[34m"; variable lar olusturldu.
        
        7.b. id static olarak 0 olarak belirlendi.
        
        7.c. static blok icinde id artirilarak
        
        7.d.  PojoClass dan urunler creat edildi ve
        
        7.e. urun listesine ve Map ine  eklendi
        
        7.f.calisanlar() adinda bir method olusturuldu.
        "************ CALISAN ISLEMLERI ************\n\n" +
                        "           1-Ürün Tanimlama\n" +
                        "           2-Miktar güncelleme\n" +
                        "           3-Raf Güncelleme\n" +
                        "           4-Ürün Silme\n" +
                        "           5-Ürün Listeleme\n" +
                        "           6-Ürün Arama\n" +
                        "           7-Ürün Indirimi Yapma\n" +
                        "           8-Ana Menu\n");
             
         7.g.
        Yapilacak islemler Switch ile sunuldu.
        urunTanimlama();
        miktarGuncelleme();
        rafGuncelleme();
        urunSilme();
        urunListeleme();
        urunArama();
        indirimYapma();
        giris(); adinda methodlar override edildi.ve switch case e yerlestirildi.
        
8. Giris_Menusu class i olusturuldu.

       8.a. burada giris() methodu creat edildi.
        Bu methodda,
        System.out.println("--- ZW Management Sistemine Hoşgeldiniz! ---\n");
                    System.out.println("Lütfen aşağıdaki seçeneklerden birini seçin:\n");
                    System.out.println("1. Müşteri Girişi");
                    System.out.println("2. Çalışan Girişi");
                    System.out.println("3. Günün Fırsatı");
                    System.out.println("4. Cikis\n");
                    secenekleri sunuldu.
                    Secimler switch case e yerlestirildi.
                    
        8.b. gununFirsati()
             cikis() methodlari burad creat edildi.
             
9. SabunPazari adinda class olusturuldu.(RunClass olarak)

        Giris_Menusu class indan obje creat edilerek giris methodu cagrildi.
