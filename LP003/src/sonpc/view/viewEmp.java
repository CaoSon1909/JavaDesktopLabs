/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonpc.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sonpc.daos.EmpDAO;
import sonpc.dtos.EmpDTO;
import sonpc.tablemodel.EmpTableModel;

/**
 *
 * @author ACER
 */
public class viewEmp extends javax.swing.JFrame {

    private final String[] HEADERS = {"EmpID", "Fullname", "Phone", "Email"};
    private final int[] INDEXES = {1, 2, 3, 4};
    private EmpTableModel tableModel = new EmpTableModel(HEADERS, INDEXES);
    private final String DATE_FORMAT = "MM/dd/yyyy";

    /*trạng thái mặc định của emp khi addNew là true, muốn remove thì sửa true thành false. 
    Không đc xóa emp đó trong database*/
    /**
     * Creates new form viewEmp
     */
    public viewEmp() {
        initComponents();

        tblEmp.setModel(tableModel);

        setUnableTrue();

        loadData();
    }

    private void loadData() {
        try {
            //call dao
            EmpDAO dao = new EmpDAO();
            //xu ly dao
            List<EmpDTO> list = dao.getAllEmp();
            //load data to tablemodel
            if (list != null) {
                tableModel.loadData(list);
            }//end if list is existed

            //setModel and updateUI
            tblEmp.setModel(tableModel);
            tblEmp.updateUI();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setUnableTrue() {
        txtEmpID.setEnabled(true);
        txtFullName.setEnabled(true);
        txtPhone.setEnabled(true);
        txtEmail.setEnabled(true);
        areaAddress.setEnabled(true);
        txtDateOfBirth.setEnabled(true);
    }

    private void setUnableFalse() {
        txtEmpID.setEnabled(false);
        txtFullName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtEmail.setEnabled(false);
        areaAddress.setEnabled(false);
        txtDateOfBirth.setEnabled(false);
    }

    private void setEditableTrue() {
        txtEmpID.setEnabled(true);
        txtFullName.setEditable(true);
        txtPhone.setEditable(true);
        txtEmail.setEditable(true);
        areaAddress.setEditable(true);
        txtDateOfBirth.setEditable(true);
    }

    private void setEditableFalse() {
        txtEmpID.setEnabled(false);
        txtFullName.setEditable(false);
        txtPhone.setEditable(false);
        txtEmail.setEditable(false);
        areaAddress.setEditable(false);
        txtDateOfBirth.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        btnGetAll = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        btnFindByID = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        btnGetAll.setText("Get All");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnGetAll)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGetAll)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Emp's Detail:"));

        jLabel2.setText("EmpID");

        jLabel3.setText("Fullname");

        jLabel4.setText("Phone");

        jLabel5.setText("Email");

        jLabel6.setText("Address");

        areaAddress.setColumns(20);
        areaAddress.setRows(5);
        jScrollPane2.setViewportView(areaAddress);

        jLabel7.setText("DOB");

        btnFindByID.setText("Find By EmpID");
        btnFindByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByIDActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Emp");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSave.setText("Save Emp");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Emp");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(txtFullName)
                                .addComponent(txtEmpID)
                                .addComponent(txtEmail))
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnSave)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove)
                            .addComponent(btnFindByID)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFindByID)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnSave)
                    .addComponent(btnRemove))
                .addGap(79, 79, 79))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Emp Management");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        // TODO add your handling code here:
        //get selecting row
        txtEmpID.setEditable(false);
        int selectedRow = tblEmp.getSelectedRow();
        if (selectedRow < 0) {
            return;
        } else {
            //get dto from tablemodel
            EmpDTO dto = tableModel.getData().get(selectedRow);
            //get all fields
            String empID = dto.getEmpID();
            String fullName = dto.getFullName();
            String phone = dto.getPhone();
            String email = dto.getEmail();
            String address = dto.getAddress();
            java.util.Date dateOfBirth = dto.getDateOfBirth();
            //parsing
            SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
            String dateString = format.format(dateOfBirth);
            //settext
            txtEmpID.setText(empID);
            txtFullName.setText(fullName);
            txtPhone.setText(phone);
            txtEmail.setText(email);
            areaAddress.setText(address);
            txtDateOfBirth.setText(dateString);
            //seteditable true
            setEditableTrue();
        }
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
        try {
            // TODO add your handling code here:
            //call dao
            EmpDAO dao = new EmpDAO();
            //xu ly dao
            List<EmpDTO> list = dao.getAllEmp();
            //clear all emp in tableModel
            tableModel = new EmpTableModel(HEADERS, INDEXES);
            //add list to tablemodel
            tableModel.loadData(list);
            //setModel cho tblEmp
            tblEmp.setModel(tableModel);
            //updateUI
            tblEmp.updateUI();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGetAllActionPerformed

    private void btnFindByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByIDActionPerformed
        try {
            // TODO add your handling code here:
            //get data from txtEmpID
            String empID = txtEmpID.getText().trim();
            //call dao
            EmpDAO dao = new EmpDAO();
            //xu ly dao
            EmpDTO dtoResult = dao.getEmpByID(empID);
            //xu ly result
            if (dtoResult != null) {
                //add dto đó vào 1 list
                List<EmpDTO> list = new ArrayList<>();
                list.add(dtoResult);
                //clear tableModel
                tableModel = new EmpTableModel(HEADERS, INDEXES);
                //load data to tableModel
                tableModel.loadData(list);
                //setModel for tblEmp
                tblEmp.setModel(tableModel);
                //updateUI
                tblEmp.updateUI();

            }//end if result
            else {
                JOptionPane.showMessageDialog(this, "No record!!!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFindByIDActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            // TODO add your handling code here:
            setUnableTrue();
            txtEmpID.setEditable(true);
            //settext = ""
            txtEmpID.setText("");
            txtFullName.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            areaAddress.setText("");
            txtDateOfBirth.setText("");

            EmpDAO dao = new EmpDAO();
            List<EmpDTO> list = dao.getAllEmp();
            tableModel = new EmpTableModel(HEADERS, INDEXES);
            tableModel.loadData(list);
            tblEmp.setModel(tableModel);
            tblEmp.updateUI();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String empID = txtEmpID.getText().trim();
        String fullName = txtFullName.getText().trim();
        String phone = txtPhone.getText().trim();
        String email = txtEmail.getText().trim();
        String address = areaAddress.getText().trim();
        String dateString = txtDateOfBirth.getText().trim();

        int rowSelect = tblEmp.getSelectedRow();
        if (rowSelect < 0) {
            try {
                //save
                EmpDAO dao = new EmpDAO();
                if (dao.empIDRegex(empID) == false) {
                    JOptionPane.showMessageDialog(this, "Invalid empiD");
                    return;
                }
                if (dao.checkDuplicateEmpID(empID)==true){
                    JOptionPane.showMessageDialog(this, "duplicate id");
                    return;
                }
                if (dao.fullNameRegex(fullName) == false) {
                    JOptionPane.showMessageDialog(this, "invalid full name");
                    return;
                }if (dao.phoneRegex(phone) == false) {
                    JOptionPane.showMessageDialog(this, "invalid phone");
                    return;
                }if (dao.emailRegex(email) == false) {
                    JOptionPane.showMessageDialog(this, "invalid email");
                    return;
                } if (dao.addressRegex(address) == false) {
                    JOptionPane.showMessageDialog(this, "invalid address");
                    return;
                }if (dao.dateRegex(dateString) == false) {
                    JOptionPane.showMessageDialog(this, "invalid date");
                    return;
                } else {
                    SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
                    java.util.Date dateOfBirth = format.parse(dateString);
                    EmpDTO dto = new EmpDTO(empID, fullName, phone, email, address, dateOfBirth);
                    boolean result = dao.createEmp(dto);
                    if (result) {
                        tableModel = new EmpTableModel(HEADERS, INDEXES);
                        List<EmpDTO> list = dao.getAllEmp();
                        tableModel.loadData(list);
                        tblEmp.setModel(tableModel);
                        tblEmp.updateUI();
                        JOptionPane.showMessageDialog(this, "save success");
                        return;
                    }
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "invalid date");
                return;
            } catch (SQLException ex) {
                Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (rowSelect >= 0) {
            try {
                EmpDAO dao = new EmpDAO();
                if (dao.empIDRegex(empID) == false) {
                    JOptionPane.showMessageDialog(this, "Invalid empiD");
                    return;
                }  if (dao.fullNameRegex(fullName) == false) {
                    JOptionPane.showMessageDialog(this, "invalid full name");
                    return;
                }  if (dao.phoneRegex(phone)==false) {
                    JOptionPane.showMessageDialog(this, "invalid phone");
                    return;
                }  if (dao.emailRegex(email) == false) {
                    JOptionPane.showMessageDialog(this, "invalid email");
                    return;
                }  if (dao.addressRegex(address) == false) {
                    JOptionPane.showMessageDialog(this, "invalid address");
                    return;
                }  if (dao.dateRegex(dateString)== false) {
                    JOptionPane.showMessageDialog(this, "invalid date");
                    return;
                }
                else{
                    SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
                    java.util.Date dateOfBirth = format.parse(dateString);
                    EmpDTO dto = new EmpDTO(empID, fullName, phone, email, address, dateOfBirth);
                    boolean result = dao.updateEmp(dto);
                    if (result){
                        tableModel = new EmpTableModel(HEADERS, INDEXES);
                        List<EmpDTO> list = dao.getAllEmp();
                        tableModel.loadData(list);
                        tblEmp.setModel(tableModel);
                        tblEmp.updateUI();
                        JOptionPane.showMessageDialog(this, "update success");
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            //1:get selectedRow
            int selectedRow = tblEmp.getSelectedRow();
            if (selectedRow < 0) {
                return;
            } else {
                //2: get dto from selectedRow (tableModel đang lưu trữ List<DTO> => getData để lấy về List<DTO>)
                EmpDTO removeEmp = tableModel.getData().get(selectedRow);
                //3:call dao
                EmpDAO dao = new EmpDAO();

                int choice = JOptionPane.showConfirmDialog(this, "Do you want to remove this employee?");
                if (choice == JOptionPane.YES_OPTION) {
                    boolean result = dao.removeEmp(removeEmp);

                    if (result) {
                        //cập nhật thông tin trên tblEmp (3 bước)
                        //B1: clear bảng
                        tableModel = new EmpTableModel(HEADERS, INDEXES);
                        //B2: load list từ DB lên
                        List<EmpDTO> list = dao.getAllEmp();
                        //B3: load list ấy vào tableModel
                        tableModel.loadData(list);
                        //B4: setModel + updateUI cho tblEmp
                        tblEmp.setModel(tableModel);
                        tblEmp.updateUI();
                        JOptionPane.showMessageDialog(this, "Delete Success");
                    }
                } else {
                    return;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(viewEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(viewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAddress;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFindByID;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}