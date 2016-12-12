/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseadministrator;

import business.enterprise.Enterprise;
import business.project.Project;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageProjectsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProjectsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ManageProjectsJPanel(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        populateTable();
    }
    
     public void populateTable() {
          
        DefaultTableModel model = (DefaultTableModel) tblProjects.getModel();
        
        model.setRowCount(0);
        
        for (Project project : enterprise.getProjectDirectory().getProjectList()){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjects = new javax.swing.JTable();
        btnProject = new javax.swing.JButton();
        btnViewProject = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        tblProjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SrNo", "Project Title", "Event"
            }
        ));
        jScrollPane1.setViewportView(tblProjects);

        btnProject.setText("Add Project");
        btnProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectActionPerformed(evt);
            }
        });

        btnViewProject.setText("View Project");
        btnViewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProjectActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton2.setText("Manage Volunteers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Manage Funds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnProject)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnViewProject)))))
                .addGap(554, 554, 554))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProject)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProject)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectActionPerformed

            AddProjectsJPanel addProjectsJPanel= new AddProjectsJPanel(userProcessContainer,enterprise, false);
            userProcessContainer.add("addProjectsJPanel", addProjectsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProjectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProjectActionPerformed
        
        
        int selectedRow = tblProjects.getSelectedRow();
        
        if(selectedRow >= 0){
            Project project = (Project)tblProjects.getValueAt(selectedRow, 1);
            AddProjectsJPanel addProjectsJPanel= new AddProjectsJPanel(userProcessContainer,enterprise, true);
            userProcessContainer.add("manageProjectsJPanel", addProjectsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_btnViewProjectActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tblProjects.getSelectedRow();
        
        if(selectedRow >= 0){
            Project project = (Project)tblProjects.getValueAt(selectedRow, 1);
            ManageProjectVolunteer manageProjectVolunteer = new ManageProjectVolunteer(userProcessContainer, project, enterprise);
            userProcessContainer.add("manageProjectVolunteer", manageProjectVolunteer);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProject;
    private javax.swing.JButton btnViewProject;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjects;
    // End of variables declaration//GEN-END:variables

   
}
