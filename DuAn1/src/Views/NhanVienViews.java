/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.NhanVien;
import ServiceIplm.NhanVienService;
import ViewModels.NhanVienViewModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class NhanVienViews extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienViews
     */
    DefaultTableModel dtm = new DefaultTableModel();
    private NhanVienService listNv = new NhanVienService();
    SimpleDateFormat SDF = new SimpleDateFormat("hh:mm:ss");

    void inti() {
        setLocationRelativeTo(null);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LbDongHo.setText(SDF.format(new Date()));
            }
        }).start();
    }

    public NhanVienViews() {
        initComponents();

        inti();
        dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        loadData();
    }

    void loadData() {
        List<NhanVienViewModel> nv = listNv.select();
        for (NhanVienViewModel nhanVienViewModel : nv) {
            dtm.addRow(new Object[]{
                nhanVienViewModel.getMaNV(),
                nhanVienViewModel.getHoVaTen(),
                nhanVienViewModel.getDiaChi(),
                nhanVienViewModel.getGioiTinh(),
                nhanVienViewModel.getSDT(),
                nhanVienViewModel.getNgaySinh()
            });
        }
    }

    void clear() {
        txtMa.setText("");
        txtHoVaTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtNgaySinh.setText("");
        txtMaCuaHang.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar2 = new javax.swing.JToolBar();
        btnDienThoai = new javax.swing.JButton();
        btnCTDienThoai = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnHoaDon = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        btnBaoHanh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        btnCuaHang = new javax.swing.JButton();
        btnDoiMK = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        LbDongHo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtMa = new javax.swing.JTextField();
        txtHoVaTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtMaCuaHang = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        gioitinh = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        btnDienThoai.setText("ĐIỆN THOẠI");
        btnDienThoai.setFocusable(false);
        btnDienThoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDienThoai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnDienThoai);

        btnCTDienThoai.setText("CHI TIẾT ĐIỆN THOẠI");
        btnCTDienThoai.setFocusable(false);
        btnCTDienThoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCTDienThoai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnCTDienThoai);
        jToolBar2.add(jSeparator5);

        btnHoaDon.setText("HÓA ĐƠN");
        btnHoaDon.setFocusable(false);
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnHoaDon);
        jToolBar2.add(jSeparator12);

        btnBaoHanh.setText("BẢO HÀNH");
        btnBaoHanh.setFocusable(false);
        btnBaoHanh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaoHanh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnBaoHanh);
        jToolBar2.add(jSeparator1);

        btnNhanVien.setText("NHÂN VIÊN");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnNhanVien);

        btnKhachHang.setText("KHÁCH HÀNG");
        btnKhachHang.setFocusable(false);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnKhachHang);

        btnTaiKhoan.setText("TÀI KHOẢN ");
        btnTaiKhoan.setFocusable(false);
        btnTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnTaiKhoan);

        btnCuaHang.setText("CỬA HÀNG");
        btnCuaHang.setFocusable(false);
        btnCuaHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuaHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnCuaHang);

        btnDoiMK.setText("ĐỔI MẬT KHẨU");
        btnDoiMK.setFocusable(false);
        btnDoiMK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoiMK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnDoiMK);

        btnLogout.setText("ĐĂNG XUẤT");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnLogout);

        LbDongHo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbDongHo.setText("12:12:12");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(rdNam);
        rdNam.setText("NAM");

        buttonGroup1.add(rdNu);
        rdNu.setText("NỮ");

        jLabel1.setText("MÃ NHÂN VIÊN");

        jLabel3.setText("HỌ VÀ TÊN");

        jLabel4.setText("ĐỊA CHỈ");

        jLabel5.setText("SĐT");

        jLabel6.setText("NGÀY SINH");

        jLabel7.setText("MÃ CỬA HÀNG");

        jLabel9.setText("GIỚI TÍNH");

        btnThem.setText("THÊM ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("TÌM KIẾM");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        gioitinh.setText("GIỚI TÍNH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(93, 93, 93)
                        .addComponent(btnSua)
                        .addGap(62, 62, 62)
                        .addComponent(btnXoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa)
                            .addComponent(txtHoVaTen)
                            .addComponent(txtDiaChi)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(gioitinh))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGioiTinh)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(txtMaCuaHang))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTimKiem)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdNu)
                                        .addGap(43, 43, 43)
                                        .addComponent(rdNam)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(682, 682, 682)
                            .addComponent(LbDongHo)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(gioitinh)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rdNu)
                    .addComponent(rdNam)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                    .addComponent(LbDongHo)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String ma = txtMa.getText();
        String hoVaTen = txtHoVaTen.getText();
        String diaChi = txtDiaChi.getText();
        String sdt = txtSDT.getText();
        String ngaySinh = txtNgaySinh.getText();
        String gioiTinh = txtGioiTinh.getText();
        String maCH = txtMaCuaHang.getText();

        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        Date ht = new Date();
        try {
            Date d = fm.parse(ngaySinh);
            if (d.after(ht)) {
                JOptionPane.showMessageDialog(null, "ko được nhập quá ngày hiện tại");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "vui lòng nhập ngày đúng định dạng yyyy-MM-dd");
            return;
        }

        try {
            listNv.insert(maCH, hoVaTen, diaChi, gioiTinh, sdt, ngaySinh);
            dtm.setRowCount(0);
            loadData();
            clear();
            return;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông tin cần xoá");
            return;
        } else {
            String ma = txtMa.getText();
            try {
                listNv.delete(ma);
                dtm.setRowCount(0);
                loadData();
                clear();
                return;
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String ma = JOptionPane.showInputDialog(null, "Vui lòng nhập mã nhân viên");
        try {
            List<NhanVien> nv = listNv.getOne(ma);
            dtm.setRowCount(0);
            for (NhanVien nhanVien : nv) {
                dtm.addRow(new Object[]{
                    nhanVien.getMaNV(),
                    nhanVien.getHoVaTen(),
                    nhanVien.getDiaChi(),
                    nhanVien.getGioiTinh(),
                    nhanVien.getSDT(),
                    nhanVien.getNgaySinh()
                });
            }
            clear();
            return;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        NhanVien list = listNv.fina().get(row);
        txtMa.setText(list.getMaNV());
        txtHoVaTen.setText(list.getHoVaTen());
        txtDiaChi.setText(list.getDiaChi());
        txtSDT.setText(list.getSDT());
        txtNgaySinh.setText(list.getNgaySinh());
        txtMaCuaHang.setText(list.getMaCH());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(NhanVienViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbDongHo;
    private javax.swing.JButton btnBaoHanh;
    private javax.swing.JButton btnCTDienThoai;
    private javax.swing.JButton btnCuaHang;
    private javax.swing.JButton btnDienThoai;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel gioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCuaHang;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}