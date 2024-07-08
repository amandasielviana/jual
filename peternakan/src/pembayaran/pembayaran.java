/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author asus
 */
public class pembayaran {
    private String id_pembayaran;
    private String kd_pesan;
    private panen total_bayar ;

    public pembayaran(String id_pembayaran, String kd_pesan, panen total_bayar) {
        this.id_pembayaran = id_pembayaran;
        this.kd_pesan = kd_pesan;
        this.total_bayar = total_bayar;
    }

    public String getid_pembayaran() {
        return id_pembayaran;
    }

    public void setid_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getkd_pesan() {
        return kd_pesan;
    }

    public void setkd_pesan(String kd_pesan) {
        this.kd_pesan = kd_pesan;
    }

    public panen gettotal_bayar() {
        return total_bayar;
    }

    public void settotal_bayar(panen total_bayar) {
        this.total_bayar = total_bayar;
    }

    public void tampilkanInfo() {
        System.out.println("id_pembayaran: " + id_pembayaran);
        System.out.println("kd_pessan : " + kd_pesan);
        total_bayar.tampilkanInfo();
    }
}

