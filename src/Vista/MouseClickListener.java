/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.MouseAdapter;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.event.MouseEvent;


/**
 *
 * @author jpant
 */
public class MouseClickListener extends MouseAdapter {
    private JTable tabla;
    private JTextPane textCodigo, textNombre, textDireccion, textTelefono, textFecha;
    private String vista;

    public MouseClickListener(JTable tabla, JTextPane textCodigo, JTextPane textNombre, JTextPane textDireccion, JTextPane textTelefono, JTextPane textFecha, String vista) {
        this.tabla = tabla;
        this.textCodigo = textCodigo;
        this.textNombre = textNombre;
        this.textDireccion = textDireccion;
        this.textTelefono = textTelefono;
        this.textFecha = textFecha;
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            return;
        }
        textCodigo.setText(tabla.getValueAt(filaSeleccionada, 0).toString());
        textNombre.setText(tabla.getValueAt(filaSeleccionada, 1).toString());
        textDireccion.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
        textTelefono.setText(tabla.getValueAt(filaSeleccionada, 3).toString());
        textFecha.setText(tabla.getValueAt(filaSeleccionada, 4).toString());
        System.out.println("Vista: " + vista);
    }
}
