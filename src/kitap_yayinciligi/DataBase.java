package kitap_yayinciligi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase 
{
    public ArrayList veri_cekme(String veri_tipi , int kitabin_numarasi_int)
    {
        ArrayList<String> veri = new ArrayList<>();
        String kitabin_numarasi_string = Integer.toString(kitabin_numarasi_int);
        
        if ( null != veri_tipi )
        switch (veri_tipi) {
            case "kitap_yayinciligi.Klasik":
                veri_tipi = "KLASIK" ;
                break;
            case "kitap_yayinciligi.Bilgisayar":
                veri_tipi = "BILGISAYAR" ;
                break;
            case "kitap_yayinciligi.Dini":
                veri_tipi = "DINI" ;
                break;
            case "kitap_yayinciligi.Felsefe":
                veri_tipi = "FELSEFE" ;
                break;
            case "kitap_yayinciligi.Tarih":
                veri_tipi = "TARIH";
                break;
            case "kitap_yayinciligi.Egitim":
                veri_tipi = "EGITIM";
                break;
            default:
                break;
        }
        
        try
        {
            String host = "jdbc:derby://localhost:1527/ProjeDB";
            String uName = "lonelyridah";
            String uPass= "1234";
        
            Connection con = DriverManager.getConnection( host, uName, uPass );
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM " + veri_tipi + " WHERE KITABIN_NUMARASI = " + kitabin_numarasi_string;
            ResultSet rs = stmt.executeQuery( SQL );
            
            while(rs.next( ))
            {
                int kitabin_numarasi = rs.getInt("kitabin_numarasi");
                String kitabin_adi = rs.getString("kitabin_adi");
                String yazarin_adi = rs.getString("yazarin_adi");
                String yayin_evi = rs.getString("yayin_evi");
                int sayfa_sayisi = rs.getInt("sayfa_sayisi");
                int basim_yili = rs.getInt("basim_yili");
                String ISBN_num = rs.getString("ISBN_num");
                int fiyat = rs.getInt("fiyat");
                String kitabin_turu = rs.getString("kitabin_turu");
                
                veri.add(Integer.toString(kitabin_numarasi));
                veri.add(kitabin_adi);
                veri.add(yazarin_adi);
                veri.add(yayin_evi);
                veri.add(Integer.toString(sayfa_sayisi));
                veri.add(Integer.toString(basim_yili));
                veri.add(ISBN_num);
                veri.add(Integer.toString(fiyat));
                veri.add(kitabin_turu);
            }
        }

        catch( SQLException err )
        {
            System.out.println(err.getMessage());
        }
        
        return veri ;
    }   

    public ArrayList veri_cekme_eklenenler(String veri_tipi)
    {
        ArrayList<String> veri = new ArrayList<>();
        
        if ( null != veri_tipi )
        switch (veri_tipi) {
            case "kitap_yayinciligi.Klasik":
                veri_tipi = "KLASIK" ;
                break;
            case "kitap_yayinciligi.Bilgisayar":
                veri_tipi = "BILGISAYAR" ;
                break;
            case "kitap_yayinciligi.Dini":
                veri_tipi = "DINI" ;
                break;
            case "kitap_yayinciligi.Felsefe":
                veri_tipi = "FELSEFE" ;
                break;
            case "kitap_yayinciligi.Tarih":
                veri_tipi = "TARIH";
                break;
            case "kitap_yayinciligi.Egitim":
                veri_tipi = "EGITIM";
                break;
            default:
                break;
        }
        
        try
        {
            String host = "jdbc:derby://localhost:1527/ProjeDB";
            String uName = "lonelyridah";
            String uPass= "1234";
        
            Connection con = DriverManager.getConnection( host, uName, uPass );
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM " + veri_tipi + " WHERE KITABIN_NUMARASI > 5" ;
            ResultSet rs = stmt.executeQuery( SQL );
            
            while(rs.next( ))
            {
                int kitabin_numarasi = rs.getInt("kitabin_numarasi");
                String kitabin_adi = rs.getString("kitabin_adi");
                String yazarin_adi = rs.getString("yazarin_adi");
                String yayin_evi = rs.getString("yayin_evi");
                int sayfa_sayisi = rs.getInt("sayfa_sayisi");
                int basim_yili = rs.getInt("basim_yili");
                String ISBN_num = rs.getString("ISBN_num");
                int fiyat = rs.getInt("fiyat");
                String kitabin_turu = rs.getString("kitabin_turu");
                
                veri.add(Integer.toString(kitabin_numarasi));
                veri.add(kitabin_adi);
                veri.add(yazarin_adi);
                veri.add(yayin_evi);
                veri.add(Integer.toString(sayfa_sayisi));
                veri.add(Integer.toString(basim_yili));
                veri.add(ISBN_num);
                veri.add(Integer.toString(fiyat));
                veri.add(kitabin_turu);
            }
        }

        catch( SQLException err )
        {
            System.out.println(err.getMessage());
        }
        
        return veri ;
    }
    public boolean veri_ekleme( String veri_tipi , ArrayList<String> kitap_nesnesi)
    {    
        int sorgu = 0 ;
        
        if ( null != veri_tipi )
        switch (veri_tipi) {
            case "kitap_yayinciligi.Klasik":
                veri_tipi = "KLASIK" ;
                break;
            case "kitap_yayinciligi.Bilgisayar":
                veri_tipi = "BILGISAYAR" ;
                break;
            case "kitap_yayinciligi.Dini":
                veri_tipi = "DINI" ;
                break;
            case "kitap_yayinciligi.Felsefe":
                veri_tipi = "FELSEFE" ;
                break;
            case "kitap_yayinciligi.Tarih":
                veri_tipi = "TARIH";
                break;
            case "kitap_yayinciligi.Egitim":
                veri_tipi = "EGITIM";
                break;
            default:
                break;
        }
        
        try
        {
            String host = "jdbc:derby://localhost:1527/ProjeDB";
            String uName = "lonelyridah";
            String uPass= "1234";
        
            int kitabin_numarasi = Integer.parseInt(kitap_nesnesi.get(0) );
            String kitabin_adi = kitap_nesnesi.get(1);
            String yazarin_adi = kitap_nesnesi.get(2);
            String yayin_evi = kitap_nesnesi.get(3);
            int sayfa_sayisi = Integer.parseInt(kitap_nesnesi.get(4) );
            int basim_yili = Integer.parseInt(kitap_nesnesi.get(5) );
            String ISBN_num = kitap_nesnesi.get(6);
            int fiyat = Integer.parseInt(kitap_nesnesi.get(7) );
            String kitabin_turu = kitap_nesnesi.get(8);
            
            Connection con = DriverManager.getConnection( host, uName, uPass );
            Statement stmt = con.createStatement();
            String SQL = String.format("INSERT INTO " + veri_tipi + "\nVALUES (" + kitabin_numarasi + ",'" + kitabin_adi + "'," + "'" + yazarin_adi + "'," + "'" + yayin_evi + "'," + sayfa_sayisi + "," + basim_yili + ",'" + ISBN_num + "'," + fiyat + ",'" + kitabin_turu + "')");
            
            sorgu = stmt.executeUpdate(SQL);
        }
        
        catch( SQLException err )
        {
            System.out.println(err.getMessage());
        }
        
        return ( sorgu > 0 ) ;
    }
    
    public boolean veri_silme(String veri_tipi , int kitabin_numarasi)
    {
        int sorgu = 0 ;
        
        String kitabin_numarasi_string = Integer.toString(kitabin_numarasi);
        
        if ( null != veri_tipi )
        switch (veri_tipi) {
            case "kitap_yayinciligi.Klasik":
                veri_tipi = "KLASIK" ;
                break;
            case "kitap_yayinciligi.Bilgisayar":
                veri_tipi = "BILGISAYAR" ;
                break;
            case "kitap_yayinciligi.Dini":
                veri_tipi = "DINI" ;
                break;
            case "kitap_yayinciligi.Felsefe":
                veri_tipi = "FELSEFE" ;
                break;
            case "kitap_yayinciligi.Tarih":
                veri_tipi = "TARIH";
                break;
            case "kitap_yayinciligi.Egitim":
                veri_tipi = "EGITIM";
                break;
            default:
                break;
        }
        
        try
        {
            String host = "jdbc:derby://localhost:1527/ProjeDB";
            String uName = "lonelyridah";
            String uPass= "1234";
            
            Connection con = DriverManager.getConnection( host, uName, uPass );
            Statement stmt = con.createStatement();
            String SQL = String.format("DELETE FROM " + veri_tipi + " WHERE KITABIN_NUMARASI = " + kitabin_numarasi_string);
            
            sorgu = stmt.executeUpdate(SQL);
        }
        
        catch( SQLException err )
        {
            System.out.println(err.getMessage());
        }
        
        return ( sorgu > 0 ) ;
    }
    public int eklenen_kitap_sayisi(String veri_tipi)
    {
        int sonuc = 0 ;
        
        if ( null != veri_tipi )
        switch (veri_tipi) {
            case "kitap_yayinciligi.Klasik":
                veri_tipi = "KLASIK" ;
                break;
            case "kitap_yayinciligi.Bilgisayar":
                veri_tipi = "BILGISAYAR" ;
                break;
            case "kitap_yayinciligi.Dini":
                veri_tipi = "DINI" ;
                break;
            case "kitap_yayinciligi.Felsefe":
                veri_tipi = "FELSEFE" ;
                break;
            case "kitap_yayinciligi.Tarih":
                veri_tipi = "TARIH";
                break;
            case "kitap_yayinciligi.Egitim":
                veri_tipi = "EGITIM";
                break;
            default:
                break;
        }
         
        try
        {
            String host = "jdbc:derby://localhost:1527/ProjeDB";
            String uName = "lonelyridah";
            String uPass= "1234";
        
            Connection con = DriverManager.getConnection( host, uName, uPass );
            Statement stmt = con.createStatement();
            String SQL = "SELECT " + veri_tipi + " FROM EKLENENLER ";
            ResultSet rs = stmt.executeQuery( SQL );
            
            while (rs.next( ))
            {
                sonuc = rs.getInt(veri_tipi);
            }
        }
        
        catch( SQLException err )
        {
            System.out.println(err.getMessage());
        }
        
        return sonuc;
    }
    public boolean eklenen_kitap_sayisi_degistir(String veri_tipi,int islem)
    {
        int sorgu = 0 ;
        int eklenecek_deger = islem ;
        
        if ( null != veri_tipi )
        switch (veri_tipi) {
            case "kitap_yayinciligi.Klasik":
                veri_tipi = "KLASIK" ;
                break;
            case "kitap_yayinciligi.Bilgisayar":
                veri_tipi = "BILGISAYAR" ;
                break;
            case "kitap_yayinciligi.Dini":
                veri_tipi = "DINI" ;
                break;
            case "kitap_yayinciligi.Felsefe":
                veri_tipi = "FELSEFE" ;
                break;
            case "kitap_yayinciligi.Tarih":
                veri_tipi = "TARIH";
                break;
            case "kitap_yayinciligi.Egitim":
                veri_tipi = "EGITIM";
                break;
            default:
                break;
        }
        
        try
        {
            String host = "jdbc:derby://localhost:1527/ProjeDB";
            String uName = "lonelyridah";
            String uPass= "1234";
            
            Connection con = DriverManager.getConnection( host, uName, uPass );
            Statement stmt = con.createStatement();
            String SQL = String.format("INSERT INTO EKLENENLER("+veri_tipi+")\nVALUES (" + eklenecek_deger + ")") ;
           
            sorgu = stmt.executeUpdate(SQL);
        }
        
        catch( SQLException err )
        {
            System.out.println(err.getMessage());
        }
        
        return ( sorgu > 0 ) ;
    }
}
