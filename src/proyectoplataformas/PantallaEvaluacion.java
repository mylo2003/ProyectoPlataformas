package proyectoplataformas;

public class PantallaEvaluacion extends javax.swing.JPanel {

    public PantallaEvaluacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_evaluacion = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(974, 485));
        setMinimumSize(new java.awt.Dimension(974, 485));
        setPreferredSize(new java.awt.Dimension(974, 485));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(101, 3, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(974, 485));
        jPanel1.setMinimumSize(new java.awt.Dimension(974, 485));
        jPanel1.setPreferredSize(new java.awt.Dimension(974, 485));

        titulo_evaluacion.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        titulo_evaluacion.setForeground(new java.awt.Color(255, 175, 94));
        titulo_evaluacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_evaluacion.setText("Quick Test");
        titulo_evaluacion.setMaximumSize(new java.awt.Dimension(974, 48));
        titulo_evaluacion.setMinimumSize(new java.awt.Dimension(974, 48));
        titulo_evaluacion.setPreferredSize(new java.awt.Dimension(974, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo_evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 437, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo_evaluacion;
    // End of variables declaration//GEN-END:variables
}
