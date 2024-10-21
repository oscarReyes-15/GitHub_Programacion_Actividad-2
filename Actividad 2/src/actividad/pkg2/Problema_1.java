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
public class Problema_1 {
    public static void main(String[] args) {
        //Diccionario de Variables
        float Celsius, Farenheit;
        Scanner entradaCelcius = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.println("Ingrese temperatura en Farenheit: ");
        Farenheit = entradaCelcius.nextFloat();
        
        //Formula matematica
        Celsius = (Farenheit - 32) * 5/9;
        
        //Salida de datos
        System.out.print("La temperatura en celsius es: " + Celsius + "\n");
    }
}
