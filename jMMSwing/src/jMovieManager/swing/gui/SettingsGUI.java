/**
 * Copyright (c) 2010-2015 Bryan Beck.
 * All rights reserved.
 * 
 * This project is licensed under LGPL v2.1.
 * See jMovieManager-license.txt for details.
 * 
 */
package jMovieManager.swing.gui;

import javax.swing.DefaultComboBoxModel;
import jmm.utils.Settings;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

/**
 * GUI to configure jMM settings
 * 
 * @author Bryan Beck
 * @since 07.05.2011
 */
public class SettingsGUI extends javax.swing.JDialog implements ColorInterface{
    /** Logger. */
    private static final Logger LOG = LoggerFactory.logger(SettingsGUI.class);
    
    private Settings settingsInst;
    
    private DefaultComboBoxModel calendarRedirectModel;

    /** Creates new form SettingsGUI */
    public SettingsGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        calendarRedirectModel = new DefaultComboBoxModel();
        settingsInst = Settings.getInstance();

        initComponents();
        this.setLocationRelativeTo(parent);
        this.setDefaultSettings();   
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("jMovieManager/swing/resources/MovieManager"); // NOI18N
        jCheckBox2.setText(bundle.getString("SettingsGUI.jCheckBox2")); // NOI18N
        jCheckBox2.setToolTipText(bundle.getString("SettingsGUI.jCheckBox2.tooltip")); // NOI18N
        jCheckBox2.setOpaque(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(bundle.getString("SettingsGUI.headline")); // NOI18N
        setMinimumSize(new java.awt.Dimension(575, 300));
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(575, 265));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(575, 265));

        jPanel4.setMinimumSize(new java.awt.Dimension(575, 265));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(575, 265));
        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(550, 115));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, ColorInterface.list_tree_BorderShadow), bundle.getString("SettingsGUI.jPanel1"))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 64));

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox10.setText(bundle.getString("SettingsGUI.jCheckBox10")); // NOI18N
        jCheckBox10.setToolTipText(bundle.getString("SettingsGUI.jCheckBox10.tooltip")); // NOI18N
        jCheckBox10.setOpaque(false);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox3.setText(bundle.getString("SettingsGUI.jCheckBox3")); // NOI18N
        jCheckBox3.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, ColorInterface.list_tree_BorderShadow), bundle.getString("SettingsGUI.jPanel12"))); // NOI18N
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(265, 64));

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox9.setText(bundle.getString("SettingsGUI.jCheckBox9")); // NOI18N
        jCheckBox9.setToolTipText(bundle.getString("SettingsGUI.jCheckBox9.tooltip")); // NOI18N
        jCheckBox9.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(550, 150));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, ColorInterface.list_tree_BorderShadow), bundle.getString("SettingsGUI.jLabel5"))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(260, 64));

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox7.setText(bundle.getString("SettingsGUI.jCheckBox7")); // NOI18N
        jCheckBox7.setToolTipText(bundle.getString("SettingsGUI.jCheckBox7.tooltip")); // NOI18N
        jCheckBox7.setActionCommand("Bilder speichern");
        jCheckBox7.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, ColorInterface.list_tree_BorderShadow), bundle.getString("SettingsGUI.jPanel3"))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 64));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText(bundle.getString("SettingsGUI.jCheckBox1")); // NOI18N
        jCheckBox1.setToolTipText(bundle.getString("SettingsGUI.jCheckBox1.tooltip")); // NOI18N
        jCheckBox1.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel10);

        jTabbedPane1.addTab(bundle.getString("SettingsGUI.jPanel4"), jPanel4); // NOI18N

        jPanel6.setOpaque(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, ColorInterface.list_tree_BorderShadow), bundle.getString("SettingsGUI.jPanel7"))); // NOI18N
        jPanel7.setOpaque(false);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox4.setText(bundle.getString("SettingsGUI.jCheckBox4")); // NOI18N
        jCheckBox4.setOpaque(false);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox5.setText(bundle.getString("SettingsGUI.jCheckBox5")); // NOI18N
        jCheckBox5.setOpaque(false);

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox6.setText(bundle.getString("SettingsGUI.jCheckBox6")); // NOI18N
        jCheckBox6.setOpaque(false);

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox8.setText(bundle.getString("SettingsGUI.jCheckBox8")); // NOI18N
        jCheckBox8.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, ColorInterface.list_tree_BorderShadow), bundle.getString("SettingsGUI.jPanel8"))); // NOI18N
        jPanel8.setOpaque(false);

        jComboBox1.setModel(calendarRedirectModel);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(bundle.getString("SettingsGUI.jPanel6"), jPanel6); // NOI18N

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jButton1.setText(bundle.getString("SettingsGUI.jButton1")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(100, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText(bundle.getString("SettingsGUI.jButton2")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(100, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * OK Button - Überprüft und Speichert die Einstellungen ab
    *
    * @param evt - Event, dass die Methode auslöst
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        settingsInst.setSavePictures(jCheckBox1.isSelected());
        settingsInst.setSendBugReportAutomatically(jCheckBox2.isSelected());
        settingsInst.setOverlapFSKImage(jCheckBox3.isSelected());
        settingsInst.setExportPicturesIntoXML(jCheckBox7.isSelected());
        settingsInst.setCheckForUpdateOnStartup(jCheckBox9.isSelected());
        settingsInst.setDisplayWatchedIcon(jCheckBox10.isSelected());
        //Calendar
        settingsInst.setShowUpcoming(jCheckBox4.isSelected());
        settingsInst.setShowNowPlaying(jCheckBox5.isSelected());
        settingsInst.setShowTopRated(jCheckBox6.isSelected());
        settingsInst.setShowPopular(jCheckBox8.isSelected());
        if(jComboBox1.getSelectedIndex() == 0){
            settingsInst.setRedirectTo(Settings.REDIRECT_TMDB);
        }else{
            settingsInst.setRedirectTo(Settings.REDIRECT_IMDB);
        }
        //notify Calendar GUI to update
        settingsInst.notifyObservers();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    /**
    * Abbruch Button - Schließt die GUI
    *
    * @param evt - Event, dass die Methode auslöst
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * Setzt die Standardeinstellungen der Settings Klasse auf der GUI
    */
    private void setDefaultSettings(){
        calendarRedirectModel.addElement("TMDB");
        calendarRedirectModel.addElement("IMDB");
        if(settingsInst.getRedirectTo() == Settings.REDIRECT_TMDB){
            jComboBox1.setSelectedIndex(0);
        }else{
            jComboBox1.setSelectedIndex(1);
        }
        
        jCheckBox1.setSelected(settingsInst.isSavePictures());
        jCheckBox2.setSelected(settingsInst.isSendBugReportAutomatically());
        jCheckBox3.setSelected(settingsInst.isOverlapFSKImage());
        jCheckBox7.setSelected(settingsInst.isExportPicturesIntoXML());
        jCheckBox9.setSelected(settingsInst.isCheckForUpdateOnStartup());        
        jCheckBox10.setSelected(settingsInst.isDisplayWatchedIcon());
        //Calendar
        jCheckBox4.setSelected(settingsInst.isShowUpcoming());
        jCheckBox5.setSelected(settingsInst.isShowNowPlaying());
        jCheckBox6.setSelected(settingsInst.isShowTopRated());
        jCheckBox8.setSelected(settingsInst.isShowPopular());
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
