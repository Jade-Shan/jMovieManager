/**
 * Copyright (c) 2010-2015 Bryan Beck.
 * All rights reserved.
 * 
 * This project is licensed under LGPL v2.1.
 * See jMovieManager-license.txt for details.
 * 
 */
package jMovieManager.swing.gui.components;

import javax.swing.ImageIcon;

/**
 * Panel to display a single save process
 * 
 * @author Bryan Beck
 * @since 10.11.2012
 */
public class MyDisplaySaveElementProgressPanel extends javax.swing.JPanel{

    private Thread process;
    
    /**
     * Creates new form MyDisplaySaveElementProgressPanel
     * 
     * @param process The process to start
     * @param imageIcon The icon to display on the left side
     * @param topText The text on the top side
     * @param centerText The text in the middle <br/> If null, a progressbar will be displayed
     * @param bottomText The text on the bottom side
     */
    public MyDisplaySaveElementProgressPanel(Thread process, ImageIcon imageIcon, String topText, String centerText, String bottomText) {
        initComponents();
        this.process = process;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();

        setMaximumSize(new java.awt.Dimension(32767, 54));
        setMinimumSize(new java.awt.Dimension(0, 54));
        setPreferredSize(new java.awt.Dimension(510, 54));
        setLayout(new java.awt.BorderLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jMovieManager/swing/images/importDirectoryDelete.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(22, 16));
        jButton3.setMinimumSize(new java.awt.Dimension(22, 16));
        jButton3.setPreferredSize(new java.awt.Dimension(22, 16));
        add(jButton3, java.awt.BorderLayout.EAST);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jMovieManager/swing/images/details.gif"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setMaximumSize(new java.awt.Dimension(22, 16));
        jButton4.setMinimumSize(new java.awt.Dimension(22, 16));
        jButton4.setPreferredSize(new java.awt.Dimension(22, 16));
        add(jButton4, java.awt.BorderLayout.WEST);

        jLabel3.setText("Sichere Datenbank");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 23, 1, 1));
        jLabel3.setMaximumSize(new java.awt.Dimension(34, 19));
        jLabel3.setMinimumSize(new java.awt.Dimension(34, 19));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 19));
        add(jLabel3, java.awt.BorderLayout.NORTH);

        jLabel4.setText("Sammlung: Filme 2");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 23, 1, 1));
        jLabel4.setMaximumSize(new java.awt.Dimension(34, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(34, 19));
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 19));
        add(jLabel4, java.awt.BorderLayout.SOUTH);

        jProgressBar2.setMaximumSize(new java.awt.Dimension(32767, 16));
        jProgressBar2.setMinimumSize(new java.awt.Dimension(10, 16));
        jProgressBar2.setPreferredSize(new java.awt.Dimension(146, 16));
        add(jProgressBar2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

//    public void startProcess(){
//        process.start();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
