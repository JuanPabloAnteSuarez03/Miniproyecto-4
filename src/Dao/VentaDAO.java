/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Cliente;
import Model.Producto;
import Model.Venta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;


/**
 *
 * @author jpant
 */

public class VentaDAO {

    private final String nombreArchivo = "ventas.dat";

    public void crearArchivoVentas() {
        File archivo = new File(nombreArchivo);
        try {
            if(!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
        }
    }
    
    public void escribirVentas(List<Venta> ventas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Venta venta : ventas) {
                String productos = "";
                for (Producto p : venta.getProductos()) {
                    productos += p.getCodigo() + "-";
                }
                productos = productos.substring(0, productos.length() - 1);
                bw.write(venta.getIdVenta() + "," + venta.getFechaVenta() + "," + productos + "," + venta.getPrecioTotal() + "," + venta.getCliente().getCodigoCliente());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void agregarVenta(Venta ventas) {
        try {
            try (FileWriter fw = new FileWriter(nombreArchivo, true)) {
                fw.write(ventas.toString());
            }
        } catch (IOException e) {
        }
    }

    public List<Venta> leerVentas() {
        List<Venta> ventas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                int idVenta = Integer.parseInt(campos[0]);
                LocalDate fechaVenta = LocalDate.parse(campos[1]);
                List<Producto> productos = new ArrayList<>();
                String[] productosArray = campos[2].split("-");
                for (String productoString : productosArray) {
                    int codigoProducto = Integer.parseInt(productoString);
                    Producto producto = ProductoDAO.buscarProductoPorCodigo(codigoProducto);
                    productos.add(producto);
                }
                double precioTotal = Double.parseDouble(campos[3]);
                int codigoCliente = Integer.parseInt(campos[4]);
                ClienteDAO clienteDAO = new ClienteDAO();
                Cliente cliente = clienteDAO.buscarClientePorCodigo(codigoCliente);
                Venta venta = new Venta(idVenta, fechaVenta, productos, precioTotal, cliente);
                ventas.add(venta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ventas;
    }


    public void actualizarVenta(Venta venta) {
        List<Venta> ventas = leerVentas();
        for (int i = 0; i < ventas.size(); i++) {
            Venta v = ventas.get(i);
            if (v.getIdVenta() == venta.getIdVenta()) {
                ventas.set(i, venta);
                break;
            }
        }
        escribirVentas(ventas);
    }
    public void eliminarVenta(Venta venta) {
        List<Venta> ventas = leerVentas();
        Iterator<Venta> iterator = ventas.iterator();
        while (iterator.hasNext()) {
            Venta v = iterator.next();
            if (v.getIdVenta() == venta.getIdVenta()) {
                iterator.remove();
                break;
            }
        }
        escribirVentas(ventas);
        }
    }