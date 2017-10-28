package apace_schedule_generator.GUI;
import Archivos.Guardar;
import Archivos.GuardarAsignatura;
import apace_schedule_generator.Asignatura;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistrarAsignaturas extends javax.swing.JFrame {

    private final ArrayList<Asignatura> asignaturas;
    
    public RegistrarAsignaturas() {
        this.asignaturas=new ArrayList<Asignatura>();
        this.initComponents();
        this.configVentana();
    }
    
    //Configuración de la ventana.
    private void configVentana(){
     this.setResizable(false);
     this.setLocationRelativeTo(null);
     this.setTitle("Registrar Asignaturas");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        btnRegistrarAsignatura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAsignaturas = new javax.swing.JTable();
        nivel1 = new javax.swing.JRadioButton();
        nivel2 = new javax.swing.JRadioButton();
        nivel3 = new javax.swing.JRadioButton();
        nivel4 = new javax.swing.JRadioButton();
        menuRegAsignaturas = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Horas");

        btnRegistrarAsignatura.setText("Registrar");
        btnRegistrarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAsignaturaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nivel Academico");

        tablaAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asignatura", "Horas", "Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaAsignaturas);
        if (tablaAsignaturas.getColumnModel().getColumnCount() > 0) {
            tablaAsignaturas.getColumnModel().getColumn(0).setResizable(false);
            tablaAsignaturas.getColumnModel().getColumn(1).setResizable(false);
            tablaAsignaturas.getColumnModel().getColumn(2).setResizable(false);
            tablaAsignaturas.getColumnModel().getColumn(3).setResizable(false);
            tablaAsignaturas.getColumnModel().getColumn(4).setResizable(false);
            tablaAsignaturas.getColumnModel().getColumn(5).setResizable(false);
        }

        nivel1.setText("1");

        nivel2.setText("2");

        nivel3.setText("3");

        nivel4.setText("4");

        jMenu1.setText("Archivo");

        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuRegAsignaturas.add(jMenu1);

        setJMenuBar(menuRegAsignaturas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtHoras)))
                            .addComponent(jLabel3)
                            .addComponent(nivel1)
                            .addComponent(nivel2)
                            .addComponent(nivel3)
                            .addComponent(nivel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrarAsignatura)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(nivel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nivel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarAsignatura)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAsignaturaActionPerformed
        //Visualización!
        if (evt.getSource()==this.btnRegistrarAsignatura){
        Asignatura asignatura=new Asignatura(this.txtNombre.getText().trim(),Integer.valueOf(this.txtHoras.getText().trim()),this.nivel1.isSelected(),this.nivel2.isSelected(),this.nivel3.isSelected(),this.nivel4.isSelected());
        this.asignaturas.add(asignatura);
        this.mostrarAsignaturas();
        this.limpiar();
        }
    }//GEN-LAST:event_btnRegistrarAsignaturaActionPerformed
    
    //Guardar Contenido JTable ->Archivo Excel TEST TEST!!!
    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
          if (evt.getSource()==this.menuGuardar){
            JOptionPane.showMessageDialog(null, "Registro Guardado", "Información", JOptionPane.INFORMATION_MESSAGE);
            Guardar guardar = new Guardar(this.tablaAsignaturas);
            guardar.Guardartabla();
        }
        
    }//GEN-LAST:event_menuGuardarActionPerformed
     
    //Mostrar en TablaAsignaturas ->El registro de asignaturas 
    //Actualización.
    public void mostrarAsignaturas (){
    Object [][] showAsignaturas=new Object [this.asignaturas.size()][6];
        for (int i = 0; i < this.asignaturas.size(); i++) {
            showAsignaturas[i][0]=this.asignaturas.get(i).getNombre().trim();
            showAsignaturas[i][1]=String.valueOf(this.asignaturas.get(i).getHora()).trim();
            showAsignaturas[i][2]=this.asignaturas.get(i).isNivel1();
            showAsignaturas[i][3]=this.asignaturas.get(i).isNivel2();
            showAsignaturas[i][4]=this.asignaturas.get(i).isNivel3();
            showAsignaturas[i][5]=this.asignaturas.get(i).isNivel4();
        }
        this.tablaAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
            showAsignaturas,
            new String [] {
                "Asignatura", "Horas", "Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4"
            })
                
        );
    }
    //Limpiar TexfField y RadioButton del registro. 
    public void limpiar(){
        this.txtNombre.setText("");
        this.txtHoras.setText("");
        this.nivel1.setSelected(false);
        this.nivel2.setSelected(false);
        this.nivel3.setSelected(false);
        this.nivel4.setSelected(false);
    }
   
    
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
            java.util.logging.Logger.getLogger(RegistrarAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new RegistrarAsignaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAsignatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuBar menuRegAsignaturas;
    private javax.swing.JRadioButton nivel1;
    private javax.swing.JRadioButton nivel2;
    private javax.swing.JRadioButton nivel3;
    private javax.swing.JRadioButton nivel4;
    private javax.swing.JTable tablaAsignaturas;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
