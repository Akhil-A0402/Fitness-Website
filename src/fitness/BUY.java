/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BUY.java
 *
 * Created on Jan 1, 2004, 12:31:45 AM
 */

package fitness;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author vsat7
 */
public class BUY extends javax.swing.JFrame {

    /** Creates new form BUY */
    public BUY() {
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
        jLabel4 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton28 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jFrame1.getContentPane().setLayout(null);

        jLabel4.setText("image");
        jFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 140, 28, 14);

        jButton27.setText("BUY");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton27);
        jButton27.setBounds(350, 310, 51, 23);

        jLabel5.setText("COST");
        jFrame1.getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 310, 34, 14);

        jLabel6.setText("Description");
        jFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 430, 70, 14);

        jLabel7.setText("DESC");
        jFrame1.getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 410, 34, 14);
        jFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(-6, -6, 1320, 730);

        jFrame2.getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFrame2.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 140, 166, 96);

        jLabel9.setText("jLabel9");
        jFrame2.getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 150, 34, 14);

        jRadioButton1.setText("COD");
        jFrame2.getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(350, 300, 93, 23);

        jRadioButton2.setText("DEBIT CARD");
        jFrame2.getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(350, 330, 85, 23);

        jRadioButton3.setText("CREDIT CARD");
        jFrame2.getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(350, 360, 93, 23);

        jButton28.setText("jButton28");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton28);
        jButton28.setBounds(370, 410, 79, 23);

        jLabel10.setText("MOB N");
        jFrame2.getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 260, 32, 14);

        jTextField1.setText("jTextField1");
        jFrame2.getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 260, 150, 20);

        jDialog1.setMinimumSize(new java.awt.Dimension(720, 720));
        jDialog1.getContentPane().setLayout(null);
        jDialog1.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 840, 561);

        jButton19.setText("jButton4");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 4000));
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 430, 250, 230);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 920, 250, 230);

        jButton3.setText("jButton3");
        jPanel1.add(jButton3);
        jButton3.setBounds(610, 430, 250, 230);

        jButton4.setText("jButton4");
        jPanel1.add(jButton4);
        jButton4.setBounds(870, 920, 250, 230);

        jButton5.setText("jButton5");
        jPanel1.add(jButton5);
        jButton5.setBounds(870, 670, 250, 230);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(90, 670, 250, 230);

        jButton7.setText("jButton2");
        jPanel1.add(jButton7);
        jButton7.setBounds(350, 1170, 250, 230);

        jButton8.setText("jButton3");
        jPanel1.add(jButton8);
        jButton8.setBounds(350, 670, 250, 230);

        jButton9.setText("jButton4");
        jPanel1.add(jButton9);
        jButton9.setBounds(870, 430, 250, 230);

        jButton10.setText("jButton5");
        jPanel1.add(jButton10);
        jButton10.setBounds(1140, 1170, 250, 230);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(90, 430, 250, 230);

        jButton12.setText("jButton2");
        jPanel1.add(jButton12);
        jButton12.setBounds(610, 1420, 250, 230);

        jButton13.setText("jButton3");
        jPanel1.add(jButton13);
        jButton13.setBounds(610, 670, 250, 230);

        jButton14.setText("jButton4");
        jPanel1.add(jButton14);
        jButton14.setBounds(1140, 670, 250, 230);

        jButton15.setText("jButton5");
        jPanel1.add(jButton15);
        jButton15.setBounds(1140, 430, 250, 230);

        jButton16.setText("jButton1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(90, 920, 250, 230);

        jButton17.setText("jButton2");
        jPanel1.add(jButton17);
        jButton17.setBounds(90, 1170, 250, 230);

        jButton18.setText("jButton3");
        jPanel1.add(jButton18);
        jButton18.setBounds(350, 1420, 250, 230);

        jButton20.setText("jButton5");
        jPanel1.add(jButton20);
        jButton20.setBounds(90, 1420, 250, 230);

        jButton21.setText("jButton1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(1140, 920, 250, 230);

        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);
        jButton26.setBounds(0, 0, 1420, 390);

        jButton22.setText("jButton2");
        jPanel1.add(jButton22);
        jButton22.setBounds(870, 1170, 250, 230);

        jButton23.setText("jButton3");
        jPanel1.add(jButton23);
        jButton23.setBounds(613, 1173, 240, 230);

        jButton24.setText("jButton4");
        jPanel1.add(jButton24);
        jButton24.setBounds(880, 1420, 250, 230);

        jButton25.setText("jButton5");
        jPanel1.add(jButton25);
        jButton25.setBounds(610, 920, 250, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/buyback.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 1160, 1430, 950);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/buyback.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 770, 1430, 980);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/buyback.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1430, 950);

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 4, 1420, 260);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jFrame1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        // TODO add your handling code here:
       
      /*  int q=jPanel1.getY();
        int p=evt.getWheelRotation();
        if(q>=1)
        {
            int z=p+q;
         jPanel1.setLocation(0,z);
        }
        if(q<=(-1))
        {int z=q-p;
         jPanel1.setLocation(0,z);
        }*/
        int q=jPanel1.getY();
        int p=evt.getWheelRotation();
        if(p>0)
        {
            if(q<=-3100)
            {
                p=0;
            }
            else{


         jPanel1.setLocation(0,q-50);
            }
        }
        if(p<0)
        {
            if(q==0)
            {
                p=0;
            }
            else{
         jPanel1.setLocation(0,q+50);
            }
        }

    }//GEN-LAST:event_jPanel1MouseWheelMoved

    

    Timer T =new Timer(1000,new ActionListener()
{public void actionPerformed(ActionEvent e)
{for(int i=1;i<=4;i++)
 {if(i==1)
 {
  jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/1.jpg")));
 if(i==2)
 {jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/2.jpg")));}
 if(i==3)
 {jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/3.jpg")));}
 if(i==4)
 {jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitness/images/4.jpg")));}
 
  }
 }}});
  
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        T.start();
}//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton11ActionPerformed

   
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
