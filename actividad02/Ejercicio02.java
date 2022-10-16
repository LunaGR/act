/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad02;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
/**
 *
 * @author Luna
 */
public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        int i,j, opcion_lgr;
        double valorMax_lgr, valor_lgr =0.0;
        String [][] puntuaciones_lgr = new String [4][4];
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        //Informacion de la tabla
        puntuaciones_lgr [0][0]= "M01";
        puntuaciones_lgr [0][1]= "8";
        puntuaciones_lgr [0][2]= "9";
        puntuaciones_lgr [0][3]= "10";
        puntuaciones_lgr [1][0]= "M02";
        puntuaciones_lgr [1][1]= "6";
        puntuaciones_lgr [1][2]= "9";
        puntuaciones_lgr [1][3]= "8";
        puntuaciones_lgr [2][0]= "M03";
        puntuaciones_lgr [2][1]= "4";
        puntuaciones_lgr [2][2]= "5";
        puntuaciones_lgr [2][3]= "5";
        puntuaciones_lgr [3][0]= "M04";
        puntuaciones_lgr [3][1]= "10";
        puntuaciones_lgr [3][2]= "4";
        puntuaciones_lgr [3][3]= "9";
        

        //para sacar los datos de la tabla en pantalla
            System.out.println("Los valores del array bidimensional son:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(puntuaciones_lgr[i][j] + "   ");
            } 
            System.out.println("");
        }
        do { // menú here
            System.out.println("\n Indica la opción del siguinte menú:\n" +
                "1-Mostrar nombre de todas las asignaturas.\n" +
                "2-Mostrar la puntuacion mayor de cada una de las asignaturas.\n" +
                "3-Modificar la puntuación de una asignatura.\n" +
                "4-Mostrar todos los valores de array bidimensional.\n" +
                "0-Salir");
            try { //excepciones para controlar errores
                opcion_lgr = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                opcion_lgr = -1;
                System.out.println("No se puede una letra.");
            }
            switch (opcion_lgr) {
                case 0: 
                    System.out.println("Fin de programa");
                    break;
                case 1:  
                    for (i = 0; i < 4; i++) {                        
                            System.out.print(puntuaciones_lgr[i][0] + "   ");
                    }
                    break;
                case 2:  
                    for (j = 0; j <4; j++){
                        valorMax_lgr = Double.parseDouble(puntuaciones_lgr [j][1]);
                        for (i = 2; i <4; i++) {                           
                            if (valorMax_lgr < Double.parseDouble(puntuaciones_lgr [j][i]) ){
                                valorMax_lgr = Double.parseDouble(puntuaciones_lgr [j][i]); 
                            }
                        }
                        System.out.println("Valor máximo de la posicion " + puntuaciones_lgr [j][0] + " es:" + valorMax_lgr);
                    } //acuerdate de poner lo de puntuaciones [][] en el siguiente caso o saldrán sólo números                  
                    break;
                case 3:
                    do { 
                        System.out.println("Introduce posición (entre 0 y 3)");
                        try { 
                            i = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            i = -1;
                        }               
                        if (i < 0 || i > 3) {
                            System.out.println("Valor incorrecto");
                        }        
                    } while (i < 0 || i > 3);
                    
                    do { 
                        System.out.println("Introduce el segundo numero de la posición de la asignatura cuya puntuacion quieres modificar (entre 1 y 3)");
                        try { 
                            j = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            j = -1;
                        }               
                        if (j < 1 || j > 3) {
                            System.out.println("Valor incorrecto");
                        }        
                   } while (j < 1 || j > 3);
                        System.out.println("El valor actual en la posición "+ i+"," +j+ " es " +puntuaciones_lgr [i][j]);                          
                        
                    do { //aqui seria la modificación de datos
                        System.out.println("Indica el nuevo valor (entre 0 y 10)");
                        try { 
                            valor_lgr = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            valor_lgr = -1;
                        }                               
                        if (valor_lgr <0 || valor_lgr > 10) {
                            System.out.println("El valor no puede ser negativo");
                        }
                    } while (valor_lgr <0 || valor_lgr > 10);                                                                                                                                                                
                    System.out.println("El valor actual en la posición "+ puntuaciones_lgr [0][0] + " es " + valor_lgr);                          
                                          
                    break;
                case 4: //todos los datos guardados
                    for (i = 0; i < 4; i++) {
                        for (j = 0; j < 4; j++) {
                            System.out.print(puntuaciones_lgr[i][j] + "   ");
                        } 
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("Valor no válido");
            }
        } while (opcion_lgr != 0);
    }
}
