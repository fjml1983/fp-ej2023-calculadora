/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 * @author FJML1983
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Presentar menu al usuario
        pintarMenu();
        // Determinar la operación a realizar
        double res = procesarOperación();
        //Imprimir el resultado
        System.out.println("Resultado: " + res);
    }
    
    public static double procesarOperación(){
        // Leer del usuario la opción seleccionada
        Scanner lector = new Scanner(System.in);
        int opcionElegida = lector.nextInt();
        
        System.out.println("¿Cuál sería el valor para el primer operando?");
        int op1 = lector.nextInt();
        System.out.println("¿Cuál sería el valor para el segundo operando?");
        int op2 = lector.nextInt();
        
        double resultado = 0.0;
        
        switch (opcionElegida) {
            case 1:
                //Realizar suma
                resultado = op1 + op2;                
                break;
            case 2:
                //Realizar resta
                resultado = op1 - op2;
                break;
            case 3:
                //Realizar multiplicacion
                resultado = op1 * op2;
                break;
            case 4:
                //Realizar division
                resultado = (double)op1 / op2;
                break;
            default:
                System.out.println("Opción no válida.");
        }
        return resultado;
    }
    
    public static void pintarMenu(){
        System.out.println("Bienvenidos al programa");
        System.out.println("SUPER CALCULADORA");
        System.out.println("Elija una opción:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");    
    }
    
}
