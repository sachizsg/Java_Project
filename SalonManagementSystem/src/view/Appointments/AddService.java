/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Appointments;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Appointments.HandleNewAppointment;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Samu
 */
public class AddService extends javax.swing.JDialog {
      
        
    private final ImageIcon doneOut;
    private final ImageIcon doneEnter;
    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private final ImageIcon searchEnter;
    private final ImageIcon searchOut;
    
    private LinkedList appointmentDetails;
    
    
    private  int rowCount = 0;
    private double total=0.00;
    private int serviceDuration;

  
    
    public AddService(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        
        
        doneOut = new ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"));  
        doneEnter = new ImageIcon(getClass().getResource("/view/Appointments/doneEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png"));  
        
        searchEnter = new ImageIcon(getClass().getResource("/view/Appointments/searchEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"));
        
        durationText.setEditable(false);
        priceText.setEditable(false);
        
        this.loadAllServises();  
        
        this.pack();
    }
    
    
    public AddService(java.awt.Frame parent, boolean modal,LinkedList appointmentDetails) {
        super(parent, modal);
        initComponents();        
             
        
        doneOut = new ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"));  
        doneEnter = new ImageIcon(getClass().getResource("/view/Appointments/doneEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png"));  
        
        searchEnter = new ImageIcon(getClass().getResource("/view/Appointments/searchEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"));
        
        this.appointmentDetails = appointmentDetails;        
        
        durationText.setEditable(false);
        priceText.setEditable(false);        
        
        this.loadAllServises();  
        this.loadPreviousServices();
        
        this.pack();
    }
    
