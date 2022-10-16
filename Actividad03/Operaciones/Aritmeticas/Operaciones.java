/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad03.Operaciones.Aritmeticas;

import Actividad03.IntroduceDatos.Pregunta;

/**
 *
 * @author Luna
 */
public class Operaciones {
    public static void MuestraLogaritmo(){
        double numero_lgr = Pregunta.pideDouble ("Introduce valor ");
        double Valor_log_lgr = Math.log(numero_lgr);
        
        System.out.println("El valor total del logaritmo es "+ Valor_log_lgr);
    }
    
    public static void CalculaPotencia (){
        double numero_lgr = 0, numero2_lgr = Pregunta.pideDouble ("Introduce valor ");
        double valor_P_lgr = Math.pow(numero_lgr, numero2_lgr);
        
        System.out.println("El resultado es "+ valor_P_lgr);
    }
    
}
