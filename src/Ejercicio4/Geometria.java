package Ejercicio4;

public class Geometria {
    public static void main(String[] args) {
        Geometria geo = new Geometria();


        System.out.println("Cuadrado: " + geo.calcularArea(5));
        System.out.println("Rectangulo: " + geo.calcularArea(4, 6));
        System.out.println("Circulo " + geo.calcularArea(3.0));
    }

        //area cuadrado
        public int calcularArea(int lado) {
            return lado * lado;
        }

        //area rectangulo
        public int calcularArea(int base, int altura) {
            return base * altura;
        }

        //area círculo
        public double calcularArea(double radio) {
            return 13.14 * radio * radio;
        }
}
