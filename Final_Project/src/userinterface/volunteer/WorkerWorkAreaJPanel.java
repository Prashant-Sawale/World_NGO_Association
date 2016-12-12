/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.volunteer;

import business.project.Project;
import business.useraccount.UserAccount;
import business.validation.Validator;
import business.volunteer.Volunteer;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.enterpriseadministrator.ViewProjectJPanel;

/**
 *
 * @author Pranjal
 */
public class WorkerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
   private  UserAccount account;
    
    /**
     * Creates new form NewJPanel1
     */
    public WorkerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account) {
        
         initComponents();
          this.userProcessContainer=userProcessContainer;
        this.account = account;
        populateTabel();
    }

     private void populateTabel() {
       
         DefaultTableModel model = (DefaultTableModel) tblProjects.getModel();
        
        model.setRowCount(0);
        
        for (Project project : account.getVolunteer().getProjectHistory()){
            Object[] row = new Object[3];
            row[0] = project.getProjectID();
            row[1] = project;
            row[2]=project.getEvent();
            model.addRow(row);
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

        txtPin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnViewProject = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddrL1 = new javax.swing.JTextField();
        txtAddrL2 = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        btnSubmit3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjects = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("Address Line 1:");

        jLabel8.setText("State:");

        jLabel6.setText("City:");

        jLabel9.setText("Contact Number:");

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnViewProject.setText("View Project");
        btnViewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProjectActionPerformed(evt);
            }
        });

        jLabel7.setText("Pin Code:");

        jLabel5.setText("Address Line 2:");

        btnSubmit3.setText("Submit");
        btnSubmit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit3ActionPerformed(evt);
            }
        });

        tblProjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SrNo", "Project Title", "Event"
            }
        ));
        jScrollPane1.setViewportView(tblProjects);

        jLabel3.setText("Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnViewProject)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmit3))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtAddrL1)
                                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddrL2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewProject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddrL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddrL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSubmit3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProjectActionPerformed

        int selectedRow = tblProjects.getSelectedRow();

        if(selectedRow >= 0){
            Project project = (Project)tblProjects.getValueAt(selectedRow, 1);
            ViewProjectJPanel viewProjectJPanel = new ViewProjectJPanel(userProcessContainer, project);
            userProcessContainer.add("viewProjectJPanel", viewProjectJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewProjectActionPerformed

    private void btnSubmit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit3ActionPerformed

        Validator validator = new Validator();
        boolean phoneNum = validator.validatePhoneNumber(txtNumber.getText());
        boolean zipCode = validator.validateZipCode(txtPin.getText());

        if (phoneNum && zipCode) {
            if (txtAddrL1.getText().isEmpty() && txtAddrL2.getText().isEmpty() && txtCity.getText().isEmpty() && txtNumber.getText().isEmpty() && txtPin.getText().isEmpty() && txtState.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "All Fields are mandatory", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                String address = txtAddrL1.getText() + ", " +txtAddrL2.getText() + ", " + txtCity.getText() + ", " + txtPin.getText() + ", " + txtState.getText();
                Volunteer volunteer =account.getVolunteer();
                volunteer.setAddress(address);
                volunteer.setContactNumber(txtNumber.getText());
                JOptionPane.showMessageDialog(null, "Details Edited Succeffully", "INFO Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Check format validity of phone number or zip code.", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmit3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit3;
    private javax.swing.JButton btnViewProject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjects;
    private javax.swing.JTextField txtAddrL1;
    private javax.swing.JTextField txtAddrL2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPin;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
