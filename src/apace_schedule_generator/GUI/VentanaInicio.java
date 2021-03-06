package apace_schedule_generator.GUI;






public class VentanaInicio extends javax.swing.JFrame {
   
    
    public VentanaInicio() {
        this.initComponents();
        this.configVentana();
    
    }
    
    private void configVentana(){
     this.setResizable(false); 
     this.setLocationRelativeTo(null);
     this.setTitle("APACE Generador de Horarios");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPanel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCursoA = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableCursoB = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableCursoC = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableCursoD = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableCursoE = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableCursoF = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableCursoG = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemRegAsignaturas = new javax.swing.JMenuItem();
        itemRegProfesores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCursoA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(A)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoA.setToolTipText("");
        jTableCursoA.setRowHeight(35);
        jTableCursoA.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableCursoAAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTableCursoA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase A", jPanel3);

        jTableCursoB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(B)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoB.setToolTipText("");
        jTableCursoB.setRowHeight(35);
        jScrollPane8.setViewportView(jTableCursoB);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase B", jPanel4);

        jTableCursoC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(C)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoC.setToolTipText("");
        jTableCursoC.setRowHeight(35);
        jScrollPane9.setViewportView(jTableCursoC);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase C", jPanel5);

        jTableCursoD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(D)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoD.setToolTipText("");
        jTableCursoD.setRowHeight(35);
        jScrollPane10.setViewportView(jTableCursoD);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase D", jPanel6);

        jTableCursoE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(E)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoE.setToolTipText("");
        jTableCursoE.setRowHeight(35);
        jScrollPane11.setViewportView(jTableCursoE);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase E", jPanel7);

        jTableCursoF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(F)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoF.setToolTipText("");
        jTableCursoF.setRowHeight(35);
        jScrollPane12.setViewportView(jTableCursoF);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase F", jPanel8);

        jTableCursoG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:30-09:30", null, null, null, null, null},
                {"09:40-10:40", null, null, null, null, null},
                {"10:50-11:50", null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null},
                {"13:10-14:10", null, null, null, null, null},
                {"14:30-15:30", null, null, null, null, null},
                {"15:40-16:40", null, null, null, null, null},
                {"16:50-17:50", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:10-20:10", null, null, null, null, null}
            },
            new String [] {
                "Horas(G)", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jTableCursoG.setToolTipText("");
        jTableCursoG.setRowHeight(35);
        jScrollPane13.setViewportView(jTableCursoG);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("Clase G", jPanel9);

        jLabel2.setText("Nivel Académico");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo", "Tercero", "Cuarto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPanel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setText("Archivo");

        jMenuItem1.setText("Imprimir");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Registro");

        itemRegAsignaturas.setText("Registrar Asignaturas");
        itemRegAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegAsignaturasActionPerformed(evt);
            }
        });
        jMenu6.add(itemRegAsignaturas);

        itemRegProfesores.setText("Registrar Profesores");
        itemRegProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegProfesoresActionPerformed(evt);
            }
        });
        jMenu6.add(itemRegProfesores);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    
    private void jTableCursoAAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableCursoAAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCursoAAncestorAdded

    //MENU**********
    //REGISTRO -> ASIGNATURA O PROFESOR
    
    private void itemRegAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegAsignaturasActionPerformed
        RegistrarAsignaturas abrir = new RegistrarAsignaturas();
        abrir.setVisible(true);
    }//GEN-LAST:event_itemRegAsignaturasActionPerformed

    private void itemRegProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegProfesoresActionPerformed
        RegistrarProfesor abrir = new RegistrarProfesor();
        abrir.setVisible(true);
    }//GEN-LAST:event_itemRegProfesoresActionPerformed

    //
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemRegAsignaturas;
    private javax.swing.JMenuItem itemRegProfesores;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPanel;
    public static javax.swing.JTable jTableCursoA;
    private javax.swing.JTable jTableCursoB;
    private javax.swing.JTable jTableCursoC;
    private javax.swing.JTable jTableCursoD;
    private javax.swing.JTable jTableCursoE;
    private javax.swing.JTable jTableCursoF;
    private javax.swing.JTable jTableCursoG;
    // End of variables declaration//GEN-END:variables
}
