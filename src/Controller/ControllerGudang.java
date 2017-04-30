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
import View.Gudang;

/**
 *
 * @author IRFAN
 */
public class ControllerGudang extends MouseAdapter implements ActionListener {
    private ArrayList<Petugas> daftarBarang;
    private Gudang view;
    
    public ControllerGudang(){
        daftarBarang = new ArrayList();
        view = new Gudang();
        view.addActionListener(this);
        view.setVisible(true);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnBack())){
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
    } else {
            if(source.equals(view.getBtnRemove())){
            int i = view.getSelectedBarang();
            daftarBarang.remove(i);
            view.resetView();;
            view.setId(getId());
            view.
            view.setDaftarPetugas(getDaftarPetugas());
            }
        }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
      
        }
    }
}
