/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseadministrator;

import userinterface.donor.ViewDonorDonations;
import business.enterprise.Enterprise;
import business.enterprise.donation.Donor;
import business.project.Project;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.donor.DonorPersonalInformationJPanel;
import userinterface.entepriseaccountant.FundAllocationJPanel;

/**
 *
 * @author Pranjal
 */
public class ManageDonorsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    /**
     * Creates new form ManageDonorsJPanel
     */
    public ManageDonorsJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
    }
    public void populateDonors(){
        DefaultTableModel dtm =  (DefaultTableModel) tblDonors.getModel() ;
        dtm.setRowCount(0);
        for(Donor d: enterprise.getDonorDiectory().getDonorDirectory()){
            Object row[] = new Object[3];
            row[0] = d.getDonorID();
            row[1] = d;
            row[2] = d.getTotalDonations();

            dtm.addRow(row);
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

        lblPageHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonors = new javax.swing.JTable();
        btnViewDonorDetails = new javax.swing.JButton();
        btnDeleteDonor = new javax.swing.JButton();
        btnViewDonorDonations = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblPageHeading.setText("Donor Directory");

        tblDonors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Donor ID", "Donor Name", "Total Donation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDonors);
        if (tblDonors.getColumnModel().getColumnCount() > 0) {
            tblDonors.getColumnModel().getColumn(0).setResizable(false);
            tblDonors.getColumnModel().getColumn(1).setResizable(false);
            tblDonors.getColumnModel().getColumn(2).setResizable(false);
        }

        btnViewDonorDetails.setText("View Donor Details");
        btnViewDonorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDonorDetailsActionPerformed(evt);
            }
        });

        btnDeleteDonor.setText("Delete Donor");
        btnDeleteDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDonorActionPerformed(evt);
            }
        });

        btnViewDonorDonations.setText("View Donations");
        btnViewDonorDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDonorDonationsActionPerformed(evt);
            }
        });

        btnBack.setText("<< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPageHeading)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnViewDonorDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnViewDonorDonations, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPageHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDonorDetails)
                    .addComponent(btnDeleteDonor))
                .addGap(18, 18, 18)
                .addComponent(btnViewDonorDonations)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDonorDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDonorDonationsActionPerformed
        int selectedRow = tblDonors.getSelectedRow();
        
        if(selectedRow >= 0){
            Donor donor = (Donor)tblDonors.getValueAt(selectedRow, 1);
            ViewDonorDonations viewDonorDonations = new ViewDonorDonations(userProcessContainer, donor);
            userProcessContainer.add("viewDonorDonations", viewDonorDonations);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        } 
        
    }//GEN-LAST:event_btnViewDonorDonationsActionPerformed

    private void btnViewDonorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDonorDetailsActionPerformed
        int selectedRow = tblDonors.getSelectedRow();
        if(selectedRow >= 0){
            Donor donor = (Donor)tblDonors.getValueAt(selectedRow, 1);
            DonorPersonalInformationJPanel dpijp = new DonorPersonalInformationJPanel(userProcessContainer, donor);
            userProcessContainer.add("donorPersonalInfoJPanel", dpijp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDonorDetailsActionPerformed

    private void btnDeleteDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDonorActionPerformed
        int selectedRow = tblDonors.getSelectedRow();
        if(selectedRow >= 0){
            Donor donor = (Donor)tblDonors.getValueAt(selectedRow, 1);
            enterprise.getDonorDiectory().deleteDonor(donor);
            JOptionPane.showMessageDialog(null, "Donor Deleted", "Success",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteDonorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDonor;
    private javax.swing.JButton btnViewDonorDetails;
    private javax.swing.JButton btnViewDonorDonations;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPageHeading;
    private javax.swing.JTable tblDonors;
    // End of variables declaration//GEN-END:variables
}
