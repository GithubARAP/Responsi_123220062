/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import java.util.ArrayList;
import DAOdatahewan.datahewanDAO;
import DAOImplements.datahewanimplements;
import model.*;
import view.mainview;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datahewancontroller {
    mainview frame;
    datahewanimplements impldatahewan;
    List<datahewan> dahe;
    
    public datahewancontroller(mainview frame){
        this.frame = frame;
        impldatahewan = new datahewanDAO();
        dahe = impldatahewan.getAll();
    }
    
     public void isitabel(){
        dahe = impldatahewan.getAll();
        modeltabeldatahewan mp = new modeltabeldatahewan(dahe);
        frame.getTabelDatahewan().setModel(mp);
    }}