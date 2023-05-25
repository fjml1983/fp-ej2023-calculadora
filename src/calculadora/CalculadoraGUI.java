/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author FJML1983
 */
public class CalculadoraGUI {
    public void pintarMenu(){
        System.out.println("Bienvenidos al programa");
        System.out.println("SUPER CALCULADORA");
        System.out.println("Elija una opcion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");    
    }

    public int leerOpcionElegida(){
        // Leer del usuario la opción seleccionada
        Scanner lector = new Scanner(System.in);
        int opcionElegida = lector.nextInt();
        
        return opcionElegida;
    }
    
    public int[] solicitarOperandos(){
        Scanner lector = new Scanner(System.in);
        int[] operandos = new int[2];
        System.out.println("¿Cual seria el valor para el primer operando?");
        operandos[0] = lector.nextInt();
        System.out.println("¿Cual seria el valor para el segundo operando?");
        operandos[1] = lector.nextInt();    
        return operandos;
    }

    
}
