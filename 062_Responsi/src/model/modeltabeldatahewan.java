/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC PRAKTIKUM
 */
public class modeltabeldatahewan extends AbstractTableModel {
    List<datahewan> dahe;
    public modeltabeldatahewan(List<datahewan>dahe){
        this.dahe = dahe;
    }
    
    @Override
    public int getRowCount(){
        return dahe.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
    
     @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Kelas";
            case 3:
                return "Jenis Makanan";
            default:
                return null;
        }
    }
    
     @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dahe.get(row).getId();
            case 1:
                return dahe.get(row).getNama();
            case 2:
                return dahe.get(row).getKelas();
            case 3:
                return dahe.get(row).getJenis();
            default:
                return null;
        }
    }
    
    
}

