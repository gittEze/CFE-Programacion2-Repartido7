package Ejercicio6;

public class Notificador {
    public static void main(String[] args) {

        Notificador notificadorr = new Notificador();

        notificadorr.enviarMensaje("Hola");
        System.out.println();
        notificadorr.enviarMensaje("Hola", "Juan");
        System.out.println();
        notificadorr.enviarMensaje("Hola", "Juan", "Alta");
        System.out.println();
        notificadorr.enviarMensaje("Hola", "Carlos", "Alta", "hola.pdf");

    }

    //mensaje simple
    public void enviarMensaje(String texto) {
        System.out.println("Mensaje: " + texto);
    }

    //mensaje a un destinatario
    public void enviarMensaje(String texto, String destinatario) {
        System.out.println("Mensaje: " + texto);
        System.out.println("Destinatario: " + destinatario);
    }

    //mensaje con prioridad
    public void enviarMensaje(String texto, String destinatario, String prioridad) {
        System.out.println("Mensaje: " + texto);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Prioridad: " + prioridad);
    }

    //mensaje con archivo adjunto
    public void enviarMensaje(String texto, String destinatario, String prioridad, String nombreArchivo) {
        System.out.println("Mensaje: " + texto);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Nombre del archivo: " + nombreArchivo);
    }
}
