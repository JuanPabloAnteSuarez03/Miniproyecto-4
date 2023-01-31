package Dao;


import Model.Proveedor;
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
 * @author user
 */
public class ProveedorDAO {
    private final String nombreArchivo = "proveedores.dat";

    public void crearArchivoProveedores() {
        File archivo = new File(nombreArchivo);
        try {
            if(!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirProveedores(List<Proveedor> proveedores) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Proveedor proveedor : proveedores) {
                bw.write(proveedor.getCodigo() + "," + proveedor.getNombre() + "," + proveedor.getFechaCrea() + "," + proveedor.getNit() + "," + proveedor.getTelefono());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarProveedor(Proveedor proveedor) {
        try (FileWriter fw = new FileWriter(nombreArchivo, true)) {
            fw.write(proveedor.getCodigo() + "," + proveedor.getNombre() + "," + proveedor.getFechaCrea() + "," + proveedor.getNit() + "," + proveedor.getTelefono());
            fw.write(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Proveedor> leerProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                int codigo = Integer.parseInt(campos[0]);
                String nombre = campos[1];
                LocalDate fechaCrea = LocalDate.parse(campos[2]);
                int nit = Integer.parseInt(campos[3]);
                int telefono = Integer.parseInt(campos[4]);
                Proveedor proveedor = new Proveedor(codigo, nombre, fechaCrea, nit, telefono);
                proveedores.add(proveedor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proveedores;
    }
    
    public void actualizarProveedor(Proveedor proveedor) {
    List<Proveedor> proveedores = leerProveedores();
    for (int i = 0; i < proveedores.size(); i++) {
        Proveedor p = proveedores.get(i);
        if (p.getCodigo() == proveedor.getCodigo()) {
            proveedores.set(i, proveedor);
            break;
        }
    }
    escribirProveedores(proveedores);
}
    public void eliminarProveedor(Proveedor proveedor) {
            List<Proveedor> proveedores = leerProveedores();
            Iterator<Proveedor> iterator = proveedores.iterator();
            while (iterator.hasNext()) {
                Proveedor p = iterator.next();
                if (p.getCodigo() == proveedor.getCodigo()) {
                    iterator.remove();
                    break;
                }
            }
            escribirProveedores(proveedores);
        }
    }