/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Problema_2 {
    public static void main(String[] args){
    
    //Diccionario de Variables
    double examenFinal, trabajoFinal, califiFinales, CalificacionFinal;
    Scanner entradaDatos = new Scanner(System.in);

    //Entrada de Datos
    System.out.println("Ingrese la nota de  su examen final (De 100%) : ");
        examenFinal = entradaDatos.nextDouble();
    System.out.println("Ingrese la nota de su trabajo final: ");
        trabajoFinal = entradaDatos.nextDouble();
    System.out.println("Ingrese el promedo de los ultimos 3 parciales: ");
        califiFinales = entradaDatos.nextDouble();
           
    //Proceso o Calculo    
    examenFinal = examenFinal * 0.3;
    trabajoFinal = trabajoFinal * 0.15;
    califiFinales = califiFinales * 0.55;
    
    //Salida de datos
    CalificacionFinal = examenFinal + trabajoFinal + califiFinales;
    System.out.println("Su nota es: " + CalificacionFinal + "%\n");            
}
}