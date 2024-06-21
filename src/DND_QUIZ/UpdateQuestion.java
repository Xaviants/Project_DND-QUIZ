package DND_QUIZ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 * Kelas ini digunakan untuk mengelola proses pembaruan pertanyaan dalam aplikasi.
 * Memungkinkan pengguna untuk mencari pertanyaan berdasarkan ID, menampilkan 
 * pertanyaan beserta opsi jawaban, dan memperbarui informasi pertanyaan tersebut.
 * 
 * @author DAFFA
 */
public class UpdateQuestion extends javax.swing.JFrame {

    /**
     * Membuat instance baru dari UpdateQuestion.
     * Inisialisasi komponen GUI seperti tombol, field teks, dan aksi awal.
     */
    public UpdateQuestion() {
        initComponents();
        
        // Set semua field teks tidak dapat diedit saat inisialisasi
        txtQuestion.setFocusable(false);
        txtOpt1.setFocusable(false);
        txtOpt2.setFocusable(false);
        txtOpt3.setFocusable(false);
        txtOpt4.setFocusable(false);
        txtAnswer.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        txtQuestion = new javax.swing.JTextField();
        txtOpt1 = new javax.swing.JTextField();
        txtOpt2 = new javax.swing.JTextField();
        txtOpt3 = new javax.swing.JTextField();
        txtOpt4 = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(140, 120));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/logo exit (1).png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 60, 50));

        txtID.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtID.setMinimumSize(new java.awt.Dimension(64, 32));
        txtID.setPreferredSize(new java.awt.Dimension(64, 32));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 230, 40));

        searchBtn.setBackground(new java.awt.Color(86, 161, 226));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 700, -1));

        txtOpt1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 700, -1));

        txtOpt2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 700, -1));

        txtOpt3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 700, -1));

        txtOpt4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 700, -1));

        txtAnswer.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 700, -1));

        updateBtn.setBackground(new java.awt.Color(86, 161, 226));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 457, -1, -1));

        clearBtn.setBackground(new java.awt.Color(86, 161, 226));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 457, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/Update Q (3).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Aksi yang dilakukan saat tombol close di-klik.
     * Mengatur status jendela AdminHome dan menyembunyikan jendela UpdateQuestion.
     * 
     * @param evt ActionEvent yang mengindikasikan tombol close di-klik
     */
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        AdminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed
    
    /**
     * Aksi yang dilakukan saat tombol search di-klik.
     * Mencari pertanyaan berdasarkan ID yang dimasukkan oleh pengguna.
     * Jika ditemukan, mengisi field teks dengan detail pertanyaan dan opsi jawaban.
     * 
     * @param evt ActionEvent yang mengindikasikan tombol search di-klik
     */
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String id = txtID.getText();
        
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi ID pertanyaan/soal terlebih dahulu", "WARNING", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Connection conn = ConnectionProvider.getConnected();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM question WHERE id = '"+id+"'");

                if(rs.next()){
                    txtQuestion.setText(rs.getString(2));
                    txtOpt1.setText(rs.getString(3));
                    txtOpt2.setText(rs.getString(4));
                    txtOpt3.setText(rs.getString(5));
                    txtOpt4.setText(rs.getString(6));
                    txtAnswer.setText(rs.getString(7));
                    txtID.setEditable(false);
                    txtID.setFocusable(false);
                    txtQuestion.setFocusable(true);
                    txtOpt1.setFocusable(true);
                    txtOpt2.setFocusable(true);
                    txtOpt3.setFocusable(true);
                    txtOpt4.setFocusable(true);
                    txtAnswer.setFocusable(true);
                }else{
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, "Question ID tidak ditemukan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e){
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    
    /**
     * Aksi yang dilakukan saat tombol update di-klik.
     * Memperbarui pertanyaan dan opsi jawaban dalam database berdasarkan inputan pengguna.
     * Memberikan pesan peringatan jika terdapat kesalahan seperti opsi yang sama atau jawaban yang tidak sesuai.
     * 
     * @param evt ActionEvent yang mengindikasikan tombol update di-klik
     */
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String id = txtID.getText();
        String name = txtQuestion.getText();
        String opt1 = txtOpt1.getText();
        String opt2 = txtOpt2.getText();
        String opt3 = txtOpt3.getText();
        String opt4 = txtOpt4.getText();
        String answer = txtAnswer.getText();
        
        if(id.isEmpty() && name.isEmpty() && opt1.isEmpty() && opt2.isEmpty() && opt3.isEmpty() && opt4.isEmpty() && answer.isEmpty()){
            JOptionPane.showMessageDialog(this, "Pertanyaan belum ditampilkan", "WARNING", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Connection con = ConnectionProvider.getConnected();
                PreparedStatement ps = con.prepareStatement("UPDATE question SET name = ?, opt1 = ?, opt2 = ?, opt3 = ?, opt4 = ?, answer = ? WHERE id = ?");
                ps.setString(1, name);
                ps.setString(2, opt1);
                ps.setString(3, opt2);
                ps.setString(4, opt3);
                ps.setString(5, opt4);
                ps.setString(6, answer);
                ps.setString(7, id);
                ps.executeUpdate();

                if(opt1.equalsIgnoreCase(opt2) || opt1.equalsIgnoreCase(opt3) || opt1.equalsIgnoreCase(opt4) || opt2.equalsIgnoreCase(opt3) || opt2.equalsIgnoreCase(opt4) || opt3.equalsIgnoreCase(opt4)){
                    JOptionPane.showMessageDialog(this, "Ada opsi yang sama", "WARNING", JOptionPane.WARNING_MESSAGE);
                }else if(!answer.equalsIgnoreCase(opt1) && !answer.equalsIgnoreCase(opt2) && !answer.equalsIgnoreCase(opt3) && !answer.equalsIgnoreCase(opt4)){
                    JOptionPane.showMessageDialog(this, "Jawaban harus sesuai atau sama dengan salah satu opsi!", "WARNING", JOptionPane.WARNING_MESSAGE);
                }else{
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, "Pertanyaan berhasil diperbarui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    setVisible(false);
                    new UpdateQuestion().setVisible(true);
                }
            }catch(Exception e){
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed
    
    /**
     * Aksi yang dilakukan saat tombol clear di-klik.
     * Mengosongkan semua field teks dan mengembalikan ke status awal.
     * 
     * @param evt ActionEvent yang mengindikasikan tombol clear di-klik
     */
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        txtID.setText("");
        txtQuestion.setText("");
        txtOpt1.setText("");
        txtOpt2.setText("");
        txtOpt3.setText("");
        txtOpt4.setText("");
        txtAnswer.setText("");
        txtID.setEditable(true);
        txtID.setFocusable(true);
        txtQuestion.setFocusable(false);
        txtOpt1.setFocusable(false);
        txtOpt2.setFocusable(false);
        txtOpt3.setFocusable(false);
        txtOpt4.setFocusable(false);
        txtAnswer.setFocusable(false);
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtOpt1;
    private javax.swing.JTextField txtOpt2;
    private javax.swing.JTextField txtOpt3;
    private javax.swing.JTextField txtOpt4;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
