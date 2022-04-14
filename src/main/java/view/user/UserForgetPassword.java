/*
 * Created by JFormDesigner on Thu Apr 14 02:47:49 TRT 2022
 */

package view.user;

import model.UserImpl;
import props.User;
import view.UserPanel;

import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class UserForgetPassword extends JFrame {
    UserImpl userImpl=new UserImpl();
    public UserForgetPassword() {
        initComponents();
    }

    private void thisWindowClosing(WindowEvent e) {
       new UserPanel().setVisible(true);
    }

    private void btnForgetPasswordClicked(ActionEvent e) {
        User user=fncDataValid();

        int answer=JOptionPane.showConfirmDialog(this,"Are you sure you want to update?","Update Window",JOptionPane.YES_OPTION);
        if(answer==0){
            if(txtverificationCode.equals(UserImpl.verificationCode)){
                userImpl.userForgetPassword(user);
            }else{
                lblError.setText("Verification Code is Wrong");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please Choose!"); //this kendini burada ortala
        }
    }

    public User fncDataValid(){

        String email=txtEmail.getText().trim().toLowerCase(Locale.ROOT);
        String verificationCode=txtverificationCode.getText().trim();
        String password=txtPassword.getText();

        if(email.equals("")){
            lblError.setText("Please Enter Email");
            txtEmail.requestFocus();
        }else if(verificationCode.equals("")){
            lblError.setText("Please Enter Verification Code");
            txtverificationCode.requestFocus();
        }else if(password.equals("")){
            lblError.setText("Please Enter New Password");
            txtPassword.requestFocus();
        }else {
            lblError.setText("");
            User user=new User(email,password);

            return user;
        }
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        txtEmail = new JTextField();
        txtverificationCode = new JTextField();
        btnForgetPassword = new JButton();
        lblError = new JLabel();
        txtPassword = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();

        //---- btnForgetPassword ----
        btnForgetPassword.setText("CHANGE");
        btnForgetPassword.addActionListener(e -> btnForgetPasswordClicked(e));

        //---- lblError ----
        lblError.setText(" ");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(btnForgetPassword))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(lblError, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                .addComponent(txtverificationCode)
                                .addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))))
                    .addContainerGap(171, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtverificationCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                    .addComponent(btnForgetPassword)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblError)
                    .addGap(19, 19, 19))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField txtEmail;
    private JTextField txtverificationCode;
    private JButton btnForgetPassword;
    private JLabel lblError;
    private JTextField txtPassword;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
