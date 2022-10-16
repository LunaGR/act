package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebas {

    public static void main(String[] args) throws IOException {
        int i, variable_apm, posicion_apm;
        double valor_apm, total_apm;
        double[] recipientes_apm = new double[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i < 5; i++) {
            recipientes_apm[i] = 0;
            System.out.println("El valor en litros del número de recipiente " + i + " es: " + recipientes_apm[i]+".\n");
        }
        do {
            System.out.println("Para moverte por el menú: \n" + 
                    "1.Añadir un refresco a un recipiente.\n" + 
                    "2.Quitar refesco de un recipiente.\n" + 
                    "3.Calcular el total de refresco.\n" + 
                    "0.Para finalizar");
            try {
                variable_apm = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                variable_apm = -1;
            }
            switch (variable_apm) {
                case 0:
                    System.out.println("Finalizaste el programa!");
                    break;
                case 1:
                    //Pedimos la posición al usuario y controlamos los posibles fallos que rompan el programa.
                    do {
                        System.out.println("Introduce un número de recipiente (0-4) ");
                        try {
                            posicion_apm = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No puedes poner letras crack!");
                            posicion_apm = -1;
                        }
                        if ((posicion_apm < 0) || (posicion_apm >= 5)) {
                            System.out.println("El valor tiene que ser entre 0 y 4");
                        }
                    } while ((posicion_apm < 0) || (posicion_apm >= 5));
                    // Pedimos el valor al usuario y controlamos los posibles fallos que rompan el programa.
                    do {
                        System.out.println("Introduce un valor");
                        try {
                            valor_apm = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No puedes poner letras crack!");
                            valor_apm = -1;
                        }
                        if ((valor_apm) > 0) {
                            System.out.println("Las matemáticas nos dicen que el valor de los recipientes no puede ser negativo.");
                        }
                    } while ((valor_apm) < 0);
                    //Asignación pertinente.
                    recipientes_apm[posicion_apm] += valor_apm;
                    for (i = 0; i < 5; i++) {
                        System.out.println("El valor en litros del número de recipiente " + i + " es: " + recipientes_apm[i]);
                    }
                    break;
                case 2:
                    //Pedimos posición al usuario y controlamos posibles fallos que rompan el programa.
                    do {
                        System.out.println("Introduce un número de recipiente (0-4) ");
                        try {
                            posicion_apm = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No puedes poner letras crack!");
                            posicion_apm = -1;
                        }
                        if ((posicion_apm < 0) || (posicion_apm >= 5)) {
                            System.out.println("El valor tiene que ser entre 0 y 4");
                        }
                    } while ((posicion_apm < 0) || (posicion_apm >= 5));
                    //Pedimos el valor al usuario y controlamos posibles fallos que rompan el programa.
                    do {
                        System.out.println("Introduce un valor");
                        try {
                            valor_apm = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("No puedes poner letras crack!");
                            valor_apm = -1;
                        }
                        if ((valor_apm) < 0) {
                            System.out.println("El valor introducido no puede ser negativo, vuelve a intentarlo.");
                        }
                        if ((recipientes_apm[posicion_apm] - valor_apm) < 0) {
                            System.out.println("Las matemáticas nos dicen que el valor de los recipientes no puede ser negativo.");
                        }

                    } while (((valor_apm) < 0) || (recipientes_apm[posicion_apm] - valor_apm) < 0);
                    //Asignación pertinente.
                    recipientes_apm[posicion_apm] -= valor_apm;

                    for (i = 0; i < 5; i++) {
                        System.out.println("El valor en litros del número de recipiente " + i + " es: " + recipientes_apm[i]);
                    }
                    break;
                case 3:
                    total_apm = 0;
                    for (i = 0; i < 5; i++) {
                        total_apm = total_apm + recipientes_apm[i];
                    }
                    System.out.println("El total de refrescos es " + total_apm);
                    break;
                default:
                    System.out.println("Valor no válido");
            }

        } while (variable_apm != 0);

    }

}
