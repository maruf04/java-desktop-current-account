/*
 * Created by JFormDesigner on Thu Apr 14 00:30:01 TRT 2022
 */

package view.user;

import java.awt.event.*;
import javax.swing.border.*;

import model.ProductCategoryImpl;
import model.UserImpl;
import utils.Util;
import view.MainApp;
//import view.UserChangePassword;

import java.awt.*;
import java.util.Locale;
import java.util.Random;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class UserPanel extends JFrame {
    MainApp mainapp=new MainApp();
    UserImpl userImpl=new UserImpl();
   // public static String to="";
    //public static String sub="";
    //public static String msg="";
    public static String emailChange="";
    boolean status=false;
    public static String verificationCode="";


    public static void main(String[] args) {
        new UserPanel().setVisible(true);
      //  ProductCategoryImpl productCategory=new ProductCategoryImpl();

    }

    public UserPanel() {
        initComponents();
        txtPassword.setText("JavaProject123");
        txtEmail.setText("javaproject96@gmail.com");

    }

    private void btnLoginClicked(ActionEvent e) {
        userLogin();


    }

    private void txtEmailKeyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            userLogin();
        }
    }

    private void txtPasswordKeyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            userLogin();
        }
    }



    private void btnChangePasswordClicked(ActionEvent e) {
        String email=txtEmail.getText().trim().toLowerCase(Locale.ROOT);
        status=userImpl.userGetEmail(email);
        if(status){
            new UserChangePassword().setVisible(true);
            dispose();
        }else{
            lblError.setText("Please Enter a Valid Email Address");
        }
    }

    private void btnForgetPasswordClicked(ActionEvent e) {
        String email=txtEmail.getText().trim().toLowerCase(Locale.ROOT);
        status=userImpl.userGetEmail(email);
        if(status){
            // String to= UserImpl.emailAddress;
            //String sub="Java Project Forget Password";
            //String msg="\n\n\t\tVerification Code: "+userImpl.verificationCode;

            System.out.println(userImpl.verificationCode);
            //Util.sendMail(to,sub,msg);

            new UserForgetPassword().setVisible(true);
            dispose();
        }else{
            lblError.setText("Please Enter a Valid Email Address");
        }
    }

    public void userLogin(){
        String email=txtEmail.getText().trim().toLowerCase(Locale.ROOT);
        String password= String.valueOf(txtPassword.getPassword()).trim();
        if(email.equals("")){
            txtEmail.requestFocus();
            lblError.setText("Please Enter E-Mail");
        }else if(!Util.isValidEmailAddress(email)){
            txtPassword.requestFocus();
            lblError.setText("E-Mail Format Error");
        }else if(password.length()==0){
            btnChangePassword.setVisible(true);
            btnForgetPassword.setVisible(true);
            emailChange= txtEmail.getText();
            txtPassword.requestFocus();
            lblError.setText("Please Enter Password");
        }else {
            lblError.setText("");
            boolean status=userImpl.userLogin(email,password);
            if(status){
                new MainApp().setVisible(true);
                dispose();
            }else{
                lblError.setText("Email or Password Incorrect");
            }
        }
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        txtEmail = new JTextField();
        txtPassword = new JPasswordField();
        btnLogin = new JButton();
        btnChangePassword = new JButton();
        btnForgetPassword = new JButton();
        lblError = new JLabel();
        panel1 = new JPanel();

        //======== this ========
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/lblEmailIcon.png")));

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/lblPasswordIcon.png")));

        //---- txtEmail ----
        txtEmail.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtEmailKeyReleased(e);
            }
        });

        //---- txtPassword ----
        txtPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtPasswordKeyReleased(e);
            }
        });

        //---- btnLogin ----
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(e -> btnLoginClicked(e));

        //---- btnChangePassword ----
        btnChangePassword.setText("Change Password");
        btnChangePassword.setFont(new Font("Segoe UI", Font.PLAIN, 9));
        btnChangePassword.addActionListener(e -> btnChangePasswordClicked(e));

        //---- btnForgetPassword ----
        btnForgetPassword.setText("Forget Password?");
        btnForgetPassword.setFont(new Font("Segoe UI", Font.PLAIN, 9));
        btnForgetPassword.addActionListener(e -> btnForgetPasswordClicked(e));

        //---- lblError ----
        lblError.setText(" ");

        //======== panel1 ========
        {
            panel1.setForeground(SystemColor.activeCaption);
            panel1.setBackground(SystemColor.activeCaption);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 328, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblError, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnForgetPassword, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnChangePassword, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPassword))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmail)))
                    .addContainerGap(48, Short.MAX_VALUE))
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnLogin)
                    .addGap(35, 35, 35)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnForgetPassword)
                        .addComponent(btnChangePassword))
                    .addGap(31, 31, 31)
                    .addComponent(lblError)
                    .addGap(27, 27, 27))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnChangePassword;
    private JButton btnForgetPassword;
    private JLabel lblError;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
