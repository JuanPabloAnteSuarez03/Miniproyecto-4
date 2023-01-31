/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import Model.Proveedor;
/**
 *
 * @author jpant
 */

public class ControladorInicio extends JFrame implements ActionListener {

    //Botones
    private JButton inicio, proveedores, productos, inven, clientes, vende;
    //Labels
    private JLabel lblTitulo;
    //Paneles
    private JPanel panelPrincipal;
    
    public ControladorInicio() {
        //Inicialización de la forma
        setTitle("Aplicación de ejemplo");
        setSize(600, 400);
        setLocationRelativeTo(null); //Colocar en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("icon.png").getImage());
        
        //Inicialización de los elementos de la interfaz
        lblTitulo = new JLabel("Bienvenido a la aplicación de ejemplo");
        inicio = new JButton("Inicio");
        proveedores = new JButton("Proveedores");
        productos = new JButton("Productos");
        inven = new JButton("Inventario");
        clientes = new JButton("Clientes");
        vende = new JButton("Vender");
        
        //Añadir eventos de ratón a los botones
        inicio.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                inicio.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseReleased(MouseEvent e) {
                inicio.setBackground(UIManager.getColor("control"));
            }
        });
        proveedores.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                proveedores.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseReleased(MouseEvent e) {
                proveedores.setBackground(UIManager.getColor("control"));
            }
        });
        productos.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                productos.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseReleased(MouseEvent e) {
                productos.setBackground(UIManager.getColor("control"));
            }
        });
        inven.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                inven.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseReleased(MouseEvent e) {
                inven.setBackground(UIManager.getColor("control"));
            }
        });
        clientes.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                clientes.setBackground(Color.LIGHT_GRAY);
        }
            public void mouseReleased(MouseEvent e) {
                clientes.setBackground(UIManager.getColor("control"));
        }
        });
        vende.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                vende.setBackground(Color.LIGHT_GRAY);
        }
        public void mouseReleased(MouseEvent e) {
                vende.setBackground(UIManager.getColor("control"));
        }
        });
        //Añadir eventos de acción a los botones
        inicio.addActionListener(this);
        proveedores.addActionListener(this);
        productos.addActionListener(this);
        inven.addActionListener(this);
        clientes.addActionListener(this);
        vende.addActionListener(this);

        //Crear panel principal y añadir elementos a él
        panelPrincipal = new JPanel();
        panelPrincipal.add(lblTitulo);
        panelPrincipal.add(inicio);
        panelPrincipal.add(proveedores);
        panelPrincipal.add(productos);
        panelPrincipal.add(inven);
        panelPrincipal.add(clientes);
        panelPrincipal.add(vende);

        //Añadir panel principal al JFrame
        add(panelPrincipal);

        //Hacer visible el JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //Obtener la acción del botón presionado
        String accion = e.getActionCommand();

        //Verificar la acción del botón y llamar al método correspondiente
        if (accion.equals("Inicio")) {
            llamarInicio();
        } else if (accion.equals("Proveedores")) {
            llamarProveedores();
        } else if (accion.equals("Productos")) {
            llamarProductos();
        } else if (accion.equals("Inventario")) {
            llamarInventario();
        } else if (accion.equals("Clientes")) {
            llamarClientes();
        } else if (accion.equals("Vender")) {
            llamarVender();
        }
    }

    //Métodos para navegar a diferentes partes de la aplicación
    public void llamarInicio() {
        JOptionPane.showMessageDialog(this, "Bienvenido al menú de inicio!");
    }

    public void llamarProveedores() {
        // Crear una nueva instancia de la clase Proveedores
        Proveedor proveedores = new Proveedor();
        // Mostrar la pantalla de proveedores
        proveedores.setVisible(true);    
    }
    
    public void llamarProductos() {
    
    }
    
    public void llamarInventario(){
    
    }
    
    public void llamarClientes(){
    
    }
    
    public void llamarVender(){
    
    }
}