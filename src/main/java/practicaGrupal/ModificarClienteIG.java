/****************************************
 * NOMBRE: Adrián Sanz Contreras        *
 * DNI: 49097240-Z                      *
 * Nº EXP: 145                          *
 *                                      *
 * NOMBRE: Alfonso Santamaría Rodríguez *
 * DNI: 49095131-K                      *   
 * Nº EXP: 63                           *
 *                                      *
 * NOMBRE: Fco Javier Pasamontes Moreno *
 * DNI: 47516684-H                      *
 * Nº EXP: 153                          *
 *                                      *
 * 2º GRADO EN INGERNIERÍA DEL SOFTWARE *
 * CURSO: 2011-2012                     *
 ****************************************/
/*
 * ModificarClienteIG.java
 *
 * Created on 10-dic-2011, 13:32:04
 */
package practicaGrupal;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ModificarClienteIG extends javax.swing.JDialog {
    private ArrayList<Cliente> misClientes = new ArrayList<Cliente>();
    private int pos;

    /** Creates new form ModificarClienteIG */
    public ModificarClienteIG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlDireccion = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jtfTelefono = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar datos del cliente");

        jlDireccion.setText("Direccion");

        jlDni.setText("DNI");

        jlTelefono.setText("Telefono");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jlNombre.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addGap(51, 51, 51)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jbModificar)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jbModificar)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        //Creamos un nuevo objeto de la clase proveedor
        //y lo introducimos en la misma posicion en la que estaba, previo borrado
        //del objeto sin modificar
        this.misClientes.remove(this.pos);

        try {
            this.misClientes.add(this.pos, new Cliente(this.jtfNombre.getText(),
                    this.jtfDni.getText(),
                    this.jtfDireccion.getText(),
                    Long.parseLong(this.jtfTelefono.getText())));
                    this.setVisible(false);
        } catch (Exception ex) {
            String problema = new String();

            if (this.jtfNombre.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir un nombre.\n";
            }
            if (this.jtfDni.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir un dni.\n";
            }
            if (this.jtfDireccion.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir una dirección.\n";
            }
            if (this.jtfTelefono.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir un teléfono.\n";
            }
        }



    }//GEN-LAST:event_jbModificarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ModificarClienteIG dialog = new ModificarClienteIG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Cliente> getMisClientes() {
        return misClientes;
    }

    public void setMisClientes(ArrayList<Cliente> misClientes) {
        this.misClientes = misClientes;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public void cargarDatosEnPaneles(){
        this.jtfNombre.setText(this.misClientes.get(this.pos).getNombre());
        this.jtfDni.setText(this.misClientes.get(this.pos).getDni());
        this.jtfDireccion.setText(this.misClientes.get(this.pos).getDireccion());
        this.jtfTelefono.setText(Long.toString(this.misClientes.get(this.pos).getTelefono()));
    }

}