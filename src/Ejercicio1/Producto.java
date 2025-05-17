package Ejercicio1;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo() {
        System.out.println(this.nombre);
        System.out.println("$" + this.precio);
        System.out.println(this.stock);
    }

    public void mostrarInfo(boolean formateado) {
        if (formateado) {
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Precio: $" + this.precio);
            System.out.println("Cantidad en stock: " + this.stock);
        } else {
            mostrarInfo();
        }
    }
}
