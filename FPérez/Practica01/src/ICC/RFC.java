import java.util.Scanner;



public class RFC{

    public static void main (String [] pps){

        Scanner in = new Scanner (System.in);
        String nombrecompleto = new String();
        String nombre, aPaterno, aMaterno;
        String Fechadenacimiento = new String();
        String dia, mes, año;

        System.out.println("Dame tu nombre completo");
        nombrecompleto = in.nextLine().trim();
        System.out.println("Ingresa tu fecha de nacimiento en formato dd/mm/aa"); 
        Fechadenacimiento = in.nextLine().trim(); 
        String [] partes = nombrecompleto.split(" ");
        nombre = partes[0];
        aPaterno = partes[1];
        aMaterno = partes[2];
        String [] partes2 = Fechadenacimiento.split("/");
        dia = partes2[0];
        mes = partes2[1];
        año = partes2[2];
        String RFC = aPaterno.substring(0,2) + aMaterno.substring( 0,1) + nombre.substring(0,1) + año.substring(0,2) + mes + dia;
        String RFC_Mayus = RFC.toUpperCase();
        System.out.println("El RFC de " + nombre + " es: " + RFC_Mayus);
        
        
        
         




    }


}



