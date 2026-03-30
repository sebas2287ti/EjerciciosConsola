import java.util.Scanner;

    public class VerificarEdad {
        public static void main(String args []) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese tu nombre:");
        String nombre = leer.nextLine();

        System.out.println(nombre + " ingresa tu año de nacimiento:");
        Short usuario = leer.nextShort();

        Short actual = 2026;
        Byte edad = (byte)(actual-usuario);
        if(edad<18){
            System.out.println("No puede entrar");
        }
        else{
            System.out.println("Bienvenido " + nombre);
        }
    }
}
