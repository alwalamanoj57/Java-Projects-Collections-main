/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * gg.java
 *
 * Created on Dec 21, 2013, 10:22:03 PM
 */

/**
 *
 * @author pooja
 */
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class gg extends javax.swing.JFrame {

    /** Creates new form gg */
    public gg() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProdId = new javax.swing.JLabel();
        txtProdId = new javax.swing.JTextField();
        lblProdName = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        lblProdVersion = new javax.swing.JLabel();
        txtProdVers = new javax.swing.JTextField();
        lblProdPrice = new javax.swing.JLabel();
        txtProdPrice = new javax.swing.JTextField();
        lblProdValid = new javax.swing.JLabel();
        txtProdValid = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Information");
        setFocusCycleRoot(false);

        lblProdId.setText(" Product Id :");

        lblProdName.setText("Product Name :");

        lblProdVersion.setText("Product Version :");

        lblProdPrice.setText("Product Price :");

        lblProdValid.setText("Product Validity :");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.JPG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProdName)
                    .addComponent(lblProdId)
                    .addComponent(lblProdVersion)
                    .addComponent(lblProdValid)
                    .addComponent(lblProdPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdVers, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdValid, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtProdPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdId)
                    .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdName)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdVersion)
                    .addComponent(txtProdVers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdValid)
                    .addComponent(txtProdValid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnSubmit)
                .addContainerGap(198, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
               
String Url = "jdbc:sqlserver://localhost;databaseName=SPC;userName=sa;password=sa";
Connection con = null;//SqlConnection
Statement stmt = null;//SqlCommand
ResultSet rs = null;// IDataReader

try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }
catch(ClassNotFoundException e)
    {
	System.err.print("ClassNotFoundException :");
	System.err.print(e.getMessage());
    }
try
{
con = DriverManager.getConnection(Url);
String SQL = "insert into db_accessadmin.tblProduct(ProductId,ProdName,ProdVersion,ProdPrice,ProdValidity) " + 
             "values('"+txtProdId.getText()+"','"+txtProdName.getText()+"','"+txtProdVers.getText()+"',"+
             "'"+txtProdPrice.getText()+"','"+txtProdValid.getText()+"');";
stmt = con.createStatement();
stmt.executeUpdate(SQL);
JOptionPane.showMessageDialog(null,"Record inserted successfully");
stmt.close();
con.close();
}
catch(SQLException ex)
{
   JOptionPane.showMessageDialog(null,ex);
   JOptionPane.showMessageDialog(null,"Record not inserted!");
}
    }//GEN-LAST:event_btnSubmitActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblProdId;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblProdPrice;
    private javax.swing.JLabel lblProdValid;
    private javax.swing.JLabel lblProdVersion;
    private javax.swing.JTextField txtProdId;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtProdValid;
    private javax.swing.JTextField txtProdVers;
    // End of variables declaration//GEN-END:variables


}
