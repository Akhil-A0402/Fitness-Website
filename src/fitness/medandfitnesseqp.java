/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * medandfitnesseqp.java
 *
 * Created on Jan 1, 2004, 12:24:01 AM
 */

package fitness;

/**
 *
 * @author vsat7
 */
public class medandfitnesseqp extends javax.swing.JFrame {

    /** Creates new form medandfitnesseqp */
    public medandfitnesseqp() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 140, 410, 20);

        jButton1.setText("FILTER");
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 140, 67, 23);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 200, 990, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medandfitnesseqp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
