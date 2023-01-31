/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Model.Cliente;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import Vista.MouseClickListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Dao.ClienteDAO;



/**
 *
 * @author jpant
 */
public class Clientes extends javax.swing.JFrame {
    private ClienteDAO clienteDao;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(getIconImage());
        clienteDao = new ClienteDAO();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }
    
    public JTextPane getjTextNit() {
        return jTextCodigoCliente;
    }

    public void setjTextNit(JTextPane jTextNit) {
        this.jTextCodigoCliente = jTextNit;
    }    
    public JTextPane getjTextNombre() {
        return jTextNombre;
    }

    public void setjTextNombre(JTextPane jTextNombre) {
        this.jTextCodigoCliente = jTextNombre;
    } 
    public JTextPane getjTextDireccion() {
        return jTextDireccion;
    }

    public void setjTextDireccion(JTextPane jTextDireccion) {
        this.jTextDireccion = jTextDireccion;
    } 
    public JTextPane getjTextTelefono() {
        return jTextTelefono;
    }

    public void setjTextTelefono(JTextPane jTextTelefono) {
        this.jTextTelefono = jTextTelefono;
    } 
    
    public void addBtnAgregar(ActionListener listenControles){
        jButtonAgregar.addActionListener(listenControles);       
    }
    
    public void addBtnEditar(ActionListener listenControles){
        jButtonEditar.addActionListener(listenControles);       
    }
    
    public void addBtnEliminar(ActionListener listenControles){
        jButtonEliminar.addActionListener(listenControles);       
    }
    
    public void displayErrorMessage(String erroMessage){
        JOptionPane.showMessageDialog(this, erroMessage);
    }

    private void actualizarTabla(){
    List<Cliente> clientes = clienteController.getClientes();
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Código");
    model.addColumn("Nombre");
    model.addColumn("Dirección");
    model.addColumn("Teléfono");
    model.addColumn("Fecha creación");
    for(Cliente cliente : clientes){
        model.addRow(new Object[]{cliente.getCodigoCliente(), cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono(), cliente.getFechaCrea()});
    }
    jTableClientes.setModel(model);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextCodigoCliente = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextTelefono = new javax.swing.JTextPane();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextNombre = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextDireccion = new javax.swing.JTextPane();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel1.setText("Supermercado Univalle");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel2.setText("CodigoCliente");

        jScrollPane1.setViewportView(jTextCodigoCliente);
        jTextCodigoCliente.getAccessibleContext().setAccessibleName("");

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel3.setText("Direccion");

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel4.setText("Telefono");

        jScrollPane2.setViewportView(jTextTelefono);

        jButtonAgregar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonAgregar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonEditar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(255, 51, 0));
        jButtonEliminar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Telefono", "Fecha"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableClientes);

        jScrollPane4.setViewportView(jTextNombre);

        jScrollPane5.setViewportView(jTextDireccion);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel6.setText("Fecha");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5))
                        .addGap(49, 49, 49)
                        .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        try {
            int codigo = Integer.parseInt(jTextCodigoCliente.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código del cliente debe ser un número");
            return;
        }
        String nombre = jTextNombre.getText();
        String direccion = jTextDireccion.getText();
        String telefono = jTextTelefono.getText();
        LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        if(codigo == 0 || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || fecha == null){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }
        
        Cliente cliente = new Cliente(codigo, nombre, direccion, telefono, fecha);
        
        boolean agregado = clienteDao.agregarCliente(cliente);
        
        if(agregado){
            JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente");
            jTextCodigoCliente.setText("");
            jTextNombre.setText("");
            jTextDireccion.setText("");
            jTextTelefono.setText("");
            jDateChooser1.setDate(null);
            actualizarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Error al agregar el cliente");
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int filaSeleccionada = jTableClientes.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para editar");
            return;
        }
        int selectedRow = jTableClientes.getSelectedRow();
        String codigoString = (String) jTableClientes.getValueAt(selectedRow, 0);
        if(codigoString == null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente");
            return;
        }
        int codigo;
        try {
            codigo = Integer.parseInt(codigoString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número entero");
            return;
        }
        String nombre = jTextNombre.getText();
        String direccion = jTextDireccion.getText();
        String telefono = jTextTelefono.getText();
        LocalDate fecha = LocalDate.ofInstant(jDateChooser1.getDate().toInstant(), ZoneId.systemDefault());

        if(nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || fecha == null){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }

        Cliente cliente = new Cliente(codigo, nombre, direccion, telefono, fecha);

        boolean actualizado = clienteController.actualizarCliente(cliente);

        if(actualizado){
            JOptionPane.showMessageDialog(this, "Cliente actualizado exitosamente");
            jTextCodigoCliente.setText("");
            jTextNombre.setText("");
            jTextDireccion.setText("");
            jTextTelefono.setText("");
            jDateChooser1.setDate(null);
            actualizarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Error al actualizar el cliente");
        }


    }//GEN-LAST:event_jButtonEditarActionPerformed
    
    
    public int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        int seleccion = jTableClientes.rowAtPoint(evt.getPoint());
        jTextCodigoCliente.setText(String.valueOf(jTableClientes.getValueAt(seleccion, 0)));
        jTextNombre.setText(String.valueOf(jTableClientes.getValueAt(seleccion, 1)));
        jTextDireccion.setText(String.valueOf(jTableClientes.getValueAt(seleccion, 2)));
        jTextTelefono.setText(String.valueOf(jTableClientes.getValueAt(seleccion, 3)));
        codigo = Integer.parseInt(String.valueOf(jTableClientes.getValueAt(seleccion, 0)));
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        LocalDate fechaSeleccionada =  LocalDate.ofInstant(Instant.ofEpochMilli(jDateChooser1.getDate().getTime()), ZoneId.systemDefault());
    }//GEN-LAST:event_jDateChooser1PropertyChange
    

    private void mostrarDetallesCliente() {
        int selectedRow = jTableClientes.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
        
        String codigo = (String) model.getValueAt(selectedRow, 0);
        String nombre = (String) model.getValueAt(selectedRow, 1);
        String direccion = (String) model.getValueAt(selectedRow, 2);
        String telefono = (String) model.getValueAt(selectedRow, 3);
        LocalDate fecha = (LocalDate) model.getValueAt(selectedRow, 4);
        
        jTextCodigoCliente.setText(codigo);
        jTextNombre.setText(nombre);
        jTextDireccion.setText(direccion);
        jTextTelefono.setText(telefono);
        jDateChooser1.setDate(Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
    }


    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int selectedRow = jTableClientes.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar");
            return;
        }
        int codigo = Integer.parseInt((String) jTableClientes.getValueAt(selectedRow, 0));
        boolean eliminado = clienteController.eliminarCliente(codigo);
        if(eliminado){
            JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente");
            actualizarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar el cliente");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTable jTableClientes;
    private javax.swing.JTextPane jTextCodigoCliente;
    private javax.swing.JTextPane jTextDireccion;
    private javax.swing.JTextPane jTextNombre;
    private javax.swing.JTextPane jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
