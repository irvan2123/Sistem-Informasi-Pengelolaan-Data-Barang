/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANIEL TANTA CHRISTOPHER (1301150054)
 */
public class Gudang {
    private Barang[] daftarBarang = new Barang[50]; // Asumsikan ada 50 barang
    private String namapetugas;
    private String alamat;
    private int jumlahBarang;
   

    public Gudang(String namapetugas, String alamat, int maxJumBarang) {
        this.namapetugas = namapetugas;
        this.alamat = alamat;
        this.daftarBarang = new Barang[maxJumBarang];
    }
    
    public void tambahBarang(Barang b){
        while (this.jumlahBarang < this.daftarBarang.length) {
            daftarBarang[jumlahBarang] = b;
            this.jumlahBarang = jumlahBarang + 1; 
        }
    
}

    public Barang getDaftarBarang() {
        for (int i = 0; i < daftarBarang.length; i++) {
            return daftarBarang[i];
        }
        return null;
    }


    public String getNamapetugas() {
        return namapetugas;
    }

    public void setNamapetugas(String namapetugas) {
        this.namapetugas = namapetugas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void removeBarang(int idx) {
        for (int i = idx; i < daftarBarang.length-1; i++) {
            daftarBarang[i] = daftarBarang[i+1];
        }
        jumlahBarang = jumlahBarang-1;
    }
    
    
    
    
    
}