    private void loadAllServises(){
        
        HandleNewAppointment hna = new HandleNewAppointment();
        
        try{
            ResultSet rs = hna.viewServiceNamesForAppointment();
            serviceTable.setModel(DbUtils.resultSetToTableModel(rs));           
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
        
        
    }
    
    private void loadPreviousServices(){
        
        HandleNewAppointment hna = new HandleNewAppointment();
        hna.setClientID(this.appointmentDetails.get(3).toString());
        try{
            ResultSet rs = hna.viewPreviousClientServices();
            previousServicesTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timeDuration = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedServicesTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        previousServicesTable = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        serviceSearchText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        durationText = new javax.swing.JTextField();
        cancelServiceLabel = new javax.swing.JLabel();
        selectServiceLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        selectedServices = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        doneLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeDuration.setBackground(new java.awt.Color(51, 0, 51));
        timeDuration.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        timeDuration.setForeground(new java.awt.Color(255, 255, 255));
        timeDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeDuration.setText("00.00");
        jPanel1.add(timeDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 415, 60, 20));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Services");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 35));

        serviceTable.setBackground(new java.awt.Color(204, 204, 204));
        serviceTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Service Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        serviceTable.setDragEnabled(true);
        serviceTable.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        serviceTable.setFillsViewportHeight(true);
        serviceTable.setRowHeight(25);
        serviceTable.getTableHeader().setReorderingAllowed(false);
        serviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(serviceTable);
        if (serviceTable.getColumnModel().getColumnCount() > 0) {
            serviceTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, 230, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/titleGlass.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        jScrollPane2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        selectedServicesTable.setBackground(new java.awt.Color(204, 204, 204));
        selectedServicesTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectedServicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Name", "Duration", "Service Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selectedServicesTable.setDragEnabled(true);
        selectedServicesTable.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        selectedServicesTable.setFillsViewportHeight(true);
        selectedServicesTable.setRowHeight(25);
        selectedServicesTable.getTableHeader().setReorderingAllowed(false);
        selectedServicesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedServicesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selectedServicesTable);
        if (selectedServicesTable.getColumnModel().getColumnCount() > 0) {
            selectedServicesTable.getColumnModel().getColumn(0).setResizable(false);
            selectedServicesTable.getColumnModel().getColumn(1).setResizable(false);
            selectedServicesTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 540, 100));

        previousServicesTable.setBackground(new java.awt.Color(204, 204, 204));
        previousServicesTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        previousServicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        previousServicesTable.setFillsViewportHeight(true);
        previousServicesTable.setRowHeight(25);
        previousServicesTable.getTableHeader().setReorderingAllowed(false);
        previousServicesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousServicesTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(previousServicesTable);
        if (previousServicesTable.getColumnModel().getColumnCount() > 0) {
            previousServicesTable.getColumnModel().getColumn(0).setResizable(false);
            previousServicesTable.getColumnModel().getColumn(1).setResizable(false);
            previousServicesTable.getColumnModel().getColumn(2).setResizable(false);
            previousServicesTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 540, 100));

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"))); // NOI18N
        searchLabel.setIconTextGap(0);
        jPanel1.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 83, 25, 24));

        serviceSearchText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serviceSearchText.setMargin(new java.awt.Insets(0, 0, 0, 0));
        serviceSearchText.setPreferredSize(new java.awt.Dimension(200, 30));
        serviceSearchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serviceSearchTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serviceSearchTextMouseExited(evt);
            }
        });
        serviceSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serviceSearchTextKeyReleased(evt);
            }
        });
        jPanel1.add(serviceSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        priceText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        priceText.setPreferredSize(new java.awt.Dimension(140, 25));
        jPanel1.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 140, 25));

        durationText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        durationText.setPreferredSize(new java.awt.Dimension(140, 25));
        jPanel1.add(durationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 140, 25));

        cancelServiceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/cancelsmall.png"))); // NOI18N
        cancelServiceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelServiceLabel.setIconTextGap(0);
        cancelServiceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelServiceLabelMouseClicked(evt);
            }
        });
        jPanel1.add(cancelServiceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 252, 25, 25));

        selectServiceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/donesmall.png"))); // NOI18N
        selectServiceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectServiceLabel.setIconTextGap(0);
        selectServiceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectServiceLabelMouseClicked(evt);
            }
        });
        jPanel1.add(selectServiceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 252, 25, 25));

        jLabel7.setBackground(new java.awt.Color(51, 0, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Previous Client Services");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 85, 230, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel6.setIconTextGap(0);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 540, 30));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selected Services");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 255, 180, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel9.setIconTextGap(0);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 540, 30));

        jLabel10.setBackground(new java.awt.Color(51, 0, 51));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total Duration    :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 415, 120, 20));

        jLabel12.setBackground(new java.awt.Color(51, 0, 51));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Services Selected :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 415, 110, 20));

        selectedServices.setBackground(new java.awt.Color(51, 0, 51));
        selectedServices.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        selectedServices.setForeground(new java.awt.Color(255, 255, 255));
        selectedServices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedServices.setText("0");
        jPanel1.add(selectedServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 415, 30, 20));

        totalPrice.setBackground(new java.awt.Color(51, 0, 51));
        totalPrice.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(255, 255, 255));
        totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPrice.setText("00.00");
        jPanel1.add(totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 415, 90, 20));

        jLabel13.setBackground(new java.awt.Color(51, 0, 51));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Price :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 415, 70, 20));

        jLabel14.setBackground(new java.awt.Color(51, 0, 51));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Service Duration");
        jLabel14.setPreferredSize(new java.awt.Dimension(67, 25));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 100, 25));

        jLabel15.setBackground(new java.awt.Color(51, 0, 51));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Service Price");
        jLabel15.setPreferredSize(new java.awt.Dimension(67, 25));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 100, 25));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel11.setIconTextGap(0);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 540, 30));

        doneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"))); // NOI18N
        doneLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneLabel.setIconTextGap(0);
        doneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doneLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doneLabelMouseExited(evt);
            }
        });
        jPanel1.add(doneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 150, 50));

        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"))); // NOI18N
        cancelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelLabel.setIconTextGap(0);
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelLabelMouseExited(evt);
            }
        });
        jPanel1.add(cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlasslong.png"))); // NOI18N
        jLabel5.setIconTextGap(0);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 810, 75));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/backgroundsmall.jpg"))); // NOI18N
        jLabel18.setIconTextGap(0);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doneLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseEntered
        doneLabel.setIcon(doneEnter);
    }//GEN-LAST:event_doneLabelMouseEntered

    private void doneLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseExited
        doneLabel.setIcon(doneOut);
    }//GEN-LAST:event_doneLabelMouseExited

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelLabel.setIcon(cancelEnter);
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelLabel.setIcon(cancelOut);
    }//GEN-LAST:event_cancelLabelMouseExited

    private void doneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseClicked

        if (selectedServicesTable.getRowCount() == 0) {            
            JOptionPane.showMessageDialog(null, "Please Select the service(s).", "Message", JOptionPane.INFORMATION_MESSAGE);            
        }
        else{
           
            HandleNewAppointment hna = new HandleNewAppointment();
            LinkedList selectedServices = new LinkedList();
            
            
            
            for (int i = 0; i < selectedServicesTable.getRowCount(); i++) {
                
                String serviceName = selectedServicesTable.getValueAt(i, 0).toString();
                hna.setServiceName(serviceName);
                try{
                    ResultSet rs = hna.viewServiceDetailsForAppointment();
                    if (rs.next()) {
                        String serviceID = rs.getString("Service_ID");
                        selectedServices.add(serviceID);
                      
                    }
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
                
            }
            
            this.appointmentDetails.add(selectedServices); 
            this.appointmentDetails.add(timeDuration.getText());
            this.appointmentDetails.add(totalPrice.getText());
           
           
            AddEmployee ae = new AddEmployee(null, true,this.appointmentDetails);
            this.dispose();
            ae.setVisible(true);
        
        }
               
    }//GEN-LAST:event_doneLabelMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();        
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void serviceSearchTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceSearchTextMouseEntered
        searchLabel.setIcon(searchEnter);
    }//GEN-LAST:event_serviceSearchTextMouseEntered

    private void serviceSearchTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceSearchTextMouseExited
        searchLabel.setIcon(searchOut);
    }//GEN-LAST:event_serviceSearchTextMouseExited

    private void serviceSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serviceSearchTextKeyReleased

        HandleNewAppointment hna = new HandleNewAppointment();
        
        durationText.setText(null);
        priceText.setText(null);

        hna.setServiceSearchKey(serviceSearchText.getText());

        try{
            ResultSet rs = hna.searchService();            
            serviceTable.setModel(DbUtils.resultSetToTableModel(rs));
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

    }//GEN-LAST:event_serviceSearchTextKeyReleased

    private void serviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceTableMouseClicked
       
        previousServicesTable.getSelectionModel().clearSelection();
        selectedServicesTable.getSelectionModel().clearSelection();
        
        int selectedRow = serviceTable.getSelectedRow();
        
        String serviceName = serviceTable.getValueAt(selectedRow, 0).toString();
        
        HandleNewAppointment hna = new HandleNewAppointment();
        hna.setServiceName(serviceName);
        
        try{
            ResultSet rs = hna.viewServiceDetailsForAppointment();
            if (rs.next()) {                 
                durationText.setText(rs.getString("Duration"));
                priceText.setText(rs.getString("Service_Price"));                
            }
            else{
                JOptionPane.showMessageDialog(null, "Cannot find client details.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
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
        
        
    }//GEN-LAST:event_serviceTableMouseClicked

    private void selectServiceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectServiceLabelMouseClicked
        
        int selectedRow1 = serviceTable.getSelectedRow();
        int selectedRow2 = previousServicesTable.getSelectedRow();
        
        
        if (selectedRow1 == -1 && selectedRow2 == -1) {
            JOptionPane.showMessageDialog(null, "Please select the service from services.", "Message", JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
            
            if (selectedRow1 != -1) {
                String serviceName = serviceTable.getValueAt(selectedRow1, 0).toString();   
                this.selectIntoServices(serviceName);
            }
            else if (selectedRow2 != -1) {
                String serviceName = previousServicesTable.getValueAt(selectedRow2, 0).toString();   
                this.selectIntoServices(serviceName);
            }
              
        }
        
    }//GEN-LAST:event_selectServiceLabelMouseClicked
    
    
    private void selectIntoServices(String serviceName){
        
        DecimalFormat df = new DecimalFormat("#.00"); 
        HandleNewAppointment hna = new HandleNewAppointment();
        
        DefaultTableModel model = (DefaultTableModel) selectedServicesTable.getModel();
        int x = model.getRowCount();
        model.setRowCount(x+1);
            
            try{
                hna.setServiceName(serviceName);
                ResultSet rs = hna.viewServiceDetailsForAppointment();
                
                if (rs.next()) {
                    
                    String serName = rs.getString("Service_Name");
                    int duration = rs.getInt("Duration");
                    Double serPrice = rs.getDouble("Service_Price");                    
                    
                    selectedServicesTable.setValueAt(serName, this.rowCount, 0);
                    selectedServicesTable.setValueAt(duration, this.rowCount, 1);
                    selectedServicesTable.setValueAt(df.format(serPrice), this.rowCount, 2);
                    
                    this.rowCount++;
                    
                    this.total = this.total + serPrice;                       
                    this.serviceDuration = this.serviceDuration + duration;    
                    
                    selectedServices.setText(Integer.toString(this.rowCount));                   
                    timeDuration.setText(this.convertHHMMSS());
                    totalPrice.setText(df.format(this.total));
                    
                    
                }
                                
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
        
        
        
        
    }
    
    private String convertHHMMSS(){
        
        long hours = TimeUnit.MINUTES.toHours(this.serviceDuration);
        long remainMinute = this.serviceDuration - TimeUnit.HOURS.toMinutes(hours);
        String h = String.format("%02d", hours);
        String m = String.format("%02d", remainMinute);
                
        String time = h+":"+m+":"+"00";
        
        return time;
        
        
    }
    
    private void cancelServiceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelServiceLabelMouseClicked
        
        DecimalFormat df = new DecimalFormat("#.00"); 
        
        int selectedRow = selectedServicesTable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the row that you need to be remove.", "Message", JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
            
             DefaultTableModel model = (DefaultTableModel) selectedServicesTable.getModel();
                    
             int duration = Integer.parseInt(selectedServicesTable.getValueAt(selectedRow, 1).toString());
             Double serPrice = Double.parseDouble(selectedServicesTable.getValueAt(selectedRow, 2).toString());
                    
                   
                    
             model.removeRow(selectedRow);
             this.rowCount--;
                                        
             this.total = this.total - serPrice;   
             this.serviceDuration = this.serviceDuration - duration;     
                    
             selectedServices.setText(Integer.toString(this.rowCount));                   
             timeDuration.setText(this.convertHHMMSS());
             totalPrice.setText(df.format(this.total));
            
        }
        
        
    }//GEN-LAST:event_cancelServiceLabelMouseClicked

    private void previousServicesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousServicesTableMouseClicked
         serviceTable.getSelectionModel().clearSelection();   
         selectedServicesTable.getSelectionModel().clearSelection();
    }//GEN-LAST:event_previousServicesTableMouseClicked

    private void selectedServicesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedServicesTableMouseClicked
         serviceTable.getSelectionModel().clearSelection();
         previousServicesTable.getSelectionModel().clearSelection();
    }//GEN-LAST:event_selectedServicesTableMouseClicked

        
    
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
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddService dialog = new AddService(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JLabel cancelServiceLabel;
    private javax.swing.JLabel doneLabel;
    private javax.swing.JTextField durationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable previousServicesTable;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel selectServiceLabel;
    private javax.swing.JLabel selectedServices;
    private javax.swing.JTable selectedServicesTable;
    private javax.swing.JTextField serviceSearchText;
    private javax.swing.JTable serviceTable;
    private javax.swing.JLabel timeDuration;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
