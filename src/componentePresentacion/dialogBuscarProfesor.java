/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentePresentacion;

import componenteEntidad.Apoderado;
import componenteEntidad.Profesor;
import componenteNegocio.ApoderadoCN;
import componenteNegocio.ProfesorCN;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class dialogBuscarProfesor extends javax.swing.JDialog {

    /**
     * Creates new form dialogBuscarApoderado
     */
    DefaultTableModel modelo = new DefaultTableModel();
    String[] nombreColumnas = {"idProfesor","Dni","Apellido","Nombre","Telefono","Dirección"};
    Profesor profesorSelec = new Profesor();
    public dialogBuscarProfesor() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        txtBuscarpoApellidos.requestFocus();
        modelo.setColumnIdentifiers(nombreColumnas);
        try{
            ArrayList<Profesor> lista = ProfesorCN.getInstancia().mostrarProfesores();
            Object datos[][]= new Object[lista.size()][6];
            for(int i=0; i<lista.size();i++){
                Profesor profesor = lista.get(i);
                datos[i][0] = profesor.getIdProfesor();
                datos[i][1] = profesor.getDni();
                datos[i][2] = profesor.getApellidos();
                datos[i][3] = profesor.getNombres();
                datos[i][4] = profesor.getTelefono();
                datos[i][5] = profesor.getDireccion();
            }
            modelo.setDataVector(datos, nombreColumnas);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarpoApellidos = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Profesor");

        txtBuscarpoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarpoApellidosActionPerformed(evt);
            }
        });
        txtBuscarpoApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarpoApellidosKeyReleased(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setToolTipText("Seleccionar un profesor de la lista.");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Buscar por Apellidos:");

        tabla.setModel(modelo);
        jScrollPane2.setViewportView(tabla);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnTodos.setText("Todos");
        btnTodos.setToolTipText("Muestra todos los profesores registrados.");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Docente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSeleccionar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtBuscarpoApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTodos)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscar, btnSalir, btnTodos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarpoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeleccionar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTodos)
                            .addComponent(btnSalir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarpoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarpoApellidosActionPerformed
        // TODO add your handling code here

    }//GEN-LAST:event_txtBuscarpoApellidosActionPerformed

    private void txtBuscarpoApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarpoApellidosKeyReleased
        // TODO add your handling code here:
        String apellidos=txtBuscarpoApellidos.getText();

        modelo.setColumnIdentifiers(nombreColumnas);
        try {
            ArrayList<Profesor> lista = ProfesorCN.getInstancia().buscarPorApellidos(apellidos);
            Object [][]datos=new Object[lista.size()][6];
            for (int i = 0; i < lista.size(); i++) {
                Profesor profesor = lista.get(i);
                datos[i][0]=profesor.getIdProfesor();
                datos[i][1]=profesor.getDni();
                datos[i][2]=profesor.getApellidos();
                datos[i][3]=profesor.getNombres();
                datos[i][4]=profesor.getTelefono();
                datos[i][5]=profesor.getDireccion();
            }
            modelo.setDataVector(datos, nombreColumnas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txtBuscarpoApellidosKeyReleased

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        int i = tabla.getSelectedRow();
        if(i!=-1) {
            profesorSelec.setIdProfesor(modelo.getValueAt(i, 0).toString());
            profesorSelec.setDni(modelo.getValueAt(i, 1).toString());
            profesorSelec.setApellidos(modelo.getValueAt(i, 2).toString());
            profesorSelec.setNombres(modelo.getValueAt(i, 3).toString());
            profesorSelec.setTelefono(modelo.getValueAt(i, 4).toString());
            profesorSelec.setDireccion(modelo.getValueAt(i, 5).toString());
            this.dispose();
        } else
        JOptionPane.showMessageDialog(null, "Debes Seleccionar un elemento");
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String apellidos=txtBuscarpoApellidos.getText();

        modelo.setColumnIdentifiers(nombreColumnas);
        try {
            ArrayList<Profesor> lista = ProfesorCN.getInstancia().buscarPorApellidos(apellidos);
            Object [][]datos=new Object[lista.size()][6];
            for (int i = 0; i < lista.size(); i++) {
                Profesor profesor = lista.get(i);
                datos[i][0]=profesor.getIdProfesor();
                datos[i][1]=profesor.getDni();
                datos[i][2]=profesor.getApellidos();
                datos[i][3]=profesor.getNombres();
                datos[i][4]=profesor.getTelefono();
                datos[i][5]=profesor.getDireccion();
            }
            modelo.setDataVector(datos, nombreColumnas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
        txtBuscarpoApellidos.setText("");
        modelo.setColumnIdentifiers(nombreColumnas);
        try{
            ArrayList<Profesor> lista = ProfesorCN.getInstancia().mostrarProfesores();
            Object datos[][]= new Object[lista.size()][6];
            for(int i=0; i<lista.size();i++){
                Profesor profesor = lista.get(i);
                datos[i][0] = profesor.getIdProfesor();
                datos[i][1] = profesor.getDni();
                datos[i][2] = profesor.getApellidos();
                datos[i][3] = profesor.getNombres();
                datos[i][4] = profesor.getTelefono();
                datos[i][5] = profesor.getDireccion();
            }
            modelo.setDataVector(datos, nombreColumnas);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txtBuscarpoApellidos.requestFocus();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dialogBuscarApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dialogBuscarApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dialogBuscarApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dialogBuscarApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                dialogBuscarApoderado dialog = new dialogBuscarApoderado(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscarpoApellidos;
    // End of variables declaration//GEN-END:variables
}
