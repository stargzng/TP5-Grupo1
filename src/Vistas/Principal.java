package Vistas;

import Entidades.DirectorioTelefonico;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    private static final DirectorioTelefonico directorio = new DirectorioTelefonico();
    static final ArrayList<String> ciudades = new ArrayList<>();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        agregarClienteJMenuItem = new javax.swing.JMenuItem();
        buscarClienteJMenuItem = new javax.swing.JMenuItem();
        borrarClienteJMenuItem = new javax.swing.JMenuItem();
        jMenuDirectorio = new javax.swing.JMenu();
        buscarPorCiudadMenuItem = new javax.swing.JMenuItem();
        buscarTelefonoApellidoMenuItem = new javax.swing.JMenuItem();
        jMenuCiudades = new javax.swing.JMenu();
        agregarCiudadjMenuItem = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jMenuClientes.setText("Clientes");

        agregarClienteJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        agregarClienteJMenuItem.setText("Agregar Cliente");
        agregarClienteJMenuItem.addActionListener(this::agregarClienteJMenuItemActionPerformed);
        jMenuClientes.add(agregarClienteJMenuItem);

        buscarClienteJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        buscarClienteJMenuItem.setText("Buscar Cliente");
        jMenuClientes.add(buscarClienteJMenuItem);

        borrarClienteJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        borrarClienteJMenuItem.setText("Borrar Cliente");
        borrarClienteJMenuItem.addActionListener(this::borrarClienteJMenuItemActionPerformed);
        jMenuClientes.add(borrarClienteJMenuItem);

        jMenuBar.add(jMenuClientes);

        jMenuDirectorio.setText("Directorio");

        buscarPorCiudadMenuItem.setText("Buscar Clientes por Ciudad");
        jMenuDirectorio.add(buscarPorCiudadMenuItem);

        buscarTelefonoApellidoMenuItem.setText("Buscar Telefono por Apellido");
        jMenuDirectorio.add(buscarTelefonoApellidoMenuItem);

        jMenuBar.add(jMenuDirectorio);

        jMenuCiudades.setText("Ciudades");

        agregarCiudadjMenuItem.setText("Agregar Ciudad");
        agregarCiudadjMenuItem.addActionListener(this::agregarCiudadjMenuItemActionPerformed);
        jMenuCiudades.add(agregarCiudadjMenuItem);

        jMenuBar.add(jMenuCiudades);

        jMenuSalir.setText("Salir");

        jMenuItemCerrar.setText("Salir del programa");
        jMenuItemCerrar.addActionListener(this::jMenuItemCerrarActionPerformed);
        jMenuSalir.add(jMenuItemCerrar);

        jMenuBar.add(jMenuSalir);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarClienteJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarClienteJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarClienteJMenuItemActionPerformed

    private void jMenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemCerrarActionPerformed

    private void agregarCiudadjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCiudadjMenuItemActionPerformed
        frmAgregarCiudad va  = new frmAgregarCiudad();
        Escritorio.add(va);
        va.setVisible(true);
    }//GEN-LAST:event_agregarCiudadjMenuItemActionPerformed

    private void agregarClienteJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarClienteJMenuItemActionPerformed
        // TODO add your handling code here:
        frmAgregarCliente agregarCliente = new frmAgregarCliente();
        Escritorio.add(agregarCliente);
        agregarCliente.setVisible(true);
    }//GEN-LAST:event_agregarClienteJMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem agregarCiudadjMenuItem;
    private javax.swing.JMenuItem agregarClienteJMenuItem;
    private javax.swing.JMenuItem borrarClienteJMenuItem;
    private javax.swing.JMenuItem buscarClienteJMenuItem;
    private javax.swing.JMenuItem buscarPorCiudadMenuItem;
    private javax.swing.JMenuItem buscarTelefonoApellidoMenuItem;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCiudades;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuDirectorio;
    private javax.swing.JMenuItem jMenuItemCerrar;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
