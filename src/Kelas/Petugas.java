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
public class Petugas extends Orang {
    private String IDPetugas;
    private static int id = 1;
    private Barang[] daftarBarang = new Barang[50]; // Asumsikan ada 50 barang
    private int jumlahBarang;
    private String gudang;
    
    
    public Petugas(String nama, int umur, String alamat,String IDPetugas, int maxJumBarang) {
        super(nama,umur,alamat);
        IDPetugas = "Petugas- "+(id++);
        this.daftarBarang = new Barang[maxJumBarang];
    }

    public static int getId(){
        return id;
    }
    public String getIDPetugas() {
        return IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        this.IDPetugas = IDPetugas;
    }
    
    public String getGudang(){
        return gudang;
    }


     public void removeBarang(int idx) {
        for (int i = idx; i < daftarBarang.length-1; i++) {
            daftarBarang[i] = daftarBarang[i+1];
        }
        jumlahBarang = jumlahBarang-1;
    } 

}
