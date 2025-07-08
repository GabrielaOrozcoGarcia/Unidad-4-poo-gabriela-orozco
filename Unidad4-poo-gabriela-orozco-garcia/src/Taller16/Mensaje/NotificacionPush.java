package Taller16.Mensaje;

public class NotificacionPush extends CanalMensajeria {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificacion push: " + mensaje);
    }
}

