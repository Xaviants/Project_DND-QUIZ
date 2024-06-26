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
 * Kelas AddNewQuestion adalah kelas untuk menambahkan pertanyaan baru ke dalam database.
 * Kelas ini juga menampilkan antarmuka pengguna untuk memasukkan data pertanyaan.
 * Data pertanyaan yang dimasukkan akan disimpan ke dalam tabel 'question' di database.
 * 
 * @author DAFFA
 */
public class AddNewQuestion extends javax.swing.JFrame {

    /**
     * Konstruktor untuk kelas AddNewQuestion.
     * Memuat antarmuka pengguna dan mengatur ID untuk pertanyaan baru.
     * Jika terjadi kesalahan saat mengambil ID dari database, pesan kesalahan akan ditampilkan.
     */
    public AddNewQuestion() {
        initComponents();
        
        try{
            Connection conn = ConnectionProvider.getConnected();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(id) FROM question");
            
            if(rs.next()){
                int id = rs.getInt(1);
                id = id + 1;
                
                String str = String.valueOf(id);
                lblID.setText(str);
            }else{
                lblID.setText("1");
            }
        }catch(Exception e){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
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

        closeBtn = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        txtOpt1 = new javax.swing.JTextField();
        txtOpt2 = new javax.swing.JTextField();
        txtOpt3 = new javax.swing.JTextField();
        txtOpt4 = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

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
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 60, 50));

        lblID.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 0, 0));
        lblID.setText("00");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        txtQuestion.setBackground(new java.awt.Color(255, 251, 192));
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 700, 40));

        txtOpt1.setBackground(new java.awt.Color(255, 251, 193));
        txtOpt1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 201, 700, 40));

        txtOpt2.setBackground(new java.awt.Color(255, 251, 193));
        txtOpt2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 700, 40));

        txtOpt3.setBackground(new java.awt.Color(255, 251, 193));
        txtOpt3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 700, 40));

        txtOpt4.setBackground(new java.awt.Color(255, 251, 193));
        txtOpt4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtOpt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 700, 40));

        txtAnswer.setBackground(new java.awt.Color(255, 251, 193));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 700, 40));

        saveBtn.setBackground(new java.awt.Color(85, 161, 229));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 457, -1, -1));

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/add new Q (1).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metode untuk menutup antarmuka pengguna ketika tombol close ditekan.
     * Mengatur status 'open' di kelas AdminHome menjadi 0 dan menghilangkan antarmuka pengguna.
     * 
     * @param evt Event yang memicu penutupan antarmuka pengguna
     */
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        AdminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed
    
    /**
     * Metode untuk menyimpan data pertanyaan baru ke dalam database.
     * Memeriksa keberadaan data yang valid sebelum menyimpan.
     * Menampilkan pesan peringatan jika ada data yang kosong atau tidak valid.
     * 
     * @param evt Event yang memicu penyimpanan data pertanyaan
     */
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String id = lblID.getText();
        String name = txtQuestion.getText();
        String opt1 = txtOpt1.getText();
        String opt2 = txtOpt2.getText();
        String opt3 = txtOpt3.getText();
        String opt4 = txtOpt4.getText();
        String answer = txtAnswer.getText();
        
        if(name.isEmpty() && opt1.isEmpty() && opt2.isEmpty() && opt3.isEmpty() && opt4.isEmpty() && answer.isEmpty()){
            JOptionPane.showMessageDialog(this, "Pertanyaan beserta jawaban belum dibuat", "WARNING", JOptionPane.WARNING_MESSAGE);
        }else{
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Kolom pertanyaan atau soal kosong", "WARNING", JOptionPane.WARNING_MESSAGE);
            }else{
                if(opt1.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Kolom opsi pertama kosong", "WARNING", JOptionPane.WARNING_MESSAGE);
                }else{
                    if(opt2.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Kolom opsi kedua kosong", "WARNING", JOptionPane.WARNING_MESSAGE);
                    }else{
                        if(opt3.isEmpty()){
                            JOptionPane.showMessageDialog(this, "Kolom opsi ketiga kosong", "WARNING", JOptionPane.WARNING_MESSAGE);
                        }else{
                            if(opt4.isEmpty()){
                                JOptionPane.showMessageDialog(this, "Kolom opsi keempat kosong", "WARNING", JOptionPane.WARNING_MESSAGE);
                            }else{
                                if(opt1.equalsIgnoreCase(opt2) || opt1.equalsIgnoreCase(opt3) || opt1.equalsIgnoreCase(opt4) || opt2.equalsIgnoreCase(opt3) || opt2.equalsIgnoreCase(opt4) || opt3.equalsIgnoreCase(opt4)){
                                    JOptionPane.showMessageDialog(this, "Ada opsi yang sama", "WARNING", JOptionPane.WARNING_MESSAGE);
                                }else{
                                    if(answer.isEmpty()){
                                        JOptionPane.showMessageDialog(this, "Kolom jawaban kosong", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    }else{
                                        if(!answer.equalsIgnoreCase(opt1) && !answer.equalsIgnoreCase(opt2) && !answer.equalsIgnoreCase(opt3) && !answer.equalsIgnoreCase(opt4)){
                                            JOptionPane.showMessageDialog(this, "Jawaban harus sesuai atau sama dengan salah satu opsi!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        }else{
                                            try{
                                                Connection con = ConnectionProvider.getConnected();
                                                PreparedStatement ps = con.prepareStatement("INSERT INTO question VALUES (?, ?, ?, ?, ?, ?, ?)");
                                                ps.setString(1, id);
                                                ps.setString(2, name);
                                                ps.setString(3, opt1);
                                                ps.setString(4, opt2);
                                                ps.setString(5, opt3);
                                                ps.setString(6, opt4);
                                                ps.setString(7, answer);
                                                ps.executeUpdate();

                                                JFrame jf = new JFrame();
                                                jf.setAlwaysOnTop(true);
                                                JOptionPane.showMessageDialog(jf, "Pertanyaan berhasil ditambahkan", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

                                                setVisible(false);
                                                new AddNewQuestion().setVisible(true);
                                            }catch(Exception e){
                                                JFrame jf = new JFrame();
                                                jf.setAlwaysOnTop(true);
                                                JOptionPane.showMessageDialog(jf, e);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    
    /**
     * Metode untuk menghapus semua inputan dalam antarmuka pengguna.
     * Membersihkan teks dari semua kolom input.
     * 
     * @param evt Event yang memicu penghapusan inputan
     */
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        txtQuestion.setText("");
        txtOpt1.setText("");
        txtOpt2.setText("");
        txtOpt3.setText("");
        txtOpt4.setText("");
        txtAnswer.setText("");
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
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lblID;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtOpt1;
    private javax.swing.JTextField txtOpt2;
    private javax.swing.JTextField txtOpt3;
    private javax.swing.JTextField txtOpt4;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
