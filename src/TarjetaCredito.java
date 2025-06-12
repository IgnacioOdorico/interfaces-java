public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {}

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Descuento aplicado del " + porcentaje + "%");
    }
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con tarjeta " + numeroTarjeta);
    }
}
