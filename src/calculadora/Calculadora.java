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
        CalculadoraGUI gui = new CalculadoraGUI();
        // Presentar menu al usuario
        gui.pintarMenu();
        // Determinar la operación a realizar
        double res = procesarOperación();
        //Imprimir el resultado
        System.out.println("Resultado: " + res);
    }
    
    public static double procesarOperación(){
        
        //TODO: falta integrar la solicitud de datos al usuario
        CalculadoraGUI gui = new CalculadoraGUI();
        int opcionElegida = gui.leerOpcionElegida();
        int[] operandos = gui.solicitarOperandos();
        int op1 = operandos[0];
        int op2 = operandos[1];
        
        double resultado = 0.0;
        
        Operaciones op = new Operaciones();
        
        switch (opcionElegida) {
            case 1:
                //Realizar suma
                //resultado = op1 + op2;                
                resultado = op.suma(op1, op2);
                break;
            case 2:
                //Realizar resta
                resultado = op.resta(op1, op2);
                break;
            case 3:
                //Realizar multiplicacion
                resultado = op.multiplica(op1, op2);
                break;
            case 4:
                //Realizar division
                resultado = op.divide(op1, op2);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
        return resultado;
    }
    
    
}
