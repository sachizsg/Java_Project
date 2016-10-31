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
public class HandleIncomeReport {
    
    private String reportSource;   
    private String date;
    
    private String startDate;
    private String endDate;
    
    

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public JasperPrint dailyReport()
    {
        
        
        JasperPrint jasperPrint = null;
        try
        {
            DatabaseConnection dbc = new DatabaseConnection();
            Connection con = (Connection) dbc.getConnection();
            Map<String, Object> params = new HashMap<>();            
            
            params.put("date1", getDate());
            
            
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
    
    
    public JasperPrint monthlyReport()
    {
        
        
        JasperPrint jasperPrint = null;
        try
        {
            DatabaseConnection dbc = new DatabaseConnection();
            Connection con = (Connection) dbc.getConnection();
            Map<String, Object> params = new HashMap<>();            
            
            params.put("date1", getStartDate());
            params.put("date2", getEndDate());
            
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    
    
    
    
    
}
