/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad03.IntroduceDatos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Luna
 */
public class Pregunta {

    public static int pideEntero(String pregunta_lgr) {
        int numero = 0;
        do {
            System.out.print(pregunta_lgr);
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                
                numero = Integer.parseInt(br.readLine());
                break;
            } catch (Exception e) {
                System.out.println("LGR: No puede ser una letra");
            }
        } while (true);
        return numero;
    }

    public static double pideDouble(String pregunta_lgr) {
        double numero = 0;
            do {
                System.out.print(pregunta_lgr);
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                
                numero = Double.parseDouble(br.readLine());
                break;
            } catch (Exception e) {
                System.out.println("LGR: No puede ser una letra");
            }
        } while (true);
        return numero;
    }
}


