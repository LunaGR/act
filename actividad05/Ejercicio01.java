
package actividad05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Ejercicio01 {
    public static void main (String [] args) throws Exception {        
        //mostrar datos del artista creado
        Artista art = new Artista();   
        art.setDni("12345678N");
        art.setNombre("Elsa");
        art.setFecha_nac(1991);
        art.setSexo("Mujer");
        /*usando el set accedemos a los atributos declarados de la clase artista sin tener que crearla
        * de nuevo, mientras que el get nos devuelve el valor del atributo*/
        System.out.println("\tArtista:\nNombre:"+art.getNombre()+"\nDNI:"+art.getDni()+"\nFecha nacimiento:"+art.getFecha_nac()+"\nSexo:"+art.getSexo());
        System.out.println(); 
        
        //mostrar datos del dibujante creado
        Dibujante dbj = new Dibujante("55178463K","Salvatore",1984,"Hombre","Exposición Uknow", "sand´s time",350000);
        
        System.out.println("\tInfo del dibujante: \nNombre:"+dbj.getNombre()+"\nDNI: "+dbj.getDni()+"\nFecha nacimiento:"+dbj.getFecha_nac()+"\nSexo: "+dbj.getSexo()+
                "\nUltima exposición:"+dbj.last_expo_lgr+ "\nCuadro más caro:"+dbj.cuadro_caro_lgr+ "\nPrecio del cuadro más caro:"+dbj.price_cuadro_caro_lgr);
        System.out.println();
               
        Musico msc = new Musico();
        
        msc.setDni("415761N");
        msc.setNombre("Narci");
        msc.setFecha_nac(1995);
        msc.setSexo("Hombre");
        msc.setsiteweb_lgr("www.Saurom.es");
        msc.settitle_last_sing_lgr("Musica");
        
        System.out.println("\tInfo del musico: \nNombre:"+msc.getNombre()+"\nDNI:"+msc.getDni()+"\nFecha nacimiento:"+msc.getFecha_nac()+"\nSexo:"+msc.getSexo()+"\nSitio Web:"+msc.getsiteweb_lgr()+
                "\nUltima canción:"+msc.gettitle_last_sing_lgr());
        System.out.println();
        
        //tenemos el array creado en la clase de musicos
        msc.mostrarCanciones();

    }
             
}
