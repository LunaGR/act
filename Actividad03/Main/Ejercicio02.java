/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad03.Main;

import Actividad03.IntroduceDatos.Pregunta;
import static Actividad03.IntroduceDatos.Pregunta.pideEntero;
import static Actividad03.Operaciones.Aritmeticas.Operaciones.CalculaPotencia;
import static Actividad03.Operaciones.Aritmeticas.Operaciones.MuestraLogaritmo;
import static Actividad03.Operaciones.Geometricas.Operaciones.muestraCoseno;
import static Actividad03.Operaciones.Geometricas.Operaciones.muestraSeno;
import static Actividad03.Operaciones.OperacionesLinkia.ConversionLinkiaCoin;
import static Actividad03.Operaciones.Valores.muestraPi;
import static Actividad03.Operaciones.Valores.muestraValorAbsoluto;
import static Actividad03.Operaciones.Valores.muestraValorAleatorio;

public class Ejercicio02 {
    
    public static void main (String[] args) {
        
        int opcion_lgr = 0;
        do{
        //recuerda que el menu va dentro del do-while
        
            System.out.println("\n Por favor, haga su elección: \n" +
            "0.-Calcular LinkiaCoins \n" +
            "1.-Muestra en número pi \n" +
            "2.-Valor absoluto de un número \n"+
            "3.-Generar un valor aleatorio \n" +
            "4.-Logaritmo de un número\n" +
            "5.-Potencia de un número \n" +
            "6.-Calcula el seno de un número \n" +
            "7.-Calcula el coseno de un double\n" +
            "8.-Salir \n"
            );


            opcion_lgr = Pregunta.pideEntero("Elige una opción ");

            switch (opcion_lgr) {
                case 0: //para vincular los javas solo pon el nombre de public static void e importa los package
                   ConversionLinkiaCoin();                                     
                    break;

                case 1:
                   muestraPi();
                    break;
                case 2:
                   muestraValorAbsoluto();
                    break;    
                case 3:
                    muestraValorAleatorio();
                    break;
                case 4:                
                    MuestraLogaritmo();
                    break;
                case 5:
                    CalculaPotencia();
                    break;
                case 6:
                    muestraSeno();
                    break;
                case 7:
                    muestraCoseno();
                    break;
                case 8:
                    System.out.println("\n ¡Hasta pronto!");
                break;
                default:
                System.out.println("Error \n Dato no válido");
            }
        }while (opcion_lgr != 8);        
    }

}
