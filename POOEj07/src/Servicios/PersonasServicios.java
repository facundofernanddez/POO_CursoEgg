
package Servicios;

import Entidades.PersonasEntidades;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class PersonasServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public PersonasEntidades crearPersona(){
        System.out.println("Introduzca su nombre");
        String nombre = leer.next();
        System.out.println("Introduzca su edad");
        int edad = leer.nextInt();
        System.out.println("Introduzca su sexo H/M/O");
        String sexo = leer.next();
        while (sexo != "H" || sexo != "M" || sexo != "O"){
            System.out.println("Ha ingresado una letra incorrecta, vuelva a intentarlo");
            sexo = leer.next();
        }
        System.out.println("Introduzca su peso");
        double peso = leer.nextDouble();
        System.out.println("Introduzca su altura");
        double altura = leer.nextDouble();
        
        
        return new PersonasEntidades(nombre, edad, sexo, peso, altura);
    }
}
