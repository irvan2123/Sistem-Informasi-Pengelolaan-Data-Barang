/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author lailis
 */
public class Aplikasi {
    Barang[] daftarBarang = new Barang[50];
    Petugas [] daftarPetugas = new Petugas [3];
    Gudang [] daftarGudang = new Gudang [50];
    Penyedia [] daftarPenyedia = new Penyedia [3];
    int jumlahPenyedia;
    int jumlahPetugas;

   public void addPenyedia (String nama, int umur, String alamat, int maxJumBarang , int jumlahBarang){
       Penyedia p = new Penyedia(nama,umur,alamat,maxJumBarang,jumlahBarang);
       daftarPenyedia [jumlahPenyedia] = p;
       this.jumlahPenyedia = jumlahPenyedia + 1;
   }
    public void addPetugas (String nama, int umur, String alamat,String IDPetugas, int maxJumBarang){
        Petugas pg = new Petugas (nama,umur,alamat,IDPetugas,maxJumBarang);
        daftarPetugas [jumlahPetugas] = pg;
        this.jumlahPetugas = jumlahPetugas + 1;
    }
    public Petugas getPetugas(String id){
        Petugas pg = null;
        for (int i = 0;i<jumlahPetugas; i++){
            if (daftarPetugas[i].getIDPetugas()== id) {
                return pg;
            }
        }
        return null;
   }
}
    
   

