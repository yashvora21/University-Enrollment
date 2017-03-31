/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.admin;

import Connection.SQL_Helper;
import dbpro.AdminViewController;
import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class CourseOfferings extends javax.swing.JPanel {

    /**
     * Creates new form FacultyList
     */
    public CourseOfferings() {
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

        cOffList = new javax.swing.JComboBox<>();
        facultyLabel = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        String[] cOffLists=new String[SQL_Helper.get_course_offering_list().size()+1];
        cOffLists[0]="ID CourseID Sem-Year";
        for(int i=0;i<SQL_Helper.get_course_offering_list().size();i++)
        cOffLists[i+1]=SQL_Helper.get_course_offering_list().get(i);
        cOffList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cOffList.setModel(new javax.swing.DefaultComboBoxModel<>(cOffLists));
        cOffList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cOffListActionPerformed(evt);
            }
        });

        facultyLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facultyLabel.setText("Course Offering List :");

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close)
                    .addComponent(facultyLabel))
                .addGap(18, 18, 18)
                .addComponent(cOffList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cOffList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyLabel))
                .addGap(54, 54, 54)
                .addComponent(close)
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:\
        AdminViewController.closeCourseOfferingList();
    }//GEN-LAST:event_closeActionPerformed

    private void cOffListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cOffListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cOffListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cOffList;
    private javax.swing.JButton close;
    private javax.swing.JLabel facultyLabel;
    // End of variables declaration//GEN-END:variables
}
