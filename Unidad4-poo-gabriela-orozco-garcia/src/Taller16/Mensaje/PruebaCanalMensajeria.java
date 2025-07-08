package Taller16.Mensaje;

public class PruebaCanalMensajeria {
    public static void main(String[] args) {

        CanalMensajeria canalEmail = new Email();
        CanalMensajeria canalSMS = new SMS();
        CanalMensajeria canalPush = new NotificacionPush();

        System.out.println("..::Envio de mensajes por distintos canales::..");
        canalEmail.enviarMensaje("Bienvenido a nuestra plataforma.");
        canalSMS.enviarMensaje("Tu codigo de verificación es 2010.");
        canalPush.enviarMensaje("Tienes una nueva oferta disponible.");
    }
}
