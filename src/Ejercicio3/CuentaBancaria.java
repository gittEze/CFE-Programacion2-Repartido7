package Ejercicio3;

public class CuentaBancaria {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan", 99000, "Cuenta corriente");
        CuentaBancaria cuenta3 = new CuentaBancaria("Pablo", -11000, "Cuenta corriente");

        cuenta1.mostrarResumen();
        System.out.println();
        cuenta2.mostrarResumen();
        System.out.println();
        cuenta3.mostrarResumen();

    }

    private String titular;
    private double saldo;
    private String tipoDeCuenta;

    public CuentaBancaria() {
        this.titular = "Invitado";
        this.saldo = 0;
        this.tipoDeCuenta = "Caja de ahorro";
    }
    public CuentaBancaria(String nombre, String cuenta) {
        this.titular = nombre;
        this.saldo = 0;
        this.tipoDeCuenta = cuenta;
    }
    public CuentaBancaria(String nombre, double saldo, String cuenta) {
        this.titular = nombre;
        this.saldo = saldo;
        this.tipoDeCuenta = cuenta;
    }

    public void mostrarResumen() {
        System.out.println("Nombre: " + this.titular);
        System.out.println("Tipo de cuenta: " + this.tipoDeCuenta);
        if (this.saldo < 0) {
            System.out.println("Esta cuenta esta sobregirada.");
            System.out.println(this.saldo);
        } else {
            System.out.println("Saldo de la cuenta: " + this.saldo);
        }
    }
}
