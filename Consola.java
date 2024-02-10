package guia1;

import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Calculadora calcu1 = new Calculadora();

        int opcion;

        do {
            System.out.println("Calculadora: ");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. COSENO");
            System.out.println("6. SENO");
            System.out.println("7. TANGENTE");
            System.out.println("8. POTENCIA");
            System.out.println("9. RAIZ CUADRADA");
            System.out.println("10. PORCENTAJE DE IVA");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    operaciones("SUMA", calcu1);
                    break;
                case 2:
                    operaciones("RESTA", calcu1);
                    break;
                case 3:
                    operaciones("MULTIPLICACION", calcu1);
                    break;
                case 4:
                    operaciones("DIVISION", calcu1);
                    break;
                case 5:
                    trigonometria("COSENO", calcu1);
                    break;
                case 6:
                    trigonometria("SENO", calcu1);
                    break;
                case 7:
                    trigonometria("TANGENTE", calcu1);
                    break;
                case 8:
                    potencia("POTENCIA", calcu1);
                    break;
                case 9:
                    raizCuadrada("RAIZ CUADRADA", calcu1);
                    break;
                case 10:
                    operaciones("PORCENTAJE DE IVA", calcu1);
                    break;
                case 0:
                    System.out.println("Calculadora cerrada");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }

    private static void operaciones(String operacion, Calculadora calcu1) {
        System.out.println(operacion);
        System.out.print("Ingrese el numero 1: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("Ingrese el numero 2: ");
        float b = new Scanner(System.in).nextFloat();
        calcu1.num1 = a;
        calcu1.num2 = b;

        switch (operacion) {
            case "SUMA":
                calcu1.suma();
                break;
            case "RESTA":
                calcu1.resta();
                break;
            case "MULTIPLICACION":
                calcu1.multi();
                break;
            case "DIVISION":
                calcu1.divi();
                break;
            case "PORCENTAJE DE IVA":
                calcu1.iva();
                break;
        }

        System.out.println("El resultado de " + operacion + " es: " + calcu1.result);
    }

    private static void trigonometria(String operacion, Calculadora calcu1) {
        System.out.println(operacion);
        System.out.print("Ingrese el ángulo: ");
        double angu = new Scanner(System.in).nextDouble();

        switch (operacion) {
            case "COSENO":
                double coseno = calcu1.cos(angu);
                System.out.println("El coseno de " + angu + " grados es " + coseno);
                break;
            case "SENO":
                double seno = calcu1.seno(angu);
                System.out.println("El seno de " + angu + " grados es " + seno);
                break;
            case "TANGENTE":
                double tangente = calcu1.tan(angu);
                System.out.println("La tangente de " + angu + " grados es " + tangente);
                break;
        }
    }

    private static void potencia(String operacion, Calculadora calcu1) {
        System.out.println(operacion);
        System.out.print("Ingrese la base: ");
        double base = new Scanner(System.in).nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = new Scanner(System.in).nextDouble();
        double potencia = calcu1.poten(base, exponente);
        System.out.println("La potencia es: " + potencia);
    }

    private static void raizCuadrada(String operacion, Calculadora calcu1) {
        System.out.println(operacion);
        System.out.print("Ingrese el numero: ");
        double numero = new Scanner(System.in).nextDouble();
        double raiz = calcu1.raizCuadra(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
    }
}
