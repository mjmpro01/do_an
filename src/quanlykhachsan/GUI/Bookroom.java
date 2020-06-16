/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.GUI;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quanlykhachsan.BUS.datphongBUS;
import quanlykhachsan.DTO.datphongDTO;

/**
 *
 * @author Duy Minh
 */
public class Bookroom extends javax.swing.JFrame {

    public Bookroom() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bookroom1 = new javax.swing.JPanel();
        gender1 = new javax.swing.JComboBox<>();
        birthday1 = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        cmnd1 = new javax.swing.JTextField();
        phonenumber1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        typeofcus1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maroom1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bookingdate1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        arrivaldate1 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);

        Bookroom1.setBackground(new java.awt.Color(255, 255, 255));
        Bookroom1.setBorder(new javax.swing.border.MatteBorder(null));

        gender1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        birthday1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthday1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthday1MouseClicked(evt);
            }
        });
        birthday1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                birthday1KeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlykhachsan/HinhAnh/close_window_64px.png"))); // NOI18N
        jLabel31.setText("Close");
        jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });

        cmnd1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmnd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmnd1ActionPerformed(evt);
            }
        });

        phonenumber1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Customer type:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlykhachsan/HinhAnh/checkmark_64px.png"))); // NOI18N
        jLabel30.setText("Book room");
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });

        typeofcus1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typeofcus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Foreign" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Fullname:");

        fullname1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Birthday:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("CMND:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Address: ");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Phone number:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Gender:");

        address1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(address1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Add customer ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Reservation Details");

        maroom1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        maroom1.setText("jLabel9");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Room's code:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bookingdate1.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Arrival Date");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Booking Date");

        javax.swing.GroupLayout Bookroom1Layout = new javax.swing.GroupLayout(Bookroom1);
        Bookroom1.setLayout(Bookroom1Layout);
        Bookroom1Layout.setHorizontalGroup(
            Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bookroom1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(212, 212, 212))
            .addGroup(Bookroom1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25)
                    .addComponent(jLabel10)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addGap(70, 70, 70)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeofcus1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmnd1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phonenumber1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(birthday1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addComponent(fullname1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bookroom1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addGroup(Bookroom1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addGroup(Bookroom1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))
                        .addGap(80, 80, 80)
                        .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maroom1)
                            .addComponent(arrivaldate1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(107, Short.MAX_VALUE))))
        );
        Bookroom1Layout.setVerticalGroup(
            Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bookroom1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bookroom1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fullname1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(maroom1)))
                        .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Bookroom1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bookroom1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookingdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38)))
                        .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(birthday1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivaldate1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Bookroom1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phonenumber1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(cmnd1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(typeofcus1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(Bookroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bookroom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bookroom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmnd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmnd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnd1ActionPerformed

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:`
        this.dispose();
    }//GEN-LAST:event_jLabel31MouseClicked
    private void testDay() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String ngaysinh = dateFormat.format(birthday1.getDate());
        System.out.print(ngaysinh);
    }

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked

        String htkh = fullname1.getText();
        String gioitinh = gender1.getSelectedItem().toString();
        Date birthday = birthday1.getDate();
        String ngsinh = birthday.getDate() + "-" + (birthday.getMonth() + 1) + "-" + (birthday.getYear() + 1900);
        String sodt = phonenumber1.getText();
        String cmnd = cmnd1.getText();
        String loaikh = typeofcus1.getSelectedItem().toString();
        String diachi = address1.getText();
        String maphong = maroom1.getText();
        Date ngaydat = bookingdate1.getDate();
        Date ngaynhan = arrivaldate1.getDate();
        Date nowday = new Date();
        String ngdat = ngaydat.getDate() + "-" + (ngaydat.getMonth() + 1) + "-" + (ngaydat.getYear() + 1900);
        String ngnhan = ngaynhan.getDate() + "-" + (ngaynhan.getMonth() + 1) + "-" + (ngaynhan.getYear() + 1900);
        String user1 = LoginGUI.user;
        if ((nowday.getYear() - birthday.getYear()) < 16) {
            JOptionPane.showMessageDialog(null, "Khách hàng chưa đủ tuổi ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            if (ngaynhan.before(ngaydat)) {
                JOptionPane.showMessageDialog(null, "ngày nhận không xác định ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                if (ngaydat.after(ngaynhan) ) {
                    JOptionPane.showMessageDialog(null, "ngày đặt không xác định ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (cmnd1.getText().isEmpty() || fullname1.getText().isEmpty() || phonenumber1.getText().isEmpty() || address1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Thông tin không đầy đủ ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                    } else {

                        datphongDTO dp;
                        dp = new datphongDTO(maphong, ngdat, ngnhan, htkh, ngsinh, gioitinh ,cmnd, sodt,  diachi, loaikh, user1);
                        datphongBUS dpBUS;
                        try {

                            dpBUS = new datphongBUS();
                            if (dpBUS.themdatphong(dp) == true) {
                                JOptionPane.showConfirmDialog(null, "bạn có muốn đặt phòng", "Thông báo", JOptionPane.OK_CANCEL_OPTION);

                                this.dispose();

                            } else {
                                JOptionPane.showMessageDialog(null, "thêm không thành công", "Thông báo", JOptionPane.NO_OPTION);
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(GiamdocGUI.class.getName()).log(Level.SEVERE, null, ex);

                            JOptionPane.showMessageDialog(null, "không thể đặt phòng ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
        // TODO add your handling code here:
        jLabel30.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel30MouseExited

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        // TODO add your handling code here:
        jLabel30.setBackground(Color.LIGHT_GRAY);
        jLabel30.setOpaque(true);

    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        // TODO add your handling code here:
        jLabel31.setBackground(Color.LIGHT_GRAY);
        jLabel31.setOpaque(true);
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        // TODO add your handling code here:
        jLabel31.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel31MouseExited

    private void birthday1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_birthday1KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_birthday1KeyPressed

    private void birthday1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthday1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_birthday1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatLightLaf.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Bookroom().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Bookroom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Bookroom1;
    private javax.swing.JEditorPane address1;
    private com.toedter.calendar.JDateChooser arrivaldate1;
    private com.toedter.calendar.JDateChooser birthday1;
    private com.toedter.calendar.JDateChooser bookingdate1;
    private javax.swing.JTextField cmnd1;
    private javax.swing.JTextField fullname1;
    private javax.swing.JComboBox<String> gender1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JLabel maroom1;
    private javax.swing.JTextField phonenumber1;
    private javax.swing.JComboBox<String> typeofcus1;
    // End of variables declaration//GEN-END:variables
}