package DND_QUIZ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Kelas BaseFrame adalah kelas turunan dari JFrame yang memiliki konfigurasi dasar untuk aplikasi.
 * Kelas ini menyiapkan konfigurasi seperti operasi close aplikasi dan tata letak yang khusus.
 */
class BaseFrame extends JFrame {
    
    /**
     * Konstruktor untuk kelas BaseFrame.
     * Menginisialisasi komponen dasar dari JFrame seperti operasi close aplikasi
     * dan pengaturan tata letak.
     */
    public BaseFrame() {
        initBaseComponents();
    }
    
    /**
     * Metode untuk menginisialisasi komponen dasar dari JFrame.
     * Konfigurasi termasuk operasi close aplikasi dan tata letak menggunakan
     * AbsoluteLayout dari NetBeans.
     */
    private void initBaseComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }
    
    /**
     * Metode untuk menampilkan pesan dialog dengan ikon dan judul yang sesuai.
     *
     * @param message Pesan yang akan ditampilkan dalam dialog.
     * @param title Judul dari dialog.
     * @param messageType Tipe dari pesan dialog (misalnya JOptionPane.INFORMATION_MESSAGE).
     */
    protected void showMessage(String message, String title, int messageType) {
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, message, title, messageType);
    }
}

/**
 * Kelas AdminHome mewarisi fungsionalitas dari BaseFrame dan menyediakan antarmuka
 * utama untuk aplikasi admin.
 * 
 * @author DAFFA
 */
public class AdminHome extends BaseFrame {
    
    public static int open = 0;
    
    /**
     * Konstruktor untuk kelas AdminHome.
     * Memanggil konstruktor superclass untuk menginisialisasi komponen dasar, dan kemudian
     * menginisialisasi komponen GUI khusus AdminHome.
     */
    public AdminHome() {
        super(); //Memanggil konstruktor Superclass
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        addMenu = new javax.swing.JMenu();
        updateMenu = new javax.swing.JMenu();
        allquestionMenu = new javax.swing.JMenu();
        deletequestionMenu = new javax.swing.JMenu();
        resultsMenu = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/Desktop - 3 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, -1, 660));

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Home", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 51, 51))); // NOI18N

        addMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/add new question_1.png"))); // NOI18N
        addMenu.setContentAreaFilled(false);
        addMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMenu.setMinimumSize(new java.awt.Dimension(211, 100));
        addMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(addMenu);

        updateMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/update question (1).png"))); // NOI18N
        updateMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(updateMenu);

        allquestionMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/all question (2).png"))); // NOI18N
        allquestionMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allquestionMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allquestionMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(allquestionMenu);

        deletequestionMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/delete question (1).png"))); // NOI18N
        deletequestionMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletequestionMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletequestionMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(deletequestionMenu);

        resultsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/all student result.png"))); // NOI18N
        resultsMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(resultsMenu);

        logoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/logout tombol (1).png"))); // NOI18N
        logoutMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutMenu);

        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_backgrounds_images/exit tombol (1).png"))); // NOI18N
        exitMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metode event handler untuk tombol logoutMenu pada GUI AdminHome.
     * Menampilkan dialog konfirmasi dan mengubah visibilitas frame sesuai dengan pilihan pengguna.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        
        int a = JOptionPane.showConfirmDialog(jf, "Apakah kamu benar ingin Logout?", "SELECT OPTION", JOptionPane.YES_NO_OPTION);
        
        if(a == 0){
            setVisible(false);
            new LoginAdmin().setVisible(true);
        }
    }//GEN-LAST:event_logoutMenuMouseClicked
    
    /**
     * Metode event handler untuk tombol exitMenu pada GUI AdminHome.
     * Menampilkan dialog konfirmasi dan menutup aplikasi sesuai dengan pilihan pengguna.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);

        int a = JOptionPane.showConfirmDialog(jf, "Apakah kamu benar ingin keluar aplikasi?", "SELECT OPTION", JOptionPane.YES_NO_OPTION);

        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuMouseClicked
    
    /**
     * Metode event handler untuk menu item addMenu pada GUI AdminHome.
     * Memeriksa apakah jendela sudah terbuka sebelumnya dan menampilkan jendela baru jika belum.
     * Jika sudah terbuka, menampilkan pesan peringatan.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void addMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMenuMouseClicked
        if(open == 0){
            new AddNewQuestion().setVisible(true);
            open = 1;
        }else{
            super.showMessage("Ada tab yang masih terbuka", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addMenuMouseClicked
    
    /**
     * Metode event handler untuk menu item updateMenu pada GUI AdminHome.
     * Memeriksa apakah jendela sudah terbuka sebelumnya dan menampilkan jendela baru jika belum.
     * Jika sudah terbuka, menampilkan pesan peringatan.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void updateMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMenuMouseClicked
        if(open == 0){
            new UpdateQuestion().setVisible(true);
            open = 1;
        }else{
            super.showMessage("Ada tab yang masih terbuka", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateMenuMouseClicked
    
    /**
     * Metode event handler untuk menu item allquestionMenu pada GUI AdminHome.
     * Memeriksa apakah jendela sudah terbuka sebelumnya dan menampilkan jendela baru jika belum.
     * Jika sudah terbuka, menampilkan pesan peringatan.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void allquestionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allquestionMenuMouseClicked
        if(open == 0){
            new AllQuestion().setVisible(true);
            open = 1;
        }else{
            super.showMessage("Ada tab yang masih terbuka", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_allquestionMenuMouseClicked
    
    /**
     * Metode event handler untuk menu item deletequestionMenu pada GUI AdminHome.
     * Memeriksa apakah jendela sudah terbuka sebelumnya dan menampilkan jendela baru jika belum.
     * Jika sudah terbuka, menampilkan pesan peringatan.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void deletequestionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletequestionMenuMouseClicked
        if(open == 0){
            new DeleteQuestion().setVisible(true);
            open = 1;
        }else{
            super.showMessage("Ada tab yang masih terbuka", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletequestionMenuMouseClicked
    
    /**
     * Metode event handler untuk menu item resultsMenu pada GUI AdminHome.
     * Memeriksa apakah jendela sudah terbuka sebelumnya dan menampilkan jendela baru jika belum.
     * Jika sudah terbuka, menampilkan pesan peringatan.
     *
     * @param evt Objek MouseEvent yang mewakili event klik mouse.
     */
    private void resultsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsMenuMouseClicked
        if(open == 0){
            new AllStudentResult().setVisible(true);
            open = 1;
        }else{
            super.showMessage("Ada tab yang masih terbuka", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_resultsMenuMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addMenu;
    private javax.swing.JMenu allquestionMenu;
    private javax.swing.JMenu deletequestionMenu;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logoutMenu;
    private javax.swing.JMenu resultsMenu;
    private javax.swing.JMenu updateMenu;
    // End of variables declaration//GEN-END:variables
}
