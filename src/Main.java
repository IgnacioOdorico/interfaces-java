public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Enviado");

        Producto producto1 = new Producto("Procesador", 1000);
        Producto producto2 = new Producto("Memoria", 2000);
        Producto producto3 = new Producto("Disco Duro", 3000);

        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);

        System.out.println("Total: " + pedido1.calcularTotal());

        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        TarjetaCredito tarjeta2 = new TarjetaCredito("1234-5678-3859-0987");

        PayPal paypal = new PayPal("correo@correo.com");
        PayPal paypal2 = new PayPal("correo@correo.com");

        paypal2.procesarPago(3000);
        paypal2.aplicarDescuento(30);

        pedido1.cambiarEstado("Entregado");
        System.out.println(pedido1);
    }
}