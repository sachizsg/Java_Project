/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Inventory;


import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Inventory.HandleStocks;
import model.Inventory.HandleSupplier;
import net.proteanit.sql.DbUtils;
import view.MainMenu.MainMenu;

/**
 *
 * @author Sachithra
 */
public class Inventory extends javax.swing.JFrame {
    private final ImageIcon btn1;
    private final ImageIcon btn2;
    private final ImageIcon btn3;
    private final ImageIcon btn4;
    
    private final ImageIcon deleteup;
    private final ImageIcon deletedwn;
    
    private final ImageIcon updateup;
    private final ImageIcon updatedwn;
    
    private final ImageIcon addup;
    private final ImageIcon adddwn;
    
    private final ImageIcon updatestkup;
    private final ImageIcon updatestkdwn;
    
    private final ImageIcon searchout;
    private final ImageIcon searchenter;
    
    private final ImageIcon backout;
    private final ImageIcon backenter;
    

    public Inventory() {
        initComponents();
        btn1  = new ImageIcon(getClass().getResource("/view/Inventory/stks.png"));
        btn2 = new ImageIcon(getClass().getResource("/view/Inventory/stockbuttons.png"));
        btn3  = new ImageIcon(getClass().getResource("/view/Inventory/sups.png"));
        btn4 = new ImageIcon(getClass().getResource("/view/Inventory/suppliersbuttos.png"));
        
        deleteup = new ImageIcon(getClass().getResource("/view/Inventory/delete.png"));
        deletedwn = new ImageIcon(getClass().getResource("/view/Inventory/deletebtn.png"));
        updateup = new ImageIcon(getClass().getResource("/view/Inventory/update.png"));
        updatedwn = new ImageIcon(getClass().getResource("/view/Inventory/updatebtn.png"));
        addup = new ImageIcon(getClass().getResource("/view/Inventory/add.png"));
        adddwn = new ImageIcon(getClass().getResource("/view/Inventory/addbtn.png"));
        updatestkup = new ImageIcon(getClass().getResource("/view/Inventory/updstk.png"));
        updatestkdwn = new ImageIcon(getClass().getResource("/view/Inventory/updstkbtn.png"));
        
        searchout = new ImageIcon(getClass().getResource("/view/Inventory/searchOut.png"));
        searchenter = new ImageIcon(getClass().getResource("/view/Inventory/searchEnter.png"));
        
        backout = new ImageIcon(getClass().getResource("/view/Inventory/backOut.png"));
        backenter = new ImageIcon(getClass().getResource("/view/Inventory/backEnter.png"));
        
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        
        setIcon();
        
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addstocks = new javax.swing.JLabel();
        updatestocks = new javax.swing.JLabel();
        deletestocks = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stock = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        searchstocktxt = new javax.swing.JTextField();
        updatestock = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        deletesup = new javax.swing.JLabel();
        addsup = new javax.swing.JLabel();
        updatesup = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplier = new javax.swing.JTable();
        searchbtn = new javax.swing.JLabel();
        searchsuptxt = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stockbtn = new javax.swing.JLabel();
        supplierbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1326, 585));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addstocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/addbtn.png"))); // NOI18N
        addstocks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addstocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addstocksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addstocksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addstocksMouseExited(evt);
            }
        });
        jPanel2.add(addstocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 527, -1, -1));

        updatestocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/updatebtn.png"))); // NOI18N
        updatestocks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatestocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatestocksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatestocksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatestocksMouseExited(evt);
            }
        });
        jPanel2.add(updatestocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 527, -1, -1));

        deletestocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/deletebtn.png"))); // NOI18N
        deletestocks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletestocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletestocksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletestocksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletestocksMouseExited(evt);
            }
        });
        jPanel2.add(deletestocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 527, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1286, 460));

        stock.setBackground(new java.awt.Color(204, 204, 204));
        stock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Stock ID", "Name", "Comnany Name", "Price", "Stock Level", "Reorder Level"
            }
        ));
        stock.setFillsViewportHeight(true);
        stock.setRowHeight(25);
        jScrollPane2.setViewportView(stock);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/searchOut.png"))); // NOI18N
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 543, 30, 25));

        searchstocktxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchstocktxt.setPreferredSize(new java.awt.Dimension(300, 30));
        searchstocktxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchstocktxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchstocktxtMouseExited(evt);
            }
        });
        searchstocktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchstocktxtKeyReleased(evt);
            }
        });
        jPanel2.add(searchstocktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 300, 30));

        updatestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/updstkbtn.png"))); // NOI18N
        updatestock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatestockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatestockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatestockMouseExited(evt);
            }
        });
        jPanel2.add(updatestock, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 527, -1, -1));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/backOut.png"))); // NOI18N
        backbtn.setText("jLabel5");
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.setPreferredSize(new java.awt.Dimension(150, 51));
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbtnMouseExited(evt);
            }
        });
        jPanel2.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/Background1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/salonimglogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 310, 90));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletesup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/deletebtn.png"))); // NOI18N
        deletesup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletesup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletesupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletesupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletesupMouseExited(evt);
            }
        });
        jPanel3.add(deletesup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 527, -1, -1));

        addsup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/addbtn.png"))); // NOI18N
        addsup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addsup.setMaximumSize(new java.awt.Dimension(150, 51));
        addsup.setMinimumSize(new java.awt.Dimension(150, 51));
        addsup.setPreferredSize(new java.awt.Dimension(150, 51));
        addsup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addsupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addsupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addsupMouseExited(evt);
            }
        });
        jPanel3.add(addsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 527, -1, -1));

        updatesup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/updatebtn.png"))); // NOI18N
        updatesup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatesup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatesupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatesupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatesupMouseExited(evt);
            }
        });
        jPanel3.add(updatesup, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 527, -1, -1));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1286, 460));

        supplier.setBackground(new java.awt.Color(204, 204, 204));
        supplier.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Supplier ID", "First Name", "Last Name", "Company Name", "Contact Number", "Address", "City", "Email"
            }
        ));
        supplier.setFillsViewportHeight(true);
        supplier.setRowHeight(25);
        jScrollPane3.setViewportView(supplier);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/searchOut.png"))); // NOI18N
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 543, 30, 25));

        searchsuptxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchsuptxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchsuptxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchsuptxtMouseExited(evt);
            }
        });
        searchsuptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchsuptxtKeyReleased(evt);
            }
        });
        jPanel3.add(searchsuptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 300, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/backOut.png"))); // NOI18N
        back.setText("jLabel5");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setPreferredSize(new java.awt.Dimension(150, 51));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/Background1.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        stockbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/stks.png"))); // NOI18N
        stockbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockbtnMouseClicked(evt);
            }
        });
        jPanel1.add(stockbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 10, 200, 75));

        supplierbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/suppliersbuttos.png"))); // NOI18N
        supplierbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierbtnMouseClicked(evt);
            }
        });
        jPanel1.add(supplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 10, 200, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addstocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstocksMouseEntered
         addstocks.setIcon(addup);
    }//GEN-LAST:event_addstocksMouseEntered

    private void addstocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstocksMouseExited
         addstocks.setIcon(adddwn);
    }//GEN-LAST:event_addstocksMouseExited

    private void updatestocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestocksMouseEntered
         updatestocks.setIcon(updateup);
    }//GEN-LAST:event_updatestocksMouseEntered

    private void updatestocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestocksMouseExited
         updatestocks.setIcon(updatedwn);
    }//GEN-LAST:event_updatestocksMouseExited

    private void deletestocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletestocksMouseEntered
         deletestocks.setIcon(deleteup);
    }//GEN-LAST:event_deletestocksMouseEntered

    private void deletestocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletestocksMouseExited
         deletestocks.setIcon(deletedwn);
    }//GEN-LAST:event_deletestocksMouseExited

    private void deletesupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletesupMouseEntered
         deletesup.setIcon(deleteup);
    }//GEN-LAST:event_deletesupMouseEntered

    private void deletesupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletesupMouseExited
         deletesup.setIcon(deletedwn);
    }//GEN-LAST:event_deletesupMouseExited

    private void addsupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addsupMouseEntered
         addsup.setIcon(addup);
    }//GEN-LAST:event_addsupMouseEntered

    private void addsupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addsupMouseExited
         addsup.setIcon(adddwn);
    }//GEN-LAST:event_addsupMouseExited

    private void updatesupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesupMouseEntered
         updatesup.setIcon(updateup);
    }//GEN-LAST:event_updatesupMouseEntered

    private void updatesupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesupMouseExited
         updatesup.setIcon(updatedwn);
    }//GEN-LAST:event_updatesupMouseExited

    private void supplierbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierbtnMouseClicked
         supplierbtn.setIcon(btn3);
         stockbtn.setIcon(btn2);
        
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }//GEN-LAST:event_supplierbtnMouseClicked

    private void stockbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockbtnMouseClicked
         stockbtn.setIcon(btn1);
         supplierbtn.setIcon(btn4);
        
         jPanel2.setVisible(true);
         jPanel3.setVisible(false);
    }//GEN-LAST:event_stockbtnMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
       try{
          displaySupplierData();  
          displayStockData();
       }
       catch(ClassNotFoundException ex){
          JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
       } 
       catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       }
        
    }//GEN-LAST:event_formWindowActivated

    private void deletesupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletesupMouseClicked
        int column = 0;        
        
        HandleSupplier hs = new HandleSupplier();        
        int row = supplier.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Please select the supplier that you need to be delete","Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String SupplierID =  supplier.getValueAt(row, column).toString();
            hs.setSupplierID(SupplierID);
            try{
               int i  = hs.deleteSupplier();
               if (i != 0) {
                  JOptionPane.showMessageDialog(null,"Supplier has been deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);       
               }
               else{
            	  JOptionPane.showMessageDialog(null, "Supplier cannot be delete.", "Error", JOptionPane.ERROR_MESSAGE);
               }    
                      
            }
            catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
            } 
            catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Supplier cannot be deleted since supplier is related to existing stocks.", "SQLIntegrityConstraintViolationException", JOptionPane.WARNING_MESSAGE);
            } 
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
            
        }        
        
    }//GEN-LAST:event_deletesupMouseClicked

    private void updatesupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesupMouseClicked

        int row = supplier.getSelectedRow();
        if(row == -1){
             JOptionPane.showMessageDialog(null, "Please select the supplier that you need to be update.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
                 String supID = supplier.getValueAt(row,0).toString();
                 UpdateSuppliers up = new UpdateSuppliers(null,true,supID);
                 up.setVisible(true);
        }
        
    }//GEN-LAST:event_updatesupMouseClicked

    private void updatestocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestocksMouseClicked
        
        int row = stock.getSelectedRow();
        if(row == -1){
             JOptionPane.showMessageDialog(null, "Please select the stock that you need to be update.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
             String stkID = stock.getValueAt(row,0).toString();
             UpdateStocks upstk = new UpdateStocks(null,true,stkID);
             upstk.setVisible(true);                   
        }
 
    }//GEN-LAST:event_updatestocksMouseClicked

    private void searchsuptxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchsuptxtKeyReleased
      
       HandleSupplier hs = new HandleSupplier();
       hs.setSearchkey(searchsuptxt.getText());
      
       try{
           ResultSet rs = hs.searchSupplier();
           supplier.setModel(DbUtils.resultSetToTableModel(rs));
           
       }
       catch(ClassNotFoundException ex){
          JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
       } 
       catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       
    }//GEN-LAST:event_searchsuptxtKeyReleased

    private void searchsuptxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchsuptxtMouseEntered
        searchbtn.setIcon(searchenter);      
    }//GEN-LAST:event_searchsuptxtMouseEntered

    private void searchsuptxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchsuptxtMouseExited
        searchbtn.setIcon(searchout);
    }//GEN-LAST:event_searchsuptxtMouseExited

    private void searchstocktxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstocktxtMouseEntered
        search.setIcon(searchenter);
    }//GEN-LAST:event_searchstocktxtMouseEntered

    private void searchstocktxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchstocktxtMouseExited
        search.setIcon(searchout);                                        
    }//GEN-LAST:event_searchstocktxtMouseExited

    private void deletestocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletestocksMouseClicked
        
        int column = 0;        
        
        HandleStocks hs = new HandleStocks(); 
        int row = stock.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Please select the stock that you need to be delete","Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String StockID =  stock.getValueAt(row, column).toString();
            hs.setStockID(StockID);
            try{
               int i  = hs.deleteStock();
               if (i != 0) {
                  JOptionPane.showMessageDialog(null,"Stock has been deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);       
               }
               else{
            	  JOptionPane.showMessageDialog(null, "Stock cannot be delete.", "Error", JOptionPane.ERROR_MESSAGE);
               }    
                      
            }
            catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
            } 
            catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Stock cannot be deleted since stock is related to existing purchaces.", "SQLIntegrityConstraintViolationException", JOptionPane.WARNING_MESSAGE);
            }            
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
            
        }        
                
    }//GEN-LAST:event_deletestocksMouseClicked

    private void updatestockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockMouseEntered
        updatestock.setIcon(updatestkup);
    }//GEN-LAST:event_updatestockMouseEntered

    private void updatestockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockMouseExited
        updatestock.setIcon(updatestkdwn);
    }//GEN-LAST:event_updatestockMouseExited

    private void updatestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockMouseClicked
                
        int row = stock.getSelectedRow();        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select the stock that you need to be update.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }        
        else{            
             String stockID = stock.getValueAt(row,0).toString();
             UpdateStockLevel upstk = new UpdateStockLevel(null,true,stockID);
             upstk.setVisible(true);
        }  
        
    }//GEN-LAST:event_updatestockMouseClicked

    private void searchstocktxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchstocktxtKeyReleased
       
        HandleStocks hs = new HandleStocks();
      
       hs.setSearchKey(searchstocktxt.getText());
      
       try{
           ResultSet rs = hs.searchStock();
           stock.setModel(DbUtils.resultSetToTableModel(rs));
           
       }
       catch(ClassNotFoundException ex){
          JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
       } 
       catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       
    }//GEN-LAST:event_searchstocktxtKeyReleased

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setIcon(backenter);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setIcon(backout);
    }//GEN-LAST:event_backMouseExited

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
       backbtn.setIcon(backenter);
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
       backbtn.setIcon(backout);
    }//GEN-LAST:event_backbtnMouseExited

    private void addstocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstocksMouseClicked
       AddStocks addstk = new AddStocks(null,true);
       addstk.setVisible(true);
    }//GEN-LAST:event_addstocksMouseClicked

    private void addsupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addsupMouseClicked
        AddSuppliers addsupp = new AddSuppliers(null,true);
        addsupp.setVisible(true);
    }//GEN-LAST:event_addsupMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void displaySupplierData() throws Exception{
        HandleSupplier hs = new HandleSupplier();
        supplier.setModel(DbUtils.resultSetToTableModel(hs.display()));
    }     
    
    private void displayStockData() throws Exception{
        HandleStocks hs = new HandleStocks();
        stock.setModel(DbUtils.resultSetToTableModel(hs.viewStocks()));
    }
   
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("inventory.png")));    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addstocks;
    private javax.swing.JLabel addsup;
    private javax.swing.JLabel back;
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel deletestocks;
    private javax.swing.JLabel deletesup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel search;
    private javax.swing.JLabel searchbtn;
    private javax.swing.JTextField searchstocktxt;
    private javax.swing.JTextField searchsuptxt;
    private javax.swing.JTable stock;
    private javax.swing.JLabel stockbtn;
    private javax.swing.JTable supplier;
    private javax.swing.JLabel supplierbtn;
    private javax.swing.JLabel updatestock;
    private javax.swing.JLabel updatestocks;
    private javax.swing.JLabel updatesup;
    // End of variables declaration//GEN-END:variables
}
