package bankmanagement;

import bankmanagement.SignupTwo;
import bankmanagement.Login;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignUpOne extends javax.swing.JFrame implements ActionListener{
    
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
    
    public SignUpOne() {
        initComponents();
        form_no.setText("APPLICATION FORM NO. "+first);  
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(Rmale);
        groupgender.add(Rfemale);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(Rmarried);
        groupstatus.add(Runmarried);
        groupstatus.add(Rothers);
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_no = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Tname = new javax.swing.JTextField();
        Tfname = new javax.swing.JTextField();
        Tmail = new javax.swing.JTextField();
        Tstate = new javax.swing.JTextField();
        Tcity = new javax.swing.JTextField();
        Tpincode = new javax.swing.JTextField();
        Rmale = new javax.swing.JRadioButton();
        Rfemale = new javax.swing.JRadioButton();
        Rothers = new javax.swing.JRadioButton();
        Rmarried = new javax.swing.JRadioButton();
        Runmarried = new javax.swing.JRadioButton();
        Taddress = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        Bback = new javax.swing.JButton();
        Bnext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Account Application Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form_no.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        form_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        form_no.setText("APPLICATION FORM");
        form_no.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(form_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 730, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Page 1: Personal Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 89, 260, 26));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 136, 112, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 175, 112, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Date of Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 212, 112, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Gender:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 254, 112, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("E-mail Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 302, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Martial Status:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 345, 112, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setText("Address:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 393, 112, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setText("City:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 112, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setText("State:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 112, -1));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setText("Pincode:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 112, -1));
        getContentPane().add(Tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 135, 334, -1));

        Tfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfnameActionPerformed(evt);
            }
        });
        getContentPane().add(Tfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 172, 334, -1));

        Tmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmailActionPerformed(evt);
            }
        });
        getContentPane().add(Tmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 299, 334, -1));
        getContentPane().add(Tstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 447, 334, -1));
        getContentPane().add(Tcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 489, 334, -1));

        Tpincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpincodeActionPerformed(evt);
            }
        });
        getContentPane().add(Tpincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 529, 334, -1));

        Rmale.setText("Male");
        Rmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RmaleActionPerformed(evt);
            }
        });
        getContentPane().add(Rmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 252, 101, -1));

        Rfemale.setText("Female");
        getContentPane().add(Rfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 252, 101, -1));

        Rothers.setText("Others");
        Rothers.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Rothers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RothersActionPerformed(evt);
            }
        });
        getContentPane().add(Rothers, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 252, 101, -1));

        Rmarried.setText("Married");
        getContentPane().add(Rmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 345, 101, -1));

        Runmarried.setText("Unmarried");
        Runmarried.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(Runmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 345, 101, -1));
        getContentPane().add(Taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 392, 334, -1));
        getContentPane().add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 212, 334, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Bback.setBackground(new java.awt.Color(0, 0, 0));
        Bback.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Bback.setForeground(new java.awt.Color(255, 255, 255));
        Bback.setText("BACK");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });

        Bnext.setBackground(new java.awt.Color(0, 0, 0));
        Bnext.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Bnext.setForeground(new java.awt.Color(255, 255, 255));
        Bnext.setText("Next");
        Bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(Bback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                .addComponent(Bnext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bnext)
                    .addComponent(Bback))
                .addGap(84, 84, 84))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfnameActionPerformed

    private void TmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TmailActionPerformed

    private void TpincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpincodeActionPerformed

    private void RmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RmaleActionPerformed

    private void RothersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RothersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RothersActionPerformed

    private void BnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnextActionPerformed
   
//    if(Tname.getText().length()<=0  || Tfname.getText().length()<=0  ){
//            JOptionPane.showMessageDialog(null, "All fiels are required");
//        }
//        else{
//        setVisible(false);
//        new SignupTwo().setVisible(true);
//}
        Bnext.addActionListener(this);
    }//GEN-LAST:event_BnextActionPerformed

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_BbackActionPerformed

        public void actionPerformed(ActionEvent ae){
        String formno = first;
        String name = Tname.getText();
        String fname = Tfname.getText();
        String dob = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(Rmale.isSelected()){ 
            gender = "Male";
        }else if(Rfemale.isSelected()){ 
            gender = "Female";
        }
            
        String email = Tmail.getText();
        String marital = null;
        if(Rmarried.isSelected()){ 
            marital = "Married";
        }else if(Runmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(Rothers.isSelected()){ 
            marital = "Other";
        }
           
        String address = Taddress.getText();
        String city = Tcity.getText();
        String pincode = Tpincode.getText();
        String state = Tstate.getText();
        

        try{
           
            if(Tname.getText().equals("") && Tfname.getText().equals("") && ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText().equals("")&& Tmail.getText().equals("") && Taddress.getText().equals("") && Tcity.getText().equals("") && Tstate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into personal_details values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+state+"','"+city+"','"+pincode+"')";
                c1.s.executeUpdate(q1);
                setVisible(false);
                new SignupTwo().setVisible(true);
                
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JButton Bnext;
    private javax.swing.JRadioButton Rfemale;
    private javax.swing.JRadioButton Rmale;
    private javax.swing.JRadioButton Rmarried;
    private javax.swing.JRadioButton Rothers;
    private javax.swing.JRadioButton Runmarried;
    private javax.swing.JTextField Taddress;
    private javax.swing.JTextField Tcity;
    private javax.swing.JTextField Tfname;
    private javax.swing.JTextField Tmail;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Tpincode;
    private javax.swing.JTextField Tstate;
    private javax.swing.JLabel form_no;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
