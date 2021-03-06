/**
 * Copyright (c) 2010-2015 Bryan Beck.
 * All rights reserved.
 * 
 * This project is licensed under LGPL v2.1.
 * See jMovieManager-license.txt for details.
 * 
 */
package jMovieManager.swing.gui;

import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingUtilities;
import jmm.data.collection.MediaCollection;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

/**
 * GUI to display different statistics about your collection
 * 
 * @author Bryan Beck
 * @since 07.04.2011
 */
public class StatisticGUI extends javax.swing.JDialog implements ColorInterface {
    /** Logger. */
    private static final Logger LOG = LoggerFactory.logger(StatisticGUI.class);
    
    private DefaultComboBoxModel comboboxModel;
    //Referenzierung von Collection zu Statistik Panel
    private Map<MediaCollection, StatisticPanel> panelMap;

    /** Creates new form StatisticGUI */
    public StatisticGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        comboboxModel = new DefaultComboBoxModel();
        panelMap = new HashMap<MediaCollection, StatisticPanel>();
        initComponents();
        
        initializeTabs();     
        //GUI zentriert darstellen
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("jMovieManager/swing/resources/MovieManager"); // NOI18N
        setTitle(bundle.getString("StatisticGUI.headline")); // NOI18N
        setMinimumSize(new java.awt.Dimension(650, 325));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(650, 325));

        jPanel16.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel16.setMinimumSize(new java.awt.Dimension(27, 40));
        jPanel16.setPreferredSize(new java.awt.Dimension(600, 40));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        jButton2.setText(bundle.getString("StatisticGUI.jButton1")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton2);

        getContentPane().add(jPanel16, java.awt.BorderLayout.SOUTH);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(288, 40));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 10));

        jLabel1.setText(bundle.getString("StatisticGUI.jLabel1")); // NOI18N
        jPanel2.add(jLabel1);

        jComboBox1.setModel(comboboxModel);
        jComboBox1.setMaximumSize(new java.awt.Dimension(32767, 20));
        jComboBox1.setMinimumSize(new java.awt.Dimension(150, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 20));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel2.add(jComboBox1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 345));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 345));
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * jButton2 - close gui <br/>
     * Disposes the GUI 
     * @param evt the triggered event
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * jComboBox1 - Change statistic panel <br/>
     * Updates the displayed statistic panel
     * 
     * @param evt the triggered event
     */
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        final MediaCollection collection = MediaCollection.getCollectionMap().get(comboboxModel.getSelectedItem().toString());
        if((collection != null) && (evt.getStateChange() == ItemEvent.SELECTED)){
            final StatisticPanel panel = panelMap.get(collection);
            
            jPanel1.removeAll();
            jPanel1.add(panel);
//            this.pack();
            jPanel1.repaint();
                
            if(!panel.isAlreadyGenerated()){
                final StatisticGUI instance = this;
                instance.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        panel.generateFileStatistic();
                        instance.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    }
                });
            }
        }        
    }//GEN-LAST:event_jComboBox1ItemStateChanged
            
    /**
     * initializes all tabs for the tabbedPane
     */
    private void initializeTabs(){
        Iterator<String> collIterator = MediaCollection.getCollectionMap().keySet().iterator();
        while(collIterator.hasNext()){
            String key = collIterator.next();
            MediaCollection collection = MediaCollection.getCollectionMap().get(key);
            panelMap.put(collection, new StatisticPanel(collection));
            comboboxModel.addElement(collection.getName());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
