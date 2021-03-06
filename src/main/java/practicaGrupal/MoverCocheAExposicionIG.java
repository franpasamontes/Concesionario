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
 * MoverCocheAExposicionIG.java
 *
 * Created on 13-dic-2011, 11:46:50
 */
package practicaGrupal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MoverCocheAExposicionIG extends javax.swing.JDialog {

    private ArrayList<Exposicion> misExposiciones = new ArrayList<Exposicion>();
    private ArrayList<CocheConcesionario> misCoches = new ArrayList<CocheConcesionario>();
    private int[] posRealCoche;

    /** Creates new form MoverCocheAExposicionIG */
    public MoverCocheAExposicionIG(java.awt.Frame parent, boolean modal) {
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

        jpMostrarProveedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtExposiciones = new javax.swing.JTable();
        jpMostrarCoches = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCoches = new javax.swing.JTable();
        jbMoverCoche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mover un coche a una exposición");

        jpMostrarProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Exposiciones"));

        jtExposiciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtExposicionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtExposiciones);

        javax.swing.GroupLayout jpMostrarProveedoresLayout = new javax.swing.GroupLayout(jpMostrarProveedores);
        jpMostrarProveedores.setLayout(jpMostrarProveedoresLayout);
        jpMostrarProveedoresLayout.setHorizontalGroup(
            jpMostrarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMostrarProveedoresLayout.setVerticalGroup(
            jpMostrarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarProveedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMostrarCoches.setBorder(javax.swing.BorderFactory.createTitledBorder("Coches"));

        jtCoches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCochesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCoches);

        jbMoverCoche.setText("Mover coche");
        jbMoverCoche.setEnabled(false);
        jbMoverCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoverCocheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMostrarCochesLayout = new javax.swing.GroupLayout(jpMostrarCoches);
        jpMostrarCoches.setLayout(jpMostrarCochesLayout);
        jpMostrarCochesLayout.setHorizontalGroup(
            jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                .addGroup(jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jbMoverCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMostrarCochesLayout.setVerticalGroup(
            jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMoverCoche)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMostrarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpMostrarCoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtExposicionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtExposicionesMouseClicked
        // TODO add your handling code here:
        this.actualizarBoton();
    }//GEN-LAST:event_jtExposicionesMouseClicked

    private void jtCochesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCochesMouseClicked
        // TODO add your handling code here:
        this.actualizarBoton();
    }//GEN-LAST:event_jtCochesMouseClicked

    private void jbMoverCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoverCocheActionPerformed
        // TODO add your handling code here:
        int co = 0;
        int exp = 0;
        while ((!this.jtExposiciones.isRowSelected(exp))
                && (exp < this.jtExposiciones.getRowCount())) {
            exp++;
        }
        while ((!this.jtCoches.isRowSelected(co))
                && (co < this.jtCoches.getRowCount())) {
            co++;
        }
        this.posRealCoche = this.posicionRealCoche(misCoches, misExposiciones);
        this.misExposiciones.get(exp).aniadirCoche(this.misCoches.get(this.posRealCoche[co]));
        this.cargarCoches();
        this.actualizarBoton();
    }//GEN-LAST:event_jbMoverCocheActionPerformed

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
            java.util.logging.Logger.getLogger(MoverCocheAExposicionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverCocheAExposicionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverCocheAExposicionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverCocheAExposicionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                MoverCocheAExposicionIG dialog = new MoverCocheAExposicionIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbMoverCoche;
    private javax.swing.JPanel jpMostrarCoches;
    private javax.swing.JPanel jpMostrarProveedores;
    private javax.swing.JTable jtCoches;
    private javax.swing.JTable jtExposiciones;
    // End of variables declaration//GEN-END:variables

    public void cargarExposiciones() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Numero");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");

        //Recorremos los proveedores
        Object[] fila = new Object[3];
        for (int i = 0; i < this.misExposiciones.size(); i++) {
            fila[0] = this.misExposiciones.get(i).getNumero();
            fila[1] = this.misExposiciones.get(i).getDireccion();
            fila[2] = this.misExposiciones.get(i).getTelefono();

            modelo.addRow(fila);
        }

        jtExposiciones.setModel(modelo);


    }

    public void cargarCoches() {
        //Cargamos la tabla superior, la de los proveedores
        DefaultTableModel modelo = new DefaultTableModel();
        int k = 0;
        int j = 0;
        boolean correcto = true;
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Matricula");
        modelo.addColumn("Tipo Vehiculo");
        modelo.addColumn("Precio");
        this.posRealCoche = this.posicionRealCoche(this.misCoches, this.misExposiciones);
        //Recorremos los proveedores
        Object[] fila = new Object[5];
        if (posRealCoche[this.misCoches.size()] == 1) {
            //Recorremos la lista de coches
            for (int i = 0; i < this.misCoches.size(); i++) {
                //Comprobamos si el coche está en venta
                if ((this.misCoches.get(i).getEstado().equalsIgnoreCase("En venta"))) {
                    //Controlamos si ha llegado al final de la lista de exposiciones
                    while ((k < this.misExposiciones.size())) {
                        while ((j < this.misExposiciones.get(k).getCochesExpo().size())) {
                            if ((this.misCoches.get(i).getMarca().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getMarca()))
                                    && (this.misCoches.get(i).getModelo().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getModelo()))
                                    && (this.misCoches.get(i).getMatricula().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getMatricula()))
                                    && (this.misCoches.get(i).getTipoVehiculo().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getTipoVehiculo()))
                                    && (this.misCoches.get(i).getPrecioVenta() == this.misExposiciones.get(k).getCochesExpo().get(j).getPrecioVenta())
                                    && (this.misCoches.get(i).getPrecioCompra() == this.misExposiciones.get(k).getCochesExpo().get(j).getPrecioCompra())
                                    && (this.misCoches.get(i).getEstado().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getEstado()))) {
                                correcto = false;
                            }
                            j++;
                        }

                        j = 0;
                        k++;
                    }
                    if (correcto) {
                        fila[0] = this.misCoches.get(i).getMarca();
                        fila[1] = this.misCoches.get(i).getModelo();
                        fila[2] = this.misCoches.get(i).getMatricula();
                        fila[3] = this.misCoches.get(i).getTipoVehiculo();
                        fila[4] = this.misCoches.get(i).getPrecioCompra();
                        modelo.addRow(fila);
                    }
                    correcto = true;

                }
                k = 0;
            }
            jtCoches.setModel(modelo);
        } else {
            jtCoches.setModel(new DefaultTableModel());
        }

    }

    public int[] posicionRealCoche(ArrayList<CocheConcesionario> listaCoche, ArrayList<Exposicion> listaExpo) {
        int[] posRealCoche = new int[listaCoche.size() + 1];
        int j = 0;
        int k = 0;
        int l = 0;
        boolean correcto = true;
        boolean correcto2 = false;
        for (int i = 0; i < this.misCoches.size(); i++) {
            //Comprobamos si el coche está en venta
            if ((this.misCoches.get(i).getEstado().equalsIgnoreCase("En venta"))) {
                //Controlamos si ha llegado al final de la lista de exposiciones
                while ((k < this.misExposiciones.size())) {
                    while ((j < this.misExposiciones.get(k).getCochesExpo().size())) {
                        if ((this.misCoches.get(i).getMarca().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getMarca()))
                                && (this.misCoches.get(i).getModelo().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getModelo()))
                                && (this.misCoches.get(i).getMatricula().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getMatricula()))
                                && (this.misCoches.get(i).getTipoVehiculo().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getTipoVehiculo()))
                                && (this.misCoches.get(i).getPrecioVenta() == this.misExposiciones.get(k).getCochesExpo().get(j).getPrecioVenta())
                                && (this.misCoches.get(i).getPrecioCompra() == this.misExposiciones.get(k).getCochesExpo().get(j).getPrecioCompra())
                                && (this.misCoches.get(i).getEstado().equalsIgnoreCase(this.misExposiciones.get(k).getCochesExpo().get(j).getEstado()))) {
                            correcto = false;
                        }
                        j++;
                    }

                    j = 0;
                    k++;
                }
                if (correcto) {
                    posRealCoche[l] = i;
                    l++;
                    correcto2 = true;
                }
                correcto = true;

            }
            k = 0;
        }
        if (correcto2) {
            posRealCoche[listaCoche.size()] = 1;
        } else {
            posRealCoche[listaCoche.size()] = 0;
        }
        return posRealCoche;
    }

    public void actualizarBoton() {
        int exp = 0;
        int co = 0;
        while ((!this.jtExposiciones.isRowSelected(exp))
                && (exp < this.jtExposiciones.getRowCount())) {
            exp++;
        }
        while ((!this.jtCoches.isRowSelected(co))
                && (co < this.jtCoches.getRowCount())) {
            co++;
        }
        if ((this.jtExposiciones.isRowSelected(exp)) && (this.jtCoches.isRowSelected(co))) {
            this.jbMoverCoche.setEnabled(true);
        } else {
            this.jbMoverCoche.setEnabled(false);
        }
    }

    public ArrayList<CocheConcesionario> getMisCoches() {
        return misCoches;
    }

    public void setMisCoches(ArrayList<CocheConcesionario> misCoches) {
        this.misCoches = misCoches;
    }

    public ArrayList<Exposicion> getMisExposiciones() {
        return misExposiciones;
    }

    public void setMisExposiciones(ArrayList<Exposicion> misExposiciones) {
        this.misExposiciones = misExposiciones;
    }

    public int[] getPosRealCoche() {
        return posRealCoche;
    }

    public void setPosRealCoche(int[] posRealCoche) {
        this.posRealCoche = posRealCoche;
    }
}
