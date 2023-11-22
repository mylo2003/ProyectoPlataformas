package proyectoplataformas;

import java.util.Locale;
import java.util.ResourceBundle;

public class PantallaInicio extends javax.swing.JFrame {
     
    int xMouse, yMouse;
    
    public PantallaInicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_inicio = new javax.swing.JLabel();
        creadores = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        profesor = new javax.swing.JLabel();
        carrera = new javax.swing.JLabel();
        logoUni = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnIngles = new javax.swing.JLabel();
        btnEspanol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(101, 3, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 626));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 626));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 626));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        titulo_inicio.setFont(new java.awt.Font("JetBrains Mono", 0, 60)); // NOI18N
        titulo_inicio.setForeground(new java.awt.Color(255, 175, 94));
        titulo_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo_inicio.setText("I/O Systems");
        titulo_inicio.setMaximumSize(new java.awt.Dimension(552, 80));
        titulo_inicio.setMinimumSize(new java.awt.Dimension(552, 80));
        titulo_inicio.setPreferredSize(new java.awt.Dimension(552, 80));

        creadores.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        creadores.setForeground(new java.awt.Color(255, 175, 94));
        creadores.setText("Created by:");
        creadores.setMaximumSize(new java.awt.Dimension(552, 33));
        creadores.setMinimumSize(new java.awt.Dimension(552, 33));
        creadores.setPreferredSize(new java.awt.Dimension(552, 33));

        nombre1.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 175, 94));
        nombre1.setText("Camilo Mora &");
        nombre1.setMaximumSize(new java.awt.Dimension(552, 33));
        nombre1.setMinimumSize(new java.awt.Dimension(552, 33));
        nombre1.setPreferredSize(new java.awt.Dimension(552, 33));

        nombre2.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        nombre2.setForeground(new java.awt.Color(255, 175, 94));
        nombre2.setText("Johan Jimenez");
        nombre2.setMaximumSize(new java.awt.Dimension(552, 33));
        nombre2.setMinimumSize(new java.awt.Dimension(552, 33));
        nombre2.setPreferredSize(new java.awt.Dimension(552, 33));

        profesor.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        profesor.setForeground(new java.awt.Color(255, 175, 94));
        profesor.setText("Engineer Eduardo Rueda");
        profesor.setMaximumSize(new java.awt.Dimension(552, 33));
        profesor.setMinimumSize(new java.awt.Dimension(552, 33));
        profesor.setPreferredSize(new java.awt.Dimension(552, 33));

        carrera.setFont(new java.awt.Font("JetBrains Mono", 0, 30)); // NOI18N
        carrera.setForeground(new java.awt.Color(255, 175, 94));
        carrera.setText("Systems Engineering - 2023");
        carrera.setMaximumSize(new java.awt.Dimension(552, 40));
        carrera.setMinimumSize(new java.awt.Dimension(552, 40));
        carrera.setPreferredSize(new java.awt.Dimension(552, 40));

        logoUni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoUni.png"))); // NOI18N

        header.setBackground(new java.awt.Color(101, 3, 29));
        header.setMaximumSize(new java.awt.Dimension(1200, 40));
        header.setPreferredSize(new java.awt.Dimension(1200, 40));
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1154, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(creadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo_inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(carrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(profesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIniciar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoUni, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIngles)
                .addGap(18, 18, 18)
                .addComponent(btnEspanol)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngles)
                    .addComponent(btnEspanol))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoUni, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(creadores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciar)
                            .addComponent(btnSalir))
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void cambiarIdioma(Locale locale) {
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);

        titulo_inicio.setText(texto.getString("titulo_inicio"));
        carrera.setText(texto.getString("carrera"));
        profesor.setText(texto.getString("profesor"));
        creadores.setText(texto.getString("creadores"));
        nombre1.setText(texto.getString("nombre1"));
    }
    
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        //exit.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        this.setVisible(false);
        PantallaMenu pantalla = new PantallaMenu();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void btnInglesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInglesMouseClicked
        cambiarIdioma(new Locale("en", "US")); 
    }//GEN-LAST:event_btnInglesMouseClicked

    private void btnEspanolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEspanolMouseClicked
        cambiarIdioma(new Locale("es", "ES"));
    }//GEN-LAST:event_btnEspanolMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEspanol;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnIngles;
    private javax.swing.JLabel btnIniciar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel carrera;
    private javax.swing.JLabel creadores;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoUni;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel profesor;
    private javax.swing.JLabel titulo_inicio;
    // End of variables declaration//GEN-END:variables
}
