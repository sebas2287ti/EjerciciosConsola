import java.util.Scanner;

public class FuncionesBasicas {
    public static int sumarDosNumeros(int a, int b){
        return a+b;
    }

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero para ser sumado: ");
        int numeroA = leer.nextInt();
        System.out.println("Ingresa el segundo numero para ser sumado: ");
        int numeroB = leer.nextInt();
        System.out.println("La suma de los numeros: " + numeroA + " + " + numeroB + " = " + sumarDosNumeros(numeroA, numeroB));
    }
}