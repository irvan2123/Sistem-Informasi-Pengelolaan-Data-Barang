/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import View.Menu;
/**
 *
 * @author IRFAN
 */
    public class ControllerMenu extends MouseAdapter implements ActionListener {
        private Menu view;
        
        public ControllerMenu(){
        view = new Menu();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent ae) {
            Object source = ae.getSource();
            if(source.equals(view.getBtnAddBarang())){
                ControllerGudang cg = new ControllerGudang();
                view.dispose();
            } else if(source.equals(view.getBtnAddPetugas())){
                ControllerPetugas cp = new ControllerPetugas();
                view.dispose();
            } else if (source.equals(view.getBtnViewGudang())){
                ControllerGudang cg = new ControllerGudang();
                view.dispose();
            }
            
        }
    }
