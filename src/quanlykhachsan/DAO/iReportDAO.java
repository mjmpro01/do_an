/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Duy Minh
 */
public class iReportDAO {
    ConnectDataBase c;
    public iReportDAO() throws SQLException{
        c = new ConnectDataBase(); 
    }
    public void baobieuphong() throws JRException{
       
        String dir = "C:\\Users\\Duy Minh\\Desktop\\java\\QuanLyKhachSan\\src\\iReport\\report1-2.jrxml ";
        JasperDesign jd = JRXmlLoader.load(dir);
        JasperReport jr = JasperCompileManager.compileReport(dir);
        JasperPrint jp;
        jp = JasperFillManager.fillReport(jr, new HashMap<>(), c.getConnection());
        JasperViewer jv;
        jv = new JasperViewer(jp, false);
        jv.setVisible(true);
    }
}

