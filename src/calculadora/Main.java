/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraGUI gui = new CalculadoraGUI();
        LogicaApp logica = new LogicaApp();        
        
        while (true) {            
            // Presentar menu al usuario
            gui.pintarMenu();
            // Determinar la operación a realizar        
            double res = logica.procesarOperación();
            //Imprimir el resultado
            gui.presentarResultado(res);            
        }
    }    
    
}
