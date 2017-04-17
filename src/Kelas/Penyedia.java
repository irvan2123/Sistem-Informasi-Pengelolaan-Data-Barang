/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author IRFAN
 */
public class Penyedia extends Orang{
    Barang[] daftarBarang = new Barang[50]; //asumsi barang yang tersedia ada 50
    private int jumlahBarang;
    
    public Penyedia (String nama, int umur, String alamat, int maxJumBarang , int jumlahBarang) {
        super(nama,umur,alamat);
        this.daftarBarang = new Barang[maxJumBarang];
        this.jumlahBarang = jumlahBarang;
    }
    
    public void tambahBarang (Barang b) {
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

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    
}
