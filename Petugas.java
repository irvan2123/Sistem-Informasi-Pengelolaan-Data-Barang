/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IRFAN
 */
public class Petugas {
    private String nama; 
    private String IDPetugas;
    private int umur;
    private String alamat;
    
    public Petugas(String nama, String IDPetugas, int umur, String alamat) {
        this.nama = nama;
        this.IDPetugas = IDPetugas;
        this.umur = umur;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIDPetugas() {
        return IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        this.IDPetugas = IDPetugas;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    
    
}
