public class Musteri implements DataBase, Musteri_Islemleri {

    public void musteri(){
        System.out.println();
        System.out.println( "************ MÜSTERI ISLEMLERI ************\n" +
                            "1- Ürün Listeleme\n"+
                            "2- Ürün Satin Alma\n"+
                            "3- Ürun Arama\n"+
                            "4- Sepet Görüntüleme\n"+
                            "5- Ana Menu\n");

        System.out.print("Seciminiz : ");



        int secim=input.nextInt();
        switch (secim){
            case 1:
                urunListele();
                musteri();
                break;
            case 2:
                urunSatinAlma();
                musteri();
                break;
            case 3:
                urunArama();// sadece id ler listesi olmuyor
                musteri();
                break;
            case 4:
                sepetGoruntuleme();
                musteri();
                break;
            case 5:
                giris();
                break;
            default:
                System.out.println("Hatali Tuslama Yaptin Tekrar Dene");
                musteri();
                break;
        }

    }
    @Override
    public void urunListele() {

//        PojoClass obj = new PojoClass();
//        obj.printListe();
       Calisan calisan = new Calisan();
       calisan.urunListeleme();

    }

    @Override
    public void urunSatinAlma() {
        urunListele();
        System.out.println("Almak Istedigin Urunun Id sini Gir ");
        int secilenUrun= input.nextInt();
        boolean flag=true;
        for (PojoClass b:urun) {
            if (b.getId()==secilenUrun){
                System.out.println(b.getId()+" "+b.getUrunIsmi());
                DataBase.sepet.add(b);
                flag=false;
                break;
            }
        }
        if (flag) System.out.println("Istenen Urun Bulunamadi");

    }

    @Override
    public void urunArama() {
        urunListele();
        System.out.println("Aradigin Urunun Id sini Listeden Sec");
        int secim= input.nextInt();
        for (PojoClass e:urun) {
            if (e.getId()==secim){
                System.out.println("Aranan Urun = "+" "+e.getUrunIsmi()+" "+e.getRaf()+" Numarali Rafta");
                break;
            }else System.out.println("Aranan Urun Listede Bulunamadi");
            break;
        }
    }

    @Override
    public void sepetGoruntuleme() {
        System.out.println(DataBase.sepet);
    }

    @Override
    public void giris() {
       Giris_Menusu giris = new Giris_Menusu();
        giris.giris();

    }

}