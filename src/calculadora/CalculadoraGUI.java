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
        System.out.println(">--------Bienvenido al programa-------<");
        System.out.println("  __      _   _  _     _          _     ");
        System.out.println(" (_  | | |_) |_ |_)   /   /\\  |  /  | | ");
        System.out.println(" __) |_| |   |_ | \\   \\_ /--\\ |_ \\_ |_| ");
        System.out.println("---------------------------------------");                                                     
        
        System.out.println("Las operaciones soportadas son las siguientes:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");    
        System.out.println("5. Salir");    
    }

    public int leerOpcionElegida(){
        Scanner lector = new Scanner(System.in);
        
        // Leer del usuario la opción seleccionada
        System.out.print("Introduzca el numero de la operacion que desea realizar: ");
        int opcionElegida = lector.nextInt();
        
        return opcionElegida;
    }
    
    public double[] solicitarOperandos(){
        Scanner lector = new Scanner(System.in);
        double[] operandos = new double[2];
        
        System.out.print("Indique el valor para el primer operando: ");
        operandos[0] = lector.nextDouble();
        System.out.print("Indique el valor para el segundo operando: ");
        operandos[1] = lector.nextDouble();    
        return operandos;
    }

    public void presentarResultado(double resultado){
        Scanner lector = new Scanner(System.in);
        System.out.println("El resultado: " + resultado);
        System.out.print("Desea realizar otra operacion? [S/N]");
        String resp = lector.next();
        if(resp.toUpperCase().equals("N")){
            terminarPrograma();
        }
    }

    public void terminarPrograma() {                
        System.out.println("__________________________________");
        System.out.println("Gracias por utilizar SUPER CALCU!");
        System.out.println("que tenga buen dia! Adios.");
        System.out.println("[Programa terminado]");
        System.exit(0);
    }
    
}
