import java.util.Scanner;

public class Hello {
    public static void main (String args []) {
        Scanner leer = new Scanner (System.in);

        System.out.println("¿Como te llamas?");

        String name = leer.nextLine();

        System.out.println("Hola " + name + " te hablo desde la consola de java");
    }
}