/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistempeternakan;
import CRUD.database;
        
/**
 *
 * @author asus
 */
public class Sistempeternakan {
    public static void main(String[] args) {
        database dbconnect = new database();
        //Tabel uji
        //dbconnect.simpanuji("1", "Amanda", "081953535353", "Sultan Adam");
        //dbconnect.ubahuji("1", "Amanda", "08235656", "Bunyamin");
        //dbconnect.hapusuji("1");
    
        //Tabel barang
        //dbconnect.simpantb_barang("01", "laptop", "7000000", "1");
        //dbconnect.ubahtb_barang("01", "laptop", "6000000", "1");
        //dbconnect.hapustb_barang("01");
    
        //Tabel kandang
        //dbconnect.simpantb_kandang("1", "01", "admin", "kandang ayam", "900");
        //dbconnect.ubahtb_kandang("1", "02", "admin", "kandang ayam", "900");
        //dbconnect.hapustb_kandang("900");
        
        //Tabel panen
        //dbconnect.simpantb_panen("2", "10", "2022-01-23", "900000", "900000");
        //dbconnect.ubahtb_panen("2", "3", "2022-01-23", "900000", "900000");
        //dbconnect.hapustb_panen("900000");
        
        //Tabel pembayaran
        //dbconnect.simpantb_pembayaran("001", "01", "500000", "2022-02-19");
        //dbconnect.ubahtb_pembayaran("002", "01", "500000", "2022-02-19");
        //dbconnect.hapustb_pembayaran("01");
        dbconnect.datatb_pembayaran();
        
        //tb_pembayaran tb_pembayaran = new tb_pembayaran("002", "02", "600000", "2022-01-12");
        
        //tb_panen tb_panen = new tb_panen("4", "12", "2022-03-25", "800000", "800000");
        
        
//        System.out.println("Detail tb_pembayaran:");
//        System.out.println("id_pembayaran: " + tb_pembayaran.getid_pembayaran());
//        System.out.println("kd_pesan: " + tb_pembayaran.getkd_pesan());
//        System.out.println("total_bayar: " + tb_pembayaran.gettotal_bayar());
//        System.out.println("tgl_bayar: " + tb_pembayaran.gettgl_lahir());
    
//        System.out.println("\nDetail tb_panen");
//        System.out.println("id_panen: " + tb_panen.getid_panen());
//        System.out.println("id_pembibitan: " + tb_panen.getid_pembibitan());
//        System.out.println("tgl_panen: " + tb_panen.gettgl_panen());
//        System.out.println("harga: " + tb_panen.getharga());
//        System.out.println("total: " + tb_panen.gettotal());
    }  
    
}
    
  