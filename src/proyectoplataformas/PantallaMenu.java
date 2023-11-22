package proyectoplataformas;

import javax.swing.JPanel;

public class PantallaMenu extends javax.swing.JFrame {

    int xMouse, yMouse;
    int cont = 1;

    public PantallaMenu() {
        initComponents();

        this.setLocationRelativeTo(null);
        PantallaContenido pantalla = new PantallaContenido();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        btnIngles = new javax.swing.JLabel();
        btnEspanol = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnContenido = new javax.swing.JLabel();
        btnContexto = new javax.swing.JLabel();
        btnTema1 = new javax.swing.JLabel();
        btnTema2 = new javax.swing.JLabel();
        btnTema3 = new javax.swing.JLabel();
        btnTema4 = new javax.swing.JLabel();
        btnTema5 = new javax.swing.JLabel();
        btnEvaluacion = new javax.swing.JLabel();
        btnSalida = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        anterior = new javax.swing.JLabel();
        siguiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 626));
        setMinimumSize(new java.awt.Dimension(1200, 626));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(66, 0, 4));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 626));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 626));

        header.setBackground(new java.awt.Color(66, 0, 4));
        header.setMaximumSize(new java.awt.Dimension(1200, 40));
        header.setMinimumSize(new java.awt.Dimension(1200, 40));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 175, 94));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setMaximumSize(new java.awt.Dimension(40, 40));
        btnExit.setMinimumSize(new java.awt.Dimension(40, 40));
        btnExit.setPreferredSize(new java.awt.Dimension(40, 40));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usa.png"))); // NOI18N
        btnIngles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInglesMouseClicked(evt);
            }
        });

        btnEspanol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spain.png"))); // NOI18N
        btnEspanol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEspanol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEspanolMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1043, 1043, 1043)
                .addComponent(btnIngles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEspanol)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEspanol)
                        .addComponent(btnIngles))))
        );

        menuLateral.setBackground(new java.awt.Color(66, 0, 4));
        menuLateral.setMaximumSize(new java.awt.Dimension(220, 586));
        menuLateral.setPreferredSize(new java.awt.Dimension(220, 586));

        menu.setFont(new java.awt.Font("JetBrains Mono", 1, 30)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 175, 94));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("Menu");
        menu.setMaximumSize(new java.awt.Dimension(220, 36));
        menu.setMinimumSize(new java.awt.Dimension(220, 36));
        menu.setPreferredSize(new java.awt.Dimension(220, 36));

        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setMaximumSize(new java.awt.Dimension(220, 32));
        btnHome.setMinimumSize(new java.awt.Dimension(200, 32));
        btnHome.setPreferredSize(new java.awt.Dimension(220, 32));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnContenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contenido.png"))); // NOI18N
        btnContenido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContenido.setMaximumSize(new java.awt.Dimension(220, 32));
        btnContenido.setMinimumSize(new java.awt.Dimension(220, 32));
        btnContenido.setPreferredSize(new java.awt.Dimension(220, 32));
        btnContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContenidoMouseClicked(evt);
            }
        });

        btnContexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema1.png"))); // NOI18N
        btnContexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContexto.setMaximumSize(new java.awt.Dimension(220, 32));
        btnContexto.setMinimumSize(new java.awt.Dimension(220, 32));
        btnContexto.setPreferredSize(new java.awt.Dimension(220, 32));
        btnContexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContextoMouseClicked(evt);
            }
        });

        btnTema1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema2.png"))); // NOI18N
        btnTema1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema1.setMaximumSize(new java.awt.Dimension(220, 32));
        btnTema1.setMinimumSize(new java.awt.Dimension(220, 32));
        btnTema1.setPreferredSize(new java.awt.Dimension(220, 32));
        btnTema1.setRequestFocusEnabled(false);
        btnTema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema1MouseClicked(evt);
            }
        });

        btnTema2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema3.png"))); // NOI18N
        btnTema2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema2.setMaximumSize(new java.awt.Dimension(220, 32));
        btnTema2.setMinimumSize(new java.awt.Dimension(220, 32));
        btnTema2.setPreferredSize(new java.awt.Dimension(220, 32));
        btnTema2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema2MouseClicked(evt);
            }
        });

        btnTema3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema4.png"))); // NOI18N
        btnTema3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema3.setMaximumSize(new java.awt.Dimension(220, 32));
        btnTema3.setMinimumSize(new java.awt.Dimension(220, 32));
        btnTema3.setPreferredSize(new java.awt.Dimension(220, 32));
        btnTema3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema3MouseClicked(evt);
            }
        });

        btnTema4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema5.png"))); // NOI18N
        btnTema4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema4.setMaximumSize(new java.awt.Dimension(220, 32));
        btnTema4.setMinimumSize(new java.awt.Dimension(220, 32));
        btnTema4.setPreferredSize(new java.awt.Dimension(220, 32));
        btnTema4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema4MouseClicked(evt);
            }
        });

        btnTema5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema6.png"))); // NOI18N
        btnTema5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema5.setMaximumSize(new java.awt.Dimension(220, 32));
        btnTema5.setMinimumSize(new java.awt.Dimension(220, 32));
        btnTema5.setPreferredSize(new java.awt.Dimension(220, 32));
        btnTema5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema5MouseClicked(evt);
            }
        });

        btnEvaluacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEvaluacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/evaluacion.png"))); // NOI18N
        btnEvaluacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvaluacion.setMaximumSize(new java.awt.Dimension(220, 32));
        btnEvaluacion.setMinimumSize(new java.awt.Dimension(220, 32));
        btnEvaluacion.setPreferredSize(new java.awt.Dimension(220, 32));
        btnEvaluacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEvaluacionMouseClicked(evt);
            }
        });

        btnSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salida.png"))); // NOI18N
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalida.setMaximumSize(new java.awt.Dimension(220, 32));
        btnSalida.setMinimumSize(new java.awt.Dimension(220, 32));
        btnSalida.setPreferredSize(new java.awt.Dimension(220, 32));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTema1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTema5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTema4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTema2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTema1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTema2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTema4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTema5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(101, 3, 29));
        contenido.setMaximumSize(new java.awt.Dimension(974, 485));
        contenido.setMinimumSize(new java.awt.Dimension(974, 485));
        contenido.setPreferredSize(new java.awt.Dimension(974, 485));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(66, 0, 4));
        jPanel2.setForeground(new java.awt.Color(101, 3, 29));
        jPanel2.setMaximumSize(new java.awt.Dimension(92, 581));
        jPanel2.setMinimumSize(new java.awt.Dimension(974, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(974, 90));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        anterior.setAlignmentX(1.0F);
        anterior.setAlignmentY(1.0F);
        anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorMouseClicked(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        siguiente.setAlignmentX(1.0F);
        siguiente.setAlignmentY(1.0F);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anterior)
                    .addComponent(siguiente))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        PantallaInicio pantalla = new PantallaInicio();
        this.setVisible(false);
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnContenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContenidoMouseClicked
        PantallaContenido pantalla = new PantallaContenido();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 1;
    }//GEN-LAST:event_btnContenidoMouseClicked

    private void btnContextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContextoMouseClicked
        PantallaContexto pantalla = new PantallaContexto();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 2;
    }//GEN-LAST:event_btnContextoMouseClicked

    private void btnTema2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema2MouseClicked
        PantallaTema2 pantalla = new PantallaTema2();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 4;
    }//GEN-LAST:event_btnTema2MouseClicked

    private void btnTema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema1MouseClicked
        PantallaTema1 pantalla = new PantallaTema1();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 3;
    }//GEN-LAST:event_btnTema1MouseClicked

    private void btnTema3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema3MouseClicked
        PantallaTema3 pantalla = new PantallaTema3();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 5;
    }//GEN-LAST:event_btnTema3MouseClicked

    private void btnTema4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema4MouseClicked
        PantallaTema4 pantalla = new PantallaTema4();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 6;
    }//GEN-LAST:event_btnTema4MouseClicked

    private void btnTema5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema5MouseClicked
        PantallaTema5 pantalla = new PantallaTema5();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 7;
    }//GEN-LAST:event_btnTema5MouseClicked

    private void btnEvaluacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEvaluacionMouseClicked
        PantallaEvaluacion pantalla = new PantallaEvaluacion();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 8;
    }//GEN-LAST:event_btnEvaluacionMouseClicked

    private void btnSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseClicked
        PantallaSalida pantalla = new PantallaSalida();
        pantalla.setSize(980, 586);
        pantalla.setLocation(0, 0);

        cambiarContenido(pantalla);
        
        cont = 9;
    }//GEN-LAST:event_btnSalidaMouseClicked

    private void btnInglesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInglesMouseClicked
        //cambiarIdioma(new Locale("en", "US"));
    }//GEN-LAST:event_btnInglesMouseClicked

    private void btnEspanolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEspanolMouseClicked
        //cambiarIdioma(new Locale("es", "ES"));
    }//GEN-LAST:event_btnEspanolMouseClicked

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        cont++;
        switch (cont) {
            case 0:
                PantallaInicio pantalla = new PantallaInicio();
                this.setVisible(false);
                pantalla.setVisible(true);

                break;

            case 1:
                PantallaContenido pantalla1 = new PantallaContenido();
                pantalla1.setSize(980, 586);
                pantalla1.setLocation(0, 0);
                cambiarContenido(pantalla1);

                break;
            case 2:
                PantallaContexto pantalla2 = new PantallaContexto();
                pantalla2.setSize(980, 586);
                pantalla2.setLocation(0, 0);
                cambiarContenido(pantalla2);
                break;
            case 3:
                PantallaTema1 pantalla3 = new PantallaTema1();
                pantalla3.setSize(980, 586);
                pantalla3.setLocation(0, 0);
                cambiarContenido(pantalla3);
                break;
            case 4:
                PantallaTema2 pantalla4 = new PantallaTema2();
                pantalla4.setSize(980, 586);
                pantalla4.setLocation(0, 0);
                cambiarContenido(pantalla4);
                break;

            case 5:
                PantallaTema3 pantalla5 = new PantallaTema3();
                pantalla5.setSize(980, 586);
                pantalla5.setLocation(0, 0);
                cambiarContenido(pantalla5);
                break;

            case 6:
                PantallaTema4 pantalla6 = new PantallaTema4();
                pantalla6.setSize(980, 586);
                pantalla6.setLocation(0, 0);
                cambiarContenido(pantalla6);
                break;

            case 7:
                PantallaTema5 pantalla7 = new PantallaTema5();
                pantalla7.setSize(980, 586);
                pantalla7.setLocation(0, 0);
                cambiarContenido(pantalla7);
                break;

            case 8:
                PantallaEvaluacion pantalla8 = new PantallaEvaluacion();
                pantalla8.setSize(980, 586);
                pantalla8.setLocation(0, 0);
                cambiarContenido(pantalla8);
                break;

            case 9:
                PantallaSalida pantalla9 = new PantallaSalida();
                pantalla9.setSize(980, 586);
                pantalla9.setLocation(0, 0);
                cambiarContenido(pantalla9);

                break;
        }

        if (cont > 9) {
            System.exit(0);
        }
    }//GEN-LAST:event_siguienteMouseClicked


    private void anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorMouseClicked
        cont--;
        switch (cont) {
            case 0:
                PantallaInicio pantalla = new PantallaInicio();
                this.setVisible(false);
                pantalla.setVisible(true);

                break;

            case 1:
                PantallaContenido pantalla1 = new PantallaContenido();
                pantalla1.setSize(980, 586);
                pantalla1.setLocation(0, 0);
                cambiarContenido(pantalla1);

                break;
            case 2:
                PantallaContexto pantalla2 = new PantallaContexto();
                pantalla2.setSize(980, 586);
                pantalla2.setLocation(0, 0);
                cambiarContenido(pantalla2);
                break;
            case 3:
                PantallaTema1 pantalla3 = new PantallaTema1();
                pantalla3.setSize(980, 586);
                pantalla3.setLocation(0, 0);
                cambiarContenido(pantalla3);
                break;
            case 4:
                PantallaTema2 pantalla4 = new PantallaTema2();
                pantalla4.setSize(980, 586);
                pantalla4.setLocation(0, 0);
                cambiarContenido(pantalla4);
                break;

            case 5:
                PantallaTema3 pantalla5 = new PantallaTema3();
                pantalla5.setSize(980, 586);
                pantalla5.setLocation(0, 0);
                cambiarContenido(pantalla5);
                break;

            case 6:
                PantallaTema4 pantalla6 = new PantallaTema4();
                pantalla6.setSize(980, 586);
                pantalla6.setLocation(0, 0);
                cambiarContenido(pantalla6);
                break;

            case 7:
                PantallaTema5 pantalla7 = new PantallaTema5();
                pantalla7.setSize(980, 586);
                pantalla7.setLocation(0, 0);
                cambiarContenido(pantalla7);
                break;

            case 8:
                PantallaEvaluacion pantalla8 = new PantallaEvaluacion();
                pantalla8.setSize(980, 586);
                pantalla8.setLocation(0, 0);
                cambiarContenido(pantalla8);
                break;

            case 9:
                PantallaSalida pantalla9 = new PantallaSalida();
                pantalla9.setSize(980, 586);
                pantalla9.setLocation(0, 0);
                cambiarContenido(pantalla9);

                break;
        }
    }//GEN-LAST:event_anteriorMouseClicked

    public void cambiarContenido(JPanel nuevoContenido) {
        contenido.removeAll();
        contenido.add(nuevoContenido);
        contenido.revalidate();
        contenido.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel anterior;
    private javax.swing.JLabel btnContenido;
    public javax.swing.JLabel btnContexto;
    public javax.swing.JLabel btnEspanol;
    private javax.swing.JLabel btnEvaluacion;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHome;
    public javax.swing.JLabel btnIngles;
    private javax.swing.JLabel btnSalida;
    private javax.swing.JLabel btnTema1;
    private javax.swing.JLabel btnTema2;
    private javax.swing.JLabel btnTema3;
    private javax.swing.JLabel btnTema4;
    private javax.swing.JLabel btnTema5;
    public javax.swing.JPanel contenido;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel menuLateral;
    public javax.swing.JLabel siguiente;
    // End of variables declaration//GEN-END:variables
}
