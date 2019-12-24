package kitap_yayinciligi;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.* ;

public class KitapYayinciligi 
{   
    //Kategorileri ekrana yazdiran fonksiyon
    public static void kategoriler_listele()
    {
        System.out.println("\n----- K A T E G O R I L E R -----\n\n");
        System.out.println("1.Klasikler    2.Bilgisayar   \t\t 3.Felsefe\n\n4.Dini\t       5.Tarihi Kitaplar\t 6.Egitim\n\n");
        System.out.println("Erismek istediginiz klasorun numarasini giriniz...Cikis yapmak icin 0'a basiniz...");
    }
    
    public static ArrayList<Kitap> listelenecekler( Kitap kitap_1 , Kitap kitap_2 , Kitap kitap_3 , Kitap kitap_4 , Kitap kitap_5 )
    {
        ArrayList<Kitap> books_in_method = new ArrayList<>() ;
        
        books_in_method.add(kitap_1) ;
        books_in_method.add(kitap_2) ;
        books_in_method.add(kitap_3) ;
        books_in_method.add(kitap_4) ;
        books_in_method.add(kitap_5) ;
        
        return books_in_method ;
    }
    
    public static void listele( ArrayList<Kitap> kitap , int sorgu ) 
    {
        switch (sorgu) {
            case 1:
                System.out.println("\n\nKLASIKLER");
                break;
            case 2:
                System.out.println("\n\nBILGISAYAR KITAPLARI");
                break;
            case 3:
                System.out.println("\n\nFELSEFI KITAPLAR");
                break;
            case 4:
                System.out.println("\n\nDINI KITAPLAR");
                break;
            case 5:
                System.out.println("\n\nTARIHI KITAPLAR");
                break;
            case 6:
                System.out.println("\n\nEGITIM KITAPLARI");
                break;
            default:
                break;
        }
        
        for (int i = 0; i < kitap.size() ; i++)
        {
            Kitap gecici_nesne = kitap.get(i );
            gecici_nesne.ozellikleri_yazdir();
        }
    }
    
