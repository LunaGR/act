
package actividad06.Vehiculos;

import java.io.BufferedReader;
import java.io.InputStreamReader;


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
        
        
    public static int pidevalor(int valormin, int valormax) {
        int valor = 0;
        do {
            valor = pideEntero ("Introduce un valor entre "+valormin+" y " +valormax+"\n");
            if ((valor < valormin) || (valor > valormax)) {
                System.out.println("El valor debe ser entre "+valormin+ " y "+valormax+"\n");
            }
        } while ((valor < valormin) || (valor > valormax));
        return valor;
    }  
    

    static String pideString(String introduce_la_matricula_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static int pidevalor(int i, int i0, String indica_el_numero_de_plazas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
