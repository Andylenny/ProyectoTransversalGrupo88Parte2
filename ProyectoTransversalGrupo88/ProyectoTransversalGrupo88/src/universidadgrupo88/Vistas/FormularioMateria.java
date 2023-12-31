/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo88.Vistas;

import javax.swing.JOptionPane;
import universidad.AccesoAdatos.AlumnoData;
import universidad.AccesoAdatos.MateriaData;
import universidad.Entidades.Alumnos;
import universidad.Entidades.Materia;

/**
 *
 * @author Lourdes
 */
public class FormularioMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioMateria
     */
    public FormularioMateria() {
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
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAño = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materia");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addComponent(jrEstado)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(8, 8, 8))
                            .addComponent(jbBuscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addComponent(jrEstado))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbEliminar)
                        .addComponent(jbGuardar)
                        .addComponent(jbSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // buscar
        // Realiza la búsqueda del alumno por Id de la materia
        try {
            int codigo = Integer.parseInt(jtCodigo.getText());

            MateriaData materiaEncontrada = new MateriaData();

            Materia materia = materiaEncontrada.buscarMateria(codigo);
            if (materia != null) {
                // Si se encuentra el alumno, muestra su información en los campos de texto
                jtCodigo.setText(String.valueOf(materia.getIdMateria()));
                jtNombre.setText(materia.getNombre());
                jtAño.setText(String.valueOf(materia.getAnioMateria()));
                jrEstado.setSelected(materia.isActivo());

            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID válido");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Eliminar
        //Primero se busca el id de la materia para luego eliminar
        try {
            int idMateria = Integer.parseInt(jtCodigo.getText());

            MateriaData materiaEncontrado = new MateriaData();
            Materia materia = materiaEncontrado.buscarMateria(idMateria);

            if (materia != null) {
                // Si se encuentra el alumno, elimínalo
                materiaEncontrado.eliminarMateria(materia);
                JOptionPane.showMessageDialog(this, "Materia eliminada");
            } else {
                // Si no se encuentra el alumno, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Materia no encontrado");
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID válido");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        activarCampos();
        limpiar();
        jtCodigo.requestFocus();
        jtNombre.setEnabled(true);
        jtAño.setEnabled(true);
        jrEstado.setEnabled(true);
        jbBuscar.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbSalir.setEnabled(true);
        jbNuevo.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        try{
        int codigo = Integer.parseInt(jtCodigo.getText());
        String nombre = jtNombre.getText();
        int año = Integer.parseInt(jtAño.getText());
        if (nombre.isEmpty() ) {
                //VALIDAR CAMPOS

                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }
        boolean estado = jrEstado.isEnabled();

        Materia materia = new Materia(codigo, nombre, año, estado);

        MateriaData mat = new MateriaData();
        mat.guardarMateria(materia);
       
        
        }catch (NumberFormatException n) {
            //VALIDAR CODIGO
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero válido ");
        }catch (NullPointerException e){
            //VALIDAR AÑO
            JOptionPane.showMessageDialog(this, "Debe ingresar una fecha");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtAño;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
 private void desactivarCampos() {
        jtCodigo.setEnabled(false);
        jtNombre.setEnabled(false);
        jtAño.setEnabled(false);
        jrEstado.isEnabled();

    }

    private void activarCampos() {
        jtCodigo.setEnabled(true);
        jtNombre.setEnabled(true);
        jtAño.setEnabled(true);
        jrEstado.isEnabled();

    }

    private void limpiar() {

        jtCodigo.setText("");
        jtNombre.setText("");
        jtAño.setText("");
        jrEstado.isEnabled();

    }

}
