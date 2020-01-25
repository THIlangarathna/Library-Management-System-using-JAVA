/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;import javax.swing.RowFilter;
;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Thilina Ilangarathna
 */
public class UpdateStock extends javax.swing.JFrame {
        public void dbcon(){
DefaultTableModel table=new DefaultTableModel();
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.
            getConnection("jdbc:mysql://localhost:3308/library"
                ,"root","");
            Statement stmt = con.createStatement();
            String sql;
            sql="SELECT ID,NAME,ISBN,QUANTITY FROM ITEM";
            ResultSet R;
            R = stmt.executeQuery(sql);
            jTable1.setModel(DbUtils.resultSetToTableModel(R));
        }
    catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getClass().toString());
            }    
        }
        private void filter(String query){
            DefaultTableModel table=new DefaultTableModel();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
            jTable1.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
    /**
     * Creates new form UpdateStock
     */
    public UpdateStock() {
        initComponents();
        dbcon();
    }

    /**
     *
     */
    public class AddItem{
        private String name;
        private String author;
        private String publisher;
        private String isbn;
        private String publishdate;
        private String edition;
        private int price;
        private String type;
        private String cate;
        private int quantity;
        private String section;
        private int upidbook;
        private int upquantity;

        /**
         *
         * @return
         */
        public String getName(){
            return name;
        }

        /**
         *
         * @param name
         */
        public void setName(String name){
            this.name=name;
        }

        /**
         *
         * @return
         */
        public String getAuthor(){
            return author;
        }

        /**
         *
         * @param author
         */
        public void setAuthor(String author){
            this.author=author;
        }

        /**
         *
         * @return
         */
        public String getPublisher(){
            return publisher;
        }

        /**
         *
         * @param publisher
         */
        public void setPublisher(String publisher){
            this.publisher=publisher;
        }

        /**
         *
         * @return
         */
        public String getIsbn(){
            return isbn;
        }

        /**
         *
         * @param isbn
         */
        public void setIsbn(String isbn){
            this.isbn=isbn;
        }

        /**
         *
         * @return
         */
        public String getPublishdate(){
            return publishdate;
        }

        /**
         *
         * @param publishdate
         */
        public void setPublishdate(String publishdate){
            this.publishdate=publishdate;
        }

        /**
         *
         * @return
         */
        public String getEdition(){
            return edition;
        }

        /**
         *
         * @param edition
         */
        public void setEdition(String edition){
            this.edition=edition;
        }

        /**
         *
         * @return
         */
        public int getPrice(){
            return price;
        }

        /**
         *
         * @param price
         */
        public void setPrice(int price){
            this.price=price;
        }

        /**
         *
         * @return
         */
        public String getType(){
            return type;
        }

        /**
         *
         * @param type
         */
        public void setType(String type){
            this.type=type;
        }

        /**
         *
         * @return
         */
        public String getCate(){
            return cate;
        }

        /**
         *
         * @param cate
         */
        public void setCate(String cate){
            this.cate=cate;
        }

        /**
         *
         * @return
         */
        public int getQuantity(){
            return quantity;
        }

        /**
         *
         * @param quantity
         */
        public void setQuantity(int quantity){
            this.quantity=quantity;
        }

        /**
         *
         * @return
         */
        public String getSection(){
            return section;
        }

        /**
         *
         * @param section
         */
        public void setSection(String section){
            this.section=section;
        }
        public int getupidbok(){
            return upidbook;
        }
        public void setupidbook(int upidbook){
            this.upidbook=upidbook;
        }
        public int getUpquantity() {
            return upquantity;
        }
        public void setUpquantity(int upquantity) {
            this.upquantity = upquantity;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtauthor = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        txtisbn = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtedition = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        combotype = new javax.swing.JComboBox<>();
        combocate = new javax.swing.JComboBox<>();
        txtquantity = new javax.swing.JTextField();
        txtsection = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtidbook = new javax.swing.JTextField();
        txtupquantity = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Stock");
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(0, 191, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 191, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thilina Ilangarathna\\Documents\\NetBeansProjects\\Project\\arrow-282-48.png")); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thilina Ilangarathna\\Documents\\NetBeansProjects\\Project\\book-16-128.png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NEW ITEM"); // NOI18N
        jLabel15.setAlignmentX(0.5F);
        jLabel15.setAlignmentY(0.0F);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setIconTextGap(0);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(48, 48, 48)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 191, 255));
        jLabel3.setText("Name");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 191, 255));
        jLabel1.setText("Authors(s)");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 191, 255));
        jLabel2.setText("Publisher");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 191, 255));
        jLabel4.setText("ISBN");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 191, 255));
        jLabel5.setText("Published Year");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 191, 255));
        jLabel6.setText("Edition");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 191, 255));
        jLabel7.setText("Price");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 191, 255));
        jLabel8.setText("Type");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 191, 255));
        jLabel9.setText("Category");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 191, 255));
        jLabel10.setText("Quantity");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 191, 255));
        jLabel11.setText("Section");

        txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtauthor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtpublisher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtisbn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisbnActionPerformed(evt);
            }
        });

        txtdate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtedition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtprice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        combotype.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Journal", "Magazine", "Multimedia" }));
        combotype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotypeActionPerformed(evt);
            }
        });

        combocate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combocate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management", "Accounting and Finance", "Mathematics", "Marketing", "Advertising", "Ecommerce", "Languages", "Science and Technology", "Economics", "Multimedia", "Art and creations", "Geography ", "Social Sciences", "Encyclopedia", "Religion", "History", "Research Methods", "Philosophy", "Biography", "Literature", "Food Drinks ", "Cooking", "Ethics and Legislations", "Cinematography", "Photography", "Videography", "Furniture and accessories", "Paintings", "Architecture", "Fashion Designing", "Designing", "Hospitality industry", "Printing and related activities", "Typography", " " }));

        txtquantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtsection.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtauthor)
                            .addComponent(txtpublisher)
                            .addComponent(txtisbn)
                            .addComponent(txtedition)
                            .addComponent(txtprice)
                            .addComponent(txtquantity)
                            .addComponent(txtsection)
                            .addComponent(combotype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combocate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdate)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(35, 35, 35))
                                                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35))
                                            .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35))
                                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addComponent(txtedition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(combotype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(combocate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ADD A NEW ITEM", jPanel4);

        jPanel7.setBackground(new java.awt.Color(0, 191, 255));

        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Book ID");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity");

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thilina Ilangarathna\\Documents\\NetBeansProjects\\Project\\arrow-282-48.png")); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtidbook, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtupquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtidbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtupquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("ADD AN EXISTING ITEM", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtisbnActionPerformed

    private void combotypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AddItem item=new AddItem();
        item.setName(txtname.getText());
        item.setAuthor(txtauthor.getText());
        item.setPublisher(txtpublisher.getText());
        item.setIsbn(txtisbn.getText());
        item.setPublishdate(txtdate.getText());
        item.setEdition(txtedition.getText());
        item.setPrice(Integer.parseInt(txtprice.getText()));
        item.setType(combotype.getSelectedItem().toString());
        item.setCate(combocate.getSelectedItem().toString());
        item.setQuantity(Integer.parseInt(txtquantity.getText()));
        item.setSection(txtsection.getText());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.
            getConnection("jdbc:mysql://localhost:3308/library"
                ,"root","");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            String ssql;
            String sql;
            ssql="INSERT INTO STOCK (QUANTITY) VALUES('"+item.getQuantity()+"')";
            sql = "INSERT INTO ITEM (NAME,AUTHOR,PUBLISHER,ISBN,PUBLIDATE,EDITION,PRICE,TYPE,CATEGORY,QUANTITY,SECTION) VALUES('"+item.getName()+"','"+item.getAuthor()+"','"+item.getPublisher()+"','"+item.getIsbn()+"','"+item.getPublishdate()+"','"+item.getEdition()+"','"+item.getPrice()+"','"+item.getType()+"','" +item.getCate()+"','"+item.getQuantity()+"','"+item.getSection()+"')";
            stmt.executeUpdate(ssql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Item Inserted!");
        } catch (ClassNotFoundException | SQLException | HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Please Enter Correct Data");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AddItem item1=new AddItem();
        item1.setupidbook(Integer.parseInt(txtidbook.getText()));
        item1.setUpquantity(Integer.parseInt(txtupquantity.getText()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.
            getConnection("jdbc:mysql://localhost:3308/library"
                ,"root","");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            String ssql;
            String sql;
            ssql="UPDATE STOCK SET QUANTITY=QUANTITY+'"+item1.getUpquantity()+"' WHERE ID='"+item1.getupidbok()+"'";
            sql ="UPDATE ITEM SET QUANTITY=QUANTITY+'"+item1.getUpquantity()+"' WHERE ID='"+item1.getupidbok()+"'";
            stmt.executeUpdate(ssql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Item Inserted!");
        } catch (ClassNotFoundException | SQLException | HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Please Enter Both Book ID and Quantity");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        Main page1=new Main();
        page1.setVisible(true);
        UpdateStock.this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        Main page1=new Main();
        page1.setVisible(true);
        UpdateStock.this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

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
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combocate;
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtidbook;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtsection;
    private javax.swing.JTextField txtupquantity;
    // End of variables declaration//GEN-END:variables
}
