package Vista;

import Controlador.Controlador;

public class VistaTablero extends javax.swing.JFrame {

    public VistaTablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ajedrez");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c00 = new javax.swing.JButton();
        c01 = new javax.swing.JButton();
        c02 = new javax.swing.JButton();
        c03 = new javax.swing.JButton();
        c04 = new javax.swing.JButton();
        c05 = new javax.swing.JButton();
        c06 = new javax.swing.JButton();
        c07 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c30 = new javax.swing.JButton();
        c31 = new javax.swing.JButton();
        c32 = new javax.swing.JButton();
        c33 = new javax.swing.JButton();
        c34 = new javax.swing.JButton();
        c35 = new javax.swing.JButton();
        c36 = new javax.swing.JButton();
        c37 = new javax.swing.JButton();
        c40 = new javax.swing.JButton();
        c41 = new javax.swing.JButton();
        c42 = new javax.swing.JButton();
        c43 = new javax.swing.JButton();
        c44 = new javax.swing.JButton();
        c45 = new javax.swing.JButton();
        c46 = new javax.swing.JButton();
        c47 = new javax.swing.JButton();
        c50 = new javax.swing.JButton();
        c51 = new javax.swing.JButton();
        c52 = new javax.swing.JButton();
        c53 = new javax.swing.JButton();
        c54 = new javax.swing.JButton();
        c55 = new javax.swing.JButton();
        c56 = new javax.swing.JButton();
        c57 = new javax.swing.JButton();
        c60 = new javax.swing.JButton();
        c61 = new javax.swing.JButton();
        c62 = new javax.swing.JButton();
        c63 = new javax.swing.JButton();
        c64 = new javax.swing.JButton();
        c65 = new javax.swing.JButton();
        c66 = new javax.swing.JButton();
        c67 = new javax.swing.JButton();
        c70 = new javax.swing.JButton();
        c71 = new javax.swing.JButton();
        c72 = new javax.swing.JButton();
        c73 = new javax.swing.JButton();
        c74 = new javax.swing.JButton();
        c75 = new javax.swing.JButton();
        c76 = new javax.swing.JButton();
        c77 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(8, 8));

        c00.setBackground(new java.awt.Color(255, 255, 255));
        c00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TorreNegra.png"))); // NOI18N
        c00.setToolTipText("");
        c00.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c00);

        c01.setBackground(new java.awt.Color(51, 51, 51));
        c01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CaballoNegro.png"))); // NOI18N
        c01.setToolTipText("");
        c01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c01);

        c02.setBackground(new java.awt.Color(255, 255, 255));
        c02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlfilNegro.png"))); // NOI18N
        c02.setToolTipText("");
        c02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c02);

        c03.setBackground(new java.awt.Color(51, 51, 51));
        c03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReinaNegra.png"))); // NOI18N
        c03.setToolTipText("");
        c03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c03);

        c04.setBackground(new java.awt.Color(255, 255, 255));
        c04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReyNegro.png"))); // NOI18N
        c04.setToolTipText("");
        c04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c04);

        c05.setBackground(new java.awt.Color(51, 51, 51));
        c05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlfilNegro.png"))); // NOI18N
        c05.setToolTipText("");
        c05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c05);

        c06.setBackground(new java.awt.Color(255, 255, 255));
        c06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CaballoNegro.png"))); // NOI18N
        c06.setToolTipText("");
        c06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c06);

        c07.setBackground(new java.awt.Color(51, 51, 51));
        c07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TorreNegra.png"))); // NOI18N
        c07.setToolTipText("");
        c07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c07);

        c10.setBackground(new java.awt.Color(51, 51, 51));
        c10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c10.setToolTipText("");
        c10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c10);

        c11.setBackground(new java.awt.Color(255, 255, 255));
        c11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c11.setToolTipText("");
        c11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c11);

        c12.setBackground(new java.awt.Color(51, 51, 51));
        c12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c12.setToolTipText("");
        c12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c12);

        c13.setBackground(new java.awt.Color(255, 255, 255));
        c13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c13.setToolTipText("");
        c13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c13);

        c14.setBackground(new java.awt.Color(51, 51, 51));
        c14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c14.setToolTipText("");
        c14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c14);

        c15.setBackground(new java.awt.Color(255, 255, 255));
        c15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c15.setToolTipText("");
        c15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c15);

        c16.setBackground(new java.awt.Color(51, 51, 51));
        c16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c16.setToolTipText("");
        c16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c16);

        c17.setBackground(new java.awt.Color(255, 255, 255));
        c17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha PeonNegra.png"))); // NOI18N
        c17.setToolTipText("");
        c17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c17);

        c20.setBackground(new java.awt.Color(255, 255, 255));
        c20.setToolTipText("");
        c20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c20);

        c21.setBackground(new java.awt.Color(51, 51, 51));
        c21.setToolTipText("");
        c21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c21);

        c22.setBackground(new java.awt.Color(255, 255, 255));
        c22.setToolTipText("");
        c22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c22);

        c23.setBackground(new java.awt.Color(51, 51, 51));
        c23.setToolTipText("");
        c23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c23);

        c24.setBackground(new java.awt.Color(255, 255, 255));
        c24.setToolTipText("");
        c24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c24);

        c25.setBackground(new java.awt.Color(51, 51, 51));
        c25.setToolTipText("");
        c25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c25);

        c26.setBackground(new java.awt.Color(255, 255, 255));
        c26.setToolTipText("");
        c26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c26);

        c27.setBackground(new java.awt.Color(51, 51, 51));
        c27.setToolTipText("");
        c27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c27);

        c30.setBackground(new java.awt.Color(51, 51, 51));
        c30.setToolTipText("");
        c30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c30);

        c31.setBackground(new java.awt.Color(255, 255, 255));
        c31.setToolTipText("");
        c31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c31);

        c32.setBackground(new java.awt.Color(51, 51, 51));
        c32.setToolTipText("");
        c32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c32);

        c33.setBackground(new java.awt.Color(255, 255, 255));
        c33.setToolTipText("");
        c33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c33);

        c34.setBackground(new java.awt.Color(51, 51, 51));
        c34.setToolTipText("");
        c34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c34);

        c35.setBackground(new java.awt.Color(255, 255, 255));
        c35.setToolTipText("");
        c35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c35);

        c36.setBackground(new java.awt.Color(51, 51, 51));
        c36.setToolTipText("");
        c36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c36);

        c37.setBackground(new java.awt.Color(255, 255, 255));
        c37.setToolTipText("");
        c37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c37);

        c40.setBackground(new java.awt.Color(255, 255, 255));
        c40.setToolTipText("");
        c40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c40);

        c41.setBackground(new java.awt.Color(51, 51, 51));
        c41.setToolTipText("");
        c41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c41);

        c42.setBackground(new java.awt.Color(255, 255, 255));
        c42.setToolTipText("");
        c42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c42);

        c43.setBackground(new java.awt.Color(51, 51, 51));
        c43.setToolTipText("");
        c43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c43);

        c44.setBackground(new java.awt.Color(255, 255, 255));
        c44.setToolTipText("");
        c44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c44);

        c45.setBackground(new java.awt.Color(51, 51, 51));
        c45.setToolTipText("");
        c45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c45);

        c46.setBackground(new java.awt.Color(255, 255, 255));
        c46.setToolTipText("");
        c46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c46);

        c47.setBackground(new java.awt.Color(51, 51, 51));
        c47.setToolTipText("");
        c47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c47);

        c50.setBackground(new java.awt.Color(51, 51, 51));
        c50.setToolTipText("");
        c50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c50);

        c51.setBackground(new java.awt.Color(255, 255, 255));
        c51.setToolTipText("");
        c51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c51);

        c52.setBackground(new java.awt.Color(51, 51, 51));
        c52.setToolTipText("");
        c52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c52);

        c53.setBackground(new java.awt.Color(255, 255, 255));
        c53.setToolTipText("");
        c53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c53);

        c54.setBackground(new java.awt.Color(51, 51, 51));
        c54.setToolTipText("");
        c54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c54);

        c55.setBackground(new java.awt.Color(255, 255, 255));
        c55.setToolTipText("");
        c55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c55);

        c56.setBackground(new java.awt.Color(51, 51, 51));
        c56.setToolTipText("");
        c56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c56);

        c57.setBackground(new java.awt.Color(255, 255, 255));
        c57.setToolTipText("");
        c57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c57);

        c60.setBackground(new java.awt.Color(255, 255, 255));
        c60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c60.setToolTipText("");
        c60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c60);

        c61.setBackground(new java.awt.Color(51, 51, 51));
        c61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c61.setToolTipText("");
        c61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c61);

        c62.setBackground(new java.awt.Color(255, 255, 255));
        c62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c62.setToolTipText("");
        c62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c62);

        c63.setBackground(new java.awt.Color(51, 51, 51));
        c63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c63.setToolTipText("");
        c63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c63);

        c64.setBackground(new java.awt.Color(255, 255, 255));
        c64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c64.setToolTipText("");
        c64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c64);

        c65.setBackground(new java.awt.Color(51, 51, 51));
        c65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c65.setToolTipText("");
        c65.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c65);

        c66.setBackground(new java.awt.Color(255, 255, 255));
        c66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c66.setToolTipText("");
        c66.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c66);

        c67.setBackground(new java.awt.Color(51, 51, 51));
        c67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha Peon.png"))); // NOI18N
        c67.setToolTipText("");
        c67.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c67);

        c70.setBackground(new java.awt.Color(51, 51, 51));
        c70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Torre.png"))); // NOI18N
        c70.setToolTipText("");
        c70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c70);

        c71.setBackground(new java.awt.Color(255, 255, 255));
        c71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caballo.png"))); // NOI18N
        c71.setToolTipText("");
        c71.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c71);

        c72.setBackground(new java.awt.Color(51, 51, 51));
        c72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alfil.png"))); // NOI18N
        c72.setToolTipText("");
        c72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c72);

        c73.setBackground(new java.awt.Color(255, 255, 255));
        c73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reina.png"))); // NOI18N
        c73.setToolTipText("");
        c73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c73);

        c74.setBackground(new java.awt.Color(51, 51, 51));
        c74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rey.png"))); // NOI18N
        c74.setToolTipText("");
        c74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c74);

        c75.setBackground(new java.awt.Color(255, 255, 255));
        c75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alfil.png"))); // NOI18N
        c75.setToolTipText("");
        c75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c75);

        c76.setBackground(new java.awt.Color(51, 51, 51));
        c76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caballo.png"))); // NOI18N
        c76.setToolTipText("");
        c76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c76);

        c77.setBackground(new java.awt.Color(255, 255, 255));
        c77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Torre.png"))); // NOI18N
        c77.setToolTipText("");
        c77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c77);

        jMenu1.setText("Restart");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Aceptar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");

        jMenuItem2.setText("Aceptar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        Controlador controlador = new Controlador();
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTablero().setVisible(true);
            }
        });
    }

    public static javax.swing.JButton c00;
    public static javax.swing.JButton c01;
    public static javax.swing.JButton c02;
    public static javax.swing.JButton c03;
    public static javax.swing.JButton c04;
    public static javax.swing.JButton c05;
    public static javax.swing.JButton c06;
    public static javax.swing.JButton c07;
    public static javax.swing.JButton c10;
    public static javax.swing.JButton c11;
    public static javax.swing.JButton c12;
    public static javax.swing.JButton c13;
    public static javax.swing.JButton c14;
    public static javax.swing.JButton c15;
    public static javax.swing.JButton c16;
    public static javax.swing.JButton c17;
    public static javax.swing.JButton c20;
    public static javax.swing.JButton c21;
    public static javax.swing.JButton c22;
    public static javax.swing.JButton c23;
    public static javax.swing.JButton c24;
    public static javax.swing.JButton c25;
    public static javax.swing.JButton c26;
    public static javax.swing.JButton c27;
    public static javax.swing.JButton c30;
    public static javax.swing.JButton c31;
    public static javax.swing.JButton c32;
    public static javax.swing.JButton c33;
    public static javax.swing.JButton c34;
    public static javax.swing.JButton c35;
    public static javax.swing.JButton c36;
    public static javax.swing.JButton c37;
    public static javax.swing.JButton c40;
    public static javax.swing.JButton c41;
    public static javax.swing.JButton c42;
    public static javax.swing.JButton c43;
    public static javax.swing.JButton c44;
    public static javax.swing.JButton c45;
    public static javax.swing.JButton c46;
    public static javax.swing.JButton c47;
    public static javax.swing.JButton c50;
    public static javax.swing.JButton c51;
    public static javax.swing.JButton c52;
    public static javax.swing.JButton c53;
    public static javax.swing.JButton c54;
    public static javax.swing.JButton c55;
    public static javax.swing.JButton c56;
    public static javax.swing.JButton c57;
    public static javax.swing.JButton c60;
    public static javax.swing.JButton c61;
    public static javax.swing.JButton c62;
    public static javax.swing.JButton c63;
    public static javax.swing.JButton c64;
    public static javax.swing.JButton c65;
    public static javax.swing.JButton c66;
    public static javax.swing.JButton c67;
    public static javax.swing.JButton c70;
    public static javax.swing.JButton c71;
    public static javax.swing.JButton c72;
    public static javax.swing.JButton c73;
    public static javax.swing.JButton c74;
    public static javax.swing.JButton c75;
    public static javax.swing.JButton c76;
    public static javax.swing.JButton c77;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
}