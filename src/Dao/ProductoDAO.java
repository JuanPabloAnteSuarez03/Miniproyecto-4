/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Iterator;


/**
 *
 * @author jpant
 */
public class ProductoDAO {

    private final String nombreArchivo = "productos.dat";

    public void crearArchivoProductos() {
        File archivo = new File(nombreArchivo);
        try {
            if(!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
        }
    }

    public void escribirProductos(List<Producto> productos) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
        for (Producto producto : productos) {
            bw.write(producto.getCodigo() + "," + producto.getFecha() + "," + producto.getDescripcion() + "," + producto.getPrecio() + "," + producto.getCantidad());
            bw.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    public static Producto buscarProductoPorCodigo(int codigoProducto) {
        ProductoDAO productoDAO = new ProductoDAO();
        List<Producto> productos = productoDAO.leerProductos();
        for (Producto producto : productos) {
            if (producto.getCodigo() == (codigoProducto)) {
                return producto;
            }

        }
        return null;
    }


    public void agregarProducto(Producto producto) {
        try {
            try (FileWriter fw = new FileWriter(nombreArchivo, true)) {
                fw.write(producto.toString());
            }
        } catch (IOException e) {
        }
    }
    
   public Producto obtenerProducto(int codigoProducto) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int codProd = Integer.parseInt(partes[0]);
                if (codProd == codigoProducto) {
                    br.close();
                    LocalDate fecha = LocalDate.parse(partes[1]);
                    String descripcion = partes[2];
                    double precio = Double.parseDouble(partes[3]);
                    int cantidad = Integer.parseInt(partes[4]);
                    return new Producto(codProd, fecha, descripcion, precio, cantidad);
                }
            }
            br.close();
            return null;
        } catch (Exception e) {
            return null;
        }
    }



    public List<Producto> leerProductos() {
        List<Producto> productos = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                int codigoProducto = Integer.parseInt(campos[0]);
                LocalDate fecha = LocalDate.parse(campos[1]);
                String descripcion = campos[2];
                float precio = Float.parseFloat(campos[3]);
                int cantidad = Integer.parseInt(campos[4]);
                Producto producto = new Producto(codigoProducto, fecha, descripcion, precio, cantidad);
                productos.add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }
    
    public void actualizarCantidad(int codigoProducto, int cantidad) {
        Producto producto = buscarProductoPorCodigo(codigoProducto);
        if (producto != null) {
            producto.setCantidad(producto.getCantidad() + cantidad);
            List<Producto> productos = leerProductos();
            for (int i = 0; i < productos.size(); i++) {
                Producto p = productos.get(i);
                if (p.getCodigo() == producto.getCodigo()) {
                    productos.set(i, producto);
                    break;
                }
            }
            escribirProductos(productos);
        }
    }

    
    public void actualizarProducto(Producto producto) {
    List<Producto> productos = leerProductos();
    for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getCodigo() == producto.getCodigo()) {
            productos.set(i, producto);
            escribirProductos(productos);
            return;
        }
    }
}


    public void eliminarProducto(Producto producto) {
    List<Producto> productos = leerProductos();
    Iterator<Producto> iterator = productos.iterator();
    while (iterator.hasNext()) {
        Producto p = iterator.next();
        if (p.getCodigo() == producto.getCodigo()) {
            iterator.remove();
            break;
        }
    }
    escribirProductos(productos);
}

}