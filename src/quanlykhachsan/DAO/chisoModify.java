/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import quanlykhachsan.DTO.chisoDTO;

/**
 *
 * @author Duy Minh
 */
public class chisoModify {
    ConnectDataBase c;
    
    public chisoModify() throws SQLException{
        c= new ConnectDataBase();
    }
     public List<chisoDTO> findAll() throws SQLException {

        List<chisoDTO> chisoList = new ArrayList<>();

        String sql = "select * from chiso";

        ResultSet result = c.executeQuery(sql);
        while (result.next()) {
            chisoDTO cs;
            cs = new chisoDTO(result.getString(1),
                    result.getString(2),
                    result.getString(3));
            chisoList.add(cs);
        }

        return chisoList;
    }

    public boolean insert(chisoDTO cs) throws SQLException {

        String sql = "insert into chiso values (?,?,?) ";
        String[] arr = {cs.getMachiso(),cs.getTenchiso(),cs.getChiso()};
        int r = c.callProcedure(sql, arr);
        return r > 0;
    }

    public boolean update(chisoDTO cs) throws SQLException {

        String sql = "update chiso set tenchiso = ?,chiso = ? where machiso = ?";
        String[] arr = {cs.getTenchiso(),cs.getChiso(),cs.getMachiso()};
        int r = c.executeUpdate(sql, arr);
        return r > 0;

    }

    public boolean delete(chisoDTO cs) throws SQLException {

        String sql = "delete from chiso where machiso = ?";  
        String[] arr = { cs.getMachiso() };
        int r = c.callProcedure(sql,arr);
        return r > 0;
        

    }
}
