/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author IRFAN
 */
public class Handler extends MouseAdapter implements ActionListener {
    private ArrayList<Petugas> daftarPetugas;
    private Petugas view;
    
    public Handler(){
        daftarPetugas = new ArrayList();
        view = new Petugas();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true);
    }

    private String[] getDaftarPetugas(){
        String[] daftarIDPetugas = new String[daftarPetugas.size()];
        for (int i=0;i<daftarIDPetugas.length;i++){
            daftarIDPetugas[i] = daftarPetugas.get(i).getIDPetugas();
        }
        return daftarIDPetugas;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnAdd())){
            String nama = view.getNama();
            char jenisKelamin = view.getJenisKelamin();
            ArrayList<String> pelajaran = view.getPelajaran();
            String jadwal = view.getJadwal();
            Peserta p = new Peserta(nama, jenisKelamin, pelajaran, jadwal);
            daftarPeserta.add(p);
            view.resetView();
            view.setId(Peserta.getId());
            view.setDaftarPeserta(getDaftarPeserta());
        }
        else if (source.equals(view.getBtnDelete())){
            int i = view.getSelectedPeserta();
            daftarPeserta.remove(i);
            view.resetView();;
            view.setId(Peserta.getId());
            view.setDaftarPeserta(getDaftarPeserta());
        }
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getListPeserta())){
            int i = view.getSelectedPeserta();
            Peserta p = daftarPeserta.get(i);
            view.setTextPeserta(p.toString());
        }
    }
}
