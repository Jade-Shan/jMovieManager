/**
 * Copyright (c) 2010-2015 Bryan Beck.
 * All rights reserved.
 * 
 * This project is licensed under LGPL v2.1.
 * See jMovieManager-license.txt for details.
 * 
 */
package jMovieManager.swing.gui;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JDialog;
import jmm.persist.RunnableImpl;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

/**
 * Dialog to Display the progress of the import process
 * 
 * @author Bryan Beck
 * @since 14.02.2013
 */
public class DisplayImportProgressGUI extends javax.swing.JDialog implements Observer{
    /** Logger. */
    private static final Logger LOG = LoggerFactory.logger(DisplayImportProgressGUI.class);
    
//    private ResourceBundle bundle;
    private List<Thread> threadTaskList;
    
    private int totalFinishes;
    private int finishes;
    
    /**
     * Creates new form SaveProgressGUI
     * 
     * @param totalFinishes The number of total tasks elements (requiered for progressbar updates)
     * @see JDialog#JDialog(java.awt.Frame, boolean)
     */
    public DisplayImportProgressGUI(java.awt.Frame parent, boolean modal, int totalFinishes) {
        super(parent, modal);
        initComponents();
//        bundle = ResourceBundle.getBundle("jMovieManager.swing.resources.MovieManager");
        if(totalFinishes > 0){
            this.totalFinishes = totalFinishes;
        }else{
            this.totalFinishes = 1;
        }
        jLabel3.setText("0");
        jLabel5.setText(String.valueOf(this.totalFinishes));
        
        this.setLocationRelativeTo(parent);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                jButton1ActionPerformed(null);
            }
        });
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
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("jMovieManager/swing/resources/MovieManager"); // NOI18N
        setTitle(bundle.getString("DisplayImportProgressGUI.headline")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setMinimumSize(new java.awt.Dimension(530, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(530, 100));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel12);

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel8.setPreferredSize(new java.awt.Dimension(500, 30));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));

        jLabel1.setText(bundle.getString("DisplayImportProgressGUI.jLabel1")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(460, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(460, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(460, 20));
        jPanel8.add(jLabel1);

        jPanel3.add(jPanel8);

        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel10.setMinimumSize(new java.awt.Dimension(500, 35));
        jPanel10.setPreferredSize(new java.awt.Dimension(500, 35));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 5));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setLabelFor(jProgressBar1);
        jLabel6.setMaximumSize(new java.awt.Dimension(32767, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(480, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(480, 25));
        jPanel10.add(jLabel6);

        jPanel3.add(jPanel10);

        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 24));
        jPanel9.setPreferredSize(new java.awt.Dimension(500, 24));

        jProgressBar1.setPreferredSize(new java.awt.Dimension(480, 14));
        jPanel9.add(jProgressBar1);

        jPanel3.add(jPanel9);

        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 25));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("...");
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 15));
        jPanel7.add(jLabel3);

        jLabel4.setText("/");
        jPanel7.add(jLabel4);

        jLabel5.setText("...");
        jLabel5.setMaximumSize(new java.awt.Dimension(30, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(30, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 15));
        jPanel7.add(jLabel5);

        jPanel3.add(jPanel7);

        jPanel11.setMinimumSize(new java.awt.Dimension(500, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 40));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 40));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 8));

        jButton1.setText(bundle.getString("SaveProgressGUI.jButton1")); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(100, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * jButton1 - Cancel Save Process <br/>
     * Interrupt all save processes and disposes the GUI
     * 
     * @param evt the triggered event
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(Thread process: threadTaskList){
            process.interrupt();
        }
       // jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Updates the overall progress bar
     * @see Observer#update(java.util.Observable, java.lang.Object) 
     */
    @Override
    public void update(Observable o, Object arg) {
        finishes ++;
        jProgressBar1.setValue(((int)(((double)finishes/(double)totalFinishes)*100)));
        jLabel3.setText(String.valueOf(finishes));
        jLabel6.setText(arg.toString());
    }
       
    /**
     * Sets the runnable list and adds each runnable the gui as observer
     * @param runnableList The list of runnable tasks
     */
    public void setRunnableList(final List<RunnableImpl> runnableList){
        threadTaskList = new LinkedList<Thread>();
        for(RunnableImpl task: runnableList){
            task.addObserver(this);
            Thread runProcess = new Thread(task);
            threadTaskList.add(runProcess);
        }
    }
    
    /**
     * Shows the GUI and starts the save process
     * 
     */
    public void showAndStart(){
        finishes = 0;
        Thread runThreadsAndDispose = new Thread(new Runnable() {
            @Override
            public void run() {
//                pack();
                //Starte alle Threads
                for(Thread process: threadTaskList){
                    process.start();
                }
                //Warte bis alle Threads abgeschlossen sind
                for(Thread process: threadTaskList){
                    try {
                        process.join();
                        LOG.debug("Thread " + process.getName() + " finished.");
                    } catch (InterruptedException ex) {
                        LOG.error("Thread could not be joined.", ex);
                    }
                }
                dispose();
            }
        });
        runThreadsAndDispose.start();
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}