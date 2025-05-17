package Ejercicio5;

public class Conversor {
    public static void main(String[] args) {

        Conversor conversorr = new Conversor();

        System.out.println("5 metros son " + conversorr.convertir(10) + " centímetros.");
        System.out.println("7 kilogramos son " + conversorr.convertir(2, "peso") + " gramos.");
        System.out.println("44 grados Celsius son " + conversorr.convertir(44, true) + " grados Fahrenheit.");

    }
        //metros a centimetros
        public double convertir(double metros) {
            return metros * 100;
        }

        //kilos a gramos
        public double convertir(double kg, String tipo) {           //kg = kilogramos
            if (tipo.equals("peso")) {
                return kg * 1000;
            } else {
                System.out.println("Tipo no válido");
                return -1;
            }
        }

        //celsius a farencoso
        public double convertir(double temp, boolean esTemperatura) {
            if (esTemperatura) {
                return (temp * 9 / 5) + 32;
            } else {
                System.out.println("No se indicó que es temperatura");
                return 0;
            }
        }
}
