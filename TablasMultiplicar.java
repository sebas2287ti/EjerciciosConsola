import java.util.Scanner;

public class TablasMultiplicar {
    public static void main (String args []) {

        Scanner Leer = new Scanner (System.in);
        System.out.println("ingresa un numero: ");
        int num = Leer.nextInt();
        System.out.println("ingresa hasta donde quieres calcular la tabla: ");
        int maximoTabla = Leer.nextInt();
        System.out.println("Esta es la tabla del: "+num);
        for (int i = 0; i <= maximoTabla; i++){
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}