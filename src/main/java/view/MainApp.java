/*
 * Created by JFormDesigner on Thu Apr 14 02:40:21 TRT 2022
 */

package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author mrf
 */
public class MainApp extends JFrame {
    public static void main(String[] args) {
        MainApp mainApp=new MainApp();
        mainApp.setVisible(true);
    }
    public MainApp() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ali
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel19 = new JPanel();
        scrollPane4 = new JScrollPane();
        tblCustomer = new JTable();
        panel20 = new JPanel();
        btnCustomerListEdit = new JButton();
        btnCustomerListDelete = new JButton();
        pnlAddCustomer = new JPanel();
        lblAddCName = new JLabel();
        l = new JLabel();
        lblAddCSurname = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        txtAddCustomerName = new JTextField();
        txtAddCustomerSurname = new JTextField();
        txtAddCustomerEmail = new JTextField();
        txtAddCustomerPhone = new JTextField();
        txtAddCustomerAddress = new JTextField();
        btnAddCustomer = new JButton();
        lblAddCustomer = new JLabel();
        pnlEditCustomer = new JPanel();
        label30 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        txtEditCustomerName = new JTextField();
        txtEditCustomerSurname = new JTextField();
        txtEditCustomerEmail = new JTextField();
        txtEditCustomerPhone = new JTextField();
        txtEditCustomerAddress = new JTextField();
        btnEditCustomer = new JButton();
        lblEditCustomer = new JLabel();
        panel2 = new JPanel();
        panel10 = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        label2 = new JLabel();
        txtSearchReport = new JTextField();
        label62 = new JLabel();
        label63 = new JLabel();
        label64 = new JLabel();
        label65 = new JLabel();
        spnDay1 = new JSpinner();
        spnMonth1 = new JSpinner();
        spnYear1 = new JSpinner();
        label66 = new JLabel();
        label67 = new JLabel();
        label68 = new JLabel();
        label69 = new JLabel();
        snpDay2 = new JSpinner();
        spnMonth2 = new JSpinner();
        spnYear2 = new JSpinner();
        panel12 = new JPanel();
        scrollPane2 = new JScrollPane();
        tblReport = new JTable();
        panel13 = new JPanel();
        lblStatement = new JLabel();
        panel14 = new JPanel();
        lblSold = new JLabel();
        lblReportsInfo = new JLabel();
        panel3 = new JPanel();
        panel15 = new JPanel();
        cmbList = new JComboBox();
        btnSaleList = new JButton();
        lblSaleList = new JLabel();
        scrollPane9 = new JScrollPane();
        tblSale = new JTable();
        lblSales = new JLabel();
        panel29 = new JPanel();
        label48 = new JLabel();
        txtSaleSelect = new JTextField();
        label49 = new JLabel();
        txtSalePiece = new JTextField();
        label50 = new JLabel();
        cmbSaleCustomer = new JComboBox();
        btnSaleProcess = new JButton();
        panel4 = new JPanel();
        panel11 = new JPanel();
        scrollPane3 = new JScrollPane();
        tblProdutcs = new JTable();
        panel16 = new JPanel();
        btnProductListEdit = new JButton();
        btnProductListDelete = new JButton();
        panel17 = new JPanel();
        txtAddProductName = new JTextField();
        label36 = new JLabel();
        label52 = new JLabel();
        label43 = new JLabel();
        label53 = new JLabel();
        label54 = new JLabel();
        label55 = new JLabel();
        cmbAddProductCategory = new JComboBox();
        txtAddProductBuying = new JTextField();
        txtAddProductSelling = new JTextField();
        txtAddProductStock = new JTextField();
        txtAddProductStatement = new JTextField();
        btnAddProduct = new JButton();
        lblAddProduct = new JLabel();
        panel18 = new JPanel();
        txtEditProductName = new JTextField();
        label37 = new JLabel();
        label57 = new JLabel();
        label44 = new JLabel();
        label58 = new JLabel();
        label59 = new JLabel();
        label60 = new JLabel();
        cmbEditProductCategory = new JComboBox();
        txtEditProductBuying = new JTextField();
        txtEditProductSelling = new JTextField();
        txtEditProductStock = new JTextField();
        txtEditProductStatement = new JTextField();
        btnEditProduct = new JButton();
        lblEditProduct = new JLabel();
        panel5 = new JPanel();
        panel23 = new JPanel();
        scrollPane5 = new JScrollPane();
        tblCategoryList = new JTable();
        panel24 = new JPanel();
        btnEditCategoryList = new JButton();
        btnDeleteCategoryList = new JButton();
        panel25 = new JPanel();
        label38 = new JLabel();
        label39 = new JLabel();
        txtAddCategory = new JTextField();
        scrollPane6 = new JScrollPane();
        txtAddCategoryExplanation = new JTextArea();
        btnAddCategory = new JButton();
        panel26 = new JPanel();
        label40 = new JLabel();
        label41 = new JLabel();
        txtEditCategory = new JTextField();
        scrollPane7 = new JScrollPane();
        txtEditCategoryExplanation = new JTextArea();
        btnEditCategory = new JButton();
        panel6 = new JPanel();
        panel27 = new JPanel();
        scrollPane8 = new JScrollPane();
        tblUserList = new JTable();
        panel28 = new JPanel();
        btnAddUser = new JButton();
        btnDltUser = new JButton();
        btnUpdateUser = new JButton();
        label42 = new JLabel();
        panel30 = new JPanel();
        label70 = new JLabel();
        label71 = new JLabel();
        label72 = new JLabel();
        btnResetPassword = new JButton();
        lblResetPassword = new JLabel();
        txtResetPassword = new JPasswordField();
        txtNewPassword = new JPasswordField();
        txtAgainPassword = new JPasswordField();
        btnExit = new JButton();
        label45 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setBackground(new Color(102, 255, 255));
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
                . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing
                .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
                Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
                ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
                public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .equals ( e. getPropertyName (
                ) ) )throw new RuntimeException( ) ;} } );

                //======== panel19 ========
                {

                    //======== scrollPane4 ========
                    {
                        scrollPane4.setViewportView(tblCustomer);
                    }

                    //======== panel20 ========
                    {
                        panel20.setBorder(new TitledBorder("Operations"));

                        //---- btnCustomerListEdit ----
                        btnCustomerListEdit.setText("Edit");

                        //---- btnCustomerListDelete ----
                        btnCustomerListDelete.setText("Delete");

                        GroupLayout panel20Layout = new GroupLayout(panel20);
                        panel20.setLayout(panel20Layout);
                        panel20Layout.setHorizontalGroup(
                            panel20Layout.createParallelGroup()
                                .addGroup(panel20Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel20Layout.createParallelGroup()
                                        .addComponent(btnCustomerListEdit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel20Layout.createSequentialGroup()
                                            .addComponent(btnCustomerListDelete)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel20Layout.setVerticalGroup(
                            panel20Layout.createParallelGroup()
                                .addGroup(panel20Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCustomerListEdit, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCustomerListDelete, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                        );
                    }

                    GroupLayout panel19Layout = new GroupLayout(panel19);
                    panel19.setLayout(panel19Layout);
                    panel19Layout.setHorizontalGroup(
                        panel19Layout.createParallelGroup()
                            .addGroup(panel19Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panel20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                    );
                    panel19Layout.setVerticalGroup(
                        panel19Layout.createParallelGroup()
                            .addGroup(panel19Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                //======== pnlAddCustomer ========
                {
                    pnlAddCustomer.setBorder(new TitledBorder(null, "Add Customer", TitledBorder.LEADING, TitledBorder.TOP));

                    //---- lblAddCName ----
                    lblAddCName.setText("Name");

                    //---- l ----
                    l.setText("E-Mail");

                    //---- lblAddCSurname ----
                    lblAddCSurname.setText("Surname");

                    //---- label28 ----
                    label28.setText("Phone");

                    //---- label29 ----
                    label29.setText("Address");

                    //---- btnAddCustomer ----
                    btnAddCustomer.setText("Add");

                    //---- lblAddCustomer ----
                    lblAddCustomer.setText("text");

                    GroupLayout pnlAddCustomerLayout = new GroupLayout(pnlAddCustomer);
                    pnlAddCustomer.setLayout(pnlAddCustomerLayout);
                    pnlAddCustomerLayout.setHorizontalGroup(
                        pnlAddCustomerLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, pnlAddCustomerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlAddCustomerLayout.createSequentialGroup()
                                        .addComponent(lblAddCustomer, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddCustomer))
                                    .addGroup(pnlAddCustomerLayout.createSequentialGroup()
                                        .addGroup(pnlAddCustomerLayout.createParallelGroup()
                                            .addGroup(pnlAddCustomerLayout.createSequentialGroup()
                                                .addComponent(lblAddCName)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, pnlAddCustomerLayout.createSequentialGroup()
                                                .addGroup(pnlAddCustomerLayout.createParallelGroup()
                                                    .addComponent(lblAddCSurname)
                                                    .addComponent(label28, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label29, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(l, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)))
                                        .addGroup(pnlAddCustomerLayout.createParallelGroup()
                                            .addComponent(txtAddCustomerAddress, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddCustomerSurname, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddCustomerName, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddCustomerEmail, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddCustomerPhone, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28))
                    );
                    pnlAddCustomerLayout.setVerticalGroup(
                        pnlAddCustomerLayout.createParallelGroup()
                            .addGroup(pnlAddCustomerLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddCName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddCustomerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddCSurname, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddCustomerSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(l, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddCustomerEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label28, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddCustomerPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label29, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddCustomerAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddCustomer)
                                    .addComponent(lblAddCustomer)))
                    );
                }

                //======== pnlEditCustomer ========
                {
                    pnlEditCustomer.setBorder(new TitledBorder(null, "Edit Customer", TitledBorder.LEADING, TitledBorder.TOP));

                    //---- label30 ----
                    label30.setText("Name");

                    //---- label31 ----
                    label31.setText("E-Mail");

                    //---- label32 ----
                    label32.setText("Surname");

                    //---- label33 ----
                    label33.setText("Phone");

                    //---- label34 ----
                    label34.setText("Address");

                    //---- btnEditCustomer ----
                    btnEditCustomer.setText("Edit");

                    //---- lblEditCustomer ----
                    lblEditCustomer.setText("text");

                    GroupLayout pnlEditCustomerLayout = new GroupLayout(pnlEditCustomer);
                    pnlEditCustomer.setLayout(pnlEditCustomerLayout);
                    pnlEditCustomerLayout.setHorizontalGroup(
                        pnlEditCustomerLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, pnlEditCustomerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlEditCustomerLayout.createSequentialGroup()
                                        .addComponent(lblEditCustomer, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEditCustomer))
                                    .addGroup(pnlEditCustomerLayout.createSequentialGroup()
                                        .addGroup(pnlEditCustomerLayout.createParallelGroup()
                                            .addGroup(pnlEditCustomerLayout.createSequentialGroup()
                                                .addComponent(label30)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, pnlEditCustomerLayout.createSequentialGroup()
                                                .addGroup(pnlEditCustomerLayout.createParallelGroup()
                                                    .addComponent(label32)
                                                    .addComponent(label33, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label34, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label31, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)))
                                        .addGroup(pnlEditCustomerLayout.createParallelGroup()
                                            .addComponent(txtEditCustomerAddress, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEditCustomerSurname, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEditCustomerName, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEditCustomerEmail, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEditCustomerPhone, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28))
                    );
                    pnlEditCustomerLayout.setVerticalGroup(
                        pnlEditCustomerLayout.createParallelGroup()
                            .addGroup(pnlEditCustomerLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label30, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditCustomerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label32, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditCustomerSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label31, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditCustomerEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label33, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditCustomerPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label34, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditCustomerAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEditCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEditCustomer)
                                    .addComponent(lblEditCustomer)))
                    );
                }

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(pnlAddCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pnlEditCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(panel19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(35, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(panel19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(pnlAddCustomer, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlEditCustomer, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(27, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Customers", panel1);

            //======== panel2 ========
            {

                //======== panel10 ========
                {
                    panel10.setBorder(new TitledBorder("Filters"));

                    //---- label1 ----
                    label1.setText("Search Location");

                    //---- radioButton1 ----
                    radioButton1.setText("Customers");

                    //---- radioButton2 ----
                    radioButton2.setText("Products");

                    //---- radioButton3 ----
                    radioButton3.setText("Categories");

                    //---- label2 ----
                    label2.setText("Search");

                    //---- label62 ----
                    label62.setText("Date Range");

                    //---- label63 ----
                    label63.setText("day");

                    //---- label64 ----
                    label64.setText("year");

                    //---- label65 ----
                    label65.setText("month");

                    //---- label66 ----
                    label66.setText("and");

                    //---- label67 ----
                    label67.setText("day");

                    //---- label68 ----
                    label68.setText("month");

                    //---- label69 ----
                    label69.setText("year");

                    GroupLayout panel10Layout = new GroupLayout(panel10);
                    panel10.setLayout(panel10Layout);
                    panel10Layout.setHorizontalGroup(
                        panel10Layout.createParallelGroup()
                            .addGroup(panel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton3))
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSearchReport, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addComponent(label62, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label63, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(spnDay1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel10Layout.createParallelGroup()
                                            .addGroup(panel10Layout.createSequentialGroup()
                                                .addComponent(label65, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label64, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel10Layout.createSequentialGroup()
                                                .addComponent(spnMonth1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnYear1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(label66)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel10Layout.createParallelGroup()
                                            .addGroup(panel10Layout.createSequentialGroup()
                                                .addComponent(label67, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label68, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label69, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel10Layout.createSequentialGroup()
                                                .addComponent(snpDay2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnMonth2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnYear2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel10Layout.setVerticalGroup(
                        panel10Layout.createParallelGroup()
                            .addGroup(panel10Layout.createSequentialGroup()
                                .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(radioButton1)
                                    .addComponent(radioButton2)
                                    .addComponent(radioButton3))
                                .addGap(18, 18, 18)
                                .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2)
                                    .addComponent(txtSearchReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label63)
                                    .addComponent(label65)
                                    .addComponent(label64)
                                    .addComponent(label67)
                                    .addComponent(label68)
                                    .addComponent(label69))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label62, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnDay1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnMonth1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnYear1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label66)
                                    .addComponent(snpDay2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnMonth2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnYear2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                    );
                }

                //======== panel12 ========
                {
                    panel12.setBorder(new TitledBorder("Results"));

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(tblReport);
                    }

                    GroupLayout panel12Layout = new GroupLayout(panel12);
                    panel12.setLayout(panel12Layout);
                    panel12Layout.setHorizontalGroup(
                        panel12Layout.createParallelGroup()
                            .addGroup(panel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane2)
                                .addContainerGap())
                    );
                    panel12Layout.setVerticalGroup(
                        panel12Layout.createParallelGroup()
                            .addGroup(panel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                //======== panel13 ========
                {
                    panel13.setBorder(new TitledBorder("Profit-Loss Statement"));

                    //---- lblStatement ----
                    lblStatement.setText("text");

                    GroupLayout panel13Layout = new GroupLayout(panel13);
                    panel13.setLayout(panel13Layout);
                    panel13Layout.setHorizontalGroup(
                        panel13Layout.createParallelGroup()
                            .addGroup(panel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStatement, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(14, Short.MAX_VALUE))
                    );
                    panel13Layout.setVerticalGroup(
                        panel13Layout.createParallelGroup()
                            .addGroup(panel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblStatement, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== panel14 ========
                {

                    //---- lblSold ----
                    lblSold.setText("Quantity Sold");

                    //---- lblReportsInfo ----
                    lblReportsInfo.setText("Info");

                    GroupLayout panel14Layout = new GroupLayout(panel14);
                    panel14.setLayout(panel14Layout);
                    panel14Layout.setHorizontalGroup(
                        panel14Layout.createParallelGroup()
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel14Layout.createParallelGroup()
                                    .addComponent(lblSold, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel14Layout.createSequentialGroup()
                                        .addComponent(lblReportsInfo, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                    );
                    panel14Layout.setVerticalGroup(
                        panel14Layout.createParallelGroup()
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSold, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(lblReportsInfo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                }

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(panel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addContainerGap())
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(panel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel12, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(14, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Reports", panel2);

            //======== panel3 ========
            {

                //======== panel15 ========
                {
                    panel15.setBorder(new TitledBorder("Sales Screen"));

                    //---- btnSaleList ----
                    btnSaleList.setText("List");

                    //---- lblSaleList ----
                    lblSaleList.setText("text");

                    //======== scrollPane9 ========
                    {
                        scrollPane9.setViewportView(tblSale);
                    }

                    //---- lblSales ----
                    lblSales.setText("text");

                    //======== panel29 ========
                    {
                        panel29.setBorder(new TitledBorder("Sales Process"));

                        //---- label48 ----
                        label48.setText("Selected");

                        //---- label49 ----
                        label49.setText("Piece");

                        //---- label50 ----
                        label50.setText("Customer");

                        //---- btnSaleProcess ----
                        btnSaleProcess.setText("Complete");

                        GroupLayout panel29Layout = new GroupLayout(panel29);
                        panel29.setLayout(panel29Layout);
                        panel29Layout.setHorizontalGroup(
                            panel29Layout.createParallelGroup()
                                .addGroup(panel29Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel29Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(label50, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addComponent(label49, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addComponent(label48, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel29Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSaleSelect, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(txtSalePiece, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(cmbSaleCustomer, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSaleProcess)
                                    .addContainerGap(50, Short.MAX_VALUE))
                        );
                        panel29Layout.setVerticalGroup(
                            panel29Layout.createParallelGroup()
                                .addGroup(panel29Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel29Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label48)
                                        .addComponent(txtSaleSelect, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel29Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label49)
                                        .addComponent(txtSalePiece, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel29Layout.createParallelGroup()
                                        .addComponent(label50)
                                        .addGroup(panel29Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbSaleCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSaleProcess)))
                                    .addContainerGap(10, Short.MAX_VALUE))
                        );
                    }

                    GroupLayout panel15Layout = new GroupLayout(panel15);
                    panel15.setLayout(panel15Layout);
                    panel15Layout.setHorizontalGroup(
                        panel15Layout.createParallelGroup()
                            .addGroup(panel15Layout.createSequentialGroup()
                                .addGroup(panel15Layout.createParallelGroup()
                                    .addGroup(panel15Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(cmbList, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSaleList))
                                    .addGroup(panel15Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(panel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel15Layout.createSequentialGroup()
                                                .addComponent(lblSaleList, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
                                                .addGap(329, 329, 329))
                                            .addComponent(scrollPane9, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSales, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(panel29, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(68, Short.MAX_VALUE))
                    );
                    panel15Layout.setVerticalGroup(
                        panel15Layout.createParallelGroup()
                            .addGroup(panel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbList, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSaleList))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSaleList)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane9, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSales)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(panel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(24, Short.MAX_VALUE))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(panel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(18, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Sales Management", panel3);

            //======== panel4 ========
            {

                //======== panel11 ========
                {
                    panel11.setBorder(new TitledBorder("Product List"));

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setViewportView(tblProdutcs);
                    }

                    //======== panel16 ========
                    {
                        panel16.setBorder(new TitledBorder("Operations"));

                        //---- btnProductListEdit ----
                        btnProductListEdit.setText("Edit");

                        //---- btnProductListDelete ----
                        btnProductListDelete.setText("Delete");

                        GroupLayout panel16Layout = new GroupLayout(panel16);
                        panel16.setLayout(panel16Layout);
                        panel16Layout.setHorizontalGroup(
                            panel16Layout.createParallelGroup()
                                .addGroup(panel16Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel16Layout.createParallelGroup()
                                        .addComponent(btnProductListEdit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel16Layout.createSequentialGroup()
                                            .addComponent(btnProductListDelete)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel16Layout.setVerticalGroup(
                            panel16Layout.createParallelGroup()
                                .addGroup(panel16Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProductListEdit, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnProductListDelete, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                        );
                    }

                    GroupLayout panel11Layout = new GroupLayout(panel11);
                    panel11.setLayout(panel11Layout);
                    panel11Layout.setHorizontalGroup(
                        panel11Layout.createParallelGroup()
                            .addGroup(panel11Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panel16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                    );
                    panel11Layout.setVerticalGroup(
                        panel11Layout.createParallelGroup()
                            .addGroup(panel11Layout.createSequentialGroup()
                                .addGroup(panel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel16, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE))
                    );
                }

                //======== panel17 ========
                {
                    panel17.setBorder(new TitledBorder(null, "Add New Product", TitledBorder.LEADING, TitledBorder.TOP));

                    //---- label36 ----
                    label36.setText("Category");

                    //---- label52 ----
                    label52.setText("Product");

                    //---- label43 ----
                    label43.setText("Buying");

                    //---- label53 ----
                    label53.setText("Selling");

                    //---- label54 ----
                    label54.setText("Stock");

                    //---- label55 ----
                    label55.setText("Statement");

                    //---- btnAddProduct ----
                    btnAddProduct.setText("Add");

                    //---- lblAddProduct ----
                    lblAddProduct.setText("text");

                    GroupLayout panel17Layout = new GroupLayout(panel17);
                    panel17.setLayout(panel17Layout);
                    panel17Layout.setHorizontalGroup(
                        panel17Layout.createParallelGroup()
                            .addGroup(panel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel17Layout.createParallelGroup()
                                    .addGroup(panel17Layout.createSequentialGroup()
                                        .addGroup(panel17Layout.createParallelGroup()
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addComponent(lblAddProduct, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAddProduct))
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addGroup(panel17Layout.createParallelGroup()
                                                    .addGroup(panel17Layout.createSequentialGroup()
                                                        .addComponent(label55, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtAddProductStatement, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel17Layout.createSequentialGroup()
                                                        .addComponent(label54, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtAddProductStock, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel17Layout.createSequentialGroup()
                                                        .addComponent(label53, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtAddProductSelling, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel17Layout.createSequentialGroup()
                                                        .addComponent(label43, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtAddProductBuying, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 6, Short.MAX_VALUE)))
                                        .addGap(0, 6, Short.MAX_VALUE))
                                    .addGroup(panel17Layout.createSequentialGroup()
                                        .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addComponent(label52, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtAddProductName, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addComponent(label36, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbAddProductCategory)))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    );
                    panel17Layout.setVerticalGroup(
                        panel17Layout.createParallelGroup()
                            .addGroup(panel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label52, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddProductName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label36, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbAddProductCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label43, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddProductBuying, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label53, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddProductSelling, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label54, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddProductStock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label55, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddProductStatement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddProduct)
                                    .addComponent(lblAddProduct))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                //======== panel18 ========
                {
                    panel18.setBorder(new TitledBorder(null, "Edit Product", TitledBorder.LEADING, TitledBorder.TOP));

                    //---- label37 ----
                    label37.setText("Category");

                    //---- label57 ----
                    label57.setText("Product");

                    //---- label44 ----
                    label44.setText("Buying");

                    //---- label58 ----
                    label58.setText("Selling");

                    //---- label59 ----
                    label59.setText("Stock");

                    //---- label60 ----
                    label60.setText("Statement");

                    //---- btnEditProduct ----
                    btnEditProduct.setText("Edit");

                    //---- lblEditProduct ----
                    lblEditProduct.setText("text");

                    GroupLayout panel18Layout = new GroupLayout(panel18);
                    panel18.setLayout(panel18Layout);
                    panel18Layout.setHorizontalGroup(
                        panel18Layout.createParallelGroup()
                            .addGroup(panel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel18Layout.createParallelGroup()
                                    .addGroup(panel18Layout.createSequentialGroup()
                                        .addGroup(panel18Layout.createParallelGroup()
                                            .addGroup(panel18Layout.createSequentialGroup()
                                                .addComponent(lblEditProduct, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEditProduct))
                                            .addGroup(panel18Layout.createSequentialGroup()
                                                .addGroup(panel18Layout.createParallelGroup()
                                                    .addGroup(panel18Layout.createSequentialGroup()
                                                        .addComponent(label60, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtEditProductStatement, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel18Layout.createSequentialGroup()
                                                        .addComponent(label59, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtEditProductStock, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel18Layout.createSequentialGroup()
                                                        .addComponent(label58, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtEditProductSelling, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel18Layout.createSequentialGroup()
                                                        .addComponent(label44, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtEditProductBuying, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 3, Short.MAX_VALUE)))
                                        .addGap(0, 9, Short.MAX_VALUE))
                                    .addGroup(panel18Layout.createSequentialGroup()
                                        .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel18Layout.createSequentialGroup()
                                                .addComponent(label57, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEditProductName, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel18Layout.createSequentialGroup()
                                                .addComponent(label37, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbEditProductCategory)))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    );
                    panel18Layout.setVerticalGroup(
                        panel18Layout.createParallelGroup()
                            .addGroup(panel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label57, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditProductName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label37, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEditProductCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label44, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditProductBuying, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label58, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditProductSelling, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label59, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditProductStock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label60, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditProductStatement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEditProduct)
                                    .addComponent(lblEditProduct))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(panel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(panel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(33, Short.MAX_VALUE))
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addComponent(panel17, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(panel18, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap())
                );
            }
            tabbedPane1.addTab("Produtcs", panel4);

            //======== panel5 ========
            {

                //======== panel23 ========
                {
                    panel23.setBorder(new TitledBorder("Category List"));

                    //======== scrollPane5 ========
                    {
                        scrollPane5.setViewportView(tblCategoryList);
                    }

                    //======== panel24 ========
                    {
                        panel24.setBorder(new TitledBorder("Operations"));

                        //---- btnEditCategoryList ----
                        btnEditCategoryList.setText("Edit");

                        //---- btnDeleteCategoryList ----
                        btnDeleteCategoryList.setText("Delete");

                        GroupLayout panel24Layout = new GroupLayout(panel24);
                        panel24.setLayout(panel24Layout);
                        panel24Layout.setHorizontalGroup(
                            panel24Layout.createParallelGroup()
                                .addGroup(panel24Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel24Layout.createParallelGroup()
                                        .addGroup(panel24Layout.createSequentialGroup()
                                            .addComponent(btnDeleteCategoryList)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(btnEditCategoryList, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
                        );
                        panel24Layout.setVerticalGroup(
                            panel24Layout.createParallelGroup()
                                .addGroup(panel24Layout.createSequentialGroup()
                                    .addComponent(btnEditCategoryList, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteCategoryList, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                        );
                    }

                    GroupLayout panel23Layout = new GroupLayout(panel23);
                    panel23.setLayout(panel23Layout);
                    panel23Layout.setHorizontalGroup(
                        panel23Layout.createParallelGroup()
                            .addGroup(panel23Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panel24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                    );
                    panel23Layout.setVerticalGroup(
                        panel23Layout.createParallelGroup()
                            .addGroup(panel23Layout.createSequentialGroup()
                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel24, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE))
                    );
                }

                //======== panel25 ========
                {
                    panel25.setBorder(new TitledBorder("Add New Category"));

                    //---- label38 ----
                    label38.setText("Category Name");

                    //---- label39 ----
                    label39.setText("Explanation");

                    //======== scrollPane6 ========
                    {
                        scrollPane6.setViewportView(txtAddCategoryExplanation);
                    }

                    //---- btnAddCategory ----
                    btnAddCategory.setText("Add");

                    GroupLayout panel25Layout = new GroupLayout(panel25);
                    panel25.setLayout(panel25Layout);
                    panel25Layout.setHorizontalGroup(
                        panel25Layout.createParallelGroup()
                            .addGroup(panel25Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel25Layout.createParallelGroup()
                                    .addGroup(panel25Layout.createSequentialGroup()
                                        .addComponent(label38, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAddCategory, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel25Layout.createSequentialGroup()
                                        .addComponent(label39, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scrollPane6)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCategory)
                                .addGap(30, 30, 30))
                    );
                    panel25Layout.setVerticalGroup(
                        panel25Layout.createParallelGroup()
                            .addGroup(panel25Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel25Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label38, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel25Layout.createParallelGroup()
                                    .addGroup(panel25Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label39, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel25Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))))
                            .addGroup(panel25Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnAddCategory, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                //======== panel26 ========
                {
                    panel26.setBorder(new TitledBorder("Edit Category"));

                    //---- label40 ----
                    label40.setText("Category Name");

                    //---- label41 ----
                    label41.setText("Explanation");

                    //======== scrollPane7 ========
                    {
                        scrollPane7.setViewportView(txtEditCategoryExplanation);
                    }

                    //---- btnEditCategory ----
                    btnEditCategory.setText("Edit");

                    GroupLayout panel26Layout = new GroupLayout(panel26);
                    panel26.setLayout(panel26Layout);
                    panel26Layout.setHorizontalGroup(
                        panel26Layout.createParallelGroup()
                            .addGroup(panel26Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel26Layout.createParallelGroup()
                                    .addGroup(panel26Layout.createSequentialGroup()
                                        .addComponent(label40, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEditCategory, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel26Layout.createSequentialGroup()
                                        .addComponent(label41, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scrollPane7)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditCategory)
                                .addContainerGap(12, Short.MAX_VALUE))
                    );
                    panel26Layout.setVerticalGroup(
                        panel26Layout.createParallelGroup()
                            .addGroup(panel26Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel26Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label40, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel26Layout.createParallelGroup()
                                    .addGroup(panel26Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label41, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(scrollPane7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))))
                            .addGroup(panel26Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnEditCategory, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(panel25, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(panel23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(28, Short.MAX_VALUE))
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(panel23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel25, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel26, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(31, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Categories", panel5);

            //======== panel6 ========
            {

                //======== panel27 ========
                {
                    panel27.setBorder(new TitledBorder("User List"));

                    //======== scrollPane8 ========
                    {
                        scrollPane8.setViewportView(tblUserList);
                    }

                    //======== panel28 ========
                    {
                        panel28.setBorder(new TitledBorder("Operations"));

                        //---- btnAddUser ----
                        btnAddUser.setText("Add User");

                        //---- btnDltUser ----
                        btnDltUser.setText("Delete User");

                        //---- btnUpdateUser ----
                        btnUpdateUser.setText("Update Password");

                        GroupLayout panel28Layout = new GroupLayout(panel28);
                        panel28.setLayout(panel28Layout);
                        panel28Layout.setHorizontalGroup(
                            panel28Layout.createParallelGroup()
                                .addGroup(panel28Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel28Layout.createParallelGroup()
                                        .addComponent(btnAddUser, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDltUser, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdateUser, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                        );
                        panel28Layout.setVerticalGroup(
                            panel28Layout.createParallelGroup()
                                .addGroup(panel28Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btnAddUser)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDltUser)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUpdateUser)
                                    .addContainerGap(15, Short.MAX_VALUE))
                        );
                    }

                    //---- label42 ----
                    label42.setText("text");

                    GroupLayout panel27Layout = new GroupLayout(panel27);
                    panel27.setLayout(panel27Layout);
                    panel27Layout.setHorizontalGroup(
                        panel27Layout.createParallelGroup()
                            .addGroup(panel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel27Layout.createParallelGroup()
                                    .addGroup(panel27Layout.createSequentialGroup()
                                        .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panel28, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label42, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
                    );
                    panel27Layout.setVerticalGroup(
                        panel27Layout.createParallelGroup()
                            .addGroup(panel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel27Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panel28, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollPane8, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label42, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== panel30 ========
                {
                    panel30.setBorder(new TitledBorder("Reset Password"));

                    //---- label70 ----
                    label70.setText("Password");

                    //---- label71 ----
                    label71.setText("New Password");

                    //---- label72 ----
                    label72.setText("New Password Again");

                    //---- btnResetPassword ----
                    btnResetPassword.setText("Change");

                    //---- lblResetPassword ----
                    lblResetPassword.setText("text");

                    GroupLayout panel30Layout = new GroupLayout(panel30);
                    panel30.setLayout(panel30Layout);
                    panel30Layout.setHorizontalGroup(
                        panel30Layout.createParallelGroup()
                            .addGroup(panel30Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel30Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblResetPassword, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                    .addComponent(label72, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(label71, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(label70, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGroup(panel30Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel30Layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(btnResetPassword))
                                    .addGroup(panel30Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel30Layout.createParallelGroup()
                                            .addGroup(panel30Layout.createSequentialGroup()
                                                .addGroup(panel30Layout.createParallelGroup()
                                                    .addComponent(txtNewPassword, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtResetPassword, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel30Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtAgainPassword, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                    );
                    panel30Layout.setVerticalGroup(
                        panel30Layout.createParallelGroup()
                            .addGroup(panel30Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label70, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResetPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label71, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(panel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label72, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgainPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(panel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnResetPassword)
                                    .addComponent(lblResetPassword))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel6Layout = new GroupLayout(panel6);
                panel6.setLayout(panel6Layout);
                panel6Layout.setHorizontalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(panel6Layout.createParallelGroup()
                                .addComponent(panel27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(25, Short.MAX_VALUE))
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(panel27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel30, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("User Settings", panel6);
        }

        //---- btnExit ----
        btnExit.setText("Exit");

        //---- label45 ----
        label45.setText("Admin");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label45, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExit))
                        .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit)
                        .addComponent(label45))
                    .addGap(1, 1, 1)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ali
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel19;
    private JScrollPane scrollPane4;
    private JTable tblCustomer;
    private JPanel panel20;
    private JButton btnCustomerListEdit;
    private JButton btnCustomerListDelete;
    private JPanel pnlAddCustomer;
    private JLabel lblAddCName;
    private JLabel l;
    private JLabel lblAddCSurname;
    private JLabel label28;
    private JLabel label29;
    private JTextField txtAddCustomerName;
    private JTextField txtAddCustomerSurname;
    private JTextField txtAddCustomerEmail;
    private JTextField txtAddCustomerPhone;
    private JTextField txtAddCustomerAddress;
    private JButton btnAddCustomer;
    private JLabel lblAddCustomer;
    private JPanel pnlEditCustomer;
    private JLabel label30;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JLabel label34;
    private JTextField txtEditCustomerName;
    private JTextField txtEditCustomerSurname;
    private JTextField txtEditCustomerEmail;
    private JTextField txtEditCustomerPhone;
    private JTextField txtEditCustomerAddress;
    private JButton btnEditCustomer;
    private JLabel lblEditCustomer;
    private JPanel panel2;
    private JPanel panel10;
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JLabel label2;
    private JTextField txtSearchReport;
    private JLabel label62;
    private JLabel label63;
    private JLabel label64;
    private JLabel label65;
    private JSpinner spnDay1;
    private JSpinner spnMonth1;
    private JSpinner spnYear1;
    private JLabel label66;
    private JLabel label67;
    private JLabel label68;
    private JLabel label69;
    private JSpinner snpDay2;
    private JSpinner spnMonth2;
    private JSpinner spnYear2;
    private JPanel panel12;
    private JScrollPane scrollPane2;
    private JTable tblReport;
    private JPanel panel13;
    private JLabel lblStatement;
    private JPanel panel14;
    private JLabel lblSold;
    private JLabel lblReportsInfo;
    private JPanel panel3;
    private JPanel panel15;
    private JComboBox cmbList;
    private JButton btnSaleList;
    private JLabel lblSaleList;
    private JScrollPane scrollPane9;
    private JTable tblSale;
    private JLabel lblSales;
    private JPanel panel29;
    private JLabel label48;
    private JTextField txtSaleSelect;
    private JLabel label49;
    private JTextField txtSalePiece;
    private JLabel label50;
    private JComboBox cmbSaleCustomer;
    private JButton btnSaleProcess;
    private JPanel panel4;
    private JPanel panel11;
    private JScrollPane scrollPane3;
    private JTable tblProdutcs;
    private JPanel panel16;
    private JButton btnProductListEdit;
    private JButton btnProductListDelete;
    private JPanel panel17;
    private JTextField txtAddProductName;
    private JLabel label36;
    private JLabel label52;
    private JLabel label43;
    private JLabel label53;
    private JLabel label54;
    private JLabel label55;
    private JComboBox cmbAddProductCategory;
    private JTextField txtAddProductBuying;
    private JTextField txtAddProductSelling;
    private JTextField txtAddProductStock;
    private JTextField txtAddProductStatement;
    private JButton btnAddProduct;
    private JLabel lblAddProduct;
    private JPanel panel18;
    private JTextField txtEditProductName;
    private JLabel label37;
    private JLabel label57;
    private JLabel label44;
    private JLabel label58;
    private JLabel label59;
    private JLabel label60;
    private JComboBox cmbEditProductCategory;
    private JTextField txtEditProductBuying;
    private JTextField txtEditProductSelling;
    private JTextField txtEditProductStock;
    private JTextField txtEditProductStatement;
    private JButton btnEditProduct;
    private JLabel lblEditProduct;
    private JPanel panel5;
    private JPanel panel23;
    private JScrollPane scrollPane5;
    private JTable tblCategoryList;
    private JPanel panel24;
    private JButton btnEditCategoryList;
    private JButton btnDeleteCategoryList;
    private JPanel panel25;
    private JLabel label38;
    private JLabel label39;
    private JTextField txtAddCategory;
    private JScrollPane scrollPane6;
    private JTextArea txtAddCategoryExplanation;
    private JButton btnAddCategory;
    private JPanel panel26;
    private JLabel label40;
    private JLabel label41;
    private JTextField txtEditCategory;
    private JScrollPane scrollPane7;
    private JTextArea txtEditCategoryExplanation;
    private JButton btnEditCategory;
    private JPanel panel6;
    private JPanel panel27;
    private JScrollPane scrollPane8;
    private JTable tblUserList;
    private JPanel panel28;
    private JButton btnAddUser;
    private JButton btnDltUser;
    private JButton btnUpdateUser;
    private JLabel label42;
    private JPanel panel30;
    private JLabel label70;
    private JLabel label71;
    private JLabel label72;
    private JButton btnResetPassword;
    private JLabel lblResetPassword;
    private JPasswordField txtResetPassword;
    private JPasswordField txtNewPassword;
    private JPasswordField txtAgainPassword;
    private JButton btnExit;
    private JLabel label45;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
