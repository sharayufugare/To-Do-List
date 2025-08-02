package com.mycompany.todolist;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
  
    private DefaultListModel<String> lm;
    public Main() {
        initComponents();
        lm = new DefaultListModel<>();// object created
        list1.setModel(lm);
    }
    private void inputActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String task = input.getText();
        if(!task.isEmpty()){
            int n = 1;
            n++;
            lm.addElement(n + task);
        }
        else{
            JOptionPane.showMessageDialog(this,"You have to enter a task");
        }
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String task = input.getText();
        if(!task.isEmpty()){
            lm.addElement(task);
            input.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this , "You have to enter a task");
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int index = list1.getAnchorSelectionIndex();
        if(index>-1){
            lm.remove(index);
        }
        else{
            JOptionPane.showMessageDialog(this,"Select an item first");
        }
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list1;
}
