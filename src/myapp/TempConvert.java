/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author bmmar
 */
public class TempConvert extends javax.swing.JPanel {

    /**
     * Creates new form TempConvert
     */
    public TempConvert() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        inUnit = new javax.swing.JComboBox<>();
        outF = new javax.swing.JTextField();
        outC = new javax.swing.JTextField();
        outK = new javax.swing.JTextField();
        convertBtn = new javax.swing.JButton();
        outFLabel = new javax.swing.JLabel();
        outCLabel = new javax.swing.JLabel();
        outKLabel = new javax.swing.JLabel();
        error = new javax.swing.JLabel();

        jLabel1.setText("Temperature Converter");

        inUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "C", "K"}));
        inUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inUnitActionPerformed(evt);
            }
        });

        outF.setEditable(false);
        outF.setToolTipText("");

        outC.setEditable(false);

        outK.setEditable(false);

        convertBtn.setText("Convert");
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });

        outFLabel.setText("F");

        outCLabel.setText("C");

        outKLabel.setText("K");

        error.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(convertBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outK, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(outC)
                            .addComponent(outF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outCLabel)
                            .addComponent(outKLabel))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outFLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outCLabel)
                    .addComponent(convertBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outKLabel)
                    .addComponent(error))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inUnitActionPerformed

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
        error.setText("");
        try{
            if (inUnit.getSelectedItem() == "F")
               FConvert(Double.parseDouble(input.getText()));
             else if (inUnit.getSelectedItem() == "C")
                CConvert(Double.parseDouble(input.getText()));
            else
                KConvert(Double.parseDouble(input.getText()));
        } catch (NumberFormatException e){
            error.setText("Error - Not a valid number.");   
        }
    }//GEN-LAST:event_convertBtnActionPerformed

    
    private void FConvert(double in) {
        double c = (in - 32) * (5.0/9.0);
        if (c == -0.0)
            c = 0.0;
        c = Math.round(c * 100);
        c /= 100;
        double k = (in + 459.67) * (5.0/9.0);
        if (k == -0.0)
            k = 0.0;
        k = Math.round(k * 100);
        k /= 100;
        outF.setText(Double.toString(in));
        outC.setText(Double.toString(c));
        outK.setText(Double.toString(k));
    }
    
    private void CConvert(double in) {
        double f = in * (9.0/5.0) + 32;
        if (f == -0.0)
            f = 0.0;
        f = Math.round(f * 100);
        f /= 100;
        double k = in + 273.15;
        if (k == -0.0)
            k = 0.0;
        k = Math.round(k * 100);
        k /= 100;
        outF.setText(Double.toString(f));
        outC.setText(Double.toString(in));
        outK.setText(Double.toString(k));
    }
    
    private void KConvert(double in) {
        double f = in * (9.0/5.0) - 459.67;
        if (f == -0.0)
            f = 0.0;
        f = Math.round(f * 100);
        f /= 100;
        double c = in - 273.15;
        if (c == -0.0)
            c = 0.0;
        c = Math.round(c * 100);
        c /= 100;
        outF.setText(Double.toString(f));
        outC.setText(Double.toString(c));
        outK.setText(Double.toString(in));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertBtn;
    private javax.swing.JLabel error;
    private javax.swing.JComboBox<String> inUnit;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField outC;
    private javax.swing.JLabel outCLabel;
    private javax.swing.JTextField outF;
    private javax.swing.JLabel outFLabel;
    private javax.swing.JTextField outK;
    private javax.swing.JLabel outKLabel;
    // End of variables declaration//GEN-END:variables
}