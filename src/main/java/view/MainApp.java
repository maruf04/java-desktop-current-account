/*
 * Created by JFormDesigner on Thu Apr 14 02:40:21 TRT 2022
 */

package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

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
        // Generated using JFormDesigner Evaluation license - mrf
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel2 = new JPanel();
        label2 = new JLabel();
        panel3 = new JPanel();
        label6 = new JLabel();
        panel4 = new JPanel();
        label5 = new JLabel();
        panel5 = new JPanel();
        label4 = new JLabel();
        panel6 = new JPanel();
        label3 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setBackground(new Color(102, 255, 255));
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
                swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border
                . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog"
                , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,panel1. getBorder
                () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
                . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException
                ( ) ;} } );

                //======== panel7 ========
                {
                    panel7.setBackground(new Color(51, 255, 153));

                    //======== panel8 ========
                    {
                        panel8.setBackground(new Color(153, 153, 255));

                        GroupLayout panel8Layout = new GroupLayout(panel8);
                        panel8.setLayout(panel8Layout);
                        panel8Layout.setHorizontalGroup(
                            panel8Layout.createParallelGroup()
                                .addGap(0, 74, Short.MAX_VALUE)
                        );
                        panel8Layout.setVerticalGroup(
                            panel8Layout.createParallelGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                        );
                    }

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(table1);
                    }

                    GroupLayout panel7Layout = new GroupLayout(panel7);
                    panel7.setLayout(panel7Layout);
                    panel7Layout.setHorizontalGroup(
                        panel7Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                    panel7Layout.setVerticalGroup(
                        panel7Layout.createParallelGroup()
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel7Layout.createParallelGroup()
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(333, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("M\u00fc\u015fteriler", panel1);

            //======== panel2 ========
            {

                //---- label2 ----
                label2.setText("Raporlar");

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(0, 266, Short.MAX_VALUE)
                            .addComponent(label2)
                            .addGap(0, 265, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(0, 214, Short.MAX_VALUE)
                            .addComponent(label2)
                            .addGap(0, 214, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Raporlar", panel2);

            //======== panel3 ========
            {

                //---- label6 ----
                label6.setText("Sat\u0131\u015f Y\u00f6netimi");

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(402, 402, 402)
                            .addComponent(label6)
                            .addContainerGap(100, Short.MAX_VALUE))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(label6)
                            .addContainerGap(227, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Sat\u0131\u015f Y\u00f6netimi", panel3);

            //======== panel4 ========
            {

                //---- label5 ----
                label5.setText("\u00dcr\u00fcn Y\u00f6netimi");

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGap(366, 366, 366)
                            .addComponent(label5)
                            .addContainerGap(136, Short.MAX_VALUE))
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGap(185, 185, 185)
                            .addComponent(label5)
                            .addContainerGap(243, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("\u00dcr\u00fcn Y\u00f6netimi", panel4);

            //======== panel5 ========
            {

                //---- label4 ----
                label4.setText("Kategori Y\u00f6netimi");

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addGap(370, 370, 370)
                            .addComponent(label4)
                            .addContainerGap(111, Short.MAX_VALUE))
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(label4)
                            .addContainerGap(251, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Kategori Y\u00f6netimi", panel5);

            //======== panel6 ========
            {

                //---- label3 ----
                label3.setText("Kullan\u0131c\u0131 Ayarlar\u0131");

                GroupLayout panel6Layout = new GroupLayout(panel6);
                panel6.setLayout(panel6Layout);
                panel6Layout.setHorizontalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGap(403, 403, 403)
                            .addComponent(label3)
                            .addContainerGap(85, Short.MAX_VALUE))
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(label3)
                            .addContainerGap(251, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Kullan\u0131c\u0131 Ayarlar\u0131", panel6);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mrf
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel7;
    private JPanel panel8;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel2;
    private JLabel label2;
    private JPanel panel3;
    private JLabel label6;
    private JPanel panel4;
    private JLabel label5;
    private JPanel panel5;
    private JLabel label4;
    private JPanel panel6;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
