/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pospros;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import pospros.Pospros;
/**
 *
 * @author Osman
 */
public class pos extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    
    public pos() {
        initComponents();
//        table_update();
        //Category();
        //Brand();
    }
    Connection con1;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model;
    //functionn to load category items
//    public class categoryItem{
//        int id;
//        String name;
//        public categoryItem(int id , String name){
//            this.id= id;
//            this.name= name;
//        }
//        public String toString(){
//         return name;   
//    }
//    }
//    
//    public class brandItem{
//        int id;
//        String name;
//        public brandItem(int id , String name){
//            this.id= id;
//            this.name= name;
//        }
//        public String toString(){
//         return name;   
//    }
//    }
    
    //updating tables on the interface
//    private void table_update(){
//        try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/possuper", "root", "");
//         ResultSet rs = stmt.executeQuery();
//        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
//        model.setRowCount(0); // clear existing rows from the table
//        while (rs.next()) {
//            Object[] row = new Object[10];
//            row[0] = rs.getInt("id");
//            row[1] = rs.getString("product");
//            row[2] = rs.getString("description");
//            row[3] = rs.getString("category");
//            row[4] = rs.getString("brand");
//            row[5] = rs.getString("costprice");
//            row[6] = rs.getString("retailprice");
//            row[7] = rs.getString("qty");
//            row[8] = rs.getString("Barcode");
//            row[9] = rs.getString("status");
//            
//            model.addRow(row);
//        }
//        rs.close();
//        stmt.close();
//        conn.close();    PreparedStatement stmt = conn.prepareStatement("SELECT * FROM product");
//        ResultSet rs = stmt.executeQuery();
//        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
//        model.setRowCount(0); // clear existing rows from the table
//        while (rs.next()) {
//            Object[] row = new Object[10];
//            row[0] = rs.getInt("id");
//            row[1] = rs.getString("product");
//            row[2] = rs.getString("description");
//            row[3] = rs.getString("category");
//            row[4] = rs.getString("brand");
//            row[5] = rs.getString("costprice");
//            row[6] = rs.getString("retailprice");
//            row[7] = rs.getString("qty");
//            row[8] = rs.getString("Barcode");
//            row[9] = rs.getString("status");
//            
//            model.addRow(row);
//        }
//        rs.close();
//        stmt.close();
//        conn.close();
//    } catch (ClassNotFoundException | SQLException ex) {
//        Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    }
    //loading category to the frontend combobox
    
    /*private void Category(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/possuper", "root", "");
            pst= con1.prepareStatement("SELECT * from category");
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                
                combocat.addItem(new categoryItem(rs.getInt(1), rs.getString(2)));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Brand(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/possuper", "root", "");
            pst= con1.prepareStatement("SELECT * from brand");
            ResultSet rs = pst.executeQuery();
            combBrand.removeAllItems();
            while (rs.next()) {
                
                combBrand.addItem(new brandItem(rs.getInt(1), rs.getString(2)));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textproduct = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        textcostprice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtproductname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textqty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textpay = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textbalance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Category");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pos");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Exit");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel6.setText("SUPER POINT OF SALE");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("POS");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Product Code");

        textproduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textproduct.setMaximumSize(new java.awt.Dimension(196, 20));
        textproduct.setMinimumSize(new java.awt.Dimension(196, 20));
        textproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textproductActionPerformed(evt);
            }
        });
        textproduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textproductKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textproductKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Pay Invoice");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtondelete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtondelete.setText("Delete");
        jButtondelete.setBorder(null);
        jButtondelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });

        textcostprice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textcostprice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textcostprice.setMaximumSize(new java.awt.Dimension(196, 20));
        textcostprice.setMinimumSize(new java.awt.Dimension(196, 20));
        textcostprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcostpriceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("sub-total");

        textprice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textprice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpriceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Price");

        txtproductname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtproductname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtproductname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductnameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Product Name");

        textqty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textqty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textqtyActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(240, 240, 240));

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product Code", "Product Name", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("Qty");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("Pay");

        textpay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textpay.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textpay.setMaximumSize(new java.awt.Dimension(196, 20));
        textpay.setMinimumSize(new java.awt.Dimension(196, 20));
        textpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpayActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel17.setText("Balance");

        textbalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textbalance.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textbalance.setMaximumSize(new java.awt.Dimension(196, 20));
        textbalance.setMinimumSize(new java.awt.Dimension(196, 20));
        textbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textcostprice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textpay, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(textprice, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(textqty, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textprice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textqty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcostprice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        pos();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int pay = Integer.parseInt(textpay.getText());
        int subtotal = Integer.parseInt(textcostprice.getText());
        int bal = pay-subtotal;
        textbalance.setText(String.valueOf(bal));
        sales();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable2.getModel();
        int selectIndex = jTable2.getSelectedRow();
            textproduct.setText(d1.getValueAt(selectIndex, 0).toString());
            txtproductname.setText(d1.getValueAt(selectIndex, 1).toString());
            textprice.setText(d1.getValueAt(selectIndex, 2).toString());
            textqty.setText(d1.getValueAt(selectIndex, 3).toString());
            
            
            
            //combprostatus.setSelectedItem(d1.getValueAt(selectIndex, 9).toString());
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable2.getSelectedRow());
        int sum =0;
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            sum=sum + Integer.parseInt(jTable2.getValueAt(i, 4).toString());
        }
        textcostprice.setText(Integer.toString(sum));
        textproduct.setText("");
                    
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void textproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textproductActionPerformed

    private void textcostpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcostpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcostpriceActionPerformed

    private void textpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpriceActionPerformed

    private void txtproductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductnameActionPerformed

    private void textqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textqtyActionPerformed

    private void textpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpayActionPerformed

    private void textbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textbalanceActionPerformed

    private void textproductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textproductKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textproductKeyTyped

    private void pos(){
        String name= textproduct.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/possuper", "root","");
            pst= con1.prepareStatement("select * from product where barcode=?");
            pst.setString(1, name);
            rs=pst.executeQuery();
            while (rs.next()) {
               
                int dbqty = rs.getInt("qty");
                int price = Integer.parseInt(textprice.getText());
                int desiredqty=Integer.parseInt(textqty.getText());
                int total = price*desiredqty;
                
                if (desiredqty>=dbqty) {
                    JOptionPane.showMessageDialog(this, "Avalable quantity is" + " "+dbqty);
                   JOptionPane.showMessageDialog(this, "The requested quantity is more than or the available quantity");
                   
                }else{
                    model = (DefaultTableModel) jTable2.getModel();
                    model.addRow(new Object[]{
                        textproduct.getText(),
                        txtproductname.getText(),
                        textprice.getText(),
                        textqty.getText(),
                        total
                    });
                    
                    int sum =0;
                    for (int i = 0; i < jTable2.getRowCount(); i++) {
                        sum=sum + Integer.parseInt(jTable2.getValueAt(i, 4).toString());
                    }
                    textcostprice.setText(Integer.toString(sum));
                    
                    textproduct.setText("");
                    txtproductname.setText("");
                    textprice.setText("");
                    textqty.setText("");
                    textproduct.requestFocus();
                        
                    
                }
                
            }
        
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void sales(){
        DateTimeFormatter datetimeformater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String Date = datetimeformater.format(now);
        String subtot = textcostprice.getText();
        String pay = textpay.getText();
        String bal = textbalance.getText();
        int lastkey=0;
        
        
        if (subtot.equals(" ") || pay.equals(" ")|| bal.equals(" ")) {
        JOptionPane.showMessageDialog(null, "You cann not submit empty fields");
        return;
    }
        // Insert the category into the database
        try {   
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/possuper", "root", "");
            String query ="INSERT INTO sales( date, subtotal, pay, balance) VALUES(?,?,?,?)";
            pst = con1.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, Date);
            pst.setString(2, subtot);
            pst.setString(3, pay);
            pst.setString(4, bal);
            pst.executeUpdate();
            ResultSet generatedkey = pst.getGeneratedKeys();
            
            

            if (generatedkey.next()) {
               lastkey=generatedkey.getInt(1);
            }
            int row = jTable2.getRowCount();
            String sales_query = "INSERT INTO sales_product(sales_id,product_id,sell_price,qty,total) VALUES(?,?,?,?,?)";
            pst = con1.prepareStatement(sales_query);
            String product_id="";
            String sell_price="";
            String qty="";
            int total=0;
            for (int i=0;i<jTable2.getRowCount();i++ ){
              product_id = (String)jTable2.getValueAt(i, 0);
              sell_price = (String)jTable2.getValueAt(i, 2);
              qty = (String)jTable2.getValueAt(i, 3);
              total = (int)jTable2.getValueAt(i, 4);
              
              pst.setInt(1, lastkey);
              pst.setString(2, product_id);
              pst.setString(3, sell_price);
              pst.setString(4, qty);
               pst.setInt(5, total);
               
               pst.executeUpdate();
              
              
              
              
                
            }
            
            pst.addBatch();
            JOptionPane.showMessageDialog(this, lastkey);
            
        } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    private void textproductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textproductKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         String name= textproduct.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/possuper", "root","");
                pst= con1.prepareStatement("select * from product where barcode=?");
                pst.setString(1, name);
                rs=pst.executeQuery();
                
                if (rs.next()==false) {
                    JOptionPane.showMessageDialog(this, "barcode does not exist");
                }else{
                    String productname = rs.getString("product");
                    String price = rs.getString("retailprice");
                     
                    txtproductname.setText(productname.trim());
                    textprice.setText(price.trim());
                    
                    
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
    }//GEN-LAST:event_textproductKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Category().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Brand().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new product().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new pos().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField textbalance;
    private javax.swing.JTextField textcostprice;
    private javax.swing.JTextField textpay;
    private javax.swing.JTextField textprice;
    private javax.swing.JTextField textproduct;
    private javax.swing.JTextField textqty;
    private javax.swing.JTextField txtproductname;
    // End of variables declaration//GEN-END:variables
}
