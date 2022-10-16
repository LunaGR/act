package Actividad03.Operaciones.Geometricas;

import Actividad03.IntroduceDatos.Pregunta;

public class Operaciones {
    public static void muestraSeno(){
        double numero_lgr = Pregunta.pideDouble("Introduce dato para calcular el Sin ");
        double V_Sin_lgr = Math.sin (numero_lgr);
        
        System.out.println("\n El resultado es "+ V_Sin_lgr);
    }
    public static void muestraCoseno(){
        double numero_lgr = Pregunta.pideDouble("Introduce dato para calcular el cos ");
        double V_Cos_lgr = Math.cos(numero_lgr);
        
        System.out.println("\n El resultado es "+ V_Cos_lgr);
    }
}
