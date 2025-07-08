package Taller16.Mensaje;

public class Email extends CanalMensajeria {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(" Enviando correo electronico: " + mensaje);
    }
}

