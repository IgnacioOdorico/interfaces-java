
public class Cliente implements Notificable {
        private String nombre;
        private String email;

        public Cliente() {}

        public Cliente(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
        @Override
        public void notificar(String mensaje) {
            System.out.println("Notificando al cliente " + nombre + " con el mensaje: " + mensaje);
        }
}

