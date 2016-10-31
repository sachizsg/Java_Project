/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.MainMenu;



import salonmanagementsystem.FadeAnimation;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import model.Employee.HandleEmployee;
import model.Inventory.HandleStocks;
import model.Login.HandleLogin;
import view.Appointments.Appointments;
import view.Employee.Employee;
import view.Finance.Finanace;
import view.Inventory.Inventory;
import view.Login.Administrator;
import view.Login.SalonLogin;
import view.PointOfSale.PointOfSale;
import view.Reports.Reports;
import view.Services.Services;


/**
 *
 * @author Samu
 */
public class MainMenu extends javax.swing.JFrame {

    
    FadeAnimation fa = new FadeAnimation();
   
    
    private LayoutManager AbsouluteLayOut;
    Border border ;  
   
    private final ImageIcon logOutOut;
    private final ImageIcon logOutEnter;
    
    private final ImageIcon nextOut;
    private final ImageIcon nextEnter;
   
    private int count = 1;
    
    
    public MainMenu() {
        initComponents();        
        
        logOutOut = new ImageIcon(getClass().getResource("/view/MainMenu/logOutOut.png"));
        logOutEnter = new ImageIcon(getClass().getResource("/view/MainMenu/logOutEnter.png"));     
        
        nextOut = new ImageIcon(getClass().getResource("/view/MainMenu/nextOut.png"));
        nextEnter = new ImageIcon(getClass().getResource("/view/MainMenu/nextEnter.png"));     
        
        this.setUserSettings();
        this.slideAnimation();
        
        this.setIcon();
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);       
        
       
    }

    private void setUserSettings(){
        
        HandleLogin hl = new HandleLogin();
        hl.setUsertType(SalonLogin.userType);
        
        try{
            ResultSet rs = hl.getLoginSettings();
            
            if (rs.next()) {
                    
                    if (rs.getString("Appointments").equals("T")) {
                        menuLabel1.setVisible(true);
                        menuButton1.setVisible(true);
                    }
                    else{
                        menuLabel1.setVisible(false);
                        menuButton1.setVisible(false);
                    }
                    if (rs.getString("Services").equals("T")) {
                        menuLabel2.setVisible(true);
                        menuButton2.setVisible(true);
                    }
                    else{
                        menuLabel2.setVisible(false);
                        menuButton2.setVisible(false);
                    }
                    if (rs.getString("Inventory").equals("T")) {
                        menuLabel3.setVisible(true);
                        menuButton3.setVisible(true);
                    }
                    else{
                        menuLabel3.setVisible(false);
                        menuButton3.setVisible(false);
                    }
                    if (rs.getString("Sales").equals("T")) {
                        menuLabel4.setVisible(true);
                        menuButton4.setVisible(true);
                    }
                    else{
                        menuLabel4.setVisible(false);
                        menuButton4.setVisible(false);
                    }
                    if (rs.getString("Employees").equals("T")) {
                        menuLabel5.setVisible(true);
                        menuButton5.setVisible(true);
                    }
                    else{
                        menuLabel5.setVisible(false);
                        menuButton5.setVisible(false);
                    }
                    if (rs.getString("Finance").equals("T")) {
                        menuLabel6.setVisible(true);
                        menuButton6.setVisible(true);
                    }
                    else{
                        menuLabel6.setVisible(false);
                        menuButton6.setVisible(false);
                    }
                    if (rs.getString("Reports").equals("T")) {
                        menuLabel7.setVisible(true);
                        menuButton7.setVisible(true);
                    }
                    else{
                        menuLabel7.setVisible(false);
                        menuButton7.setVisible(false);
                    }
                    if (rs.getString("Administrator").equals("T")) {
                        menuLabel8.setVisible(true);
                        menuButton8.setVisible(true);
                    }
                    else{
                        menuLabel8.setVisible(false);
                        menuButton8.setVisible(false);
                    }
                    
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
    
    private void slideAnimation(){
                       
        fa.setLayout(AbsouluteLayOut);        
        fa.setBounds(0, 0, 1366, 600);     
        
        this.addButtons();
        this.addNames();
        
        backgroundPanel.setBackground(Color.GRAY);
        border = BorderFactory.createLineBorder(Color.GRAY, 5); 
        
        backgroundPanel.add(fa); 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JLabel();
        menuButton1 = new javax.swing.JLabel();
        menuLabel1 = new javax.swing.JLabel();
        menuButton2 = new javax.swing.JLabel();
        menuLabel2 = new javax.swing.JLabel();
        menuButton3 = new javax.swing.JLabel();
        menuLabel3 = new javax.swing.JLabel();
        menuButton4 = new javax.swing.JLabel();
        menuLabel4 = new javax.swing.JLabel();
        menuButton5 = new javax.swing.JLabel();
        menuLabel5 = new javax.swing.JLabel();
        menuButton6 = new javax.swing.JLabel();
        menuLabel6 = new javax.swing.JLabel();
        menuButton7 = new javax.swing.JLabel();
        menuLabel7 = new javax.swing.JLabel();
        menuButton8 = new javax.swing.JLabel();
        menuLabel8 = new javax.swing.JLabel();
        changeImages = new javax.swing.JLabel();
        messageCount = new javax.swing.JLabel();
        mesageLabel = new javax.swing.JLabel();
        messages = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1386, 661));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(0, 0, 51));

        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/logOutOut.png"))); // NOI18N
        logOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutButton.setIconTextGap(0);
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });

        menuButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/appointments.png"))); // NOI18N
        menuButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton1.setIconTextGap(0);
        menuButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton1MouseExited(evt);
            }
        });

        menuLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel1.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel1.setText("Appointments");
        menuLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel1.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel1.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel1.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/services.png"))); // NOI18N
        menuButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton2.setIconTextGap(0);
        menuButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton2MouseExited(evt);
            }
        });

        menuLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel2.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel2.setText("Services");
        menuLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel2.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel2.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel2.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/inventory.png"))); // NOI18N
        menuButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton3.setIconTextGap(0);
        menuButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton3MouseExited(evt);
            }
        });

        menuLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel3.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel3.setText("Inventory");
        menuLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel3.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel3.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel3.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/sales.png"))); // NOI18N
        menuButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton4.setIconTextGap(0);
        menuButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton4MouseExited(evt);
            }
        });

        menuLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel4.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel4.setText("Sales");
        menuLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel4.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel4.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel4.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/employees.png"))); // NOI18N
        menuButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton5.setIconTextGap(0);
        menuButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton5MouseExited(evt);
            }
        });

        menuLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel5.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel5.setText("Employees");
        menuLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel5.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel5.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel5.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/finance.png"))); // NOI18N
        menuButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton6.setIconTextGap(0);
        menuButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton6MouseExited(evt);
            }
        });

        menuLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel6.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel6.setText("Finance");
        menuLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel6.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel6.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel6.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/reports.png"))); // NOI18N
        menuButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton7.setIconTextGap(0);
        menuButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton7MouseExited(evt);
            }
        });

        menuLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel7.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel7.setText("Reports");
        menuLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel7.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel7.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel7.setPreferredSize(new java.awt.Dimension(125, 25));

        menuButton8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/admin.png"))); // NOI18N
        menuButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton8.setIconTextGap(0);
        menuButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButton8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton8MouseExited(evt);
            }
        });

        menuLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLabel8.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel8.setText("Administrator");
        menuLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel8.setMaximumSize(new java.awt.Dimension(125, 25));
        menuLabel8.setMinimumSize(new java.awt.Dimension(125, 25));
        menuLabel8.setPreferredSize(new java.awt.Dimension(125, 25));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(menuLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(menuButton3))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(menuLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(menuButton4))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(menuButton1))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(menuLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(menuButton2))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(menuLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(menuLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(menuButton5))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(menuLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(menuButton6)))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(menuButton7)))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(menuButton8)))))
                .addContainerGap(714, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logOutButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(menuButton5))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(menuLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(menuButton1))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(menuLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(menuButton6))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(menuButton2))
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(183, 183, 183)
                                    .addComponent(menuButton3))
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(293, 293, 293)
                                    .addComponent(menuLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(35, 35, 35)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(menuLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(menuButton7)))
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addComponent(menuLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(155, 155, 155)
                                    .addComponent(menuLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(menuLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(menuButton4)
                                            .addGap(70, 70, 70)))
                                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                            .addGap(120, 120, 120)
                                            .addComponent(menuLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(menuButton8)))))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logOutButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 1345, 550));

        changeImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/nextOut.png"))); // NOI18N
        changeImages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeImages.setIconTextGap(0);
        changeImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeImagesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeImagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeImagesMouseExited(evt);
            }
        });
        jPanel1.add(changeImages, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, -1));

        messageCount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        messageCount.setForeground(new java.awt.Color(255, 255, 255));
        messageCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageCount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(messageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 60, 50));

        mesageLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mesageLabel.setForeground(new java.awt.Color(255, 255, 255));
        mesageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesageLabel.setText("Messages");
        mesageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mesageLabel.setMaximumSize(new java.awt.Dimension(125, 25));
        mesageLabel.setMinimumSize(new java.awt.Dimension(125, 25));
        mesageLabel.setPreferredSize(new java.awt.Dimension(125, 25));
        jPanel1.add(mesageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 110, 110, -1));

        messages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/m3.png"))); // NOI18N
        messages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messages.setIconTextGap(0);
        messages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messagesMouseClicked(evt);
            }
        });
        jPanel1.add(messages, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 100, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/salonimglogo.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MainMenu/Background1.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jLabel1.setPreferredSize(new java.awt.Dimension(1386, 661));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1458, 837));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton1MouseEntered
        menuButton1.setBorder(border);
    }//GEN-LAST:event_menuButton1MouseEntered

    private void menuButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton1MouseExited
        menuButton1.setBorder(null);
    }//GEN-LAST:event_menuButton1MouseExited

    private void menuButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton2MouseEntered
        menuButton2.setBorder(border);
    }//GEN-LAST:event_menuButton2MouseEntered

    private void menuButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton2MouseExited
        menuButton2.setBorder(null);
    }//GEN-LAST:event_menuButton2MouseExited

    private void menuButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton3MouseEntered
        menuButton3.setBorder(border);
    }//GEN-LAST:event_menuButton3MouseEntered

    private void menuButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton3MouseExited
        menuButton3.setBorder(null);
    }//GEN-LAST:event_menuButton3MouseExited

    private void menuButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton4MouseEntered
        menuButton4.setBorder(border);
    }//GEN-LAST:event_menuButton4MouseEntered

    private void menuButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton4MouseExited
        menuButton4.setBorder(null);
    }//GEN-LAST:event_menuButton4MouseExited

    private void menuButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton5MouseEntered
        menuButton5.setBorder(border);
    }//GEN-LAST:event_menuButton5MouseEntered

    private void menuButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton5MouseExited
        menuButton5.setBorder(null);
    }//GEN-LAST:event_menuButton5MouseExited

    private void menuButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton6MouseEntered
        menuButton6.setBorder(border);
    }//GEN-LAST:event_menuButton6MouseEntered

    private void menuButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton6MouseExited
        menuButton6.setBorder(null);
    }//GEN-LAST:event_menuButton6MouseExited

    private void menuButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton7MouseEntered
        menuButton7.setBorder(border);
    }//GEN-LAST:event_menuButton7MouseEntered

    private void menuButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton7MouseExited
        menuButton7.setBorder(null);
    }//GEN-LAST:event_menuButton7MouseExited

    private void menuButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton8MouseEntered
        menuButton8.setBorder(border);
    }//GEN-LAST:event_menuButton8MouseEntered

    private void menuButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton8MouseExited
        menuButton8.setBorder(null);
    }//GEN-LAST:event_menuButton8MouseExited

    private void menuButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton1MouseClicked
        
        HandleEmployee he = new HandleEmployee();
        try{
            ResultSet rs = he.checkEmployee();
            if (rs.next()) {
                Appointments a = new Appointments();
                this.dispose();
                a.setVisible(true);        
            }
            else{
                JOptionPane.showMessageDialog(null, "Please add employee details before make an appointment.", "Add Employee", JOptionPane.INFORMATION_MESSAGE);   
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
        
        
    }//GEN-LAST:event_menuButton1MouseClicked

    private void menuButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton2MouseClicked
        Services s = new Services();
        this.dispose();
        s.setVisible(true);
    }//GEN-LAST:event_menuButton2MouseClicked

    private void menuButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton3MouseClicked
        Inventory i = new Inventory();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuButton3MouseClicked

    private void menuButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton4MouseClicked
        PointOfSale pos = new PointOfSale();
        this.dispose();
        pos.setVisible(true);
    }//GEN-LAST:event_menuButton4MouseClicked

    private void menuButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton5MouseClicked
        Employee e = new Employee();
        this.dispose();
        e.setVisible(true);
    }//GEN-LAST:event_menuButton5MouseClicked

    private void menuButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton6MouseClicked
        Finanace f = new Finanace(); 
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_menuButton6MouseClicked

    private void menuButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton8MouseClicked
        Administrator a = new Administrator(null, true);        
        a.setVisible(true);
    }//GEN-LAST:event_menuButton8MouseClicked

    private void menuButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButton7MouseClicked
        Reports r = new Reports();
        this.dispose();
        r.setVisible(true);        
    }//GEN-LAST:event_menuButton7MouseClicked

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        SalonLogin sl = new SalonLogin();
        this.dispose();
        sl.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        logOutButton.setIcon(logOutEnter);
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        logOutButton.setIcon(logOutOut);
    }//GEN-LAST:event_logOutButtonMouseExited

    private void changeImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeImagesMouseClicked
       
        switch(this.count) {
            case 1:  
                fa.paint(1);
                count = 2;
                break;
            case 2:
                fa.paint(2);
                count = 3;
                break;
            case 3:
                fa.paint(3);        
                count = 4;
                break; 
            case 4:
                fa.paint(4);           
                count = 1;
                break;    
            
        }          
      
       
    }//GEN-LAST:event_changeImagesMouseClicked

    private void messagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messagesMouseClicked
        Messages m = new Messages(this, true);
        m.setVisible(true);  
    }//GEN-LAST:event_messagesMouseClicked

    private void changeImagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeImagesMouseEntered
        changeImages.setIcon(nextEnter);
    }//GEN-LAST:event_changeImagesMouseEntered

    private void changeImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeImagesMouseExited
        changeImages.setIcon(nextOut);
    }//GEN-LAST:event_changeImagesMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.messageCount();
    }//GEN-LAST:event_formWindowActivated

    private void addButtons(){
        
        menuButton1.setBounds(100, 75, 100, 100);
        fa.add(menuButton1);
        
        menuButton2.setBounds(250, 75, 100, 100);
        fa.add(menuButton2);
        
        menuButton3.setBounds(400, 75, 100, 100);
        fa.add(menuButton3);
        
        menuButton4.setBounds(550, 75, 100, 100);
        fa.add(menuButton4);
        
        menuButton5.setBounds(100, 250, 100, 100);
        fa.add(menuButton5);        
        
        menuButton6.setBounds(250, 250, 100, 100);
        fa.add(menuButton6);
        
        menuButton7.setBounds(400, 250, 100, 100);
        fa.add(menuButton7);
      
        menuButton8.setBounds(550, 250, 100, 100);
        fa.add(menuButton8);
        
        logOutButton.setBounds(40, 475, 150, 50);
        fa.add(logOutButton);
        
        changeImages.setBounds(675, 350, 100, 100);
        fa.add(changeImages);

    }
    
    private void addNames(){
        
        menuLabel1.setBounds(85, 185, 125, 25);
        fa.add(menuLabel1);
        
        menuLabel2.setBounds(235, 185, 125, 25);
        fa.add(menuLabel2);
        
        menuLabel3.setBounds(385, 185, 125, 25);
        fa.add(menuLabel3);
        
        menuLabel4.setBounds(535, 185, 125, 25);
        fa.add(menuLabel4);
        
        menuLabel5.setBounds(85, 360, 125, 25);
        fa.add(menuLabel5);
        
        menuLabel6.setBounds(235, 360, 125, 25);
        fa.add(menuLabel6);
        
        menuLabel7.setBounds(385, 360, 125, 25);        
        fa.add(menuLabel7);
      
        menuLabel8.setBounds(535, 360, 125, 25);       
        fa.add(menuLabel8);

        
    }
    
    private void messageCount(){
      int rows = 0;
        try{
              HandleStocks hi = new HandleStocks();
              ResultSet rs = hi.stockMessages();
 
              if (rs.last()) {
                rows = rs.getRow();                
                rs.beforeFirst();
               
              }              
              
             messageCount.setText(Integer.toString(rows));
              
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
       
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mainMenu.png")));
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel changeImages;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logOutButton;
    public javax.swing.JLabel menuButton1;
    public javax.swing.JLabel menuButton2;
    public javax.swing.JLabel menuButton3;
    public javax.swing.JLabel menuButton4;
    public javax.swing.JLabel menuButton5;
    public javax.swing.JLabel menuButton6;
    public javax.swing.JLabel menuButton7;
    public javax.swing.JLabel menuButton8;
    private javax.swing.JLabel menuLabel1;
    private javax.swing.JLabel menuLabel2;
    private javax.swing.JLabel menuLabel3;
    private javax.swing.JLabel menuLabel4;
    private javax.swing.JLabel menuLabel5;
    private javax.swing.JLabel menuLabel6;
    private javax.swing.JLabel menuLabel7;
    private javax.swing.JLabel menuLabel8;
    private javax.swing.JLabel mesageLabel;
    private javax.swing.JLabel messageCount;
    private javax.swing.JLabel messages;
    // End of variables declaration//GEN-END:variables
}
