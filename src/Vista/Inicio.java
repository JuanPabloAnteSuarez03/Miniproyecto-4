/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import Vista.Clientes;
import Vista.Ventas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


/**
 *
 * @author juanc
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(getIconImage());
    }  
    
    
    //icono
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        inven = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        vende = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton10.setText("jButton10");
        jButton10.setAlignmentY(0.0F);
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);

        jButton20.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton20.setText("jButton10");
        jButton20.setAlignmentY(0.0F);
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);

        jButton21.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton21.setText("jButton10");
        jButton21.setAlignmentY(0.0F);
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);

        jButton22.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton22.setText("jButton10");
        jButton22.setAlignmentY(0.0F);
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);

        jButton23.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton23.setText("jButton10");
        jButton23.setAlignmentY(0.0F);
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);

        jButton25.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton25.setText("jButton10");
        jButton25.setAlignmentY(0.0F);
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);

        jButton26.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton26.setText("jButton10");
        jButton26.setAlignmentY(0.0F);
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);

        jButton27.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton27.setText("jButton10");
        jButton27.setAlignmentY(0.0F);
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);

        jButton28.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton28.setText("jButton10");
        jButton28.setAlignmentY(0.0F);
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addGap(0, 190, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel1.setText("Supermercado Univalle");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inicio.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        inicio.setText("Inicio");
        inicio.setBorderPainted(false);
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inicioMouseReleased(evt);
            }
        });
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        proveedores.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        proveedores.setText("Proveedores");
        proveedores.setBorderPainted(false);
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proveedoresMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proveedoresMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                proveedoresMouseReleased(evt);
            }
        });
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });

        productos.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        productos.setText("productos");
        productos.setBorderPainted(false);
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                productosMouseReleased(evt);
            }
        });
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        inven.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        inven.setText("Inventarios");
        inven.setBorderPainted(false);
        inven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                invenMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                invenMouseReleased(evt);
            }
        });
        inven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invenActionPerformed(evt);
            }
        });

        clientes.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        clientes.setText("Clientes");
        clientes.setBorderPainted(false);
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clientesMouseReleased(evt);
            }
        });
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        vende.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        vende.setText("Ventas");
        vende.setBorderPainted(false);
        vende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vendeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vendeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vendeMouseReleased(evt);
            }
        });
        vende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inven, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vende, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicio)
                    .addComponent(proveedores)
                    .addComponent(productos)
                    .addComponent(inven)
                    .addComponent(clientes)
                    .addComponent(vende))
                .addContainerGap(366, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioMouseEntered

    private void inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMousePressed
            inicio.setBackground(new Color(235, 184, 114));
    }//GEN-LAST:event_inicioMousePressed

    private void proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseEntered
        
    }//GEN-LAST:event_proveedoresMouseEntered

    private void proveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMousePressed
        proveedores.setBackground(new Color(235, 184, 114));
    }//GEN-LAST:event_proveedoresMousePressed

    private void productosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_productosMouseEntered

    private void productosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMousePressed
        productos.setBackground(new Color(235, 184, 114));
    }//GEN-LAST:event_productosMousePressed

    private void invenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invenMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_invenMouseEntered

    private void invenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invenMousePressed
        inven.setBackground(new Color(235, 184, 114));
    }//GEN-LAST:event_invenMousePressed

    private void clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesMouseEntered

    private void clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMousePressed
        clientes.setBackground(new Color(235, 184, 114));
    }//GEN-LAST:event_clientesMousePressed

    private void vendeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_vendeMouseEntered

    private void vendeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendeMousePressed
        vende.setBackground(new Color(235, 184, 114));
    }//GEN-LAST:event_vendeMousePressed

    private void inicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseReleased
        inicio.setBackground(Color.white);
    }//GEN-LAST:event_inicioMouseReleased

    private void proveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseReleased
        proveedores.setBackground(Color.white);
    }//GEN-LAST:event_proveedoresMouseReleased

    private void productosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseReleased
        productos.setBackground(Color.white);
    }//GEN-LAST:event_productosMouseReleased

    private void invenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invenMouseReleased
        inven.setBackground(Color.white);
    }//GEN-LAST:event_invenMouseReleased

    private void clientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseReleased
        clientes.setBackground(Color.white);
    }//GEN-LAST:event_clientesMouseReleased

    private void vendeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendeMouseReleased
        vende.setBackground(Color.white);
    }//GEN-LAST:event_vendeMouseReleased

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        
    }//GEN-LAST:event_inicioActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        Proveedores proveedores = new Proveedores();
        proveedores.setVisible(true); 
        this.setVisible(false); 
    }//GEN-LAST:event_proveedoresActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        Productos productos = new Productos();
        productos.setVisible(true); 
        this.setVisible(false); 
    }//GEN-LAST:event_productosActionPerformed

    private void invenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenActionPerformed
        Inventario inventario = new Inventario();
        inventario.setVisible(true); 
        this.setVisible(false); 
    }//GEN-LAST:event_invenActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        Clientes clientes = new Clientes();
        clientes.setVisible(true); // para mostrar la vista de clientes
        this.setVisible(false); // para ocultar la vista actual
    }//GEN-LAST:event_clientesActionPerformed

    private void vendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendeActionPerformed
        Ventas ventas = new Ventas();
        ventas.setVisible(true); // para mostrar la vista de ventas
        this.setVisible(false); // para ocultar la vista actual
    }//GEN-LAST:event_vendeActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientes;
    private javax.swing.JButton inicio;
    private javax.swing.JButton inven;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton vende;
    // End of variables declaration//GEN-END:variables
}
