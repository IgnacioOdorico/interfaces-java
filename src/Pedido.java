import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable{
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente = new Cliente();
    private String estado = "Pendiente";

    public Pedido() {
    }

    public Pedido(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int calcularTotal() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", estado='" + estado + '\'' +
                ", productos=" + productos +
                '}';
    }

    public void cambiarEstado(String nuevoEstado){
        System.out.println("Estado cambiado de " + estado + " a " + nuevoEstado);
        this.estado = nuevoEstado;
    }
}