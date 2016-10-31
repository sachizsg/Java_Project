/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.PointOfSale;


import java.awt.Toolkit;
import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PointOfSale.HandlePointOfSale;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import javax.swing.JFrame;
import model.Appointments.HandleAppointment;
import model.Inventory.HandleStocks;
import model.PointOfSale.ValidatePointOfSale;
import view.MainMenu.MainMenu;

/**
 *
 * @author Nadee
 */
public class PointOfSale extends javax.swing.JFrame {

    private final ImageIcon newinvoiceOut;
    private final ImageIcon newinvoiceEnter;
    private final ImageIcon deleteOut;
    private final ImageIcon deleteEnter;
    private final ImageIcon endsaleOut;
    private final ImageIcon endsaleEnter;
    private final ImageIcon historyOut;
    private final ImageIcon historyEnter;
    private final ImageIcon salesOut;
    private final ImageIcon salesEnter;
    private final ImageIcon backOut;
    private final ImageIcon backEnter;
    private final ImageIcon searchOut;
    private final ImageIcon searchEnter;
    private final ImageIcon quantityOut;
    private final ImageIcon quantityEnter;
    
    private int count = 0;
    public static String quan;
    public static int stockLevel;
       
    public PointOfSale() {
        initComponents();
        newinvoiceOut = new ImageIcon(getClass().getResource("/view/PointOfSale/newinvoiceOut.png"));
        newinvoiceEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/newinvoiceEnter.png"));
        deleteOut = new ImageIcon(getClass().getResource("/view/PointOfSale/deleteOut.png"));
        deleteEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/deleteEnter.png"));
        endsaleOut = new ImageIcon(getClass().getResource("/view/PointOfSale/endsaleOut.png"));
        endsaleEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/endsaleEnter.png"));
        historyOut = new ImageIcon(getClass().getResource("/view/PointOfSale/historyOut.png"));
        historyEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/historyEnter.png"));
        salesOut = new ImageIcon(getClass().getResource("/view/PointOfSale/salesOut.png"));
        salesEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/salesEnter.png"));
        backOut = new ImageIcon(getClass().getResource("/view/PointOfSale/backOut.png"));
        backEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/backEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/PointOfSale/searchOut.png"));
        searchEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/searchEnter.png"));
        quantityOut = new ImageIcon(getClass().getResource("/view/PointOfSale/quantityOut.png"));
        quantityEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/quantityEnter.png"));

        this.updateInvoiceID();        
        this.loadStocks();
        this.loadServices();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String currentDate = df.format(d);
        Date.setText(currentDate);
       
        balanceText.setEditable(false);
        
        this.setIcon();        
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
    }
    
