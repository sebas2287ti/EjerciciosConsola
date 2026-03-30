import java.util.Scanner;

public class FuncionesConStrings {

    public static String ConCat3(String cadena){
        return cadena.concat(cadena).concat(cadena);
    }

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String nombre = sn.nextLine();

        System.out.println("Escribe Algo");
        String cadena = sn.nextLine();

        System.out.println(ConCat3(cadena));


        int resultado1 = sumar(11, 1);
        System.out.println(resultado1);

        int resultado2 = sumar(15, 3);
        System.out.println(resultado2);

        OtraSuma(90, 9);

        System.out.println(Resultado(Contar(nombre)));

    }

    public static String Resultado(int Contando){
        return "Tu nombre tiene "+Contando+" letra";
    }

    public static int Contar(String name){
        return name.length();
    }

    public static String Mayus(String name){
        return name.toUpperCase().concat(" Bienvenido ");
    }

    public static void OtraSuma(int a, int b){
        System.out.println("El resultado es: "+(a+b));
    }

    public static int sumar(int a, int b){
        return a+b;
    }
}
