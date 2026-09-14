package Vistas;

import Entidades.Contacto;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class frmClientesporCiudad extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public frmClientesporCiudad() {
        initComponents();
        cargarComboBox();
        cabeceras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClienporCiudad = new javax.swing.JLabel();
        lblCiudades = new javax.swing.JLabel();
        cmbCiudades = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatosCliente = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        lblClienporCiudad.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblClienporCiudad.setText("Buscar Clientes de Directorio por Ciudad");

        lblCiudades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCiudades.setText("Ciudades:");

        cmbCiudades.addActionListener(this::cmbCiudadesActionPerformed);

        jtDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jtDatosCliente);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCiudades)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblClienporCiudad)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblClienporCiudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCiudades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadesActionPerformed
        cargarTabla();
        
    }//GEN-LAST:event_cmbCiudadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCiudades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDatosCliente;
    private javax.swing.JLabel lblCiudades;
    private javax.swing.JLabel lblClienporCiudad;
    // End of variables declaration//GEN-END:variables

    private void cabeceras() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono");

        jtDatosCliente.setModel(modelo);
    }

    private void cargarComboBox() {

        for (String aux : Principal.ciudades) {
            cmbCiudades.addItem(aux);
        }

    }

    private void cargarTabla() {

        String ciudad = (String) cmbCiudades.getSelectedItem();

        for (Map.Entry<Long, Contacto> aux : Principal.directorio.directorio.entrySet()) {

            Long telefono = aux.getKey();
            Contacto contacto = aux.getValue();

            if (ciudad.equals(contacto.getCiudad())) {

                String DNI = Integer.toString(contacto.getDni());
                String apellido = contacto.getApellido();
                String nombre = contacto.getNombre();
                String dir = contacto.getDireccion();
                String city = contacto.getCiudad();
                String tel = Long.toString(telefono);
                
                modelo.addRow(new String[]{DNI, apellido, nombre, dir, city, tel});
                
            }

        }
    }

}
