/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;
import java.util.List;
import model.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public interface datahewanimplements {
    public void insert(datahewan m);
    public void update(datahewan m);
    public void delete(String Nama);
    public List<datahewan> getAll();
}
