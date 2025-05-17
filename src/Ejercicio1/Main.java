package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Producto per1 = new Producto();
        Producto per2 = new Producto("Alfajor", 40);
        Producto per3 = new Producto("Computadora", 22000, 100);

        per1.mostrarInfo(true);
        System.out.println();
        per2.mostrarInfo(true);
        System.out.println();
        per3.mostrarInfo(false);
    }
}
