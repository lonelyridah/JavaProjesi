package kitap_yayinciligi;

public class Tarih extends Kitap implements Kitap_Interface
{
    private String kitabin_turu ;
    
    //Constructor Methods
    Tarih()
    {
        this.kitabin_turu = "Tarih" ;
    }
    Tarih( String kitabin_adi , String yazarin_adi , String yayin_evi , 
           int sayfa_sayisi , int basim_yili , String ISBN_num , int fiyat , String kitabin_turu )
    {
        super( kitabin_adi , yazarin_adi , yayin_evi , sayfa_sayisi , basim_yili , ISBN_num , fiyat ) ;
        this.kitabin_turu = kitabin_turu ;
    }
    
    @Override
    public void ozellikleri_yazdir()
    {
        super.ozellikleri_yazdir();
        System.out.print("Kitabin Turu : " + kitabin_turu + "\n\n" );
    }    

    @Override
    public void Kitap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Kitap(String kitabin_adi, String yazarin_adi, String yayin_evi, int sayfa_sayisi, int basim_yili, String ISBN_num, int fiyat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}