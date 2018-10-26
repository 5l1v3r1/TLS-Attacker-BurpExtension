/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rub.nds.burp.tlsattacker.gui;

import burp.IContextMenuFactory;
import burp.IContextMenuInvocation;
import de.rub.nds.burp.utilities.SiteReportPrinter;
import de.rub.nds.tlsattacker.core.config.delegate.GeneralDelegate;
import de.rub.nds.tlsscanner.TlsScanner;
import de.rub.nds.tlsscanner.config.ScannerConfig;
import de.rub.nds.tlsscanner.constants.ScannerDetail;
import de.rub.nds.tlsscanner.report.SiteReport;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

/**
 * TLS-Scanner.
 * 
 * @author Nurullah Erinola
 */
public class UIScanner extends javax.swing.JPanel implements IContextMenuFactory {
     
    /**
     * Creates new form UIScanner.
     */
    public UIScanner() {
        initComponents();       
        initJComboBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonScan = new javax.swing.JButton();
        jTextFieldHost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCopy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxImplementation = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldThreads = new javax.swing.JTextField();
        jTextFieldAggroLevel = new javax.swing.JTextField();
        jComboBoxDangerLevel = new javax.swing.JComboBox<>();
        jComboBoxReportDetail = new javax.swing.JComboBox<>();
        jComboBoxScanDetail = new javax.swing.JComboBox<>();
        jCheckBoxNoColor = new javax.swing.JCheckBox();
        jCheckBoxDefaultSetting = new javax.swing.JCheckBox();
        jScrollPaneResult = new javax.swing.JScrollPane();
        jTextPaneResult = new javax.swing.JTextPane();

        jButtonScan.setText("Scan");
        jButtonScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScanActionPerformed(evt);
            }
        });

        jTextFieldHost.setText("localhost:4433");
        jTextFieldHost.setToolTipText("Who to connect to. Syntax: localhost:4433");

        jLabel1.setText("Host:");

        jLabel3.setText("Result:");

        jButtonCopy.setText("Copy");
        jButtonCopy.setToolTipText("Copy result to clipboard.");
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });

        jLabel2.setText("Threads:");
        jLabel2.setToolTipText("How many threads should execute Probes.");

        jLabel4.setText("Aggro Level:");
        jLabel4.setToolTipText("The level of concurrent handshakes (only applies to some resource intensive tests).");

        jLabel5.setText("Danger Level:");
        jLabel5.setToolTipText("How aggressive the Scanner should test");

        jCheckBoxImplementation.setText("Implementation");
        jCheckBoxImplementation.setToolTipText("If you are interessted in the vulnerability of an implementation rather than a specific site.");
        jCheckBoxImplementation.setEnabled(false);

        jLabel6.setText("Scan Detail:");
        jLabel6.setToolTipText("How detailed do you want to scan.");

        jLabel7.setText("Report Detail:");
        jLabel7.setToolTipText("How detailed do you want the report to be.");

        jTextFieldThreads.setText("4");
        jTextFieldThreads.setToolTipText("Enter numbers only.");
        jTextFieldThreads.setEnabled(false);

        jTextFieldAggroLevel.setText("100");
        jTextFieldAggroLevel.setToolTipText("Enter numbers only.");
        jTextFieldAggroLevel.setEnabled(false);

        jComboBoxDangerLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDangerLevel.setEnabled(false);

        jComboBoxReportDetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxReportDetail.setEnabled(false);

        jComboBoxScanDetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxScanDetail.setEnabled(false);

        jCheckBoxNoColor.setText("No color");
        jCheckBoxNoColor.setToolTipText("If you don't want colored text.");

        jCheckBoxDefaultSetting.setSelected(true);
        jCheckBoxDefaultSetting.setText("Use default settings");
        jCheckBoxDefaultSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDefaultSettingActionPerformed(evt);
            }
        });

        jTextPaneResult.setEditable(false);
        jScrollPaneResult.setViewportView(jTextPaneResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCopy))
                            .addComponent(jButtonScan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxDefaultSetting)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxNoColor))
                                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldThreads)
                                            .addComponent(jComboBoxScanDetail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxDangerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxReportDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldAggroLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBoxImplementation)))))))
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addComponent(jScrollPaneResult))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDefaultSetting)
                    .addComponent(jCheckBoxNoColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAggroLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBoxImplementation))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxScanDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxReportDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDangerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonScan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonCopy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneResult, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initJComboBoxes() {
        // Init jComboBox for Scan Detail and Report Detail
        ArrayList<String> details = new ArrayList<>();
        details.add(ScannerDetail.ALL.toString());
        details.add(ScannerDetail.DETAILED.toString());
        details.add(ScannerDetail.NORMAL.toString());
        jComboBoxScanDetail.setModel(new DefaultComboBoxModel(details.toArray())); 
        jComboBoxScanDetail.setSelectedIndex(2); 
        jComboBoxReportDetail.setModel(new DefaultComboBoxModel(details.toArray())); 
        jComboBoxReportDetail.setSelectedIndex(2);
        // Init jComboBox for Danger Level
        ArrayList<String> levels = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            levels.add(String.valueOf(i));
        }
        jComboBoxDangerLevel.setModel(new DefaultComboBoxModel(levels.toArray())); 
        jComboBoxDangerLevel.setSelectedIndex(9); 
    }
    
    /**
     * Add new menu item to context menu.
     */
    @Override
    public List<JMenuItem> createMenuItems(IContextMenuInvocation contextMenuInvocation) {
        List<JMenuItem> menuList = new ArrayList<>();
        JMenuItem jMenuItemSendToScanner = new JCheckBoxMenuItem("Send to TLS-Scanner");
        jMenuItemSendToScanner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Set selected Host
                jTextFieldHost.setText(contextMenuInvocation.getSelectedMessages()[0].getHttpService().getHost());
            }
        });
        menuList.add(jMenuItemSendToScanner);
        return menuList;
    }
    
    private void jButtonScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScanActionPerformed
        // Create config
        ScannerConfig config = new ScannerConfig(new GeneralDelegate());
        config.getClientDelegate().setHost(jTextFieldHost.getText());
        config.setNoColor(jCheckBoxNoColor.isSelected());
        config.setThreads(4);
        config.setAggroLevel(100);
        if(!jCheckBoxDefaultSetting.isSelected()) {
            config.setDangerLevel(Integer.parseInt((String) jComboBoxDangerLevel.getSelectedItem()));
            config.setThreads(Integer.parseInt(jTextFieldThreads.getText()));
            config.setAggroLevel(Integer.parseInt(jTextFieldAggroLevel.getText()));
            config.setImplementation(jCheckBoxImplementation.isSelected());
            config.setReportDetail(ScannerDetail.valueOf((String) jComboBoxReportDetail.getSelectedItem()));
            config.setScanDetail(ScannerDetail.valueOf((String) jComboBoxScanDetail.getSelectedItem()));
        }
        // Init scanner
        TlsScanner scanner = new TlsScanner(config);
        SiteReport report = scanner.scan();  
        // Print scan result
        SiteReportPrinter printer = new SiteReportPrinter(jTextPaneResult, report, config.getReportDetail());
        printer.printFullReport();
    }//GEN-LAST:event_jButtonScanActionPerformed

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        String toCopy = jTextPaneResult.getText();
        StringSelection stringSelection = new StringSelection(toCopy);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_jButtonCopyActionPerformed

    private void jCheckBoxDefaultSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDefaultSettingActionPerformed
        if(jCheckBoxDefaultSetting.isSelected()) {
            jCheckBoxImplementation.setEnabled(false);
            jComboBoxDangerLevel.setEnabled(false);
            jComboBoxReportDetail.setEnabled(false);
            jComboBoxScanDetail.setEnabled(false);
            jTextFieldAggroLevel.setEnabled(false);
            jTextFieldThreads.setEnabled(false);
        } else {
            jCheckBoxImplementation.setEnabled(true);
            jComboBoxDangerLevel.setEnabled(true);
            jComboBoxReportDetail.setEnabled(true);
            jComboBoxScanDetail.setEnabled(true);
            jTextFieldAggroLevel.setEnabled(true);
            jTextFieldThreads.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxDefaultSettingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonScan;
    private javax.swing.JCheckBox jCheckBoxDefaultSetting;
    private javax.swing.JCheckBox jCheckBoxImplementation;
    private javax.swing.JCheckBox jCheckBoxNoColor;
    private javax.swing.JComboBox<String> jComboBoxDangerLevel;
    private javax.swing.JComboBox<String> jComboBoxReportDetail;
    private javax.swing.JComboBox<String> jComboBoxScanDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPaneResult;
    private javax.swing.JTextField jTextFieldAggroLevel;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldThreads;
    private javax.swing.JTextPane jTextPaneResult;
    // End of variables declaration//GEN-END:variables
}
