package proyectoplataformas;

public class PantallaSalida extends javax.swing.JPanel {

    public PantallaSalida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_salida = new javax.swing.JLabel();
        btnSalida = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(974, 485));
        setMinimumSize(new java.awt.Dimension(974, 485));
        setPreferredSize(new java.awt.Dimension(974, 485));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(101, 3, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 586));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 586));

        titulo_salida.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        titulo_salida.setForeground(new java.awt.Color(255, 175, 94));
        titulo_salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_salida.setText("Quit");
        titulo_salida.setMaximumSize(new java.awt.Dimension(974, 48));
        titulo_salida.setMinimumSize(new java.awt.Dimension(974, 48));
        titulo_salida.setPreferredSize(new java.awt.Dimension(974, 48));

        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalida.setAlignmentX(1.0F);
        btnSalida.setAlignmentY(1.0F);
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(btnSalida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titulo_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(btnSalida)
                .addGap(228, 228, 228))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo_salida;
    // End of variables declaration//GEN-END:variables
}
