/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseadministrator.workrequest;

import business.enterprise.Enterprise;
import business.network.Network;
import business.ngoWorkque.WorkRequest;
import business.project.Project;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.donor.DonorPersonalInformationJPanel;
import userinterface.enterpriseadministrator.ViewProjectJPanel;

/**
 *
 * @author Pranjal
 */
public class ManageWorkRequests extends javax.swing.JPanel {
    
    private  JPanel userProcessContainer;
    private  Enterprise enterprise;
    private Network network;
    /**
     * Creates new form ManageWorkRequests
     */
    public ManageWorkRequests(JPanel userProcessContainer,Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.network = network;
        populateWorkRequest();
        populateProjectComboBox();
    }
    
    public void populateWorkRequest(){
        DefaultTableModel dtm =  (DefaultTableModel) tblWorkRequests.getModel() ;
        dtm.setRowCount(0);
        for(WorkRequest workRequest: network.getNgoWorkqueList().getNgoWorkRequests()){
            Object row[] = new Object[5];
            row[0] = workRequest;
            row[1] = workRequest.getEnterprise();
            row[2] = workRequest.getProject();
            row[3] = workRequest.getProject().fundsRemaining();
            row[4] = workRequest.getProject().getVolunteersRemaining();
            dtm.addRow(row);
        }
    }
    
    public void populateProjectComboBox() {
        projectCombo.removeAllItems();

        for (Project project: enterprise.getProjectDirectory().getProjectList()) {
            projectCombo.addItem(project);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnResponseToRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewProject = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        projectCombo = new javax.swing.JComboBox();
        btnBack1 = new javax.swing.JButton();

        tblWorkRequests.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Work Request ID", "Enterprise", "Project", "Funds Required", "Volunteers Required"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkRequests.setRowHeight(18);
        jScrollPane1.setViewportView(tblWorkRequests);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Manage Work Requests");

        btnResponseToRequest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResponseToRequest.setText("View Work Request");
        btnResponseToRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseToRequestActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewProject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewProject.setText("View Project");
        btnViewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProjectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Create Work Request");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Project");

        projectCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        projectCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        projectCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectComboActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack1.setText("Create Request");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(222, 222, 222))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnResponseToRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnViewProject, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(projectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResponseToRequest)
                    .addComponent(btnViewProject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(projectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack1))
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProjectActionPerformed
        
        ViewProjectJPanel viewProjectJPanel = new ViewProjectJPanel(userProcessContainer,(Project) projectCombo.getSelectedItem());
        userProcessContainer.add("viewProjectJPanel", viewProjectJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProjectActionPerformed

    private void btnResponseToRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseToRequestActionPerformed
        int selectedRow = tblWorkRequests.getSelectedRow();
        
        if(selectedRow >= 0){
            WorkRequest workRequest = (WorkRequest)tblWorkRequests.getValueAt(selectedRow, 0);
            ViewWorkRequest viewWorkRequest = new ViewWorkRequest(userProcessContainer, enterprise, workRequest);
            userProcessContainer.add("viewDonorDonations", viewWorkRequest);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_btnResponseToRequestActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        Project project = (Project)projectCombo.getSelectedItem();
        WorkRequest workRequest = network.getNgoWorkqueList().createWorkRequest(project);
        populateWorkRequest();
        JOptionPane.showMessageDialog(null, "Request Added");
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void projectComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnResponseToRequest;
    private javax.swing.JButton btnViewProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox projectCombo;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
