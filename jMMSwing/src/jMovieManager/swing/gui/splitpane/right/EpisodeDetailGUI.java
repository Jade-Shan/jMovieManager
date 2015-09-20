/**
 * Copyright (c) 2010-2015 Bryan Beck.
 * All rights reserved.
 * 
 * This project is licensed under LGPL v2.1.
 * See jMovieManager-license.txt for details.
 * 
 */
package jMovieManager.swing.gui.splitpane.right;

import javax.swing.border.TitledBorder;
import jmm.data.Episode;
import jmm.utils.LocaleManager;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

/**
 *
 * @author Bryan Beck
 * @since 25.10.2011
 * 
 */
public class EpisodeDetailGUI extends MovieDetailGUI {
    /** Logger. */
    private static final Logger LOG = LoggerFactory.logger(EpisodeDetailGUI.class);
    
    private static EpisodeDetailGUI instance;

    /** Creates new form EpisodeDetailGUI */
    public EpisodeDetailGUI() {
        super();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Singleton Konstruktor der Klasse MovieDetailGUI
    *
    * @return instance Die Instanz der Klasse
    */
    public static EpisodeDetailGUI getInstance(){
        if(instance == null){
            instance = new EpisodeDetailGUI();
            LocaleManager.getInstance().addObserver(instance);
        }
        return instance;
    }
        
   /**
   * Aktualisiert alle Labels, Buttons, Tooltips und sonstigen Texte der GUI
   * auf das gesetzte Locale
   */
    @Override
   protected void updateGUILocalization(){
       super.updateGUILocalization();
       //jLabel11.setText(bundle.getString("MovieDetailGUI.jLabel11"));
   }

    /**
    * Aktualisiert das jPanel 2 mit
    * Informationen des Movie Objekts
    *
    * @param episode Das Movie Objekt
    */
    public void updateEpisodeDetail(final Episode episode){
        super.updateMovieDetail(episode);
        //Episode Nr
        if(episode.getEpisodeNumber() != 0){
            ((TitledBorder)detailsPanel.getBorder()).setTitle(bundle.getString("AbstractDetailGUI.detailsPanel") + " - Episode " + episode.getEpisodeNumber());
            //jLabel2.setText(bundle.getString("MovieDetailGUI.jLabelEmpty"));
        }
        else{
            //jLabel2.setText(String.valueOf(episode.getEpisodeNumber())); 
        }
    }       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
