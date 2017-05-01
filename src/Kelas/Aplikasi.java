/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

import java.util.ArrayList;

/**
 *
 * @author lailis
 */
public class Aplikasi {
    ArrayList<Barang> daftarBarang; 
    ArrayList<Petugas> daftarPetugas;
    ArrayList<Gudang> daftarGudang;
    ArrayList<Penyedia> daftarPenyedia;
    int jumlahPenyedia;
    int jumlahPetugas;
    int jumlahBarang;

    public ArrayList<Barang> daftarBarang(){
       return daftarBarang;
    }
   public ArrayList<Penyedia> daftarPenyedia(){
       return daftarPenyedia;
   }
   public ArrayList<Petugas> daftarPetugas(){
       return daftarPetugas;
   }
   public ArrayList<Gudang> daftarGudang(){
       return daftarGudang;
   }
   
   public void addPenyedia (String nama, int umur, String alamat, int maxJumBarang , int jumlahBarang){
       Penyedia p = new Penyedia(nama,umur,alamat,maxJumBarang,jumlahBarang);
       daftarPenyedia.set(jumlahPenyedia, p);
       this.jumlahPenyedia = jumlahPenyedia + 1;
   }
    public void addPetugas (String nama, int umur, String alamat,String IDPetugas, int maxJumBarang){
        Petugas pg = new Petugas (nama,umur,alamat,IDPetugas,maxJumBarang);
        daftarPetugas.set(jumlahPetugas, pg);
        this.jumlahPetugas = jumlahPetugas + 1;
    }
    public Petugas getPetugas(String idPetugas){
        Petugas pg = null;
        for (int i = 0;i<jumlahPetugas; i++){
            if (daftarPetugas.get(i).getIDPetugas().equals(idPetugas)) {
                return pg;
            }
        }
        return null;
   }
    
    public Penyedia getPenyedia(String idPenyedia){
        Penyedia p = null;
        for (int i = 0; i < jumlahPenyedia; i++) {
            if(daftarPenyedia.get(i).getIDPenyedia().equals(idPenyedia)){
                return p;
            }
        }
        return null;
    }
    
    public void addBarang (String namaBarang, int harga, int jumlahBarang) {
        Barang b = new Barang (namaBarang,harga,jumlahBarang);
        daftarBarang.set(jumlahBarang, b);
        this.jumlahBarang = jumlahBarang + 1;
    }
    public void deletePetugas (String IDPetugas){
        for (int i = 0;i<jumlahPetugas; i++){
            if (daftarPetugas.get(i).getIDPetugas().equals(IDPetugas)) {
                jumlahPetugas = jumlahPetugas-1;
            }
        }
    }
   public void deleteBarang (String IDBarang){
      for (int i = 0;i<jumlahBarang; i++){
            if (daftarBarang.get(i).getIDBarang().equals(IDBarang)) {
                jumlahBarang = jumlahBarang-1;
            }
        }
    }
}