
package actividad04;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class pregunta {
    
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
    
    
    //trabaja de esta manera por el momento, luego hazlo más sencillo, a ver si no se caga
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
}
   