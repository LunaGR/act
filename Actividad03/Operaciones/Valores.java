package Actividad03.Operaciones;

import Actividad03.IntroduceDatos.Pregunta;

public class Valores {
    public static void muestraPi(){   
        System.out.println("El Número Pi es "+ Math.PI);
    }
    
    
    public static void muestraValorAbsoluto(){   
        double numero_lgr=Pregunta.pideDouble("introduce num para saber su valor absoluto ");
        double valorabsoluto_lgr = Math.abs(numero_lgr);
        
        System.out.println("El valor absoluto es "+ valorabsoluto_lgr);
    }
    
    
    public static void muestraValorAleatorio(){   
        double valor_R_lgr = Math.random();
        System.out.println("Valor random " + valor_R_lgr);
    }
}
