/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author FJML1983
 */
public class LogicaApp {
    
    public double procesarOperación(){                
        //Instancia de clase especialista en GUI
        CalculadoraGUI gui = new CalculadoraGUI(); 
        //Instancia de clase especialista en realizar operaciones
        Operaciones op = new Operaciones();        
        
        //Variables que se ocuparán en el proceso
        double op1 = 0.0;  //representa el primer operando
        double op2 = 0.0;  //representa el segundo operando
        double resultado = 0.0;  //almacenará el resultado de la operación aplicada sobre los dos operandos        
        
        //Con apoyo de gui identificar la operación que desea el usuario.
        int opcionElegida = gui.leerOpcionElegida();
                        
        //Si el usuario eligió una operación válida se solicitarán los valores para los operandos.
        if (opcionElegida >= 1 && opcionElegida <=4){
            double[] operandos = gui.solicitarOperandos();
            op1 = operandos[0];
            op2 = operandos[1];
        }                        
        
        //Una vez que se tienen los valores de los operandos realizar la operación seleccionada.
        switch (opcionElegida) {
            case 1 -> //Realizar sumar
                resultado = op.sumar(op1, op2);
            case 2 -> //Realizar restar
                resultado = op.restar(op1, op2);
            case 3 -> //Realizar multiplicacion
                resultado = op.multiplicar(op1, op2);
            case 4 -> //Realizar division
                resultado = op.dividir(op1, op2);                
            case 5 -> //Si eligió salir, terminar el programa elegantemente.
                gui.terminarPrograma();                
            default -> //Si escribió alguno otra opción que no aparece en el menú.
                System.out.println("Opcion de operacion no valida, seleccione una del menu.");
        }
        return resultado;
    }

    
}
