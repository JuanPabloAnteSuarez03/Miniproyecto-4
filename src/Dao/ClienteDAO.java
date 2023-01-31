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
 * @author Leon
 */
public class ClienteDAO {

    private final String nombreArchivo = "clientes.dat";
    
    public Cliente buscarClientePorCodigo(int codigoCliente) {
    List<Cliente> clientes = leerClientes();
    for (Cliente c : clientes) {
        if (c.getCodigoCliente() == codigoCliente) {
            return c;
        }
    }
    return null;
}


    public void crearArchivoClientes() {
        File archivo = new File(nombreArchivo);
        try {
            if(!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
        }
    }

    public void escribirClientes(List<Cliente> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Cliente cliente : clientes) {
                bw.write(cliente.getCodigoCliente() + "," + cliente.getNombre() + "," + cliente.getDireccion() + "," + cliente.getTelefono() + "," + cliente.getFechaCrea());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean agregarCliente(Cliente cliente) {
        try {
            try (FileWriter fw = new FileWriter(nombreArchivo, true)) {
                fw.write(cliente.toString());
                return true;
            }
        } catch (IOException e) {
            return false;
        }
    }
    
    public List<Cliente> leerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                int codigoCliente = Integer.parseInt(campos[0]);
                String nombre = campos[1];
                String direccion = campos[2];
                String telefono = campos[3];
                LocalDate fechaCrea = LocalDate.parse(campos[4]);
                Cliente cliente = new Cliente(codigoCliente, nombre, direccion, telefono, fechaCrea);
                clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    
    public void actualizarCliente(Cliente cliente) {
    List<Cliente> clientes = leerClientes();
    for (int i = 0; i < clientes.size(); i++) {
        Cliente c = clientes.get(i);
        if (c.getCodigoCliente() == cliente.getCodigoCliente()) {
            clientes.set(i, cliente);
            break;
        }
    }
    escribirClientes(clientes);
}
    
    
    public void eliminarCliente(Cliente cliente) {
    List<Cliente> clientes = leerClientes();
    Iterator<Cliente> iterator = clientes.iterator();
    while (iterator.hasNext()) {
        Cliente c = iterator.next();
        if (c.getCodigoCliente() == cliente.getCodigoCliente()) {
            iterator.remove();
            break;
        }
    }
    escribirClientes(clientes);
}

}
