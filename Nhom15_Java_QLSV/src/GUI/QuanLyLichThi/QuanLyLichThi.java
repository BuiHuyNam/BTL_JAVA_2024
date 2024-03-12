/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.QuanLyLichThi;

import Model.LichThi;
import GUI.Home;
import static Services.LichThiService.lichThiFromFile;
import static Services.LichThiService.writeFile;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vũ Đình Duy
 */
public class QuanLyLichThi extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyLichThi
     */
    List<LichThi> list;
    static DefaultTableModel tbLichThi;
    static String fileName = "src/FileData/LICHTHI.txt";

    public QuanLyLichThi() {
        initComponents();
        setLocationRelativeTo(null);
        list = new ArrayList<>();
        tbLichThi = (DefaultTableModel) tableLichThi.getModel();
        try {
            list = lichThiFromFile(fileName);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        showTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhongThi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDiemThi = new javax.swing.JTextField();
        txtCaThi = new javax.swing.JTextField();
        txtMonThi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLichThi = new javax.swing.JTable();
        btnThiSinh = new javax.swing.JButton();
        bntThemLich = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoaLich = new javax.swing.JButton();
        txtKyThi = new javax.swing.JComboBox<>();
        txtNgayThi = new com.toedter.calendar.JDateChooser();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setBackground(new java.awt.Color(0, 158, 15));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý lịch thi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên kỳ thi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày thi");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phòng thi");

        txtPhongThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Môn thi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ca thi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Điểm thi");

        txtDiemThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCaThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtMonThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tableLichThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableLichThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên kỳ thi", "Môn thi", "Ngày thi", "Ca thi", "Phòng thi", "Điểm thi", "Thí sinh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLichThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLichThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLichThi);
        if (tableLichThi.getColumnModel().getColumnCount() > 0) {
            tableLichThi.getColumnModel().getColumn(0).setMinWidth(100);
            tableLichThi.getColumnModel().getColumn(1).setMinWidth(100);
            tableLichThi.getColumnModel().getColumn(2).setMinWidth(100);
            tableLichThi.getColumnModel().getColumn(2).setMaxWidth(100);
            tableLichThi.getColumnModel().getColumn(3).setMinWidth(60);
            tableLichThi.getColumnModel().getColumn(3).setMaxWidth(60);
            tableLichThi.getColumnModel().getColumn(4).setMinWidth(60);
            tableLichThi.getColumnModel().getColumn(4).setMaxWidth(60);
            tableLichThi.getColumnModel().getColumn(5).setMinWidth(60);
            tableLichThi.getColumnModel().getColumn(5).setMaxWidth(60);
            tableLichThi.getColumnModel().getColumn(6).setMinWidth(60);
            tableLichThi.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        btnThiSinh.setBackground(new java.awt.Color(0, 158, 15));
        btnThiSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThiSinh.setForeground(new java.awt.Color(255, 255, 255));
        btnThiSinh.setText("Thí sinh");
        btnThiSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThiSinhActionPerformed(evt);
            }
        });

        bntThemLich.setBackground(new java.awt.Color(0, 158, 15));
        bntThemLich.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntThemLich.setForeground(new java.awt.Color(255, 255, 255));
        bntThemLich.setText("Thêm lịch thi");
        bntThemLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemLichActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(255, 153, 0));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setText("Cập nhật lịch thi");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoaLich.setBackground(new java.awt.Color(255, 0, 0));
        btnXoaLich.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaLich.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLich.setText("Xóa lịch thi");
        btnXoaLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLichActionPerformed(evt);
            }
        });

        txtKyThi.setBackground(new java.awt.Color(204, 255, 255));
        txtKyThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKyThi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kết thúc học phần", "Giữa kỳ", "Đánh giá thường xuyên", "Đánh giá năng lực", "Bảo vệ đồ án tốt nghiệp" }));
        txtKyThi.setMinimumSize(new java.awt.Dimension(192, 30));
        txtKyThi.setPreferredSize(new java.awt.Dimension(192, 30));
        txtKyThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKyThiActionPerformed(evt);
            }
        });

        txtNgayThi.setDateFormatString("dd/MM/yyyy");
        txtNgayThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnThiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntThemLich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaLich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKyThi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhongThi)
                                    .addComponent(txtNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMonThi)
                                    .addComponent(txtCaThi)
                                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMonThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCaThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhongThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntThemLich, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaLich, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        txtKyThi.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnThiSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThiSinhActionPerformed
        try {
            int selectedIndex = tableLichThi.getSelectedRow();
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(this, "Hãy chọn một lịch thi để cập nhật thí sinh!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            } else {
                ThiSinh thisinh = new ThiSinh(list.get(selectedIndex).getListSV(), list.get(selectedIndex), list);
                thisinh.setVisible(true);
                dispose();
            }
        } catch (Exception ex) {
            System.out.print(ex.toString());
        }
    }//GEN-LAST:event_btnThiSinhActionPerformed
    private void btnXoaLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLichActionPerformed
        int[] selectedRows = tableLichThi.getSelectedRows();
        boolean checkRemove = false;
        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(this, "Hãy chọn ít nhất một dòng để xóa!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa các dòng đã chọn?", "Xác nhận xóa", JOptionPane.INFORMATION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                List<LichThi> needToRemove = new ArrayList<>();
                for (int row : selectedRows) {
                    needToRemove.add(list.get(row));
                }
                checkRemove = list.removeAll(needToRemove);
                if (checkRemove) {
                    clearContent();
                    showTableData();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        writeFile(fileName, list);
                    } catch (Exception ex) {
                        Logger.getLogger(QuanLyLichThi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnXoaLichActionPerformed

    private void bntThemLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemLichActionPerformed
        if (checkIsEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                if (checkExists()) {
                    JOptionPane.showMessageDialog(this, "Lịch thi này đã tồn tại trên hệ thống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    List<String> listSV = new ArrayList<>();
                    LichThi lichthi = new LichThi();
                    String tenKyThi = txtKyThi.getSelectedItem().toString();
                    String monThi = txtMonThi.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String ngayThi = dateFormat.format(txtNgayThi.getDate());
                    String caThi = txtCaThi.getText();
                    String phongThi = txtPhongThi.getText();
                    String diemThi = txtDiemThi.getText();
                    LichThi lich = new LichThi(tenKyThi, monThi, ngayThi, caThi, phongThi, diemThi, listSV);
                    list.add(lich);
                    showTableData();
                    clearContent();
                    writeFile(fileName, list);
                }
            } catch (Exception ex) {
                Logger.getLogger(QuanLyLichThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bntThemLichActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int selectedIndex = tableLichThi.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn một dòng để sửa!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        } else {
            if (checkIsEmpty() == false) {
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String ngayThi = dateFormat.format(txtNgayThi.getDate());
                    list.get(selectedIndex).setTenKyThi(txtKyThi.getSelectedItem().toString());
                    list.get(selectedIndex).setMonThi(txtMonThi.getText());
                    list.get(selectedIndex).setNgayThi(ngayThi);
                    list.get(selectedIndex).setCaThi(txtCaThi.getText());
                    list.get(selectedIndex).setPhongThi(txtPhongThi.getText());
                    list.get(selectedIndex).setDiemThi(txtDiemThi.getText());
                    clearContent();
                    showTableData();
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    writeFile(fileName, list);
                } catch (Exception ex) {
                    Logger.getLogger(QuanLyLichThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void tableLichThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLichThiMouseClicked
        int selectedIndex = tableLichThi.getSelectedRow();
        String caThi = list.get(selectedIndex).getCaThi();
        txtCaThi.setText(caThi);
        String diemThi = list.get(selectedIndex).getDiemThi();
        txtDiemThi.setText(diemThi);
        String kyThi = list.get(selectedIndex).getTenKyThi();
        txtKyThi.setSelectedItem(kyThi);
        String monThi = list.get(selectedIndex).getMonThi();
        txtMonThi.setText(monThi);
        String ngayThi = list.get(selectedIndex).getNgayThi();
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            txtNgayThi.setDate(date.parse(ngayThi));
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyLichThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        String phongThi = list.get(selectedIndex).getPhongThi();
        txtPhongThi.setText(phongThi);
        if (outOfDate(list.get(selectedIndex).getNgayThi())) {
            int confirm = JOptionPane.showConfirmDialog(this, "Lịch thi đã quá hạn. Xác nhận xóa?", "Xác nhận xóa", JOptionPane.INFORMATION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                list.remove(selectedIndex);
                clearContent();
                showTableData();
                JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                try {
                    writeFile(fileName, list);
                } catch (Exception ex) {
                    Logger.getLogger(QuanLyLichThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tableLichThiMouseClicked

    private void txtKyThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKyThiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKyThiActionPerformed

    /**
     * @param args the command line arguments
     */
    private void showTableData() {
        tbLichThi.setRowCount(0);
        for (LichThi lich : list) {
            tbLichThi.addRow(new Object[]{lich.getTenKyThi(), lich.getMonThi(), lich.getNgayThi(),
                lich.getCaThi(), lich.getPhongThi(), lich.getDiemThi(), lich.getSoSV()});
        }
    }

    private void clearContent() {
        txtCaThi.setText("");
        txtDiemThi.setText("");
        txtKyThi.setSelectedItem("Kết thúc học phần");
        txtMonThi.setText("");
        txtNgayThi.setDate(new Date());
        txtPhongThi.setText("");
    }

    private boolean checkIsEmpty() {
        return txtCaThi.getText().trim().equals("") || txtDiemThi.getText().trim().equals("")
                || txtKyThi.getSelectedItem().toString().trim().equals("") || txtMonThi.getText().trim().equals("")
                || txtNgayThi.getDate().toString().trim().equals("") || txtPhongThi.getText().trim().equals("");
    }

    private boolean checkExists() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayThi = dateFormat.format(txtNgayThi.getDate());
        for (LichThi lich : list) {
            if ((lich.getTenKyThi().equals(txtKyThi.getSelectedItem().toString()))
                    && (lich.getMonThi().equals(txtMonThi.getText()))
                    && (lich.getCaThi().equals(txtCaThi.getText()))
                    && (lich.getNgayThi().equals(ngayThi))) {
                return true;
            }
        }
        return false;
    }

    public boolean outOfDate(String day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate ngayThi = LocalDate.parse(day, formatter);
        long numberOfDays = ChronoUnit.DAYS.between(today, ngayThi);
        if (numberOfDays < 0) {
            return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(QuanLyLichThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyLichThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyLichThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyLichThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyLichThi().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(QuanLyLichThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntThemLich;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThiSinh;
    private javax.swing.JButton btnXoaLich;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTable tableLichThi;
    private javax.swing.JTextField txtCaThi;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JComboBox<String> txtKyThi;
    private javax.swing.JTextField txtMonThi;
    private com.toedter.calendar.JDateChooser txtNgayThi;
    private javax.swing.JTextField txtPhongThi;
    // End of variables declaration//GEN-END:variables
}
