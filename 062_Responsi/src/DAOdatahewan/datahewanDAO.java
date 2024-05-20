/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdatahewan;
import java.sql.*;
import java.util.*;
import connect.konektor;
import model.*;
import DAOImplements.datahewanimplements;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datahewanDAO implements datahewanimplements {
    Connection connection;
    
    final String select = "select * from hewan;" ;
    final String insert = "INSERT INTO hewan (nama,kelas,jenis_makanan) VALUES (?,?,?);";
    final String update = "update hewan set nama=?, kelas=?, jenis_makanan=? where id=?";
    final String delete = "delete from hewan where nama=?";
    private String nama;

    @Override
    public void insert(datahewan m) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setInt(1, m.getId());
            statement.setString(2, m.getNama());
            statement.setString(3, m.getKelas());
            statement.setString(4, m.getJenis());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datahewan m) {
        PreparedStatement statement = null;
        try{
           statement = connection.prepareStatement(update);
            statement.setInt(1, m.getId());
            statement.setString(2, m.getNama());
            statement.setString(3, m.getKelas());
            statement.setString(4, m.getJenis());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String Nama) {
         PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, nama);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datahewan> getAll() {
        List<datahewan> dahe = null;
        try{
            dahe = new ArrayList<>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datahewan hewan = new datahewan();
                hewan.setId(rs.getInt("id"));
                hewan.setNama(rs.getString("nama"));
                hewan.setKelas(rs.getString("kelas"));
                hewan.setJenis(rs.getString("jenis_makanan"));
                dahe.add(hewan);
            }
        }catch(SQLException ex){
            Logger.getLogger(datahewanDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return dahe;
    }
}