    public PointOfSale(String appoID,String charge) {
        initComponents();
        newinvoiceOut = new ImageIcon(getClass().getResource("/view/PointOfSale/newinvoiceOut.png"));
        newinvoiceEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/newinvoiceEnter.png"));
        deleteOut = new ImageIcon(getClass().getResource("/view/PointOfSale/deleteOut.png"));
        deleteEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/deleteEnter.png"));
        endsaleOut = new ImageIcon(getClass().getResource("/view/PointOfSale/endsaleOut.png"));
        endsaleEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/endsaleEnter.png"));
        historyOut = new ImageIcon(getClass().getResource("/view/PointOfSale/historyOut.png"));
        historyEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/historyEnter.png"));
        salesOut = new ImageIcon(getClass().getResource("/view/PointOfSale/salesOut.png"));
        salesEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/salesEnter.png"));
        backOut = new ImageIcon(getClass().getResource("/view/PointOfSale/backOut.png"));
        backEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/backEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/PointOfSale/searchOut.png"));
        searchEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/searchEnter.png"));
        quantityOut = new ImageIcon(getClass().getResource("/view/PointOfSale/quantityOut.png"));
        quantityEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/quantityEnter.png"));

        this.updateInvoiceID();  
        this.loadStocks();
        this.loadServices();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String currentDate = df.format(d);
        Date.setText(currentDate);
       
        balanceText.setEditable(false);
        
        this.addAppointmentsToInvoice(appoID,charge);
        
        this.setIcon();        
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(PointOfSale.DISPOSE_ON_CLOSE);
       
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invoiceID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchService = new javax.swing.JLabel();
        serviceSearchText = new javax.swing.JTextField();
        searchStock = new javax.swing.JLabel();
        stockSearchText = new javax.swing.JTextField();
        ItemTable = new javax.swing.JScrollPane();
        StockTable = new javax.swing.JTable();
        ServiceTable = new javax.swing.JScrollPane();
        ServicesTable = new javax.swing.JTable();
        InvoiceTable = new javax.swing.JScrollPane();
        PointOfSaleTable = new javax.swing.JTable();
        salesTotalText = new javax.swing.JTextField();
        History = new javax.swing.JLabel();
        stLabel = new javax.swing.JLabel();
        prLable = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        EndSale = new javax.swing.JLabel();
        backButtonPOS = new javax.swing.JLabel();
        addQuantity = new javax.swing.JLabel();
        Sales = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        New = new javax.swing.JLabel();
        balanceText = new javax.swing.JTextField();
        paymentReceivedText = new javax.swing.JTextField();
        panel = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Date.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("2014-11-09");
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 100, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Invoice ID :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 70, 110, 30));

        invoiceID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        invoiceID.setForeground(new java.awt.Color(255, 255, 255));
        invoiceID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        invoiceID.setText("001");
        jPanel1.add(invoiceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 70, 60, 30));

        jPanel2.setMinimumSize(new java.awt.Dimension(1326, 585));
        jPanel2.setPreferredSize(new java.awt.Dimension(1326, 585));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/searchOut.png"))); // NOI18N
        searchService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(searchService, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 273, 30, 24));

        serviceSearchText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serviceSearchText.setPreferredSize(new java.awt.Dimension(300, 30));
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
        jPanel2.add(serviceSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 330, 30));

        searchStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/searchOut.png"))); // NOI18N
        searchStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(searchStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 13, 30, 24));

        stockSearchText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stockSearchText.setPreferredSize(new java.awt.Dimension(300, 30));
        stockSearchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockSearchTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockSearchTextMouseExited(evt);
            }
        });
        stockSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockSearchTextKeyReleased(evt);
            }
        });
        jPanel2.add(stockSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 30));

        StockTable.setBackground(new java.awt.Color(204, 204, 204));
        StockTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        StockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Item Price"
            }
        ));
        StockTable.setFillsViewportHeight(true);
        StockTable.setRowHeight(25);
        StockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockTableMouseClicked(evt);
            }
        });
        ItemTable.setViewportView(StockTable);

        jPanel2.add(ItemTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 200));

        ServicesTable.setBackground(new java.awt.Color(204, 204, 204));
        ServicesTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ServicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Service Name", "Service Price"
            }
        ));
        ServicesTable.setFillsViewportHeight(true);
        ServicesTable.setRowHeight(25);
        ServicesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicesTableMouseClicked(evt);
            }
        });
        ServiceTable.setViewportView(ServicesTable);

        jPanel2.add(ServiceTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 330, 200));

        PointOfSaleTable.setBackground(new java.awt.Color(204, 204, 204));
        PointOfSaleTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PointOfSaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Description", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PointOfSaleTable.setFillsViewportHeight(true);
        PointOfSaleTable.setRowHeight(25);
        PointOfSaleTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        PointOfSaleTable.getTableHeader().setReorderingAllowed(false);
        PointOfSaleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PointOfSaleTableMouseClicked(evt);
            }
        });
        InvoiceTable.setViewportView(PointOfSaleTable);
        if (PointOfSaleTable.getColumnModel().getColumnCount() > 0) {
            PointOfSaleTable.getColumnModel().getColumn(0).setResizable(false);
            PointOfSaleTable.getColumnModel().getColumn(1).setResizable(false);
            PointOfSaleTable.getColumnModel().getColumn(2).setResizable(false);
            PointOfSaleTable.getColumnModel().getColumn(3).setResizable(false);
            PointOfSaleTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(InvoiceTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 960, 370));

        salesTotalText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salesTotalText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salesTotalTextKeyReleased(evt);
            }
        });
        jPanel2.add(salesTotalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 190, 30));

        History.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/historyOut.png"))); // NOI18N
        History.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        History.setIconTextGap(0);
        History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistoryMouseExited(evt);
            }
        });
        jPanel2.add(History, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 150, 50));

        stLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        stLabel.setForeground(new java.awt.Color(255, 255, 255));
        stLabel.setText("Sales Total");
        jPanel2.add(stLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, -1, 30));

        prLable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        prLable.setForeground(new java.awt.Color(255, 255, 255));
        prLable.setText("Payment Received");
        jPanel2.add(prLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, -1, 30));

        balanceLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel.setText("Balance");
        jPanel2.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, -1, 30));

        EndSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/endsaleOut.png"))); // NOI18N
        EndSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EndSale.setIconTextGap(0);
        EndSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EndSaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EndSaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EndSaleMouseExited(evt);
            }
        });
        jPanel2.add(EndSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 150, 50));

        backButtonPOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/backOut.png"))); // NOI18N
        backButtonPOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButtonPOS.setIconTextGap(0);
        backButtonPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonPOSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonPOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonPOSMouseExited(evt);
            }
        });
        jPanel2.add(backButtonPOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 150, 50));

        addQuantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/quantityOut.png"))); // NOI18N
        addQuantity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addQuantity.setIconTextGap(0);
        addQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addQuantityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addQuantityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addQuantityMouseExited(evt);
            }
        });
        jPanel2.add(addQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 150, 50));

        Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/salesOut.png"))); // NOI18N
        Sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sales.setIconTextGap(0);
        Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalesMouseExited(evt);
            }
        });
        jPanel2.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 150, 50));

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/deleteOut.png"))); // NOI18N
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.setIconTextGap(0);
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 50));

        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/newinvoiceOut.png"))); // NOI18N
        New.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New.setIconTextGap(0);
        New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewMouseExited(evt);
            }
        });
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 150, 50));

        balanceText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(balanceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 190, 30));

        paymentReceivedText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        paymentReceivedText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentReceivedTextKeyReleased(evt);
            }
        });
        jPanel2.add(paymentReceivedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 460, 190, 30));

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/POSBtnPanel.png"))); // NOI18N
        panel.setIconTextGap(0);
        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 490, 180));

        Total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/POSTotalPanel.png"))); // NOI18N
        Total.setIconTextGap(0);
        jPanel2.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 400, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/Background1.jpg"))); // NOI18N
        jLabel2.setText("kw");
        jLabel2.setIconTextGap(0);
        jLabel2.setMinimumSize(new java.awt.Dimension(1326, 585));
        jLabel2.setPreferredSize(new java.awt.Dimension(1326, 585));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/salonimglogo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 310, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/background.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateInvoiceID(){
        
        HandlePointOfSale hna = new HandlePointOfSale();        
        try{
            ResultSet rs = hna.getLastFromInvoice();

             if (rs.next()) {
                int ID = rs.getInt("Invoice ID");
                int newinvoID = ID + 1;
                invoiceID.setText(Integer.toString(newinvoID));
             }              
           
        }
        catch(Exception e)
        {	
          JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
       
    }
    
    private void loadStocks(){
        
        try{ 
            HandlePointOfSale hi = new HandlePointOfSale();
            StockTable.setModel(DbUtils.resultSetToTableModel(hi.viewStocks()));
            
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
    
    private void loadServices(){
        
        try{ 
            HandlePointOfSale hi = new HandlePointOfSale();
            ServicesTable.setModel(DbUtils.resultSetToTableModel(hi.viewServices()));
            
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
    
    
    
    private void NewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseEntered
        New.setIcon(newinvoiceEnter);
    }//GEN-LAST:event_NewMouseEntered

    private void NewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseExited
        New.setIcon(newinvoiceOut);
    }//GEN-LAST:event_NewMouseExited

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        Delete.setIcon(deleteEnter);
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setIcon(deleteOut);
    }//GEN-LAST:event_DeleteMouseExited

    private void EndSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndSaleMouseEntered
        EndSale.setIcon(endsaleEnter);
    }//GEN-LAST:event_EndSaleMouseEntered

    private void EndSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndSaleMouseExited
        EndSale.setIcon(endsaleOut);
    }//GEN-LAST:event_EndSaleMouseExited

    private void SalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseEntered
        Sales.setIcon( salesEnter );
    }//GEN-LAST:event_SalesMouseEntered

    private void SalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseExited
        Sales.setIcon(salesOut);
    }//GEN-LAST:event_SalesMouseExited

    private void HistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMouseEntered
        History.setIcon(historyEnter);
    }//GEN-LAST:event_HistoryMouseEntered

    private void HistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMouseExited
        History.setIcon(historyOut);
    }//GEN-LAST:event_HistoryMouseExited

    private void addQuantityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQuantityMouseEntered
        addQuantity.setIcon(quantityEnter);
    }//GEN-LAST:event_addQuantityMouseEntered

    private void addQuantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQuantityMouseExited
        addQuantity.setIcon(quantityOut);
    }//GEN-LAST:event_addQuantityMouseExited

    private void EndSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndSaleMouseClicked
        
        HandlePointOfSale hps = new HandlePointOfSale();
        
        if (salesTotalText.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Total Payment is empty.", "Error", JOptionPane.ERROR_MESSAGE);  
        }
        else{
            hps.setDate(Date.getText());
            hps.setPrice(salesTotalText.getText());
            hps.setInvoice_ID(invoiceID.getText());

        try {
           
            int i = hps.addToInvoice();
            if(i != 0){                
                 ResultSet rs = hps.getLastFromInvoice();
                 if (rs.next()) {
                     int invoiceID = rs.getInt("Invoice ID");
                     hps.setInvoice_ID(Integer.toString(invoiceID));
                     
                     this.addDescription(hps);
                     
                     JOptionPane.showMessageDialog(null, "Invoice has been saved successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                     salesTotalText.setText(null);
                     paymentReceivedText.setText(null);
                     balanceText.setText(null);
                     this.clearInvoice();
                     this.updateInvoiceID();                     
                 }                 
            }
            else{
                 JOptionPane.showMessageDialog(null, "Invoice cannot be save.", "Error", JOptionPane.ERROR_MESSAGE);
                 salesTotalText.setText(null);
                 paymentReceivedText.setText(null);
                 balanceText.setText(null);
                 this.clearInvoice();
            }

        } 
        catch(DataTruncation ex){
           JOptionPane.showMessageDialog(null, "Some fields have exceeded the maximum number of characters.", "DataTruncation", JOptionPane.ERROR_MESSAGE);
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
        
        
    }//GEN-LAST:event_EndSaleMouseClicked

    private void addDescription(HandlePointOfSale hps){
        
        for(int i = 0; i < PointOfSaleTable.getRowCount() ; i++){
             
            String category = PointOfSaleTable.getValueAt(i, 0).toString();
            
            if (category.equalsIgnoreCase("SRV000")) {
                this.addToInvoiceService(i,hps);    
             
            }
            else if (category.equalsIgnoreCase("STK000")) {
                this.addToInvoiceStock(i,hps);
            }
            else if (category.equalsIgnoreCase("APP000")) {
                this.addToInvoiceAppointments(i,hps);
            }
            
        }
        
    }
    
    private void addToInvoiceAppointments(int i,HandlePointOfSale hps){
        
        HandleAppointment ha =  new HandleAppointment();       
        
        String description = PointOfSaleTable.getValueAt(i, 1).toString();
        
        String[] h1=description.split(" : ");           
      
        hps.setAppointmentID(h1[1]);
       
         try{
             
             int j = hps.addToInvoice_has_Appointment();
             if (j != 0) {
                ha.setAppointmentID(h1[1]);        
                ha.updateFinishedAppointment();
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
    
    private void addToInvoiceService(int i,HandlePointOfSale hps){
        
                String serviceName = PointOfSaleTable.getValueAt(i, 1).toString();
                hps.setServiceName(serviceName);
                
                try{
                    ResultSet rs = hps.getSelectedServiceID();
                    if (rs.next()) {
                        hps.setServiceID(rs.getString("Service_ID"));
                        hps.addToInvoice_has_Service();
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
    
    private void addToInvoiceStock(int i,HandlePointOfSale hps){
        
                String description = PointOfSaleTable.getValueAt(i, 1).toString();
                String quantity = PointOfSaleTable.getValueAt(i, 2).toString();
                String stockID = null;
                
                String[] h1=description.split(" : ");                
                
                hps.setStockName(h1[0]);                
                hps.setCompanyName(h1[1]);
                
                try{
                    ResultSet rs = hps.getSelectedStockID();
                    if (rs.next()) {
                        stockID = rs.getString("Stock_ID");
                       
                        hps.setStockID(stockID);
                        hps.setQuantity(quantity);
                        int j = hps.addToInvoice_has_Stock();
                        
                        if (j!=0) {
                            
                            HandleStocks hs = new HandleStocks();
                            hs.setStockID(stockID);
                            ResultSet rs2 = hs.getSelectedStockDetails();
                            if(rs2.next()) {
                                int stockLevel = rs2.getInt("Stock_Level");
                                int quan = Integer.parseInt(quantity);
                                int newStockLevel = stockLevel - quan;                            
                                
                                hs.setNewStock(Integer.toString(newStockLevel));
                                hs.updateStockLevel();
                            }
                                                        
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
        
    private void clearInvoice(){        
            DefaultTableModel model = (DefaultTableModel) PointOfSaleTable.getModel();           
            model.setRowCount(0);
            this.count = 0;           
    }    
        
    private void HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMouseClicked
         History h = new History(null,true);
         h.setVisible(true);
    }//GEN-LAST:event_HistoryMouseClicked

    private void addAppointmentsToInvoice(String appoID,String charge){
        
        DefaultTableModel model = (DefaultTableModel) PointOfSaleTable.getModel();
        int x = model.getRowCount();
        model.setRowCount(x+1);
        
        String description = "Appointment"+" : "+appoID;    
        
        PointOfSaleTable.setValueAt("APP000", count, 0);
        PointOfSaleTable.setValueAt(description, count, 1);
        PointOfSaleTable.setValueAt(1, count, 2);
        PointOfSaleTable.setValueAt(charge, count, 3);
        PointOfSaleTable.setValueAt(charge, count, 4);
        
        this.getSalesTotal();

        count++;
                
    }
    
    
    
    private void ServicesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicesTableMouseClicked

        PointOfSaleTable.getSelectionModel().clearSelection();
        StockTable.getSelectionModel().clearSelection();
        int check = 0;
        int i = ServicesTable.getSelectedRow();
        String serviceName = ServicesTable.getValueAt(i, 0).toString();
        String servicePrice = ServicesTable.getValueAt(i, 1).toString();
        
        
        for (int j = 0; j < PointOfSaleTable.getRowCount(); j++) {
            
            String descriptionCheck = PointOfSaleTable.getValueAt(j, 1).toString();
            if (serviceName.equals(descriptionCheck)) {
                check = 1;
                break;
            }
            
        }
        
        if (check == 1) {
            JOptionPane.showMessageDialog(null, "This service is already selected.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            DefaultTableModel model = (DefaultTableModel) PointOfSaleTable.getModel();
            int x = model.getRowCount();
            model.setRowCount(x+1);
        
            PointOfSaleTable.setValueAt("SRV000", count, 0);
            PointOfSaleTable.setValueAt(serviceName, count, 1);
            PointOfSaleTable.setValueAt(1, count, 2);
            PointOfSaleTable.setValueAt(servicePrice, count, 3);
            PointOfSaleTable.setValueAt(servicePrice, count, 4);
        
            this.getSalesTotal();

            count++;
            
        }
        
        
    }//GEN-LAST:event_ServicesTableMouseClicked

    private void StockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockTableMouseClicked
        
        PointOfSaleTable.getSelectionModel().clearSelection();
        ServicesTable.getSelectionModel().clearSelection();
        int check = 0;
        
        int i = StockTable.getSelectedRow();
        
        String stockName = StockTable.getValueAt(i, 0).toString();        
        String stockPrice = StockTable.getValueAt(i, 1).toString();
        String brandName = StockTable.getValueAt(i, 2).toString();  
        
        HandleStocks hs = new HandleStocks();
        hs.setStockName(stockName);
        hs.setCompanyName(brandName);
        
        try{
            ResultSet rs = hs.checkStockAvailability();
            if (rs.next()) {
                PointOfSale.stockLevel = rs.getInt("Stock_Level");
                
                if (PointOfSale.stockLevel <= 0) {
                    JOptionPane.showMessageDialog(null, "This item doesn't have enough stocks.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    
                    String description = stockName+" : "+brandName;    
        
                    for (int j = 0; j < PointOfSaleTable.getRowCount(); j++) {
            
                        String descriptionCheck = PointOfSaleTable.getValueAt(j, 1).toString();
                         if (description.equals(descriptionCheck)) {
                             check = 1;
                                break;
                         }
            
                    }
        
                    if (check == 1) {
                        JOptionPane.showMessageDialog(null, "This item is already selected.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        DefaultTableModel model = (DefaultTableModel) PointOfSaleTable.getModel();
                        int x = model.getRowCount();
                        model.setRowCount(x+1);
        
                        PointOfSaleTable.setValueAt("STK000", count, 0);
                        PointOfSaleTable.setValueAt(description, count, 1);
                        PointOfSaleTable.setValueAt(1, count, 2);
                        PointOfSaleTable.setValueAt(stockPrice, count, 3);
                        PointOfSaleTable.setValueAt(stockPrice, count, 4);
                        
                        this.getSalesTotal();   
                        
                        count++;
            
                    }
                    
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
                
        
        
    }//GEN-LAST:event_StockTableMouseClicked

    private void addQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQuantityMouseClicked
       
        int selRow = PointOfSaleTable.getSelectedRow();
        if(PointOfSaleTable.getRowCount()> 0 && selRow != -1){
           
           PointOfSale.quan = PointOfSaleTable.getValueAt(selRow, 2).toString();
                               
           Quantity qn = new Quantity(null,true);
           qn.setVisible(true);
           
           PointOfSaleTable.setValueAt(PointOfSale.quan,selRow , 2);
           String stp = PointOfSaleTable.getValueAt(selRow, 3).toString();
           
           double q = Double.parseDouble(PointOfSale.quan);           
           double dstp = Double.parseDouble(stp);
           
           DecimalFormat df = new DecimalFormat("#.00");
           String total= df.format(q*dstp);
           
           PointOfSaleTable.setValueAt(total,selRow , 4);
           this.getSalesTotal();
        }
        else{
             JOptionPane.showMessageDialog(null, "Please select the item that you need to add quantity.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_addQuantityMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        
        if(PointOfSaleTable.getSelectedRowCount()!= 0){
        
           
            DefaultTableModel model = (DefaultTableModel) PointOfSaleTable.getModel();
            int r = PointOfSaleTable.getRowCount();
            int[] rows = PointOfSaleTable.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                 model.removeRow(rows[i]-i);
                 model.setRowCount(r-1);
                 this.count--;
                 this.getSalesTotal();
            }
        }
           
        else{
          JOptionPane.showMessageDialog(null, "Please select the row that you need to delete.", "Message", JOptionPane.INFORMATION_MESSAGE);
 
        }
   
    }//GEN-LAST:event_DeleteMouseClicked

    private void NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseClicked

        salesTotalText.setText(null);
        paymentReceivedText.setText(null);
        balanceText.setText(null);
        this.clearInvoice();
        this.updateInvoiceID();
        
    }//GEN-LAST:event_NewMouseClicked

    private void backButtonPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonPOSMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backButtonPOSMouseClicked

    private void backButtonPOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonPOSMouseEntered
        backButtonPOS.setIcon(backEnter);
    }//GEN-LAST:event_backButtonPOSMouseEntered

    private void backButtonPOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonPOSMouseExited
        backButtonPOS.setIcon(backOut);
    }//GEN-LAST:event_backButtonPOSMouseExited

    private void SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseClicked
        Sales sal = new Sales(null,true);
        sal.setVisible(true);
    }//GEN-LAST:event_SalesMouseClicked

    private void stockSearchTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockSearchTextMouseEntered
        searchStock.setIcon(searchEnter);
    }//GEN-LAST:event_stockSearchTextMouseEntered

    private void stockSearchTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockSearchTextMouseExited
        searchStock.setIcon(searchOut);
    }//GEN-LAST:event_stockSearchTextMouseExited

    private void stockSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockSearchTextKeyReleased
        
        HandlePointOfSale hp = new HandlePointOfSale();
        
        hp.setItemSearchKey(stockSearchText.getText());
        try{
            
            ResultSet rs = hp.searchStocksToInvoice();
            
            StockTable.setModel(DbUtils.resultSetToTableModel(rs));
        
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
        
        
    }//GEN-LAST:event_stockSearchTextKeyReleased

    private void serviceSearchTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceSearchTextMouseEntered
        searchService.setIcon(searchEnter);
    }//GEN-LAST:event_serviceSearchTextMouseEntered

    private void serviceSearchTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceSearchTextMouseExited
        searchService.setIcon(searchOut);
    }//GEN-LAST:event_serviceSearchTextMouseExited

    private void serviceSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serviceSearchTextKeyReleased
        
        HandlePointOfSale hp = new HandlePointOfSale();
        
        hp.setServiceSearchKey(serviceSearchText.getText());
        try{
            
            ResultSet rs = hp.searchServiceToInvoice();
            
            ServicesTable.setModel(DbUtils.resultSetToTableModel(rs));
        
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

    private void paymentReceivedTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentReceivedTextKeyReleased
        
        ValidatePointOfSale vps = new ValidatePointOfSale();
        String total = salesTotalText.getText();
        String payment = paymentReceivedText.getText();
        
        if (payment.equalsIgnoreCase("")) {
               paymentReceivedText.setText(null); 
               balanceText.setText(null);
        }
        
        else{
            
            if (total.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Total Payment is empty.", "Error", JOptionPane.ERROR_MESSAGE);  
                paymentReceivedText.setText(null);
                balanceText.setText(null);
           
            }
        
            else{
            
                if (!vps.validatePrice(paymentReceivedText.getText())) {
                    JOptionPane.showMessageDialog(null, "Payment Received value is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                    paymentReceivedText.setText(null);
                }
                else{
                     double tot = Double.parseDouble(total);        
                     double pymnt = Double.parseDouble(payment);
        
                    double balance = pymnt - tot;
        
                    DecimalFormat df = new DecimalFormat("#.00");
                    String cashBalance= df.format(balance);
                    balanceText.setText(cashBalance);
                    
                }
            
           
            }
        
            
            
        }
        
        
    }//GEN-LAST:event_paymentReceivedTextKeyReleased

    private void salesTotalTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salesTotalTextKeyReleased
                        
        ValidatePointOfSale vps = new ValidatePointOfSale();
        if (salesTotalText.getText().equalsIgnoreCase("")) {
            salesTotalText.setText(null);
            paymentReceivedText.setText(null);
            balanceText.setText(null);
        }
        else{
            if (!vps.validatePrice(salesTotalText.getText())) {
             JOptionPane.showMessageDialog(null, "Sales Total value is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
             salesTotalText.setText(null);
            }
        }
        
        
    }//GEN-LAST:event_salesTotalTextKeyReleased

    private void PointOfSaleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PointOfSaleTableMouseClicked
        
         StockTable.getSelectionModel().clearSelection();
         ServicesTable.getSelectionModel().clearSelection();
        
    }//GEN-LAST:event_PointOfSaleTableMouseClicked
    
    private void getSalesTotal(){
        
        double tot = 0;
        for(int i = 0; i < PointOfSaleTable.getRowCount() ; i++){
             String totl = PointOfSaleTable.getValueAt(i, 4).toString();
             double serTot = Double.parseDouble(totl); 
            
             tot = tot + serTot;
            
        }
         DecimalFormat df = new DecimalFormat("#.00");
         String totalAmount= df.format(tot);
         salesTotalText.setText(totalAmount);
       
        
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("sales.png")));
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
            java.util.logging.Logger.getLogger(PointOfSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PointOfSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PointOfSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PointOfSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PointOfSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel EndSale;
    private javax.swing.JLabel History;
    private javax.swing.JScrollPane InvoiceTable;
    private javax.swing.JScrollPane ItemTable;
    private javax.swing.JLabel New;
    private javax.swing.JTable PointOfSaleTable;
    private javax.swing.JLabel Sales;
    private javax.swing.JScrollPane ServiceTable;
    private javax.swing.JTable ServicesTable;
    private javax.swing.JTable StockTable;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel addQuantity;
    private javax.swing.JLabel backButtonPOS;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceText;
    private javax.swing.JLabel invoiceID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel panel;
    private javax.swing.JTextField paymentReceivedText;
    private javax.swing.JLabel prLable;
    private javax.swing.JTextField salesTotalText;
    private javax.swing.JLabel searchService;
    private javax.swing.JLabel searchStock;
    private javax.swing.JTextField serviceSearchText;
    private javax.swing.JLabel stLabel;
    private javax.swing.JTextField stockSearchText;
    // End of variables declaration//GEN-END:variables
    
    
    


}
