/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BonusCalculator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Buddhi Rangana
 */
public class BonusCalculator_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form SoftwareEngineeringAssignment3JFrame
     */
    public BonusCalculator_JFrame() {
        initComponents();
        setTitle("Perera Industry");
        setIconImage(new ImageIcon(getClass().getResource("BonusCalculater.png")).getImage());
        currentDate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header_desktopPane = new javax.swing.JDesktopPane();
        header_lbl = new javax.swing.JLabel();
        footer_desktopPane = new javax.swing.JDesktopPane();
        footer_lbl = new javax.swing.JLabel();
        close_btn = new javax.swing.JButton();
        bonusAmount_btn = new javax.swing.JButton();
        serviceYear_lbl = new javax.swing.JLabel();
        serviceYear_txt = new javax.swing.JTextField();
        salary_lbl = new javax.swing.JLabel();
        salary_txt = new javax.swing.JTextField();
        logo_lbl = new javax.swing.JLabel();
        background_lbl = new javax.swing.JLabel();
        currentDate_menu = new javax.swing.JMenuBar();
        date1_lbl = new javax.swing.JMenu();
        date2_lbl = new javax.swing.JMenu();
        time1_lbl = new javax.swing.JMenu();
        time2_lbl = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 150, 100, 150));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_lbl.setFont(new java.awt.Font("FMEconbld", 1, 18)); // NOI18N
        header_lbl.setForeground(new java.awt.Color(255, 255, 255));
        header_lbl.setText("Calculate Bonus for Employees");

        header_desktopPane.setLayer(header_lbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout header_desktopPaneLayout = new javax.swing.GroupLayout(header_desktopPane);
        header_desktopPane.setLayout(header_desktopPaneLayout);
        header_desktopPaneLayout.setHorizontalGroup(
            header_desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_desktopPaneLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(header_lbl)
                .addGap(91, 91, 91))
        );
        header_desktopPaneLayout.setVerticalGroup(
            header_desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header_desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        footer_lbl.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        footer_lbl.setForeground(new java.awt.Color(51, 153, 255));
        footer_lbl.setText("Design by : Buddhi Rangana");

        footer_desktopPane.setLayer(footer_lbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout footer_desktopPaneLayout = new javax.swing.GroupLayout(footer_desktopPane);
        footer_desktopPane.setLayout(footer_desktopPaneLayout);
        footer_desktopPaneLayout.setHorizontalGroup(
            footer_desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footer_desktopPaneLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(footer_lbl)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        footer_desktopPaneLayout.setVerticalGroup(
            footer_desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        getContentPane().add(footer_desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 460, 20));

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close icon.png"))); // NOI18N
        close_btn.setText("Close");
        close_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        bonusAmount_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bonusAmount_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bonus icon.png"))); // NOI18N
        bonusAmount_btn.setText("Show Bonus Amount");
        bonusAmount_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bonusAmount_btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        bonusAmount_btn.setInheritsPopupMenu(true);
        bonusAmount_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonusAmount_btnActionPerformed(evt);
            }
        });
        getContentPane().add(bonusAmount_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        serviceYear_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        serviceYear_lbl.setText("Enter Year of  Service ");
        getContentPane().add(serviceYear_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, 20));

        serviceYear_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(serviceYear_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 180, -1));

        salary_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salary_lbl.setText("Enter Salary   ");
        getContentPane().add(salary_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 90, 20));

        salary_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salary_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_txtActionPerformed(evt);
            }
        });
        getContentPane().add(salary_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, -1));

        logo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Perera industry logo.png"))); // NOI18N
        getContentPane().add(logo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 210, 140));

        background_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Background Image.png"))); // NOI18N
        getContentPane().add(background_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));

        date1_lbl.setText("Date");
        currentDate_menu.add(date1_lbl);
        currentDate_menu.add(date2_lbl);

        time1_lbl.setText("Time");
        currentDate_menu.add(time1_lbl);
        currentDate_menu.add(time2_lbl);

        setJMenuBar(currentDate_menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bonusAmount_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonusAmount_btnActionPerformed
        bonusAmountButton();
    }//GEN-LAST:event_bonusAmount_btnActionPerformed

    private void salary_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salary_txtActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        closeButton();
    }//GEN-LAST:event_close_btnActionPerformed

    private void currentDate() {
        //Date
        Date date = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd");
        date2_lbl.setText(sdf.format(date));

        //Time
        Date time = new Date();
        SimpleDateFormat formatOfDate = new SimpleDateFormat("hh : mm a ");
        time2_lbl.setText(formatOfDate.format(time));

    }

    public void bonusAmountButton() {
        if ((salary_txt.getText().isEmpty()) || (serviceYear_txt.getText().isEmpty())) {
			getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please enter salary and service " + "\n" + "years to calculate bonus amount", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int salary = Integer.parseInt(salary_txt.getText());
            int serviceYear = Integer.parseInt(serviceYear_txt.getText());
            if (serviceYear > 5) {
                int bonus = ((salary * 5) / 100);
				getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Bonus Amount is : " + "Rs " + bonus, "Bonus Amount", JOptionPane.INFORMATION_MESSAGE);
            } else {
				getToolkit().beep();
                JOptionPane.showMessageDialog(null, "You can't get bonus" + "\n" + "Your are traning employee", "Bonus Amount", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void closeButton() {
		getToolkit().beep();
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to close programme?", "Close", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            System.exit(0);
        }
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
            java.util.logging.Logger.getLogger(BonusCalculator_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BonusCalculator_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BonusCalculator_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BonusCalculator_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BonusCalculator_JFrame().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_lbl;
    private javax.swing.JButton bonusAmount_btn;
    private javax.swing.JButton close_btn;
    private javax.swing.JMenuBar currentDate_menu;
    private javax.swing.JMenu date1_lbl;
    private javax.swing.JMenu date2_lbl;
    private javax.swing.JDesktopPane footer_desktopPane;
    private javax.swing.JLabel footer_lbl;
    private javax.swing.JDesktopPane header_desktopPane;
    private javax.swing.JLabel header_lbl;
    private javax.swing.JLabel logo_lbl;
    private javax.swing.JLabel salary_lbl;
    private javax.swing.JTextField salary_txt;
    private javax.swing.JLabel serviceYear_lbl;
    private javax.swing.JTextField serviceYear_txt;
    private javax.swing.JMenu time1_lbl;
    private javax.swing.JMenu time2_lbl;
    // End of variables declaration//GEN-END:variables

}
