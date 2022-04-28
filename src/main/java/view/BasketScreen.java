/*
 * Created by JFormDesigner on Sat Apr 23 21:57:20 TRT 2022
 */

package view;

import java.awt.event.*;
import model.BasketImpl;
import model.OrderImpl;
import model.ProductCategoryImpl;
import model.ProductImpl;
import props.Basket;
import props.ComboItem;
import props.Order;
import props.Product;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mrf
 */
public class BasketScreen extends JFrame {
    BasketImpl basketImpl = new BasketImpl(-1);
    ProductImpl productImpl =new ProductImpl(-1);
    OrderImpl orderImpl=new OrderImpl();

    public BasketScreen() {
        initComponents();
        tblBasket.setModel(basketImpl.basketTableModel());
        listedCustomer();
    }

    private void listedCustomer() {
        List<ComboItem> listCustomer=productImpl.listCustomer();
        for (ComboItem item:listCustomer) {
            cmbSaleCustomer.addItem(new ComboItem(item.getValue(), item.getKey()));
        }
    }

    private void btnDeleteClick(ActionEvent e) {
        if (tblBasket.getSelectedRow() != -1) {
            int input = JOptionPane.showConfirmDialog(this, "Request delete are you sure?","Deletion process",JOptionPane.YES_NO_OPTION);
            if(input==0){
                basketImpl.basketDelete(Integer.parseInt(String.valueOf(tblBasket.getValueAt(tblBasket.getSelectedRow() , 0))));
                BasketImpl basketImpl1 = new BasketImpl(1);
                tblBasket.setModel(basketImpl1.basketTableModel());
            }
        }
        else
            JOptionPane.showMessageDialog(this,"Please make a choice!");
    }

    private void btnBuyClick(ActionEvent e) {
        int customerId = Integer.parseInt(((ComboItem)cmbSaleCustomer.getSelectedItem()).getValue());
        BasketImpl basketImpl1 = new BasketImpl(customerId);
        tblBasket.setModel(basketImpl1.basketTableModel());
        System.out.println(basketImpl1.basketList());
        int customerID = basketImpl1.basketList().get(0).getCustomerID();
        String date = basketImpl1.basketList().get(0).getDate();
        String uuid = basketImpl1.basketList().get(0).getUuid();
        int totalPrice=0;
        List<Basket> listBasket=basketImpl1.basketList();
        for (Basket item:listBasket) {
            //stock kontrolu yap ,stokta varsa işleme tabi tut
            if(basketImpl.stockControl(item.getProductID(),item.getCount())==1){
                totalPrice +=(item.getCount()) * (productImpl.getProductSellPrice(item.getProductID()));
                Product product1=productImpl.getProduct(item.getProductID());
                int stock=product1.getStock();
                int rsStock=stock-item.getCount();
                product1.setStock(rsStock);
                productImpl.productUpdate(product1);
                System.out.println("stock updated : "+product1.getStock());
            }
        }
        Order order=new Order(1,customerID,totalPrice,date,uuid);
        orderImpl.orderInsert(order);
        basketImpl.basketUpdate(customerID);
        BasketImpl basketImpl2 = new BasketImpl(customerId);
        tblBasket.setModel(basketImpl2.basketTableModel());
    }

    private void btnSearchClick(ActionEvent e) {
        int customerId = Integer.parseInt(((ComboItem)cmbSaleCustomer.getSelectedItem()).getValue());
        BasketImpl basketImpl1 = new BasketImpl(customerId);
        tblBasket.setModel(basketImpl1.basketTableModel());
    }

    private void cmbSaleCustomerMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        tblBasket = new JTable();
        btnDelete = new JButton();
        btnBuy = new JButton();
        cmbSaleCustomer = new JComboBox();
        label50 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(tblBasket);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //---- btnDelete ----
        btnDelete.setText("Delete");
        btnDelete.addActionListener(e -> btnDeleteClick(e));

        //---- btnBuy ----
        btnBuy.setText("Buy");
        btnBuy.addActionListener(e -> btnBuyClick(e));

        //---- cmbSaleCustomer ----
        cmbSaleCustomer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cmbSaleCustomerMouseEntered(e);
            }
        });

        //---- label50 ----
        label50.setText("Customer");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                    .addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(label50, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(cmbSaleCustomer, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label50)
                        .addComponent(cmbSaleCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(btnBuy))
                    .addContainerGap(259, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable tblBasket;
    private JButton btnDelete;
    private JButton btnBuy;
    private JComboBox cmbSaleCustomer;
    private JLabel label50;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
