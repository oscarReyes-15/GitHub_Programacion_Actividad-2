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
public class Problema_4 {
    public static void main(String[] args){
    
    //Diccionario de Variables 
    String Equipo;
    int Victorias, Empates, Perdidas, puntosTotal, partidosTotal;
    Scanner Entrada = new Scanner(System.in);
    
    //Entrada de Datos
    System.out.print("***Puntos por Equipo*** \nIngrese el nombre del equipo: ");
    Equipo = Entrada.nextLine();
    
            //Datos de victorias y perdidas
    System.out.println("Ingrese la cantidad de partidos ganados: ");
        Victorias = Entrada.nextInt();
    System.out.println("Ingrese la cantidad de partidos empatados: ");
        Empates = Entrada.nextInt();
    System.out.println("Ingrese la cantidad de partidos perdidos: ");
        Perdidas = Entrada.nextInt();
    
    //Proceso
    puntosTotal = (Victorias * 3) + (Empates * 1);
    partidosTotal = Victorias + Empates + Perdidas;
    
    //Salida
    System.out.print("\nEl equipo " + Equipo + 
            " tiene: \nVictorias: " + Victorias + 
            "\nEmpates: " + Empates + 
            "\nPerdidas: " + Perdidas + "\nPartidos Totales: " + partidosTotal + 
            "\nCon un puntaje total de: " + puntosTotal + "\n");
    
 }
}
