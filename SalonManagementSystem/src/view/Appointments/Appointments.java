/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Appointments;

import salonmanagementsystem.SetImageSize;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Appointments.AppointmentDisplayButton;
import model.Appointments.HandleAppointment;
import model.Appointments.HandleClient;
import model.Appointments.HandleNewAppointment;
import net.proteanit.sql.DbUtils;
import view.MainMenu.MainMenu;

/**
 *
 * @author Samu
 */


public class Appointments extends javax.swing.JFrame {

    
    
    private final ImageIcon appointmentsEnter;
    private final ImageIcon appointmentsOut;
    
    private final ImageIcon clientsEnter;
    private final ImageIcon clientsOut;
   
    private final ImageIcon leftEnter;
    private final ImageIcon leftOut;    
    private final ImageIcon todayEnter;
    private final ImageIcon todayOut;
    private final ImageIcon rightEnter;
    private final ImageIcon rightOut;
    
    private final ImageIcon addEnter;
    private final ImageIcon addOut;
    
    private final ImageIcon updateEnter;
    private final ImageIcon updateOut;
    
    private final ImageIcon deleteEnter;
    private final ImageIcon deleteOut;
    
    
    private final ImageIcon searchEnter;
    private final ImageIcon searchOut;
    
    private final ImageIcon timeEnter;
    private final ImageIcon timeOut;
    
