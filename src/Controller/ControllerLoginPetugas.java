/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Kelas.Aplikasi;
import View.LoginPenyedia;
import View.LoginPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IRFAN
 */
public class ControllerLoginPetugas {
    private Aplikasi app;
    private LoginPetugas view;

    public ControllerLoginPetugas(){
        view = new LoginPetugas();
        view.setVisible(true);
        view.addActionListener((ActionListener) this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnOk())) {
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }    
}

