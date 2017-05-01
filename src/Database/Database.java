/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Kelas.Barang;
import Kelas.Penyedia;
import Kelas.Petugas;
import Kelas.Gudang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author IRFAN
 */
public class Database {
    
    private Connection connection;
    private String address;
    private String username;
    private String password;
    
    
    private void connect(){
        this.address = "jdbc:mysql://localhost:3306/user";
        this.username = "admin";
        this.password = "admin";
        
        try{
            connection = DriverManager.getConnection(address, username, password);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            System.out.println("Connected successfully!");
        } catch(SQLException e){
            System.out.println("Connection failed");
        }
    }
    
    public void saveBarang(Barang b){
        try{
            Statement s = connection.createStatement();
            String query = "INSERT INTO `barang`(`IDBarang`, `NamaBarang`, `Harga`, `JumlahBarang`) "
                    + "VALUES (,'"+b.getNamaBarang()+"','"+b.getHarga()+"','"+b.getJumlahBarang()+"')";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    
    public void savePetugas(Petugas p){
        try{
            Statement s = connection.createStatement();
            String query = "INSERT INTO `petugas`(`IDPetugas`, `NamaPetugas`, `Umur_Petugas`, `Alamat_Petugas`,`maxJumlahBarang`) "
                    + "VALUES (,'"+p.getIDPetugas()+"','"+p.getNama()+"','"+p.getUmur()+"','"+p.getAlamat()+")";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    public void savePenyedia(Penyedia py){
        try{
            Statement s = connection.createStatement();
            String query = "INSERT INTO `penyedia`(`ID_Penyedia`, `Nama_Penyedia`, `Alamat_Penyedia`, `Umur_Penyedia`,`JumlahBarang`) "
                    + "VALUES (,'"+py.getIDPenyedia()+"','"+py.getNama()+"','"+py.getAlamat()+"','"+py.getUmur()+"','"+py.getJumlahBarang()+")";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    public void saveGudang(Gudang g){
        try{
            Statement s = connection.createStatement();
            String query = "INSERT INTO `gudang`(`IDGudang`, `AlamatGudang`) "
                    + "VALUES (,'"+g.getIDGudang()+"','"+g.getAlamat()+")";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    public void deleteBarang(Barang b){
        try{
            Statement s = connection.createStatement();
            String query = "DELETE FROM `barang` WHERE IDBarang='"+b.getIDBarang()+"'";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    public void deleteGudang(Gudang g){
        try{
            Statement s = connection.createStatement();
            String query = "DELETE FROM `gudang` WHERE IDGudang='"+g.getIDGudang()+"'";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    public void deletePenyedia(Penyedia py){
        try{
            Statement s = connection.createStatement();
            String query = "DELETE FROM `penyedia` WHERE ID_Penyedia='"+py.getIDPenyedia()+"'";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
    public void deletePetugas(Petugas p){
        try{
            Statement s = connection.createStatement();
            String query = "DELETE FROM `petugas` WHERE IDPetugas='"+p.getIDPetugas()+"'";
            
            //System.out.println(query);
            
            s.execute(query);
            connection.commit();
            s.close();
        } catch(SQLException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
