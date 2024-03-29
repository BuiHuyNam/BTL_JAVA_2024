/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.QuanLyKTX;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.PhongKTX;
import Model.SinhVien;
import Model.SinhVienKTX;
import Service.PhongKTXService;
import Services.SINHVIENDOC;
import Utils.Check;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyễn Bá Hiệp
 */
public class GUIThemSinhVienKTX extends javax.swing.JDialog {
    private PhongKTX phongKTX;
    private DefaultTableModel model;

    /**
     * Creates new form GUIThemSinhVienKTX
     */
    public GUIThemSinhVienKTX(java.awt.Frame parent, boolean modal, PhongKTX phongKTX) {
        super(parent, modal);
        this.phongKTX = phongKTX;
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) table.getModel();

        model.setColumnIdentifiers(new Object[] {
            "Mã sinh viên", "Họ và tên", "Giới tính", "Ngày sinh"
        });
    }

    private void timKiemHandler() {
        String msv = msvTextField.getText();
        if(msv.trim().equals("") || msv == null) {
            JOptionPane.showMessageDialog(rootPane, "Yêu cầu nhập mã sinh viên để tìm kiếm");
            return;
        }
        
        boolean flag = false;
        List<SinhVien> list = new SINHVIENDOC().docfile();
        model.setRowCount(0);
        for (SinhVien sv : list) {
            if(sv.getMaSV().toLowerCase().contains(msv.toLowerCase())) {
                model.addRow(new Object[] {
                    sv.getMaSV(), sv.getTenSV(), sv.getGioiTinh(), sv.getNgaySinh(),
                });
                flag = true;
            }
        }
        
        if(!flag) {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy sinh viên trên!!!");
            msvTextField.setText(null);
        }
    }

    private void themSinhVienHandler() {
        int[] viTri = table.getSelectedRows();
        int choTrong = this.phongKTX.getSoSVToiDa() - this.phongKTX.getSoSVHienTai();

        if(viTri.length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn sinh viên muốn thêm!");
        } else if(viTri.length > 1)  {
            JOptionPane.showMessageDialog(rootPane, "Chỉ được chọn 1 sinh viên dể thêm!");
        } else if(choTrong == 0)  {
            JOptionPane.showMessageDialog(rootPane, "Phòng " + this.phongKTX.getTenPhong() + " đã đầy!!!");
        } else {
            String msv = (String) table.getValueAt(viTri[0], 0);
            if(PhongKTXService.daThuocKTX(msv)) {
                JOptionPane.showMessageDialog(rootPane, "Sinh viên này đã đăng ký phòng ký túc xá trước đó!!!");
                return;
            }
            String name = (String) table.getValueAt(viTri[0], 1).toString().trim();
            String gender = (String) table.getValueAt(viTri[0], 2).toString().trim();
            String dateOfBirth = (String) table.getValueAt(viTri[0], 3).toString().trim();
            String ngayDangKy = ngayDangKyTextField.getText();
            String ngayHetHan = ngayHetHanTextField.getText().trim();

            if(!Check.checkDateFormat(ngayHetHan)) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập giá trị mới \"Ngày hết hạn\" đúng định dạng: dd/MM/yyyy!");
            } else if(ngayHetHan.equals("") || ngayHetHan == null) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng không để trống ngày hết hạn!!!");
            } else if(!Check.isFuture(ngayDangKy, ngayHetHan)) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ngày hết hạn sau ngay hôm nay!!!");
            } else {
                int response = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn thêm không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    SinhVienKTX svMoi = new SinhVienKTX(msv, name, gender, dateOfBirth, ngayDangKy, ngayHetHan);
                    System.out.println(svMoi.toString());
                    this.phongKTX.themSinhVien(svMoi);
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    this.dispose();
                }
            }
        }
        try {
            PhongKTXService.updateFile(phongKTX);
        } catch (IOException ex) {
            Logger.getLogger(GUIThemSinhVienKTX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        msvLabel = new javax.swing.JLabel();
        msvTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        themButton = new javax.swing.JButton();
        timKiemButton = new javax.swing.JButton();
        quayLaiButton = new javax.swing.JButton();
        ngayHetHanLabel = new javax.swing.JLabel();
        ngayHetHanTextField = new javax.swing.JTextField();
        ngayDangKyLabel = new javax.swing.JLabel();
        ngayDangKyTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm sinh viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Thêm sinh viên");

        msvLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msvLabel.setText("Mã sinh viên");

        msvTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msvTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msvTextFieldActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        themButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        themButton.setText("Thêm");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        timKiemButton.setText("Tìm kiếm");
        timKiemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemButtonActionPerformed(evt);
            }
        });

        quayLaiButton.setText("Quay lại");
        quayLaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiButtonActionPerformed(evt);
            }
        });

        ngayHetHanLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayHetHanLabel.setText("Ngày hết hạn");

        ngayHetHanTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        
        ngayDangKyLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayDangKyLabel.setText("Ngày đăng ký");
        
        ngayDangKyTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayDangKyTextField.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quayLaiButton)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(msvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(timKiemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ngayDangKyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(ngayDangKyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ngayHetHanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(ngayHetHanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quayLaiButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timKiemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(msvLabel)
                        .addComponent(msvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngayDangKyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayDangKyLabel)
                    .addComponent(ngayHetHanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayHetHanLabel))
                .addGap(18, 18, 18)
                .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void msvTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        this.themSinhVienHandler();
    }
    
    private void timKiemButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        this.timKiemHandler();
    } 

    private void quayLaiButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }  

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
            java.util.logging.Logger.getLogger(GUIThemSinhVienKTX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIThemSinhVienKTX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIThemSinhVienKTX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIThemSinhVienKTX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // try {
                //     new GUIThemSinhVienKTX(
                //         PhongKTXService.getPhongKTXById(PhongKTXService.getListPhongFromFile(), "201")
                //     ).setVisible(true);
                // } catch (FileNotFoundException e) {
                //     // TODO Auto-generated catch block
                //     e.printStackTrace();
                // }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msvLabel;
    private javax.swing.JTextField msvTextField;
    private javax.swing.JLabel ngayDangKyLabel;
    private javax.swing.JTextField ngayDangKyTextField;
    private javax.swing.JLabel ngayHetHanLabel;
    private javax.swing.JTextField ngayHetHanTextField;
    private javax.swing.JButton quayLaiButton;
    private javax.swing.JTable table;
    private javax.swing.JButton themButton;
    private javax.swing.JButton timKiemButton;
    // End of variables declaration                   
}