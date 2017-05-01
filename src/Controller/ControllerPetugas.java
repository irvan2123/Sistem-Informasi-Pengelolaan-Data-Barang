/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Petugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author DANIEL
 */

public class ControllerPetugas extends MouseAdapter implements ActionListener {
    private ArrayList<Petugas> daftarBarang;
    private Petugas view;
    
     public ControllerPetugas(){
        daftarBarang = new ArrayList();
        view = new Petugas();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true);
    }

     @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnOk())){
            try {
                
            } catch (Exception e) {
            }
        } else {
            
        }
    }
}