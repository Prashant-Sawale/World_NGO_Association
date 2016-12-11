/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseadministrator;

import business.enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pranjal
 */
public class EnterpriseAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdminWorkArea
     */
    private  JPanel userProcessContainer;
    private  Enterprise enterprise;
    public EnterpriseAdminWorkArea(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        btnNGOCommu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();
        btnCreateProject = new javax.swing.JButton();
        btnManageVolunteer = new javax.swing.JButton();
        btnManageDonors = new javax.swing.JButton();

        btnNGOCommu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNGOCommu.setText("NGO Communications");
        btnNGOCommu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNGOCommuActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Employee Communications");

        btnManageOrganization.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnManageEmployee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnManageUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageUser.setText("Manage User");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        btnCreateProject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreateProject.setText("Create Project");
        btnCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
        });

        btnManageVolunteer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageVolunteer.setText("Manage Volunteer");
        btnManageVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVolunteerActionPerformed(evt);
            }
        });

        btnManageDonors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageDonors.setText("Manage Donors");
        btnManageDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDonorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNGOCommu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageVolunteer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageVolunteer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNGOCommu)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(17, 17, 17)
                .addComponent(btnManageOrganization)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnManageUser)
                .addGap(18, 18, 18)
                .addComponent(btnCreateProject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageDonors)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), "Employee");
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed

        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProjectActionPerformed

        ManageProjectsJPanel manageProjectsJPanel= new ManageProjectsJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("manageProjectsJPanel", manageProjectsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateProjectActionPerformed

    private void btnNGOCommuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNGOCommuActionPerformed
        
        
        
    }//GEN-LAST:event_btnNGOCommuActionPerformed

    private void btnManageVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVolunteerActionPerformed
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),"volunteer");
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVolunteerActionPerformed

    private void btnManageDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDonorsActionPerformed

        ManageDonorsJPanel manageDonorsJPanel = new ManageDonorsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageDonorsJPanel", manageDonorsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDonorsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProject;
    private javax.swing.JButton btnManageDonors;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton btnManageVolunteer;
    private javax.swing.JButton btnNGOCommu;
    private javax.swing.JButton jButton2;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
