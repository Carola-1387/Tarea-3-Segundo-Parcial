import java.util.Scanner;
public class Ejercicio1
{
    public static void main(String [] args)
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un nombre");
        String n = t.nextLine();
        System.out.println("Ingresa un apellido");
        String a = t.nextLine();
        System.out.println("Hola mi nombre es: " +n);
        System.out.println("Mi apellido es: " +a);
    }
}