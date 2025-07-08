package Taller16.Mensaje;

public class SMS extends CanalMensajeria {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}

