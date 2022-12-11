/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.DoctorWorkArea;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DocOrganization;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import Business.TaskQueue.VictimTaskRequest;
import Business.TaskQueue.TaskRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ghostdaddy16
 */
public class DoctorWorkArea extends javax.swing.JPanel {
        private JPanel userProcessContainer;
    private UserCredentials credentials;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    DocOrganization docOrganization;
    /** Creates new form DoctorWorkArea */
    public DoctorWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.credentials=credentials;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        
         populateDoctorTable();
        
    }
     public void populateDoctorTable(){

         DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        
        model.setRowCount(0);
        
        
        for (TaskRequest work : system.getTaskQueue().getTaskRequestList()){
           if(work instanceof VictimTaskRequest){
               if((work.getStatus().equalsIgnoreCase("Assigned To Doctor"))||(work.getStatus().equalsIgnoreCase("Doctor assigned the Request"))){
                   
               
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getName();
            row[1] = work.getSubject();
            row[2] = ((VictimTaskRequest) work).getDescription();
            row[3] = ((VictimTaskRequest) work).getLocation();
            row[4] = work.getRequestDate();
            row[5] = work;
            row[6] = work.getReciever();
            
            model.addRow(row);
           }
        }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(219, 243, 250));

        jPanel3.setBackground(new java.awt.Color(208, 61, 86));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAssign.setBackground(new java.awt.Color(208, 61, 86));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Acknowledge");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(208, 61, 86));
        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnComplete.setText("Responded");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        tblRequests.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject", "Description", "Location", "Date", "Status", "Change Maker"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Welcome, You're logged in as Doctor.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
      int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            VictimTaskRequest cswr = (VictimTaskRequest) tblRequests.getValueAt(selectedRow, 5);
            if(cswr.getStatus().equalsIgnoreCase("Assigned To Doctor")){
            cswr.setStatus("Doctor assigned the Request");
            cswr.setReciever(credentials);

            populateDoctorTable();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            VictimTaskRequest p = (VictimTaskRequest) tblRequests.getValueAt(selectedRow, 5);
            if(p.getStatus().equalsIgnoreCase("Doctor assigned the Request")){
            p.setStatus("Complete");
            p.setReciever(credentials);
            JOptionPane.showMessageDialog(null, "You have completed the request successfully");
            populateDoctorTable();
             }
             else{
                  JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
             }

        }  
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables

}