    private final ImageIcon backEnter;
    private final ImageIcon backOut;
    
    
    public static String date;

     
    public Appointments() {
        initComponents();
     
        appointmentsEnter = new ImageIcon(getClass().getResource("/view/Appointments/appointmentsEnter.png"));
        appointmentsOut = new ImageIcon(getClass().getResource("/view/Appointments/appointmentsOut.png"));
        
        clientsEnter = new ImageIcon(getClass().getResource("/view/Appointments/clientsEnter.png"));
        clientsOut = new ImageIcon(getClass().getResource("/view/Appointments/clientsOut.png"));
        
        leftEnter  = new ImageIcon(getClass().getResource("/view/Appointments/dayleftEnter.png"));  
        leftOut  = new ImageIcon(getClass().getResource("/view/Appointments/dayleftOut.png"));
        todayEnter  = new ImageIcon(getClass().getResource("/view/Appointments/todayEnter.png"));   
        todayOut  = new ImageIcon(getClass().getResource("/view/Appointments/todayOut.png")); 
        rightEnter = new ImageIcon(getClass().getResource("/view/Appointments/dayrightEnter.png"));        
        rightOut = new ImageIcon(getClass().getResource("/view/Appointments/dayrightOut.png"));        
       
        addEnter = new ImageIcon(getClass().getResource("/view/Appointments/addEnter.png"));
        addOut = new ImageIcon(getClass().getResource("/view/Appointments/addOut.png"));
        
        updateEnter = new ImageIcon(getClass().getResource("/view/Appointments/updateEnter.png"));
        updateOut = new ImageIcon(getClass().getResource("/view/Appointments/updateOut.png"));
        
        deleteEnter = new ImageIcon(getClass().getResource("/view/Appointments/deleteEnter.png"));
        deleteOut = new ImageIcon(getClass().getResource("/view/Appointments/deleteOut.png"));
        
        searchEnter = new ImageIcon(getClass().getResource("/view/Appointments/searchEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"));
        
        timeEnter = new ImageIcon(getClass().getResource("/view/Appointments/timeEnter.png"));
        timeOut = new ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"));
        
        backEnter = new ImageIcon(getClass().getResource("/view/Appointments/backEnter.png"));
        backOut = new ImageIcon(getClass().getResource("/view/Appointments/backOut.png"));
        
        appointmentsPanel.setVisible(true);
        clientPanel.setVisible(false);
        
        lunchLabel.setVisible(false);
        closingLabel.setVisible(false);
        
        this.selctToday();               
        this.employeeList();
        
        employeeTable.setRowSelectionInterval(0, 0);
        
        this.setIcon();
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
 
    }   
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appointments.png")));
    }
    
    private void selctToday(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        Appointments.date = sdf.format(d);
        
        dateDisplayLabel.setText(Appointments.date); 
        
    }
    
    
    private void employeeList(){
        
        HandleAppointment ha = new HandleAppointment();
        
        try{
            ResultSet rs = ha.getEmployeeDetails();
            employeeTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        jLabel4 = new javax.swing.JLabel();
        button1 = new javax.swing.JLabel();
        button2 = new javax.swing.JLabel();
        buttonGlass1 = new javax.swing.JLabel();
        appointmentsPanel = new javax.swing.JPanel();
        calanderLabel = new javax.swing.JLabel();
        backButtonAppointments = new javax.swing.JLabel();
        viewAppointmentPanel = new javax.swing.JPanel();
        timeLabel1 = new javax.swing.JLabel();
        timeBackLabel1 = new javax.swing.JLabel();
        timeLabel2 = new javax.swing.JLabel();
        timeBackLabel2 = new javax.swing.JLabel();
        timeLabel3 = new javax.swing.JLabel();
        timeBackLabel3 = new javax.swing.JLabel();
        timeLabel4 = new javax.swing.JLabel();
        timeBackLabel4 = new javax.swing.JLabel();
        timeLabel5 = new javax.swing.JLabel();
        timeBackLabel5 = new javax.swing.JLabel();
        timeLabel6 = new javax.swing.JLabel();
        timeBackLabel6 = new javax.swing.JLabel();
        timeLabel7 = new javax.swing.JLabel();
        timeBackLabel7 = new javax.swing.JLabel();
        timeLabel8 = new javax.swing.JLabel();
        timeBackLabel8 = new javax.swing.JLabel();
        timeLabel9 = new javax.swing.JLabel();
        timeBackLabel9 = new javax.swing.JLabel();
        timeLabel10 = new javax.swing.JLabel();
        timeBackLabel10 = new javax.swing.JLabel();
        timeLabel11 = new javax.swing.JLabel();
        timeBackLabel11 = new javax.swing.JLabel();
        timeLabel12 = new javax.swing.JLabel();
        timeBackLabel12 = new javax.swing.JLabel();
        timeLabel13 = new javax.swing.JLabel();
        timeBackLabel13 = new javax.swing.JLabel();
        timeLabel14 = new javax.swing.JLabel();
        timeBackLabel14 = new javax.swing.JLabel();
        timeLabel15 = new javax.swing.JLabel();
        timeBackLabel15 = new javax.swing.JLabel();
        timeLabel16 = new javax.swing.JLabel();
        timeBackLabel16 = new javax.swing.JLabel();
        timeLabel17 = new javax.swing.JLabel();
        timeBackLabel17 = new javax.swing.JLabel();
        timeLabel18 = new javax.swing.JLabel();
        timeBackLabel18 = new javax.swing.JLabel();
        timeLabel19 = new javax.swing.JLabel();
        timeBackLabel19 = new javax.swing.JLabel();
        timeLabel20 = new javax.swing.JLabel();
        timeBackLabel20 = new javax.swing.JLabel();
        timeLabel21 = new javax.swing.JLabel();
        timeBackLabel21 = new javax.swing.JLabel();
        timeLabel22 = new javax.swing.JLabel();
        timeBackLabel22 = new javax.swing.JLabel();
        timeLabel23 = new javax.swing.JLabel();
        timeBackLabel23 = new javax.swing.JLabel();
        timeLabel24 = new javax.swing.JLabel();
        timeBackLabel24 = new javax.swing.JLabel();
        timeLabel25 = new javax.swing.JLabel();
        timeBackLabel25 = new javax.swing.JLabel();
        timeLabel26 = new javax.swing.JLabel();
        timeBackLabel26 = new javax.swing.JLabel();
        timeLabel27 = new javax.swing.JLabel();
        timeBackLabel27 = new javax.swing.JLabel();
        timeLabel28 = new javax.swing.JLabel();
        timeBackLabel28 = new javax.swing.JLabel();
        timeLabel29 = new javax.swing.JLabel();
        timeBackLabel29 = new javax.swing.JLabel();
        timeLabel30 = new javax.swing.JLabel();
        timeBackLabel30 = new javax.swing.JLabel();
        timeLabel31 = new javax.swing.JLabel();
        timeBackLabel31 = new javax.swing.JLabel();
        timeLabel32 = new javax.swing.JLabel();
        timeBackLabel32 = new javax.swing.JLabel();
        timeLabel33 = new javax.swing.JLabel();
        timeBackLabel33 = new javax.swing.JLabel();
        timeLabel34 = new javax.swing.JLabel();
        timeBackLabel34 = new javax.swing.JLabel();
        EmpImage = new javax.swing.JLabel();
        leftButton = new javax.swing.JLabel();
        todayButton = new javax.swing.JLabel();
        rightButton = new javax.swing.JLabel();
        employeeNameLabel = new javax.swing.JLabel();
        appointmentButtonPanelEvening = new javax.swing.JPanel();
        closingLabel = new javax.swing.JLabel();
        appoButtonLabel2 = new javax.swing.JLabel();
        appointmentButtonPanelMorning = new javax.swing.JPanel();
        lunchLabel = new javax.swing.JLabel();
        appoButtonLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateDisplayLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        clientPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        backButtonClient = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        clientSearchText = new javax.swing.JTextField();
        deleteLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        updateLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appointments");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/salonimglogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 310, 90));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/appointmentsEnter.png"))); // NOI18N
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setIconTextGap(0);
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 200, 75));

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/clientsOut.png"))); // NOI18N
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setIconTextGap(0);
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 200, 75));

        buttonGlass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass1.png"))); // NOI18N
        buttonGlass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGlass1.setIconTextGap(0);
        jPanel1.add(buttonGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 400, 75));

        appointmentsPanel.setPreferredSize(new java.awt.Dimension(1326, 585));
        appointmentsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calanderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/calendar.png"))); // NOI18N
        calanderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calanderLabel.setIconTextGap(0);
        calanderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calanderLabelMouseClicked(evt);
            }
        });
        appointmentsPanel.add(calanderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        backButtonAppointments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/backOut.png"))); // NOI18N
        backButtonAppointments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButtonAppointments.setIconTextGap(0);
        backButtonAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonAppointmentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonAppointmentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonAppointmentsMouseExited(evt);
            }
        });
        appointmentsPanel.add(backButtonAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 525, -1, -1));

        viewAppointmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel1.setText("9.00 A.M");
        timeLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel1.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel1.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel1.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 25));

        timeBackLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel1.setIconTextGap(0);
        timeBackLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel1MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 25));

        timeLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel2.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel2.setText("15");
        timeLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel2.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel2.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel2.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 150, 25));

        timeBackLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel2.setIconTextGap(0);
        timeBackLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel2MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 150, 25));

        timeLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel3.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel3.setText("30");
        timeLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel3.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel3.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel3.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 25));

        timeBackLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel3.setIconTextGap(0);
        timeBackLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel3MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 25));

        timeLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel4.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel4.setText("45");
        timeLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel4.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel4.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel4.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 150, 25));

        timeBackLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel4.setIconTextGap(0);
        timeBackLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel4MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 150, 25));

        timeLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel5.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel5.setText("10.00 A.M");
        timeLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel5.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel5.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel5.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 25));

        timeBackLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel5.setIconTextGap(0);
        timeBackLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel5MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 25));

        timeLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel6.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel6.setText("15");
        timeLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel6.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel6.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel6.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 150, 25));

        timeBackLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel6.setIconTextGap(0);
        timeBackLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel6MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 150, 25));

        timeLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel7.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel7.setText("30");
        timeLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel7.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel7.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel7.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 25));

        timeBackLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel7.setIconTextGap(0);
        timeBackLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel7MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 25));

        timeLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel8.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel8.setText("45");
        timeLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel8.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel8.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel8.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 185, 150, 25));

        timeBackLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel8.setIconTextGap(0);
        timeBackLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel8MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 185, 150, 25));

        timeLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel9.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel9.setText("11.00 A.M");
        timeLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel9.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel9.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel9.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 25));

        timeBackLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel9.setIconTextGap(0);
        timeBackLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel9MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 25));

        timeLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel10.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel10.setText("15");
        timeLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel10.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel10.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel10.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 235, 150, 25));

        timeBackLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel10.setIconTextGap(0);
        timeBackLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel10MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 235, 150, 25));

        timeLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel11.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel11.setText("30");
        timeLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel11.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel11.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel11.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 25));

        timeBackLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel11.setIconTextGap(0);
        timeBackLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel11MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 25));

        timeLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel12.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel12.setText("45");
        timeLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel12.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel12.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel12.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, 150, 25));

        timeBackLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel12.setIconTextGap(0);
        timeBackLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel12MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, 150, 25));

        timeLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel13.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel13.setText("12.00 P.M");
        timeLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel13.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel13.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel13.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 25));

        timeBackLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel13.setIconTextGap(0);
        timeBackLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel13MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 25));

        timeLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel14.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel14.setText("15");
        timeLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel14.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel14.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel14.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, 150, 25));

        timeBackLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel14.setIconTextGap(0);
        timeBackLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel14MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, 150, 25));

        timeLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel15.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel15.setText("30");
        timeLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel15.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel15.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel15.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 150, 25));

        timeBackLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel15.setIconTextGap(0);
        timeBackLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel15MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 150, 25));

        timeLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel16.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel16.setText("45");
        timeLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel16.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel16.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel16.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 385, 150, 25));

        timeBackLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel16.setIconTextGap(0);
        timeBackLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel16MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 385, 150, 25));

        timeLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel17.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel17.setText("1.00 P.M");
        timeLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel17.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel17.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel17.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 25));

        timeBackLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel17.setIconTextGap(0);
        timeBackLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel17MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 25));

        timeLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel18.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel18.setText("2.00 P.M");
        timeLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel18.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel18.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel18.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 150, 25));

        timeBackLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel18.setIconTextGap(0);
        timeBackLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel18MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 150, 25));

        timeLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel19.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel19.setText("15");
        timeLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel19.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel19.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel19.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 35, 150, 25));

        timeBackLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel19.setIconTextGap(0);
        timeBackLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel19MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 35, 150, 25));

        timeLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel20.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel20.setText("30");
        timeLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel20.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel20.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel20.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 150, 25));

        timeBackLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel20.setIconTextGap(0);
        timeBackLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel20MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 150, 25));

        timeLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel21.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel21.setText("45");
        timeLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel21.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel21.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel21.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, 150, 25));

        timeBackLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel21.setIconTextGap(0);
        timeBackLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel21MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, 150, 25));

        timeLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel22.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel22.setText("3.00 P.M");
        timeLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel22.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel22.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel22.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, 25));

        timeBackLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel22.setIconTextGap(0);
        timeBackLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel22MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, 25));

        timeLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel23.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel23.setText("15");
        timeLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel23.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel23.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel23.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 135, 150, 25));

        timeBackLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel23.setIconTextGap(0);
        timeBackLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel23MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 135, 150, 25));

        timeLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel24.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel24.setText("30");
        timeLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel24.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel24.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel24.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 150, 25));

        timeBackLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel24.setIconTextGap(0);
        timeBackLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel24MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 150, 25));

        timeLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel25.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel25.setText("45");
        timeLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel25.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel25.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel25.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 185, 150, 25));

        timeBackLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel25.setIconTextGap(0);
        timeBackLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel25MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 185, 150, 25));

        timeLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel26.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel26.setText("4.00 P.M");
        timeLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel26.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel26.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel26.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 150, 25));

        timeBackLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel26.setIconTextGap(0);
        timeBackLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel26MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 150, 25));

        timeLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel27.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel27.setText("15");
        timeLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel27.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel27.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel27.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, 150, 25));

        timeBackLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel27.setIconTextGap(0);
        timeBackLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel27MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, 150, 25));

        timeLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel28.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel28.setText("30");
        timeLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel28.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel28.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel28.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 150, 25));

        timeBackLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel28.setIconTextGap(0);
        timeBackLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel28MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 150, 25));

        timeLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel29.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel29.setText("45");
        timeLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel29.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel29.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel29.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 285, 150, 25));

        timeBackLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel29.setIconTextGap(0);
        timeBackLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel29MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 285, 150, 25));

        timeLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel30.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel30.setText("5.00 P.M");
        timeLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel30.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel30.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel30.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 150, 25));

        timeBackLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel30.setIconTextGap(0);
        timeBackLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel30MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 150, 25));

        timeLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel31.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel31.setText("15");
        timeLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel31.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel31.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel31.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 335, 150, 25));

        timeBackLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel31.setIconTextGap(0);
        timeBackLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel31MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 335, 150, 25));

        timeLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel32.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel32.setText("30");
        timeLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel32.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel32.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel32.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 150, 25));

        timeBackLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel32.setIconTextGap(0);
        timeBackLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel32MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 150, 25));

        timeLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel33.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel33.setText("45");
        timeLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel33.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel33.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel33.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 385, 150, 25));

        timeBackLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel33.setIconTextGap(0);
        timeBackLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel33MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 385, 150, 25));

        timeLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel34.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel34.setText("6.00 P.M");
        timeLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel34.setMaximumSize(new java.awt.Dimension(150, 25));
        timeLabel34.setMinimumSize(new java.awt.Dimension(100, 25));
        timeLabel34.setPreferredSize(new java.awt.Dimension(150, 25));
        viewAppointmentPanel.add(timeLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 150, 25));

        timeBackLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeBackLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/timeOut.png"))); // NOI18N
        timeBackLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeBackLabel34.setIconTextGap(0);
        timeBackLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeBackLabel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeBackLabel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeBackLabel34MouseExited(evt);
            }
        });
        viewAppointmentPanel.add(timeBackLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 150, 25));

        EmpImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/employeeProPicBig.jpg"))); // NOI18N
        EmpImage.setIconTextGap(0);
        viewAppointmentPanel.add(EmpImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 12, 170, 170));

        leftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/dayleftOut.png"))); // NOI18N
        leftButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftButton.setIconTextGap(0);
        leftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leftButtonMouseExited(evt);
            }
        });
        viewAppointmentPanel.add(leftButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 150, -1));

        todayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/todayOut.png"))); // NOI18N
        todayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        todayButton.setIconTextGap(0);
        todayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                todayButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                todayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                todayButtonMouseExited(evt);
            }
        });
        viewAppointmentPanel.add(todayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, -1));

        rightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/dayrightOut.png"))); // NOI18N
        rightButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightButton.setIconTextGap(0);
        rightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rightButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rightButtonMouseExited(evt);
            }
        });
        viewAppointmentPanel.add(rightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 150, -1));

        employeeNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewAppointmentPanel.add(employeeNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 170, 20));

        appointmentButtonPanelEvening.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closingLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        closingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closingLabel.setText("Closing Time");
        appointmentButtonPanelEvening.add(closingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 405, 215, -1));

        appoButtonLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/appointmentButtonPanelNew.jpg"))); // NOI18N
        appoButtonLabel2.setIconTextGap(0);
        appointmentButtonPanelEvening.add(appoButtonLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 425));

        viewAppointmentPanel.add(appointmentButtonPanelEvening, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 250, 425));

        appointmentButtonPanelMorning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lunchLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lunchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lunchLabel.setText("Lunch Time");
        appointmentButtonPanelMorning.add(lunchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, 215, -1));

        appoButtonLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/appointmentButtonPanelNew.jpg"))); // NOI18N
        appoButtonLabel1.setIconTextGap(0);
        appointmentButtonPanelMorning.add(appoButtonLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 425));

        viewAppointmentPanel.add(appointmentButtonPanelMorning, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 250, 425));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/background1.jpg"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(1080, 450));
        viewAppointmentPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 505));

        appointmentsPanel.add(viewAppointmentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1080, 505));

        dateDisplayLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dateDisplayLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateDisplayLabel.setText("jLabel4");
        appointmentsPanel.add(dateDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, -1));

        employeeTable.setBackground(new java.awt.Color(204, 204, 204));
        employeeTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeTable.setFillsViewportHeight(true);
        employeeTable.setRowHeight(25);
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(employeeTable);

        appointmentsPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/PanelBack.jpg"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jLabel2.setPreferredSize(new java.awt.Dimension(1326, 585));
        appointmentsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 590));

        jPanel1.add(appointmentsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        clientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientTable.setBackground(new java.awt.Color(204, 204, 204));
        clientTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Time", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientTable.setGridColor(new java.awt.Color(0, 0, 0));
        clientTable.setRowHeight(25);
        jScrollPane2.setViewportView(clientTable);

        clientPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        backButtonClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/backOut.png"))); // NOI18N
        backButtonClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButtonClient.setIconTextGap(0);
        backButtonClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonClientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonClientMouseExited(evt);
            }
        });
        clientPanel.add(backButtonClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"))); // NOI18N
        searchLabel.setIconTextGap(0);
        clientPanel.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 543, 30, 25));

        clientSearchText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientSearchText.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clientSearchText.setPreferredSize(new java.awt.Dimension(300, 28));
        clientSearchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientSearchTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientSearchTextMouseExited(evt);
            }
        });
        clientSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clientSearchTextKeyReleased(evt);
            }
        });
        clientPanel.add(clientSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 300, 30));

        deleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/deleteOut.png"))); // NOI18N
        deleteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLabel.setIconTextGap(0);
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteLabelMouseExited(evt);
            }
        });
        clientPanel.add(deleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 527, 150, 50));

        addLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/addOut.png"))); // NOI18N
        addLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addLabel.setIconTextGap(0);
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addLabelMouseExited(evt);
            }
        });
        clientPanel.add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 527, 150, 50));

        updateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/updateOut.png"))); // NOI18N
        updateLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLabel.setIconTextGap(0);
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateLabelMouseExited(evt);
            }
        });
        clientPanel.add(updateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 527, 150, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/PanelBack.jpg"))); // NOI18N
        jLabel3.setIconTextGap(0);
        jLabel3.setPreferredSize(new java.awt.Dimension(1326, 585));
        clientPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(clientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/background.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rightButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightButtonMouseEntered
        rightButton.setIcon(rightEnter);        
    }//GEN-LAST:event_rightButtonMouseEntered

    private void rightButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightButtonMouseExited
        rightButton.setIcon(rightOut);        
    }//GEN-LAST:event_rightButtonMouseExited

    private void leftButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftButtonMouseEntered
        leftButton.setIcon(leftEnter);        
    }//GEN-LAST:event_leftButtonMouseEntered

    private void leftButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftButtonMouseExited
        leftButton.setIcon(leftOut);        
    }//GEN-LAST:event_leftButtonMouseExited

    private void calanderLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calanderLabelMouseClicked
        
        SelectDate sd = new SelectDate(null, true);
        sd.setVisible(true);
        dateDisplayLabel.setText(Appointments.date);         
        String empID = this.selectEmployee();
        this.loadAppointmentDetails(empID);
        
    }//GEN-LAST:event_calanderLabelMouseClicked

    private void addLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseEntered
        addLabel.setIcon(addEnter);        
    }//GEN-LAST:event_addLabelMouseEntered

    private void addLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseExited
       addLabel.setIcon(addOut);        
    }//GEN-LAST:event_addLabelMouseExited

    private void todayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayButtonMouseEntered
       todayButton.setIcon(todayEnter);    
    }//GEN-LAST:event_todayButtonMouseEntered

    private void todayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayButtonMouseExited
       todayButton.setIcon(todayOut);        
    }//GEN-LAST:event_todayButtonMouseExited

    private void updateLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseEntered
       updateLabel.setIcon(updateEnter);        
    }//GEN-LAST:event_updateLabelMouseEntered

    private void updateLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseExited
       updateLabel.setIcon(updateOut);        
    }//GEN-LAST:event_updateLabelMouseExited

    private void deleteLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseEntered
       deleteLabel.setIcon(deleteEnter);        
    }//GEN-LAST:event_deleteLabelMouseEntered

    private void deleteLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseExited
       deleteLabel.setIcon(deleteOut);        
    }//GEN-LAST:event_deleteLabelMouseExited

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
       
        button1.setIcon(appointmentsEnter);
        button2.setIcon(clientsOut);
        
        appointmentsPanel.setVisible(true);
        clientPanel.setVisible(false);
        
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        
        button1.setIcon(appointmentsOut);
        button2.setIcon(clientsEnter);
        
        appointmentsPanel.setVisible(false);
        clientPanel.setVisible(true);
        
    }//GEN-LAST:event_button2MouseClicked

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
       
        AddNewClient anc = new AddNewClient(null, true);
        anc.setVisible(true);
        
    }//GEN-LAST:event_addLabelMouseClicked

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
        
        int slectedRow = clientTable.getSelectedRow();
        
        if (slectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the client that you need to be update.", "Message", JOptionPane.INFORMATION_MESSAGE);            
        }
        
        else{            
            
            String clientID = clientTable.getValueAt(slectedRow, 0).toString();
            
            UpdateClient uc = new UpdateClient(null,true,clientID);
            uc.setVisible(true);
            
        }
                
    }//GEN-LAST:event_updateLabelMouseClicked

    private void timeBackLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel1MouseEntered
        timeBackLabel1.setIcon(timeEnter);        
    }//GEN-LAST:event_timeBackLabel1MouseEntered

    private void timeBackLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel1MouseExited
       timeBackLabel1.setIcon(timeOut);        
    }//GEN-LAST:event_timeBackLabel1MouseExited

    private void timeBackLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel2MouseEntered
        timeBackLabel2.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel2MouseEntered

    private void timeBackLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel2MouseExited
       timeBackLabel2.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel2MouseExited

    private void timeBackLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel3MouseEntered
       timeBackLabel3.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel3MouseEntered

    private void timeBackLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel3MouseExited
       timeBackLabel3.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel3MouseExited

    private void timeBackLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel4MouseEntered
       timeBackLabel4.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel4MouseEntered

    private void timeBackLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel4MouseExited
       timeBackLabel4.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel4MouseExited

    private void timeBackLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel5MouseEntered
       timeBackLabel5.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel5MouseEntered

    private void timeBackLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel5MouseExited
       timeBackLabel5.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel5MouseExited

    private void timeBackLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel6MouseEntered
       timeBackLabel6.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel6MouseEntered

    private void timeBackLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel6MouseExited
       timeBackLabel6.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel6MouseExited

    private void timeBackLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel7MouseEntered
       timeBackLabel7.setIcon(timeEnter);   
    }//GEN-LAST:event_timeBackLabel7MouseEntered

    private void timeBackLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel7MouseExited
       timeBackLabel7.setIcon(timeOut);        
    }//GEN-LAST:event_timeBackLabel7MouseExited

    private void timeBackLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel8MouseEntered
       timeBackLabel8.setIcon(timeEnter);        
    }//GEN-LAST:event_timeBackLabel8MouseEntered

    private void timeBackLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel8MouseExited
       timeBackLabel8.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel8MouseExited

    private void timeBackLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel9MouseEntered
       timeBackLabel9.setIcon(timeEnter);       
    }//GEN-LAST:event_timeBackLabel9MouseEntered

    private void timeBackLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel9MouseExited
       timeBackLabel9.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel9MouseExited

    private void timeBackLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel10MouseEntered
       timeBackLabel10.setIcon(timeEnter);        
    }//GEN-LAST:event_timeBackLabel10MouseEntered

    private void timeBackLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel10MouseExited
       timeBackLabel10.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel10MouseExited

    private void timeBackLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel11MouseEntered
       timeBackLabel11.setIcon(timeEnter);        
    }//GEN-LAST:event_timeBackLabel11MouseEntered

    private void timeBackLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel11MouseExited
       timeBackLabel11.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel11MouseExited

    private void timeBackLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel12MouseEntered
        timeBackLabel12.setIcon(timeEnter);        
    }//GEN-LAST:event_timeBackLabel12MouseEntered

    private void timeBackLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel12MouseExited
        timeBackLabel12.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel12MouseExited

    private void timeBackLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel13MouseEntered
        timeBackLabel13.setIcon(timeEnter);      
    }//GEN-LAST:event_timeBackLabel13MouseEntered

    private void timeBackLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel13MouseExited
        timeBackLabel13.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel13MouseExited

    private void newAppointment(Time time){
        
        String empID = this.selectEmployee();
        if (empID != null) {
        
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String t = sdf.format(time);
            String date = dateDisplayLabel.getText(); 
            
            HandleNewAppointment hna = new HandleNewAppointment();
            hna.setClientDate(date);
            hna.setClientStartTime(t);
            hna.setEmployeeID(empID);
            
            try{
               ResultSet rs = hna.checkEmployeeAvailability();
               if (rs.next() ) {
                   JOptionPane.showMessageDialog(null, "This employee already has an appointment.", "Message", JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                    AddCliient ac = new AddCliient(null, true,empID,time,date);
                    ac.setVisible(true);
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
        
    }
       
    private int intoMinutes(String duration){
                
        String[] h1=duration.split(":");  
  
        int hour=Integer.parseInt(h1[0]);  
        int minute=Integer.parseInt(h1[1]);  
        int second=Integer.parseInt(h1[2]);  
  
        int temp;  
        temp = second + (minute) + (60 * hour);   
                
        return temp;
        
    }
   
    private void timeBackLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel1MouseClicked
        Time time = new Time(9, 0, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel1MouseClicked

    private void timeBackLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel2MouseClicked
        Time time = new Time(9, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel2MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        String empID = this.selectEmployee();
        this.loadAppointmentDetails(empID);
        
        loadClientDetails(); 
       
    }//GEN-LAST:event_formWindowActivated

    private void loadClientDetails(){
        
        HandleClient hc = new HandleClient();
        
        try{
            ResultSet rs = hc.viewClientDetails();
            clientTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        
    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
       
        int slectedRow = clientTable.getSelectedRow();
 
        if (slectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the client that you need to be delete.", "Message", JOptionPane.INFORMATION_MESSAGE);            
        }
        
        else{            
            
                HandleClient hc = new HandleClient();            
                
                hc.setClientID(clientTable.getValueAt(slectedRow, 0).toString());
                try{
                    int count = hc.deleteClient();
                    if (count != 0) {
                      JOptionPane.showMessageDialog(null, "Client has been deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
                } 
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "Client cannot be deleted since client is related to existing appointments.", "SQLIntegrityConstraintViolationException", JOptionPane.WARNING_MESSAGE);
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            
                
        }
        
    }//GEN-LAST:event_deleteLabelMouseClicked

    private void clientSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientSearchTextKeyReleased
        
        HandleClient hc = new HandleClient();
        hc.setSearchKey(clientSearchText.getText());
        
        try{
            ResultSet rs = hc.searchClient();
            clientTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        
        
    }//GEN-LAST:event_clientSearchTextKeyReleased

    private void clientSearchTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSearchTextMouseEntered
        searchLabel.setIcon(searchEnter); 
    }//GEN-LAST:event_clientSearchTextMouseEntered

    private void clientSearchTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSearchTextMouseExited
        searchLabel.setIcon(searchOut);
    }//GEN-LAST:event_clientSearchTextMouseExited

    private void timeBackLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel3MouseClicked
        Time time = new Time(9, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel3MouseClicked

    private void timeBackLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel4MouseClicked
        Time time = new Time(9, 45, 0);
        this.newAppointment(time);        
    }//GEN-LAST:event_timeBackLabel4MouseClicked

    private void timeBackLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel5MouseClicked
        Time time = new Time(10, 00, 0);
        this.newAppointment(time);        
    }//GEN-LAST:event_timeBackLabel5MouseClicked

    private void timeBackLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel6MouseClicked
        Time time = new Time(10, 15, 0);
        this.newAppointment(time);        
    }//GEN-LAST:event_timeBackLabel6MouseClicked

    private void timeBackLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel7MouseClicked
        Time time = new Time(10, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel7MouseClicked

    private void timeBackLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel8MouseClicked
        Time time = new Time(10, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel8MouseClicked

    private void timeBackLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel9MouseClicked
        Time time = new Time(11, 00, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel9MouseClicked

    private void timeBackLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel10MouseClicked
        Time time = new Time(11, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel10MouseClicked

    private void timeBackLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel11MouseClicked
        Time time = new Time(11, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel11MouseClicked

    private void timeBackLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel12MouseClicked
        Time time = new Time(11, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel12MouseClicked

    private void timeBackLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel13MouseClicked
        Time time = new Time(12, 0, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel13MouseClicked

    private void todayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayButtonMouseClicked
        this.selctToday(); 
        String empID = this.selectEmployee();
        this.loadAppointmentDetails(empID);
    }//GEN-LAST:event_todayButtonMouseClicked

    private String selectEmployee(){
        
        int selectedRow = employeeTable.getSelectedRow();
        String empID = null;
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the employee.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String employeeName = employeeTable.getValueAt(selectedRow, 0).toString();
            employeeNameLabel.setText(employeeName);        
        
            HandleAppointment ha = new HandleAppointment();
            ha.setEmployeeName(employeeName);
            try{
                ResultSet rs = ha.getSelectedEmployeeID();
                if (rs.next()) {
                    empID = rs.getString("Employee_ID");                     
                    InputStream employeeImage = rs.getBinaryStream("Profile_Picture");
                    
                    SetImageSize sis = new SetImageSize();                    
                    BufferedImage image = ImageIO.read(employeeImage);                    
                    EmpImage.setIcon(sis.addImageToLabel(image,170,170));
                                        
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
        return empID;
        
    }
    
    private void loadAppointmentDetails(String empID){
        
        HandleAppointment ha = new HandleAppointment();
        appoButtonLabel1.removeAll();
        appoButtonLabel2.removeAll();
        
        
        ha.setEmployeeID(empID);
        ha.setAppointmentDate(dateDisplayLabel.getText());
        int flagTimeMinitsMorniing = 540;    
        int flagTimeMinitsEvening = 840;  
        int positionX = 0;
                
        try{
            
            ResultSet rs = ha.getEmployeeAppointmentDetails();
            while(rs.next()){
                
                String appointmentID = rs.getString("Appointment_ID");
                String startTime = rs.getString("Start_Time");
                String endTime = rs.getString("End_Time");
                String clientName = rs.getString("CONCAT_WS('  ',Client.First_Name,Client.Last_Name)");
                String status = rs.getString("Status");
                
                int startTimeMinits = this.intoMinutes(startTime);
                int endTimeMinits = this.intoMinutes(endTime);
                
                
                if (startTimeMinits < 840) {
                    int flagDifference = startTimeMinits - flagTimeMinitsMorniing; 
                    int positionY = (flagDifference/15)*25;                
                
                
                    int duration = endTimeMinits - startTimeMinits;
                    int height = (duration/15)*25;
                
                
                    LinkedList appoButtonDetails = new LinkedList();
                    appoButtonDetails.add(appointmentID);
                    appoButtonDetails.add(startTime);
                    appoButtonDetails.add(endTime);
                    appoButtonDetails.add(clientName);
                    appoButtonDetails.add(status);
                    appoButtonDetails.add(empID);
                
                
                    AppointmentDisplayButton adp = new AppointmentDisplayButton(positionX,positionY,height,appoButtonDetails);
                    appoButtonLabel1.add(adp.appButton());
                   
                }
                else{
                    
                    int flagDifference = startTimeMinits - flagTimeMinitsEvening; 
                    int positionY = (flagDifference/15)*25;                
                
                
                    int duration = endTimeMinits - startTimeMinits;
                    int height = (duration/15)*25;
                
                
                    LinkedList appoButtonDetails = new LinkedList();
                    appoButtonDetails.add(appointmentID);
                    appoButtonDetails.add(startTime);
                    appoButtonDetails.add(endTime);
                    appoButtonDetails.add(clientName);
                    appoButtonDetails.add(status);
                    appoButtonDetails.add(empID);
                
                
                    AppointmentDisplayButton adp = new AppointmentDisplayButton(positionX,positionY,height,appoButtonDetails);
                    appoButtonLabel2.add(adp.appButton());
                    
                    
                }
                
                
            }
            appoButtonLabel1.repaint();
            appoButtonLabel2.repaint();
            viewAppointmentPanel.setVisible(true);
           
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
    
    
    private void backButtonAppointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonAppointmentsMouseEntered
        backButtonAppointments.setIcon(backEnter);
    }//GEN-LAST:event_backButtonAppointmentsMouseEntered

    private void backButtonAppointmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonAppointmentsMouseExited
        backButtonAppointments.setIcon(backOut);
    }//GEN-LAST:event_backButtonAppointmentsMouseExited

    private void backButtonAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonAppointmentsMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backButtonAppointmentsMouseClicked

    private void backButtonClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonClientMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backButtonClientMouseClicked

    private void backButtonClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonClientMouseEntered
        backButtonClient.setIcon(backEnter);
    }//GEN-LAST:event_backButtonClientMouseEntered

    private void backButtonClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonClientMouseExited
        backButtonClient.setIcon(backOut);
    }//GEN-LAST:event_backButtonClientMouseExited

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        
        String empID = this.selectEmployee();
        this.loadAppointmentDetails(empID);
        
    }//GEN-LAST:event_employeeTableMouseClicked

    private void timeBackLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel14MouseClicked
        Time time = new Time(12, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel14MouseClicked

    private void timeBackLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel14MouseEntered
        timeBackLabel14.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel14MouseEntered

    private void timeBackLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel14MouseExited
        timeBackLabel14.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel14MouseExited

    private void timeBackLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel15MouseClicked
        Time time = new Time(12, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel15MouseClicked

    private void timeBackLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel15MouseEntered
        timeBackLabel15.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel15MouseEntered

    private void timeBackLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel15MouseExited
        timeBackLabel15.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel15MouseExited

    private void timeBackLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel16MouseClicked
        Time time = new Time(12, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel16MouseClicked

    private void timeBackLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel16MouseEntered
        timeBackLabel16.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel16MouseEntered

    private void timeBackLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel16MouseExited
        timeBackLabel16.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel16MouseExited

    private void timeBackLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel17MouseClicked
       
    }//GEN-LAST:event_timeBackLabel17MouseClicked

    private void timeBackLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel17MouseEntered
        timeBackLabel17.setIcon(timeEnter);
        lunchLabel.setVisible(true);
    }//GEN-LAST:event_timeBackLabel17MouseEntered

    private void timeBackLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel17MouseExited
        timeBackLabel17.setIcon(timeOut);
        lunchLabel.setVisible(false);
    }//GEN-LAST:event_timeBackLabel17MouseExited

    private void timeBackLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel18MouseClicked
        Time time = new Time(14, 0, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel18MouseClicked

    private void timeBackLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel18MouseEntered
        timeBackLabel18.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel18MouseEntered

    private void timeBackLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel18MouseExited
        timeBackLabel18.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel18MouseExited

    private void timeBackLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel19MouseClicked
        Time time = new Time(14, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel19MouseClicked

    private void timeBackLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel19MouseEntered
        timeBackLabel19.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel19MouseEntered

    private void timeBackLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel19MouseExited
        timeBackLabel19.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel19MouseExited

    private void timeBackLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel20MouseClicked
        Time time = new Time(14, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel20MouseClicked

    private void timeBackLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel20MouseEntered
        timeBackLabel20.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel20MouseEntered

    private void timeBackLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel20MouseExited
        timeBackLabel20.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel20MouseExited

    private void timeBackLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel21MouseClicked
        Time time = new Time(14, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel21MouseClicked

    private void timeBackLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel21MouseEntered
        timeBackLabel21.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel21MouseEntered

    private void timeBackLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel21MouseExited
        timeBackLabel21.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel21MouseExited

    private void timeBackLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel22MouseClicked
        Time time = new Time(15, 0, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel22MouseClicked

    private void timeBackLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel22MouseEntered
        timeBackLabel22.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel22MouseEntered

    private void timeBackLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel22MouseExited
        timeBackLabel22.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel22MouseExited

    private void timeBackLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel23MouseClicked
        Time time = new Time(15, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel23MouseClicked

    private void timeBackLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel23MouseEntered
        timeBackLabel23.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel23MouseEntered

    private void timeBackLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel23MouseExited
        timeBackLabel23.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel23MouseExited

    private void timeBackLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel24MouseClicked
        Time time = new Time(15, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel24MouseClicked

    private void timeBackLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel24MouseEntered
        timeBackLabel24.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel24MouseEntered

    private void timeBackLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel24MouseExited
        timeBackLabel24.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel24MouseExited

    private void timeBackLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel25MouseClicked
        Time time = new Time(15, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel25MouseClicked

    private void timeBackLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel25MouseEntered
        timeBackLabel25.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel25MouseEntered

    private void timeBackLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel25MouseExited
        timeBackLabel25.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel25MouseExited

    private void timeBackLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel26MouseClicked
        Time time = new Time(16, 0, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel26MouseClicked

    private void timeBackLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel26MouseEntered
        timeBackLabel26.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel26MouseEntered

    private void timeBackLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel26MouseExited
        timeBackLabel26.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel26MouseExited

    private void timeBackLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel27MouseClicked
        Time time = new Time(16, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel27MouseClicked

    private void timeBackLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel27MouseEntered
        timeBackLabel27.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel27MouseEntered

    private void timeBackLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel27MouseExited
        timeBackLabel27.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel27MouseExited

    private void timeBackLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel28MouseClicked
        Time time = new Time(16, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel28MouseClicked

    private void timeBackLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel28MouseEntered
        timeBackLabel28.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel28MouseEntered

    private void timeBackLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel28MouseExited
        timeBackLabel28.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel28MouseExited

    private void timeBackLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel29MouseClicked
        Time time = new Time(16, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel29MouseClicked

    private void timeBackLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel29MouseEntered
        timeBackLabel29.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel29MouseEntered

    private void timeBackLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel29MouseExited
        timeBackLabel29.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel29MouseExited

    private void timeBackLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel30MouseClicked
        Time time = new Time(17, 0, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel30MouseClicked

    private void timeBackLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel30MouseEntered
        timeBackLabel30.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel30MouseEntered

    private void timeBackLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel30MouseExited
        timeBackLabel30.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel30MouseExited

    private void timeBackLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel31MouseClicked
        Time time = new Time(17, 15, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel31MouseClicked

    private void timeBackLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel31MouseEntered
        timeBackLabel31.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel31MouseEntered

    private void timeBackLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel31MouseExited
        timeBackLabel31.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel31MouseExited

    private void timeBackLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel32MouseClicked
        Time time = new Time(17, 30, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel32MouseClicked

    private void timeBackLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel32MouseEntered
        timeBackLabel32.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel32MouseEntered

    private void timeBackLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel32MouseExited
        timeBackLabel32.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel32MouseExited

    private void timeBackLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel33MouseClicked
         Time time = new Time(17, 45, 0);
        this.newAppointment(time);
    }//GEN-LAST:event_timeBackLabel33MouseClicked

    private void timeBackLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel33MouseEntered
        timeBackLabel33.setIcon(timeEnter);
    }//GEN-LAST:event_timeBackLabel33MouseEntered

    private void timeBackLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel33MouseExited
        timeBackLabel33.setIcon(timeOut);
    }//GEN-LAST:event_timeBackLabel33MouseExited

    private void timeBackLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel34MouseClicked
     
    }//GEN-LAST:event_timeBackLabel34MouseClicked

    private void timeBackLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel34MouseEntered
        timeBackLabel34.setIcon(timeEnter);
        closingLabel.setVisible(true);
    }//GEN-LAST:event_timeBackLabel34MouseEntered

    private void timeBackLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeBackLabel34MouseExited
        timeBackLabel34.setIcon(timeOut);
        closingLabel.setVisible(false);
    }//GEN-LAST:event_timeBackLabel34MouseExited

    private void rightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightButtonMouseClicked
        
        String currentDate = dateDisplayLabel.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date cDate = sdf.parse(currentDate);
            Date nextDate = addDays(cDate, 1);
            dateDisplayLabel.setText(sdf.format(nextDate));
            String empID = this.selectEmployee();
            this.loadAppointmentDetails(empID);
            
        }
        catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Invalid date format.", "ParseException", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_rightButtonMouseClicked

    private void leftButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftButtonMouseClicked
        
        String currentDate = dateDisplayLabel.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date cDate = sdf.parse(currentDate);
            Date nextDate = addDays(cDate, -1);
            dateDisplayLabel.setText(sdf.format(nextDate));
            String empID = this.selectEmployee();
            this.loadAppointmentDetails(empID);
            
        }
        catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Invalid date format.", "ParseException", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_leftButtonMouseClicked

    private Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
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
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmpImage;
    private javax.swing.JLabel addLabel;
    private javax.swing.JLabel appoButtonLabel1;
    private javax.swing.JLabel appoButtonLabel2;
    private javax.swing.JPanel appointmentButtonPanelEvening;
    private javax.swing.JPanel appointmentButtonPanelMorning;
    private javax.swing.JPanel appointmentsPanel;
    private javax.swing.JLabel backButtonAppointments;
    private javax.swing.JLabel backButtonClient;
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel buttonGlass1;
    private javax.swing.JLabel calanderLabel;
    private javax.swing.JPanel clientPanel;
    private javax.swing.JTextField clientSearchText;
    private javax.swing.JTable clientTable;
    private javax.swing.JLabel closingLabel;
    private javax.swing.JLabel dateDisplayLabel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel leftButton;
    private javax.swing.JLabel lunchLabel;
    private javax.swing.JLabel rightButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel timeBackLabel1;
    private javax.swing.JLabel timeBackLabel10;
    private javax.swing.JLabel timeBackLabel11;
    private javax.swing.JLabel timeBackLabel12;
    private javax.swing.JLabel timeBackLabel13;
    private javax.swing.JLabel timeBackLabel14;
    private javax.swing.JLabel timeBackLabel15;
    private javax.swing.JLabel timeBackLabel16;
    private javax.swing.JLabel timeBackLabel17;
    private javax.swing.JLabel timeBackLabel18;
    private javax.swing.JLabel timeBackLabel19;
    private javax.swing.JLabel timeBackLabel2;
    private javax.swing.JLabel timeBackLabel20;
    private javax.swing.JLabel timeBackLabel21;
    private javax.swing.JLabel timeBackLabel22;
    private javax.swing.JLabel timeBackLabel23;
    private javax.swing.JLabel timeBackLabel24;
    private javax.swing.JLabel timeBackLabel25;
    private javax.swing.JLabel timeBackLabel26;
    private javax.swing.JLabel timeBackLabel27;
    private javax.swing.JLabel timeBackLabel28;
    private javax.swing.JLabel timeBackLabel29;
    private javax.swing.JLabel timeBackLabel3;
    private javax.swing.JLabel timeBackLabel30;
    private javax.swing.JLabel timeBackLabel31;
    private javax.swing.JLabel timeBackLabel32;
    private javax.swing.JLabel timeBackLabel33;
    private javax.swing.JLabel timeBackLabel34;
    private javax.swing.JLabel timeBackLabel4;
    private javax.swing.JLabel timeBackLabel5;
    private javax.swing.JLabel timeBackLabel6;
    private javax.swing.JLabel timeBackLabel7;
    private javax.swing.JLabel timeBackLabel8;
    private javax.swing.JLabel timeBackLabel9;
    private javax.swing.JLabel timeLabel1;
    private javax.swing.JLabel timeLabel10;
    private javax.swing.JLabel timeLabel11;
    private javax.swing.JLabel timeLabel12;
    private javax.swing.JLabel timeLabel13;
    private javax.swing.JLabel timeLabel14;
    private javax.swing.JLabel timeLabel15;
    private javax.swing.JLabel timeLabel16;
    private javax.swing.JLabel timeLabel17;
    private javax.swing.JLabel timeLabel18;
    private javax.swing.JLabel timeLabel19;
    private javax.swing.JLabel timeLabel2;
    private javax.swing.JLabel timeLabel20;
    private javax.swing.JLabel timeLabel21;
    private javax.swing.JLabel timeLabel22;
    private javax.swing.JLabel timeLabel23;
    private javax.swing.JLabel timeLabel24;
    private javax.swing.JLabel timeLabel25;
    private javax.swing.JLabel timeLabel26;
    private javax.swing.JLabel timeLabel27;
    private javax.swing.JLabel timeLabel28;
    private javax.swing.JLabel timeLabel29;
    private javax.swing.JLabel timeLabel3;
    private javax.swing.JLabel timeLabel30;
    private javax.swing.JLabel timeLabel31;
    private javax.swing.JLabel timeLabel32;
    private javax.swing.JLabel timeLabel33;
    private javax.swing.JLabel timeLabel34;
    private javax.swing.JLabel timeLabel4;
    private javax.swing.JLabel timeLabel5;
    private javax.swing.JLabel timeLabel6;
    private javax.swing.JLabel timeLabel7;
    private javax.swing.JLabel timeLabel8;
    private javax.swing.JLabel timeLabel9;
    private javax.swing.JLabel todayButton;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JPanel viewAppointmentPanel;
    // End of variables declaration//GEN-END:variables
}
