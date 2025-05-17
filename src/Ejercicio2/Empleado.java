package Ejercicio2;

public class Empleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Jorge",23000,5);
        empleado1.calcularSueldoTotal();

    }

    //Empleado
    private String nombre;
    private double sueldoBase;
    private int horasExtra;


    public Empleado() {
    }
    public Empleado(String name, double sueldo) {
        this.nombre = name;
        this.sueldoBase = sueldo;
    }
    public Empleado(String name, double sueldo, int horas) {
        this.nombre = name;
        this.sueldoBase = sueldo;
        this.horasExtra = horas;
    }

    public void calcularSueldoTotal() {
        double sueldoTotal = this.sueldoBase + (250 * this.horasExtra);
        System.out.println(sueldoTotal);
    }


}
