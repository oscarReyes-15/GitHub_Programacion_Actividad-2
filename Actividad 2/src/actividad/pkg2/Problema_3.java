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
public class Problema_3 {
    public static void main (String[] args){
        //Diccionario de Variables 
        double base, altura, perimetro, area, Menu;
        Scanner entradaDatos = new Scanner(System.in);
        
        //Ingreso de Datos
        System.out.println("Ingrese las medidas de la base: ");
        base = entradaDatos.nextDouble();
        System.out.println("Ingrese las medidas de la altura: ");
        altura = entradaDatos.nextDouble();
        
        //Menu
        System.out.println("Desea calcular perimetro (1) o area de su rectangulo (2) ?: ");
        Menu = entradaDatos.nextDouble();
        
        //Salida de Datos
        if (Menu == 1) {
            perimetro = (base * 2) + (altura * 2);
            System.out.print("El perimetro de su rectangulo es: " + perimetro);
        } 
        else {if (Menu == 2){
            area = base * altura;
            System.out.print("El area de su rectangulo es: " + area + "\n" );
            
            }
        }
        
    }
}
