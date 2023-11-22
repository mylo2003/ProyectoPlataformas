package proyectoplataformas;

public class PantallaTema3 extends javax.swing.JPanel {

    public PantallaTema3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_tema3 = new javax.swing.JLabel();
        jLabel1_tema3 = new javax.swing.JLabel();
        jLabel2_tema3 = new javax.swing.JLabel();
        jLabel3_tema3 = new javax.swing.JLabel();
        jLabel4_tema3 = new javax.swing.JLabel();
        jLabel5_tema3 = new javax.swing.JLabel();
        jLabel6_tema3 = new javax.swing.JLabel();
        jLabel7_tema3 = new javax.swing.JLabel();
        jLabel8_tema4 = new javax.swing.JLabel();
        jLabel9_tema3 = new javax.swing.JLabel();
        jLabel10_tema3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(974, 485));
        setMinimumSize(new java.awt.Dimension(974, 485));
        setPreferredSize(new java.awt.Dimension(974, 485));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(101, 3, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(974, 485));
        jPanel1.setMinimumSize(new java.awt.Dimension(974, 485));
        jPanel1.setPreferredSize(new java.awt.Dimension(974, 485));

        titulo_tema3.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        titulo_tema3.setForeground(new java.awt.Color(255, 175, 94));
        titulo_tema3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_tema3.setText("Kernel I/O Subsystem");
        titulo_tema3.setMaximumSize(new java.awt.Dimension(974, 48));
        titulo_tema3.setMinimumSize(new java.awt.Dimension(974, 48));
        titulo_tema3.setPreferredSize(new java.awt.Dimension(974, 48));

        jLabel1_tema3.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        jLabel1_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_tema3.setText("● The Kernel I/O Subsystem handles key aspects:");
        jLabel1_tema3.setToolTipText("");
        jLabel1_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel1_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel1_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel2_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel2_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_tema3.setText("> Scheduling: Organizing I/O requests, some through per-device queues,");
        jLabel2_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel2_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel2_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel3_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel3_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3_tema3.setText("aiming for fairness or implementing Quality of Service.");
        jLabel3_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel3_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel3_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel4_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel4_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_tema3.setText("> Buffering: Temporarily storing data in memory during transfers to manage device");
        jLabel4_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel4_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel4_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel5_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel5_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5_tema3.setText("speed and size differences, ensuring consistent data copies.");
        jLabel5_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel5_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel5_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel6_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel6_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6_tema3.setText("> Caching: Utilizing faster device copies of data for improved performance,");
        jLabel6_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel6_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel6_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel7_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel7_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7_tema3.setText("often combined with buffering.");
        jLabel7_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel7_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel7_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel8_tema4.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel8_tema4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8_tema4.setText("> Spooling: Temporarily storing device output, useful for single-serving devices like printers.");
        jLabel8_tema4.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel8_tema4.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel8_tema4.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel9_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel9_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9_tema3.setText("> Device Reservation: Provides exclusive device access, managed through system calls,");
        jLabel9_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel9_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel9_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        jLabel10_tema3.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel10_tema3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10_tema3.setText("requiring attention to prevent deadlocks.");
        jLabel10_tema3.setMaximumSize(new java.awt.Dimension(860, 21));
        jLabel10_tema3.setMinimumSize(new java.awt.Dimension(860, 21));
        jLabel10_tema3.setPreferredSize(new java.awt.Dimension(860, 21));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8_tema4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8_tema4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10_tema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 139, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10_tema3;
    private javax.swing.JLabel jLabel1_tema3;
    private javax.swing.JLabel jLabel2_tema3;
    private javax.swing.JLabel jLabel3_tema3;
    private javax.swing.JLabel jLabel4_tema3;
    private javax.swing.JLabel jLabel5_tema3;
    private javax.swing.JLabel jLabel6_tema3;
    private javax.swing.JLabel jLabel7_tema3;
    private javax.swing.JLabel jLabel8_tema4;
    private javax.swing.JLabel jLabel9_tema3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo_tema3;
    // End of variables declaration//GEN-END:variables
}
