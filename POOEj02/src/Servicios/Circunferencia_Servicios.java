/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Circunferencia_Servicios {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Escriba el valor del radio");
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    }
    
    public void area(Circunferencia circ1) {
       double area = (Math.PI) * (circ1.getRadio() * circ1.getRadio());
    }
    
}
