package Actividad02;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Ejercicio01 {
     public static void main(String[] args) throws IOException {
        int i, opcion_LGR, posicion_LGR;
        double valor_LGR, total_LGR;
        double[] recipientes_LGR = new double[5];        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        //recuerda: los for se ponen duera de los do|while
        for(i = 0; i < 5; i++) {
        recipientes_LGR[i]= 0;
        }
        
        for(i = 0;i < 5; i++){
        System.out.println("El valor de la posición " + i + " es:" + recipientes_LGR[i]);
        System.out.println("");
        }         
        System.out.println("Introduzca la operación a realizar del siguiente menú de opciones: \n" +
            "1- Añadir refresco a un recipiente. \n" +
            "2- Quitar refresco de un recipiente. \n" +
            "3- Calcular el total de refresco. \n" +
            "0- Finalizar\n");  
        
	do { //do-while basico controlado//                
            System.out.println("Introduce un valor");
            try { //punto de control de errores//
                opcion_LGR = Integer.parseInt(br.readLine());
            } catch (Exception e){
                opcion_LGR =-1;
            }
                                   
            switch (opcion_LGR){
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1: //Añadir refrescos                         
                    do { //este es el de posición//
                        System.out.println("Introduce posición");
                        try { //otro punto de control los errores//
                        posicion_LGR = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            posicion_LGR = -1;
                        }               
                        if ((posicion_LGR <0) || (posicion_LGR >=5)) {
                            System.out.println("Valor tiene que ser entre 0 y 4");
                        }        
                   } while ((posicion_LGR <0) || (posicion_LGR >5));
                                                     
                    do { //este es el de valor//
                        System.out.println("Introduce valor"); 
                        try { //punto de control de errores de valor//
                            valor_LGR = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            valor_LGR = -1;
                        }                               
                        if ((recipientes_LGR [posicion_LGR] + valor_LGR) < 0) {
                            System.out.println("El valor de los recipientes no puede ser negativo");
                        }
                    } while ((recipientes_LGR [posicion_LGR] + valor_LGR) <0);
                        
                    recipientes_LGR [posicion_LGR]+= valor_LGR;                                  
                                                                                   
                    for(i = 0;i < 5; i++){
                        System.out.println("El valor de la posición " + i + " es:" + recipientes_LGR[i]);
                        System.out.println("");
                    }                          
                    break;
                    
                case 2: //Eliminar los refrescos                          
                    do { //este es el de posición//
                        System.out.println("Introduce posición");
                        try { //otro punto de control los errores//
                        posicion_LGR = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            posicion_LGR = -1;
                        }               
                        if ((posicion_LGR <0) || (posicion_LGR >=5)) {
                            System.out.println("Valor tiene que ser entre 0 y 4");
                        }        
                   } while ((posicion_LGR <0) || (posicion_LGR >5));
                    
                    do { //este es el de valor//
                        System.out.println("Introduce valor"); 
                        try { //punto de control de errores de valor//
                        valor_LGR = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No se puede una letra");
                            valor_LGR = -1;
                        }                               
                        
                        if ((valor_LGR) < 0) {
                            System.out.println("El valor introducido no puede ser negativo");
                        }
                        if ((recipientes_LGR [posicion_LGR] - valor_LGR) < 0) {
                            System.out.println("El valor de los recipientes no puede ser negativo");
                        }
                    } while (( (valor_LGR) <0) || (recipientes_LGR[posicion_LGR] -valor_LGR) <0);
                        
                    recipientes_LGR [posicion_LGR] -= valor_LGR;                                  
                                                                                   
                    for(i = 0;i < 5; i++){
                        System.out.println("El valor de la posición " + i + " es:" + recipientes_LGR[i]);
                        System.out.println("");
                    }                          
                    break;
                case 3:
                    total_LGR = 0;
                    for (i = 0; i <5; i++) {
                        total_LGR = total_LGR + recipientes_LGR[i];
                    }
                    System.out.println("El estado actual de los recipientes es:" + total_LGR);
                    break;
                    
                default:
                        System.out.println("Valor no valido");
            }                    
	} while (opcion_LGR !=0); 
                
    }
}
                                    
