/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Kelas.Aplikasi;
import View.LoginPenyedia;
import View.LoginPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author IRFAN
 */
public class ControllerLoginPetugas {
    private Aplikasi app;
    private LoginPetugas view;
    private Database db;

    public ControllerLoginPetugas(Aplikasi app, Database db){
        view = new LoginPetugas();
        this.app = app;
        this.db = db;
        view.setVisible(true);
        view.addActionListener((ActionListener) this);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnOk())) {
            try {
                if(view.getUsername() == view.getUsername()){
                    if(view.getPassword() == view.getPassword()){
                        ControllerMenu cm = new ControllerMenu();
                        view.dispose();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(view, "Salah username atau Password");
            }
        }
    }    
}

