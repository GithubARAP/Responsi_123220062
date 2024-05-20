/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datahewan {
    private int id;
    private String nama;
    private String kelas;
    private String jenis_makanan;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getJenis(){
        return jenis_makanan;
    }
    
    public void setJenis(String jenis_makanan){
        this.jenis_makanan = jenis_makanan;
    }
    
}
