package ejercicioaulau2;

import java.util.Scanner;

/**
 *
 * @author Damian Dries
 */
public class EjercicioAulaU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = datos.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = datos.nextLine();
        System.out.println("Ingrese su edad");
        String edad = datos.nextLine();
        System.out.println("Ingrese su hobbie");
        String hobbie = datos.nextLine();
        System.out.println("Ingrese su editor de codigo favorito");
        String editor = datos.nextLine();
        System.out.println("Ingrese sistema operativo que usa");
        String sistema = datos.nextLine();
        int anio = Integer.parseInt(edad);
        System.out.println("Su Nombre Es: "+nombre+"\n"+"Su Apellido Es: "+apellido+"\n"
        +"Su Edad Es: "+anio+"\n"+"Su Hobbie Es: "+hobbie+"\n"+"Su Editor Preferido Es: "+editor+"\n"
        +"El Sistema Operativo Que Usa Es: "+sistema);
        
        
        
    }
    
}
