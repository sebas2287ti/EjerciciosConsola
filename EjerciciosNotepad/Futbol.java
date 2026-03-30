import java.time.LocalDate;
import java.time.LocalTime;

public class Futbol
{
    public static void main (String args[]){

        Persona p1 = new Persona();

        p1.nacimiento = LocalDate.of(1950, 03, 02);
        p1.id = 1;
        p1.nacionalidad = "Venezolana";
        p1.altura = 1.93;
        p1.peso = 81.3;

        Persona p2 = new Persona();

        p2.name = "Mencho";
        p2.id = 2;
        p2.nacionalidad = "Mexicana";

        Persona p3 = new Persona();

        p3.name = "Ayatola";
        p3.id = 3;
        p3.nacionalidad = "Irani";

    }
}
