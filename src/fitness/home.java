/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * home.java
 *
 * Created on Jan 1, 2004, 10:50:30 AM
 */

package fitness;
import javax.swing.Timer;
import java.awt.event.*;
/**
 *
 * @author vsat7
 */
public class home extends javax.swing.JFrame {

    /** Creates new form home */
    public home() {
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

        jFrame1 = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jButton14 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.getContentPane().setLayout(null);

        jButton7.setText("Start");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton7);
        jButton7.setBounds(320, 130, 73, 23);

        jButton6.setText("Stop");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton6);
        jButton6.setBounds(320, 240, 70, 23);

        jLabel3.setText("0");
        jFrame1.getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 170, 30, 14);

        jLabel7.setText("0");
        jFrame1.getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 170, 40, 14);

        jLabel8.setText("0");
        jFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 170, 34, 14);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton8);
        jButton8.setBounds(250, 190, 30, 20);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton9);
        jButton9.setBounds(280, 190, 30, 20);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton10);
        jButton10.setBounds(320, 190, 30, 20);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton11);
        jButton11.setBounds(350, 190, 30, 20);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton12);
        jButton12.setBounds(390, 190, 30, 20);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton13);
        jButton13.setBounds(420, 190, 30, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1450, 900));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 2, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXPERTS");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(204, 255, 255)));
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 40, 320, 80);

        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 120, 340, 0);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 2, 24));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ME");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(204, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 40, 320, 80);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial Black", 2, 24));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("TOGETHER");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(204, 255, 255)));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 40, 340, 80);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial Black", 2, 24));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DISCOVER");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(204, 255, 255)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1050, 40, 340, 80);

        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(720, 120, 320, 0);

        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1050, 120, 340, 0);

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 120, 320, 0);

        panel1.setLayout(null);

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/popup1.jpg"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panel1.add(jButton14);
        jButton14.setBounds(1240, 0, 80, 80);

        getContentPane().add(panel1);
        panel1.setBounds(50, 800, 1320, 90);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(180, 300, 120, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/aosn.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 1430, 940);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        // TODO add your handling code here:
        if(jButton2.isFocusable())
            jLabel6.setVisible(false);
        else
            jLabel6.setVisible(true);
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Profile().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2FocusLost
int i=60;
int j=60;
int k=24;
    Timer T =new Timer(1,new ActionListener()
{public void actionPerformed(ActionEvent e)
{
i=i-1;
jLabel8.setText(""+i);
if(i==0)
{j=j-1;
i=60;
jLabel7.setText(""+j);
if(j==0)
{j=60;
}
k=k-1;
jLabel3.setText(""+k);
if(i==0)
    {if(j==0)
    {if(k==0)
    {T.stop();}}}
}}});
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
      jButton8.setVisible(false);
      jButton9.setVisible(false);
      jButton10.setVisible(false);
      jButton11.setVisible(false);
      jButton12.setVisible(false);
      jButton13.setVisible(false);
         T.start();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jLabel3.getText());
        a=a+1;
        jLabel3.setText(""+a);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jLabel3.getText());
        a=a-1;
        jLabel3.setText(""+a);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        T.stop();
        jButton8.setVisible(true);
      jButton9.setVisible(true);
      jButton10.setVisible(true);
      jButton11.setVisible(true);
      jButton12.setVisible(true);
      jButton13.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jLabel7.getText());
        a=a+1;
        jLabel7.setText(""+a);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jLabel7.getText());
        a=a-1;
        jLabel7.setText(""+a);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jLabel8.getText());
        a=a+1;
        jLabel8.setText(""+a);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jLabel8.getText());
        a=a-1;
        jLabel8.setText(""+a);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jFrame1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new tips().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

}
