/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Kelas.Aplikasi;
import Kelas.Barang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import View.Penyedia;

/**
 *
 * @author DANIEL
 */

public class ControllerPenyedia extends MouseAdapter implements ActionListener {
    private ArrayList<Barang> daftarBarang;
    private Penyedia view;
    private Aplikasi app;
    
     public ControllerPenyedia(){
        daftarBarang = new ArrayList();
        view = new Penyedia();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true);
    }

     @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnBack())){
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        } else if (source.equals(view.getBtnOk())){
            try {
                
            } catch (Exception e) {
            }
        }
    }
}
   