/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cryptography_project_1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author radie
 */
public class BCH_Encode_Decode extends javax.swing.JFrame {
    

    /** Creates new form NewJFrame */
    public BCH_Encode_Decode() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBackground(new java.awt.Color(255, 216, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 0, 102));

        jTextField2.setBackground(new java.awt.Color(255, 216, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 0, 102));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(255, 216, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 0, 102));

        jButton1.setBackground(new java.awt.Color(241, 181, 243));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Encode");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(241, 181, 243));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("Decode");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(241, 181, 243));
        jButton3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 102));
        jButton3.setText("Close");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(241, 181, 243));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setText("Clear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));

        jTextField4.setBackground(new java.awt.Color(255, 216, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 0, 102));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 386, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 386, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 62, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(23, 23, 23))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(41, 41, 41))))
            .add(layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 472, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(67, 67, 67)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 34, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(22, 22, 22)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(16, 16, 16))
                    .add(layout.createSequentialGroup()
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(49, 49, 49)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Encode BUTTON
        
        int[]d = new int[10];
        
        String input;
        input = jTextField1.getText();   // Gather input
        System.out.println(input);
    
        int len = input.length();
        if(len == 6){             // Check if input format is correct (6 digits)
            
            for(int n=0; n < len; n++){
                d[n] = Integer.parseInt(String.valueOf(input.charAt(n)));
            }         // Get the first 6 digits from input as chars
            
            d[6] = 4*d[0] + 10*d[1] + 9*d[2] + 2*d[3] + d[4] + 7*d[5];
            d[7] = 7*d[0] + 8*d[1] + 7*d[2] + d[3] + 9*d[4] + 6*d[5];
            d[8] = 9*d[0] + d[1] + 7*d[2] + 8*d[3] + 7*d[4] + 7*d[5];
            d[9] = d[0] + 2*d[1] + 9*d[2] + 10*d[3] + 4*d[4] + d[5];   // Generate the other 4 digits
            
            String usable = "yes";
            for(int n = 6; n < 10; n++){
                d[n] %= 11;                 // Evaluate the 4 last digits (mod 11)
                if(d[n] >= 10){                    // If any equals 10, the number is unusable
                    jTextField3.setText("Unusable number");
                    usable = "no";
                }
            }
            
            String total = "";
            if(usable.equals("yes")){            // If the number is usable,
                for(int n = 0; n < 10; n ++){    // combine all 10 digits into a String for the answer
                total += String.valueOf(d[n]);   
                }
            
                jTextField3.setText(total);   // Answer
            
                jTextField1.setText("");  // CLEAR text field and label when BUTTON PRESSED
                jLabel1.setText("");
            }
            else{      // If the number is not usable, only leave the message stating that
                jTextField1.setText("");   
                jLabel1.setText("");
            }
            
        }
        else{
            jLabel1.setText("Incorrect input! Please enter a 6-digit number.");
            jTextField3.setText("");  // Clear Answer field, as there is no answer
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // DECODE button pressed
        BCH_Encode_Decode f = new BCH_Encode_Decode();
        
        int[]d = new int[10];
        String total = null;
        
        String input;
        input = jTextField2.getText();   // Gather input
        //System.out.println(s);
        
        int len = input.length(); 
        if(len == 10){        // Check if the input is in the correct format (10 digits)
            
            for(int n=0; n < len; n++){
                d[n] = Integer.parseInt(String.valueOf(input.charAt(n)));
                total += String.valueOf(d[n]);   // Gather input and place it into a string
                total = total.replace("null", "");
            }
            
            System.out.println("");
            System.out.println("INPUT: " + total);
            
            int s1 = d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8]+ d[9];
            s1 %= 11;  // Formulate syndrome 1 (d1 + d2 + d3...+d10)
            
            int s2 = d[0] + 2*d[1] + 3*d[2] + 4*d[3] + 5*d[4] + 6*d[5] + 7*d[6] + 8*d[7] + 9*d[8] + 10*d[9];
            s2 %= 11;  // Formulate syndrome 2 (d1 + 2*d2 + 3*d3...+10*d10)
            
            
            int s3 = d[0] + 4*d[1] + 9*d[2] + 5*d[3] + 3*d[4] + 3*d[5] + 5*d[6] + 9*d[7] + 4*d[8] + d[9];
            s3 %= 11;  // Find syndrome 3
            
            
            int s4 = d[0] + 8*d[1] + 5*d[2] + 9*d[3] + 4*d[4] + 7*d[5] + 2*d[6] + 6*d[7] + 3*d[8] + 10*d[9];
            s4 %= 11;  // Find syndrome 4
            
            
            System.out.println("S1,S2,S3,S4 = " + s1 + " " + s2 + " " + s3 + " " + s4);
            
            String e = "error";      // Indicates whether there is an error 
            if(s1 == 0){
                if(s2 == 0){              
                    if(s3 == 0){
                        if(s4 == 0){
                            jTextField3.setText("There are NO errors");
                            e = null;    // If S1 = S2 = S3 = S4 = 0, there are NO errors
                            
                            jTextField4.setText("Input: " + total + "\n Output: " + total);
                        }
                    }
                }
            }
            
            if(e != null){   // If there are errors, find out how many there are
                
                int p = f.find_p(s1, s2, s3);
                
                int q = f.find_q(s1, s2, s3, s4);
            
                int r = f.find_r(s2, s3, s4);
                
                System.out.println("p = " + p + "  q = " + q + "  r = " + r);
                
                if(p == 0){
                    if(q == 0){              
                        if(r == 0){
                            //jTextField3.setText("There is 1 error!");
                            e = "one";    // If P = Q = R = 0, there is 1 error
                        }
                    }
                }
                
                if(e == "one"){
                    
                    String output = f.one_error(s1, s2, total);
                    
                    if(output != null){
                        jTextField3.setText("There is 1 error");
                        jTextField4.setText("Input: " + total + "\n Output: " + output);
                        System.out.println(output);
                    }
                    else{ // there are more than 2 errors
                        
                        jTextField3.setText("There are more than 2 errors !");
                        jTextField4.setText("Input: " + total + "\n Output: (???)" );
                        System.out.println(output);
                    }
                }
                
                else{            // If there are at least 2 errors
                    
                    int sqrt = f.sqrt_function(p, q, r);
                    
                    if(sqrt > 0){     // If there is a square root value
                        int i = f.find_i(p, q, sqrt);  // Error position
                        
                        if(i == 0){   // If I = 0, there are more than 2 errors
                            jTextField3.setText("There are more than 2 errors !");
                            jTextField4.setText("Input: " + total + "\n Output: (???)" );
                        }
                        
                        int j = f.find_j(p, q, sqrt);  // Error position
                        
                        if(j == 0){  // If J = 0, there are more than 2 errors
                            jTextField3.setText("There are more than 2 errors !");
                            jTextField4.setText("Input: " + total + "\n Output: (???)" );
                        }
                        
                        if(i != 0){
                            if(j != 0){  // If neither of them equal "0" at this stage, there are 2 errors
                                jTextField3.setText("There are 2 errors");
                                
                                int b = f.find_b(s1, s2, i, j);  // Error magnitude = b
                                
                                int a = s1 - b;   // Error magnitude = a
                                if(a < 0){
                                    a += 11;
                                }
                                System.out.println("A = " + a);
                                
                                String output = f.double_correct(total, i, j, a, b);
                                jTextField4.setText("Input: " + total + "\n Output: " + output );
                            }
                        }
                        
                    }
                    else{  // If there is no square root value, there are more than 2 errors
                        jTextField3.setText("There are more than 2 errors !");
                        jTextField4.setText("Input: " + total + "\n Output: (???)" );
                    }
                }
            }
            jTextField2.setText("");
        }
        else{
            jLabel1.setText("Invalid input! Please enter a 10-digit number.");  // If the entered input is not valid format (not 10 digits)
        }
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // CLEAR Button
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jLabel1.setText("");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // Close button
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(BCH_Encode_Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BCH_Encode_Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BCH_Encode_Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BCH_Encode_Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BCH_Encode_Decode window = new BCH_Encode_Decode();
                window.getContentPane().setBackground(new Color(178, 206, 255));  // Design (color) of interface
                window.setVisible(true);
            }
        });
    }
    
    public int inverse(int n){
        
        int inv = 0;
        int mod = 11;
        List finite_field = new ArrayList();
        
        n %= 11;
        if(n < 0){
            n += 11;
        }
        
        for(int i=0; i<mod; i++){   // Create a finite field for mod 11
            finite_field.add(i);
        }
        
        for(int i=0; i < finite_field.size(); i++){   // Loop through the field to find the inverse of N
            int a = (int) finite_field.get(i);
            int check = n * a;          
            
            if(check%mod == 1){   // A is the inverse of N, as n * a %11 = 1
                inv = a;
            }
        }
        return inv;
    }
    
    public String one_error(int s1, int s2, String total){
        BCH_Encode_Decode f = new BCH_Encode_Decode();
        String output = null;
        
        int inv = f.inverse(s1);
        int position = s2 * inv;    // Position of the error
        position %= 11;
        int a = s1;                   // Magnitude
        
        System.out.println("Error position " + position);
        System.out.println("Error magnitude " + a);
        
        if(position != 0){             // IF I = 0, there are more than 2 errors
        
            int[]d = new int[10];
        
            for(int n=0; n<10; n++){      // Input array
                d[n] = Integer.parseInt(String.valueOf(total.charAt(n)));
            }
        
            System.out.println("Error detected: " + d[position-1]);
            int correct = d[position - 1] -= a;     // Correct the error found
        
            if(correct > 9){
                jTextField2.setText("There are more than 2 errors !");
                System.out.println("Corrected: " + correct);  // If the corrected value is 10 (and above)
            }                                                     // there are more than 2 errors
            else{
                System.out.println("Corrected: " + correct);
                    
                output = Arrays.toString(d).replaceAll("\\[|\\]|,|\\s", "");  // Place the answer in a string for output
                System.out.println("");
                System.out.println("Output " + output);
                output = output.replace("null", "");
            }
        }
        
        
        return output;
   
    }
    
    public int find_p(int s1, int s2, int s3){
        
        int p = s2 * s2;
        int mult = s1 * s3;      // Find P = S2^2 - S1*S3
        p -= mult;
        if(p < 0){
            p %= 11;
            p += 11;
        }
        p %= 11;
        
        return p;
    }
    
    public int find_q(int s1, int s2, int s3, int s4){
        
        int q = s1 * s4;         // Find Q = S1*S4 - S2*S3
        int mult = s2 * s3;
        q -= mult;
        q %= 11;
        if(q < 0){
            q += 11;
        }
        q %= 11;
        
        return q;
        
    }
    
    public int find_r(int s2, int s3, int s4){
        
        int r = s3 * s3;       // Find R = S3^2 - S2*S4
        int mult = s2*s4;
        r -= mult;
        r %= 11;
        if(r < 0){
            r += 11;
        }
        r %= 11;
        
        return r;
    }
    
    public int sqrt_function(int p, int q, int r){
        
        double sqroot = q * q;
        double mult = 4 * p * r;
        sqroot -= mult;
        sqroot %= 11;      // sqroot Q^2 - 4 * P * R 
        if(sqroot < 0){
            sqroot += 11;
            
        }
                    
        sqroot = (double)Math.sqrt(sqroot);   // The square root of (Q^2 - 4PR)
        
        int sq;
        double check = sqroot % 1;     // Check if there is anything after the decimal point
        if(check == 0){       // IF the number is whole (nothing after decimal point)
            System.out.println("Square root: " + (int) sqroot);
            sq = (int)sqroot; 
        }
        else{   // IF the number isn't whole, there is no square root
            System.out.println("There is no square root");
            sq = 0;
        }
        
        return sq;
    }
    
    public int find_i(int p, int q, int sqroot){
        BCH_Encode_Decode f = new BCH_Encode_Decode();
        System.out.println("Sqroot = " + sqroot);
     
        int i = sqroot - q;         //  -q + sqroot = sqroot - q
        int tail = 2 * p;        
        
        if(i < 0){                // IF i is negative, add 11
            i += 11;
            int tail_t = f.inverse(tail);
            
            i *= tail_t;
            i %= 11;
            
            System.out.println("I = " + i);
        }
        else{                 // When i is positive
            int tail_t = f.inverse(tail);
            i *= tail_t;
            i %= 11;
            
            System.out.println("I = " + i);
        }
        
        return i;
    }
    
    public int find_j(int p, int q, int sqroot){
        BCH_Encode_Decode f = new BCH_Encode_Decode();
        
        int j = -q - sqroot;  
        int tail = 2 * p;        
        
        if(j < 0){   // If j is negative, add 11
            j += 11;
            int tail_t = f.inverse(tail);
            
            j *= tail_t;
            j %= 11;
            
            System.out.println("J = " + j);
        }
        else{               // When j is positive
            int tail_t = f.inverse(tail);
            j *= tail_t;
            j %= 11;
            
            System.out.println("J = " + j);
        }
    
        return j;
    }
    
    public int find_b(int s1, int s2, int i, int j){
        BCH_Encode_Decode f = new BCH_Encode_Decode();
        
        int b = i * s1;
        b -= s2;
        b %= 11;                   // b = i * S1 - S2 / (i-j)
        
        int tail = i - j;
        
        if(b > 0){             // i * S1 - S2 = positive 
            if(tail > 0){       // i - j = positive as well
                
                int inv = f.inverse(tail);
                b *= inv;
                b %= 11;
                
                System.out.println("B = " + b);
            }
            else{           // i - j = negative
                tail += 11;
                int inv = f.inverse(tail);
                b *= inv;
                b %= 11;
                
                System.out.println("B = " + b);
            }
            
        }
        else{              // i * S1 - S2 = negative
            b += 11;
            
            if(tail < 0){  // i - j = negative as well
                tail += 11;
                b *= tail;
                b %= 11;
                
                System.out.println("B = " + b);
            }
            else{                   // j - j = positive
                int inv = f.inverse(tail);
                b *= inv;
                b %= 11;
                
                System.out.println("B = " + b);
            }
            
        }
        return b;
    }
    
    public String double_correct(String total, int i, int j, int a, int b){
        
        String output = null;
        int[]d = new int[10];
        
        for(int n=0; n<10; n++){      // Input array
            d[n] = Integer.parseInt(String.valueOf(total.charAt(n)));
        }
        
        System.out.println("Error detected: " + d[i-1]);
        int first = d[i-1] -= a;
        if(first < 0){        // Correct the 1st error     i -= a
            first += 11;
            d[i-1] = first;
            System.out.println("Error corrected: " + first);
        }
        
        System.out.println("Error detected: " + d[j-1]);
        int sec = d[j-1] -= b;
        if(sec < 0){    // Correct the 2nd error      j -= b
            sec += 11;
            d[j-1] = sec;
            System.out.println("Error corrected: " + sec);
        }
        
        if(first > 9){
            jTextField2.setText("There are more than 2 errors !");  // If the corrected value is 10 (and above)
        }                                                     // there are more than 2 errors
        else if(sec > 9){
            jTextField2.setText("There are more than 2 errors !");
        }
        else{
            output = Arrays.toString(d).replaceAll("\\[|\\]|,|\\s", "");  // Place the answer in a string for output
            System.out.println("");
            System.out.println("Output " + output);
            output = output.replace("null", "");
            }
        
        return output;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}