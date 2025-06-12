public class PayPal implements PagoConDescuento{
    private String email;

    public PayPal() {}

    public PayPal(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {}

    @Override
    public void procesarPago(double monto){
        System.out.println("Pago realizado con PayPal " + email);
    }

    @Override
    public void aplicarDescuento(double porcentaje){
        System.out.println("Descuento aplicado del " + (int)porcentaje + "% " + email);
    }
}
