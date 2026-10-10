import java.util.Scanner;



public class Psicologo{
    public static void main (String [] args){
        
        Scanner in = new Scanner (System.in);
        String Nombre;
        String Problema;
        String Respuesta;

        System.out.println("Buenos días ¿Cuál es tu nombre?");
        Nombre = in.nextLine();
        System.out.println("Hola " + Nombre + " ¿Cuál es tu problema?" );
        Problema = in.nextLine();
        System.out.println("MMMMM... ya veo" );
        System.out.println("Y digame..." );
        System.out.println("¿Porque dice " + Problema + "?" );
        Respuesta = in.nextLine();
        System.out.println("¡Muy interesante! Hablaremos de ello con más detalle en la proxima sesión.");

    }
    
}
