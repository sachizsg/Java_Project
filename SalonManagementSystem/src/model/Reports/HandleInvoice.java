/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Reports;

import com.mysql.jdbc.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.SalonDatabase.DatabaseConnection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Samu
 */
public class HandleInvoice {
    private String reportSource;
    private String invoiceID;

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }
    
    public JasperPrint printInvoice()
    {
        
        
        JasperPrint jasperPrint = null;
        try
        {
            DatabaseConnection dbc = new DatabaseConnection();
            Connection con = (Connection) dbc.getConnection();
            Map<String, Object> params = new HashMap<>();
            
            params.put("ID", getInvoiceID());
            
            JasperReport jasperReport = JasperCompileManager.compileReport(getReportSource());
            jasperPrint = JasperFillManager.fillReport(jasperReport, params, con);
            
            
            
        } 
        catch (JRException jRException)
        {
            JOptionPane.showMessageDialog(null, jRException.getMessage());
        }
        catch(Exception e)
        {	
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
        
        return jasperPrint;
    }
    
    
    
    
}