    public static ArrayList<Kitap> kitap_ekle( ArrayList<Kitap> kitap , Scanner klavye , int sorgu )
    {
        DataBase db = new DataBase();
        
        Kitap yeni_kitap = null ;
        String veri_tipi = null ;
        String kitabin_turu = null;
        ArrayList<String> kitap_nesnesi = new ArrayList<>() ;
        
        switch (sorgu) {
            case 1:
                yeni_kitap = new Klasik() ;
                veri_tipi = "kitap_yayinciligi.Klasik";
                kitabin_turu = "Klasikler";
                break;
            case 2:
                yeni_kitap = new Bilgisayar() ;
                veri_tipi = "kitap_yayinciligi.Bilgisayar";
                kitabin_turu = "Bilgisayar";
                break;
            case 3:
                yeni_kitap = new Felsefe() ;
                veri_tipi = "kitap_yayinciligi.Felsefe";
                kitabin_turu = "Felsefe";
                break;
            case 4:
                yeni_kitap = new Dini() ;
                veri_tipi = "kitap_yayinciligi.Dini";
                kitabin_turu = "Dini";
                break;
            case 5:
                yeni_kitap = new Tarih() ;
                veri_tipi = "kitap_yayinciligi.Tarih";
                kitabin_turu = "Tarih";
                break;
            case 6:
                yeni_kitap = new Egitim() ;
                veri_tipi = "kitap_yayinciligi.Egitim";
                kitabin_turu = "Egitim";
                break;
            default:
                break;
        }
        
        System.out.println("Kitabin numarasini giriniz : ");
        int kitabin_numarasi = klavye.nextInt();
        String kitabin_numarasi_string = Integer.toString(kitabin_numarasi);
        kitap_nesnesi.add(kitabin_numarasi_string);
        
        System.out.println("Kitabin adini giriniz : ");
        String kitabin_adi = klavye.next() ;
        yeni_kitap.setKitabin_adi( kitabin_adi );
        kitap_nesnesi.add(kitabin_adi);
        
        System.out.println("Kitabin yazarini giriniz : ");
        String yazarin_adi = klavye.next() ;
        yeni_kitap.setYazarin_adi( yazarin_adi );
        kitap_nesnesi.add(yazarin_adi);
        
        System.out.println("Kitabin yayinevini giriniz : ");
        String yayin_evi = klavye.next() ;
        yeni_kitap.setYayin_evi( yayin_evi );
        kitap_nesnesi.add(yayin_evi);

        System.out.println("Kitabin sayfa sayisini giriniz : ");
        int sayfa_sayisi = klavye.nextInt() ;
        String sayfa_sayisi_string = Integer.toString(sayfa_sayisi) ;
        yeni_kitap.setSayfa_sayisi( sayfa_sayisi );
        kitap_nesnesi.add(sayfa_sayisi_string);
        
        System.out.println("Kitabin basim yilini giriniz : ");
        int basim_yili = klavye.nextInt() ;
        String basim_yili_string = Integer.toString(basim_yili);
        yeni_kitap.setBasim_yili( basim_yili );
        kitap_nesnesi.add(basim_yili_string); 
        
        System.out.println("Kitabin ISBN numarasini giriniz : ");
        String ISBN_num = klavye.next() ;
        yeni_kitap.setISBN_num( ISBN_num );
        kitap_nesnesi.add(ISBN_num);
        
        System.out.println("Kitabin fiyatini giriniz : ");
        int kitabin_fiyati = klavye.nextInt() ;
        String fiyat_string = Integer.toString(kitabin_fiyati) ;
        yeni_kitap.setFiyat( kitabin_fiyati );
        kitap_nesnesi.add(fiyat_string);
        
        kitap_nesnesi.add(kitabin_turu);
        
        db.veri_ekleme(veri_tipi, kitap_nesnesi);
        
        boolean sonuc = kitap.add( yeni_kitap ) ;
        
        if ( sonuc )
        {
            System.out.print("Yeni kitap basariyla eklendi..");
            if( db.eklenen_kitap_sayisi_degistir(veri_tipi,1) )
            {
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Yeni kitap eklenemedi..");
        }
           
        return kitap ;
    }
    
    public static ArrayList<Kitap> kategoriler( ArrayList<Kitap> kitap , Scanner klavye , int sorgu ) 
    {
        listele( kitap , sorgu );
        
        while( true )
        {
            System.out.println("\n\nYeni kitap eklemek icin 1'e , cikis yapmak icin 0'a , kitap silmek icin 2'ye basiniz");
            
            int sorgulama = klavye.nextInt() ;
            
            if( sorgulama == 1 )
            {
                kitap = kitap_ekle(kitap, klavye , sorgu);
            }
            else if( sorgulama == 0 )
            {
                break ;
            }
            else if ( sorgulama == 2 )
            {
                kitap_sil(klavye, sorgu);
            }
            else
            {
                System.out.println("Hatali Giris...\n");
            }
        }
        
        return kitap ;
    }

    public static void kitap_sil( Scanner klavye , int sorgu )
    {
        DataBase db = new DataBase();
        
        String veri_tipi = null ;
        
        System.out.println("Kitabin numarasini giriniz : ");
        int kitabin_numarasi = klavye.nextInt();
        
        switch (sorgu) {
            case 1:
                veri_tipi = "kitap_yayinciligi.Klasik";
                break;
            case 2:
                veri_tipi = "kitap_yayinciligi.Bilgisayar";
                break;
            case 3:
                veri_tipi = "kitap_yayinciligi.Felsefe";
                break;
            case 4:
                veri_tipi = "kitap_yayinciligi.Dini";
                break;
            case 5:
                veri_tipi = "kitap_yayinciligi.Tarih";
                break;
            case 6:
                veri_tipi = "kitap_yayinciligi.Egitim";
                break;
            default:
                break;
        }
        
        boolean sonuc = db.veri_silme(veri_tipi, kitabin_numarasi);
        
        if ( sonuc )
        {
            System.out.println("Kitap basariyla silindi..");
            if( db.eklenen_kitap_sayisi_degistir(veri_tipi,0) )
            {
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Kitap silinemedi..");
        }
     
    }
    //Main Method
    public static void main(String[] args) 
    {  
        Scanner klavye = new Scanner( System.in ) ;
        DataBase db = new DataBase();
        
        ArrayList<String> kitap_database = new ArrayList<>();
        
        //Klasik kitaplarin tanimlanmasi) 
        Class<Klasik> veri_tipi_klasik = Klasik.class;
        
        kitap_database = db.veri_cekme(veri_tipi_klasik.getTypeName() , 1);
        Kitap sefiller = new Klasik( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
 
        kitap_database = db.veri_cekme(veri_tipi_klasik.getTypeName() , 2);
        Kitap babalar_ve_ogullar = new Klasik( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_klasik.getTypeName() , 3);
        Kitap fareler_ve_insanlar = new Klasik( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_klasik.getTypeName() , 4);
        Kitap kelile_ve_dimne = new Klasik( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ; 
      
        kitap_database = db.veri_cekme(veri_tipi_klasik.getTypeName() , 5);
        Kitap cakircali_efe = new Klasik( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
       
        ArrayList<Kitap> klasikler = new ArrayList<>() ;
        klasikler = listelenecekler( sefiller , babalar_ve_ogullar , fareler_ve_insanlar , kelile_ve_dimne , cakircali_efe ) ;
        
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_klasik.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_klasik.getTypeName()) ;
            Kitap kitap_k = new Klasik(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            klasikler.add(kitap_k);
        }
        
        //Bilgisayar kitaplarinin tanimlanmasi
        Class<Bilgisayar> veri_tipi_bilgisayar = Bilgisayar.class;
        
        kitap_database = db.veri_cekme(veri_tipi_bilgisayar.getTypeName() , 1);
        Kitap python = new Bilgisayar( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) );
        
        kitap_database = db.veri_cekme(veri_tipi_bilgisayar.getTypeName() , 2);
        Kitap ag_teknolojileri = new Bilgisayar( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_bilgisayar.getTypeName() , 3);
        Kitap internet_for_dummies = new Bilgisayar( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)  );
        
        kitap_database = db.veri_cekme(veri_tipi_bilgisayar.getTypeName() , 4);
        Kitap oracle_veritabani = new Bilgisayar( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)  ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_bilgisayar.getTypeName() , 5);
        Kitap c_programlama = new Bilgisayar( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        ArrayList<Kitap> bilgisayar = new ArrayList<>() ;
        bilgisayar = listelenecekler( python , ag_teknolojileri , internet_for_dummies , oracle_veritabani , c_programlama ) ;
        
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_bilgisayar.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_bilgisayar.getTypeName()) ;
            Kitap kitap_b = new Bilgisayar(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            bilgisayar.add(kitap_b);
        }
        
        //Dini kitaplarin tanimlanmasi
        Class<Dini> veri_tipi_dini = Dini.class;
        
        kitap_database = db.veri_cekme(veri_tipi_dini.getTypeName() , 1);
        Kitap mukaddime = new Dini(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_dini.getTypeName() , 2);
        Kitap musned = new Dini(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_dini.getTypeName() , 3);
        Kitap tehafutul_felasife = new Dini(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_dini.getTypeName() , 4);
        Kitap mesnevi_bahcesi = new Dini(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_dini.getTypeName() , 5);
        Kitap mistik_kabala = new Dini(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
              
        ArrayList<Kitap> dini = new ArrayList<>() ;
        dini = listelenecekler( mukaddime , musned , tehafutul_felasife , mesnevi_bahcesi , mistik_kabala ) ;
     
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_dini.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_dini.getTypeName()) ;
            Kitap kitap_d = new Dini(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            dini.add(kitap_d);
        }
        
        //Felsefi kitaplarin tanimlanmasi
        Class<Felsefe> veri_tipi_felsefe = Felsefe.class;
        
        kitap_database = db.veri_cekme(veri_tipi_felsefe.getTypeName() , 1);
        Kitap devlet = new Felsefe(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_felsefe.getTypeName() , 2);
        Kitap das_kapital = new Felsefe(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_felsefe.getTypeName() , 3);
        Kitap savas_sanati = new Felsefe( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_felsefe.getTypeName() , 4);
        Kitap oryantalizm = new Felsefe(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_felsefe.getTypeName() , 5);
        Kitap toz = new Felsefe(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
         
        ArrayList<Kitap> felsefe = new ArrayList<>() ;
        felsefe = listelenecekler( devlet , das_kapital , savas_sanati , oryantalizm , toz ) ;       
        
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_felsefe.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_felsefe.getTypeName()) ;
            Kitap kitap_f = new Felsefe(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            felsefe.add(kitap_f);
        }
        
        //Tarih kitaplarinin tanimlanmasi
        Class<Tarih> veri_tipi_tarih = Tarih.class;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 1);
        Kitap cecen = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
       
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 2);
        Kitap hititler = new Tarih( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 3);
        Kitap guzel_tarih = new Tarih( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 4);
        Kitap hayatim = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 5);
        Kitap turklerin_tarihi = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        ArrayList<Kitap> tarih = new ArrayList<>() ;
        tarih = listelenecekler(cecen, hititler, guzel_tarih, hayatim, turklerin_tarihi) ;
        
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_tarih.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_tarih.getTypeName()) ;
            Kitap kitap_t = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            tarih.add(kitap_t);
        }
        
        //Egitim kitaplarinin tanimlanmasi
        Class<Egitim> veri_tipi_egitim = Egitim.class;
        
        kitap_database = db.veri_cekme(veri_tipi_egitim.getTypeName() , 1);
        Kitap collins = new Egitim( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_egitim.getTypeName() , 2);
        Kitap gokdelenler = new Egitim( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_egitim.getTypeName() , 3);
        Kitap anne_baba = new Egitim( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_egitim.getTypeName() , 4);
        Kitap yuksek_ogretim = new Egitim( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_egitim.getTypeName() , 5);
        Kitap ingilizce = new Egitim( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        ArrayList<Kitap> egitim = new ArrayList<>() ;
        egitim = listelenecekler(collins, gokdelenler, anne_baba, yuksek_ogretim, ingilizce) ;
        
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_egitim.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_egitim.getTypeName()) ;
            Kitap kitap_e = new Egitim(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            egitim.add(kitap_e);
        }
        
        OUTER:
        while (true) {
            kategoriler_listele();
            int sorgu = klavye.nextInt() ;
            
            switch (sorgu) {
                case 0:
                    break OUTER;
                case 1:
                    klasikler = kategoriler(klasikler, klavye , sorgu );
                    listele(klasikler , sorgu );
                    break;
                case 2:
                    bilgisayar = kategoriler(bilgisayar, klavye , sorgu );
                    listele(bilgisayar , sorgu );
                    break;
                case 3:
                    felsefe = kategoriler(felsefe, klavye , sorgu ) ;
                    listele(felsefe , sorgu );
                    break;
                case 4:
                    dini = kategoriler(dini, klavye , sorgu ) ;
                    listele(dini , sorgu );
                    break;
                case 5:
                    tarih = kategoriler(tarih, klavye , sorgu);
                    listele(tarih , sorgu );
                    break;
                case 6:
                    egitim = kategoriler(egitim, klavye, sorgu) ;
                    listele(egitim , sorgu );
                    break;
                default:
                    System.out.println("\nHatali Giris...\n");
                    break;
            }
        }
    }
}
