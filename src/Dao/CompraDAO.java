package Dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Model.Compra;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import Model.Producto;
import java.util.Iterator;
/**
 *
 * @author jpant
 */
public class CompraDAO {
    private final String nombreArchivo = "compras.dat";

    public void crearArchivoCompras() {
        File archivo = new File(nombreArchivo);
        try {
            if(!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
        }
    }

    public void escribirCompras(List<Compra> compras) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Compra compra : compras) {
                bw.write(compra.getFechaCompra() + "," + compra.getCodigoProveedor() + "," + compra.getCodigoProducto() + "," + compra.getCantidad() + "," + compra.getPrecioUnitario());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean agregarCompra(Compra compra) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("compras.dat", true));
            bw.write(compra.toString());
            bw.newLine();
            bw.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo");
            return false;
        }
    }

    public List<Compra> leerCompras() {
        List<Compra> compras = new ArrayList<>();
        String linea;
        try {
            BufferedReader br = new BufferedReader(new FileReader("compras.dat"));
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                LocalDate fechaCompra = LocalDate.parse(campos[0]);
                int codigoProveedor = Integer.parseInt(campos[1]);
                int codigoProducto = Integer.parseInt(campos[2]);
                int cantidad = Integer.parseInt(campos[3]);
                float precioUnitario = Float.parseFloat(campos[4]);
                float precioTotal = cantidad * precioUnitario;
                compras.add(new Compra(fechaCompra, codigoProveedor, codigoProducto, cantidad, precioUnitario, precioTotal));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        }
        return compras;
    }


public void actualizarCompra(Compra compra) {
    List<Compra> compras = leerCompras();
    for (int i = 0; i < compras.size(); i++) {
        if (compras.get(i).getFechaCompra().equals(compra.getFechaCompra())) {
            compras.set(i, compra);
            escribirCompras(compras);
            return;
        }
    }
}
    
    public boolean eliminarCompra(int codigoProveedor, int codigoProducto, LocalDate fechaCompra) {
        boolean eliminado = false;
        List<Compra> compras = leerCompras();
        for (int i = 0; i < compras.size(); i++) {
            Compra compra = compras.get(i);
            if (compra.getCodigoProveedor() == codigoProveedor && compra.getCodigoProducto() == codigoProducto && compra.getFechaCompra().equals(fechaCompra)) {
                compras.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            escribirCompras(compras);
        }
        return eliminado;
    }

}
