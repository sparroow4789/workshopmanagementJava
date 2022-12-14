/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialog;

import db.Database;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oshan Premachandra
 */
public class AddJobAdvanceDialog extends javax.swing.JDialog {
    
    private int jobid;
    private String reglicensnumber;
    
    private static DefaultTableModel dtm;
    private static DefaultTableModel loj;
    
    /**
     * Creates new form AddJobAdvanceDialog
     */
    public AddJobAdvanceDialog(java.awt.Frame parent, boolean modal, int jobId, String reglicensnumber) {
        super(parent, modal);
        this.jobid = jobId;
        this.reglicensnumber = reglicensnumber;
        initComponents();
        
        dtm = (DefaultTableModel) AdvanceRequestTbl.getModel();
        LoadAdvanceRequestData();
        
        loj = (DefaultTableModel) AddedAdvanceTbl.getModel();
        LoadAdvanceJobData();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AdvanceRequestArea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdvanceRequestTbl = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        SubletIdLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddedAdvanceArea = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AddedAdvanceTbl = new javax.swing.JTable();
        DeleteBtn = new javax.swing.JButton();
        SubletIdLbl1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Advance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
        );

        AdvanceRequestArea.setBackground(new java.awt.Color(255, 255, 255));

        AdvanceRequestTbl.setBorder(new javax.swing.border.MatteBorder(null));
        AdvanceRequestTbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AdvanceRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Advance Number", "Advance (.Rs)", "Advance Date", "advance_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AdvanceRequestTbl.setPreferredSize(new java.awt.Dimension(450, 120));
        AdvanceRequestTbl.setRowHeight(25);
        AdvanceRequestTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdvanceRequestTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AdvanceRequestTbl);
        if (AdvanceRequestTbl.getColumnModel().getColumnCount() > 0) {
            AdvanceRequestTbl.getColumnModel().getColumn(0).setMinWidth(50);
            AdvanceRequestTbl.getColumnModel().getColumn(0).setPreferredWidth(50);
            AdvanceRequestTbl.getColumnModel().getColumn(0).setMaxWidth(50);
            AdvanceRequestTbl.getColumnModel().getColumn(4).setMinWidth(0);
            AdvanceRequestTbl.getColumnModel().getColumn(4).setPreferredWidth(0);
            AdvanceRequestTbl.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        AddBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Advance Request");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout AdvanceRequestAreaLayout = new javax.swing.GroupLayout(AdvanceRequestArea);
        AdvanceRequestArea.setLayout(AdvanceRequestAreaLayout);
        AdvanceRequestAreaLayout.setHorizontalGroup(
            AdvanceRequestAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdvanceRequestAreaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AdvanceRequestAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(AdvanceRequestAreaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(AdvanceRequestAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdvanceRequestAreaLayout.createSequentialGroup()
                                .addComponent(SubletIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addComponent(AddBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        AdvanceRequestAreaLayout.setVerticalGroup(
            AdvanceRequestAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdvanceRequestAreaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AdvanceRequestAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(SubletIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddedAdvanceArea.setBackground(new java.awt.Color(255, 255, 255));

        AddedAdvanceTbl.setBorder(new javax.swing.border.MatteBorder(null));
        AddedAdvanceTbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AddedAdvanceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Advance Number", "Advance (.Rs)", "Advance Date", "advance_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AddedAdvanceTbl.setRowHeight(25);
        AddedAdvanceTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddedAdvanceTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(AddedAdvanceTbl);
        if (AddedAdvanceTbl.getColumnModel().getColumnCount() > 0) {
            AddedAdvanceTbl.getColumnModel().getColumn(0).setMinWidth(50);
            AddedAdvanceTbl.getColumnModel().getColumn(0).setPreferredWidth(50);
            AddedAdvanceTbl.getColumnModel().getColumn(0).setMaxWidth(50);
            AddedAdvanceTbl.getColumnModel().getColumn(4).setMinWidth(0);
            AddedAdvanceTbl.getColumnModel().getColumn(4).setPreferredWidth(0);
            AddedAdvanceTbl.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Added Advance to this Job");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout AddedAdvanceAreaLayout = new javax.swing.GroupLayout(AddedAdvanceArea);
        AddedAdvanceArea.setLayout(AddedAdvanceAreaLayout);
        AddedAdvanceAreaLayout.setHorizontalGroup(
            AddedAdvanceAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddedAdvanceAreaLayout.createSequentialGroup()
                .addGroup(AddedAdvanceAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddedAdvanceAreaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddedAdvanceAreaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(AddedAdvanceAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(AddedAdvanceAreaLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(SubletIdLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)))))
                .addGap(15, 15, 15))
        );
        AddedAdvanceAreaLayout.setVerticalGroup(
            AddedAdvanceAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddedAdvanceAreaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteBtn)
                .addGap(110, 110, 110)
                .addComponent(SubletIdLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdvanceRequestArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddedAdvanceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdvanceRequestArea, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddedAdvanceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void LoadAdvanceRequestData(){
        int AdvanceReqCount=0;
        ResultSet pd = Database.getData("SELECT * FROM tbl_advance WHERE license_number= '"+reglicensnumber+"' AND stat = '0'  ");
        dtm.setRowCount(0);
        try {
            while(pd.next()){
                
                int advanceid = pd.getInt(1);
                Date Advancedate = pd.getDate(7);
                
                int advanceviewid = advanceid + 10000;
                
                DateFormat pfm = new SimpleDateFormat("yyyy");
                String advanceyear = pfm.format(Advancedate);
                
                Vector v = new Vector();
                v.add(AdvanceReqCount+=1);
                v.add("BAE/AD/"+advanceyear+"/"+advanceviewid);
                v.add(pd.getString(5));
                v.add(Advancedate);
                v.add(pd.getInt(1));
                
                dtm.addRow(v);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void LoadAdvanceJobData(){
        int AdvanceJobCount=0;
        ResultSet aj = Database.getData("SELECT * FROM tbl_advance WHERE license_number= '"+reglicensnumber+"' AND job_id = "+jobid+"  ");
        loj.setRowCount(0);
        try {
            while(aj.next()){
                
                int advancejobid = aj.getInt(1);
                Date AdvanceJobdate = aj.getDate(7);
                
                int advancejobviewid = advancejobid + 10000;
                
                DateFormat pfm = new SimpleDateFormat("yyyy");
                String advancejobyear = pfm.format(AdvanceJobdate);
                
                Vector c = new Vector();
                c.add(AdvanceJobCount+=1);
                c.add("BAE/AD/"+advancejobyear+"/"+advancejobviewid);
                c.add(aj.getString(5));
                c.add(AdvanceJobdate);
                c.add(aj.getInt(1));
                
                loj.addRow(c);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void AdvanceRequestTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdvanceRequestTblMouseClicked

    }//GEN-LAST:event_AdvanceRequestTblMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        if(AdvanceRequestTbl.getSelectedRowCount()==1){
            
            int advance_id = (int) AdvanceRequestTbl.getValueAt(AdvanceRequestTbl.getSelectedRow(), 4);
        
            if(Database.saveData("UPDATE tbl_advance SET job_id = '"+jobid+"', stat = '1' WHERE advance_id = "+advance_id+" ")){
                JOptionPane.showMessageDialog(rootPane, "Successfully added to job.");
                System.out.println("Successfully added to job.");

                    LoadAdvanceRequestData();
                    LoadAdvanceJobData();


            }else{
                JOptionPane.showMessageDialog(rootPane, "Error adding, please try again.");
            }
            
        }else{
            if(AdvanceRequestTbl.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Advance request table is Empty!");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for add.");
            }
        }
        
        
        

    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddedAdvanceTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddedAdvanceTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddedAdvanceTblMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
        if(AddedAdvanceTbl.getSelectedRowCount()==1){
            
            int advance_id = (int) AddedAdvanceTbl.getValueAt(AddedAdvanceTbl.getSelectedRow(), 4);
        
            if(Database.saveData("UPDATE tbl_advance SET job_id='', stat='0' WHERE advance_id = "+advance_id+" ")){
                JOptionPane.showMessageDialog(rootPane, "Successfully remove this advance.");
                System.out.println("Successfully remove this advance.");

                    LoadAdvanceRequestData();
                    LoadAdvanceJobData();


            }else{
                JOptionPane.showMessageDialog(rootPane, "Error removing, please try again.");
            }
            
        }else{
            if(AddedAdvanceTbl.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Added advance to this Job table is Empty!");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for delete.");
            }
        }
        
        
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddJobAdvanceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJobAdvanceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJobAdvanceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJobAdvanceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddJobAdvanceDialog dialog = new AddJobAdvanceDialog(new javax.swing.JFrame(), true, 0,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel AddedAdvanceArea;
    private javax.swing.JTable AddedAdvanceTbl;
    private javax.swing.JPanel AdvanceRequestArea;
    private javax.swing.JTable AdvanceRequestTbl;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel SubletIdLbl;
    private javax.swing.JLabel SubletIdLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
