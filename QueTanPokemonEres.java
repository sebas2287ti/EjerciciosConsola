import java.util.Scanner;

public class QueTanPokemonEres {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Cual inicial de pokemon eres?");

        System.out.println("Que tipo de clima prefieres?");
        System.out.println("1. Templado");
        System.out.println("2. Caluroso");
        System.out.println("3. Frio");
        int p1 = leer.nextInt();

        System.out.println("Te caracterizas por tu?");
        System.out.println("1. Ser pacienciente");
        System.out.println("2. Ser curioso");
        System.out.println("3. Ser enojon");
        int p2 = leer.nextInt();

        System.out.println("Cual letra te gusta mas");
        System.out.println("1. La S");
        System.out.println("2. La C");
        System.out.println("3. La B");
        int p3 = leer.nextInt();

        System.out.println("Cual elemento te atrae mas?");
        System.out.println("1. El fuego");
        System.out.println("2. El Agua");
        System.out.println("3. La Tierra");
        int p4 = leer.nextInt();

        System.out.println("Cual es tu color favorito de estos?");
        System.out.println("1. Verde");
        System.out.println("2. Rojo");
        System.out.println("3. Azul");
        int p5 = leer.nextInt();

        int suma = p1 + p2 + p3 + p4 + p5;

        if (suma <= 7) {
            System.out.println("Eres como Bulbasaur");
        } else if (suma <= 11) {
            System.out.println("Eres como Charmander");
        } else {
            System.out.println("Eres como Squirtler");
        }
    }
}
