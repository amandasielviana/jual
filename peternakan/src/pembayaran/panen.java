/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author asus
 */

public class panen {
    private String idpanen;
    private String harga;
    private String total;

    public panen(String idpanen, String harga, String total) {
        this.idpanen = idpanen;
        this.harga = harga;
        this.total = total;
    }

    public String getidpanen() {
        return idpanen;
    }

    public void setidpanen(String idPanen) {
        this.idpanen = idpanen;
    }

    public String getharga() {
        return harga;
    }

    public void setharga(String harga) {
        this.harga = harga;
    }

    public String gettotal() {
        return total;
    }

    public void settotal(String total) {
        this.total = total;
    }

    public void tampilkanInfo() {
        System.out.println("id panen: " + idpanen);
        System.out.println("harga: " + harga);
        System.out.println("total: " + total);
    }
}
