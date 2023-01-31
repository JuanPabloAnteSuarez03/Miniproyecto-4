package Model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
/**
 *
 * @author jpant
 */
public final class Venta {
    private int idVenta;
    private LocalDate fechaVenta;
    private Map<Producto, Integer> productosCantidad;
    private double precioTotal;
    private Cliente cliente;

    public Venta(int idVenta, LocalDate fechaVenta, Map<Producto, Integer> productosCantidad, double precioTotal, Cliente cliente) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.productosCantidad = productosCantidad;
        calcularPrecioTotal();
        this.cliente = cliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Map<Producto, Integer> getProductosCantidad() {
        return productosCantidad;
    }
    
    public void calcularPrecioTotal() {
        double total = 0;
        for (Map.Entry<Producto, Integer> entry : productosCantidad.entrySet()) {
            Producto p = entry.getKey();
            Integer cantidad = entry.getValue();
            total += p.getPrecio() * cantidad;
        }
        this.precioTotal = total;
    }

    public void setProductosCantidad(Map<Producto, Integer> productosCantidad) {
        this.productosCantidad = productosCantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
