/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Kelas.Aplikasi;
import View.LoginPenyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IRFAN
 */
public class ControllerLoginPenyedia implements ActionListener{
    private Aplikasi app;
    private LoginPenyedia view;

    public ControllerLoginPenyedia(){
        view = new LoginPenyedia();
        view.setVisible(true);
        view.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnOk())) {
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }    
}