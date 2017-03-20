/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IRFAN
 */
public class Penyedia {
    private String nama;
    private Barang[] daftarBarang = new Barang[50]; //asumsi barang yang tersedia ada 50
    private String alamat;
    private int jumlahBarang;
    
    public Penyedia (String nama, String alamat , int maxJumBarang , int jumlahBarang) {
        this.alamat = alamat;
        this.nama = nama;
        this.daftarBarang = new Barang[maxJumBarang];
        this.jumlahBarang = jumlahBarang;
    }
    
    public void tambahBarang (Barang b) {
        while (this.getJumlahBarang() < this.getDaftarBarang().length) {
            getDaftarBarang()[getJumlahBarang()] = b;
            this.setJumlahBarang(this.getJumlahBarang() + 1);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Barang[] getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(Barang[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    
}
