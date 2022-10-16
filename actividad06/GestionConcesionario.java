
package actividad06;

import actividad06.Vehiculos.*;
import actividad06.Seguro.*;

import java.io.*;


public class GestionConcesionario {
    private static IAlquilable [] alquilados;

    
    public static void main (String[]args) throws IOException {
        Seguros seguro01 = new Seguros("Seguro quitamultas","Solo tiene lo básico",20);
        Seguros seguro02 = new Seguros("Seguro Super","Tiene cosas que no vas a usar en la vida",30);
        Seguros[] seguros = {seguro01, seguro02};

        Coche coche1 = new Coche("2455KNG","Kia",5,"C");
        Coche coche2 = new Coche("2415LM", "Peugeot",3,"A");

        Carga furgoneta01 = new Carga("4018DRR","Frago-Neta",7,30);
        Carga furgoneta02 = new Carga("2214JKH","Furgo-prox",7,45);

        Vehiculo[] flota = new Vehiculo[4];

        flota[0] = coche1;
        flota[1] = coche2;
        flota[2] = furgoneta01;
        flota[3] = furgoneta02;

        int opcion_lgr;
        System.out.println("¡Hola!");//
        do{
            System.out.println("Dime, ¿qué quieres hacer?");//venga, a continuar
            System.out.println("\n 1\t Mostrar flota"+
                               "\n 2\t Mostrar Seguros"+//venga, a continuar
                               "\n 3\t Reiniciar alquiler"+
                               "\n 4\t Establecer numeros de dias de alquiler"+
                               "\n 5\t Mostrar alquiler"+
                               "\n 0\t Salir");
            opcion_lgr = Pregunta.pidevalor(0, 5);

            switch (opcion_lgr) {
                case 1:
                    muestraflota(flota);           
                    break;
                case 2:
                    muestraseguros(seguros);
                    break;
                case 3:
                    reiniciarAlquiler(flota,seguros);
                    break;
                case 4:
                    setDiasAlquiler();
                    break;
                case 5:
                    muestraAlquiler();
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
        } while (opcion_lgr !=0);
    }
    
        
                
    public static void muestraflota(Vehiculo[] flota) {
        System.out.println("\n Vehiculos Disponibles");
        for (int f =0; f < flota.length; f++) {
            System.out.println(f + "-"+ flota[f]);
        }
    }
    
    //mostrar info de los seguros
    public static void muestraseguros (Seguros[] seguros){
       System.out.println("\n Seguros Disponibles");
        for (int s =0; s < seguros.length; s++) {
            System.out.println(s + "-"+ seguros[s]);
        } 
    }
    
    public static void reiniciarAlquiler (Vehiculo[] flota, Seguros[] seguros){
        System.out.println("Cuantos vehiculos o seguros quieres contratar");
        int totalAlquilables = Pregunta.pidevalor(1, 5);
        alquilados = new IAlquilable[totalAlquilables];
        int totalAlquilados = 0;

        do{
            System.out.println("Proceso: Alquilando "+ (totalAlquilados+1)+" seguro/s o coche/s de "+(totalAlquilados+1));
            System.out.println("1- Añadir un vehiculo al alquiler \n2- Añadir un seguro al alquiler");
            int opcion_lgr = Pregunta.pidevalor(1, 2);
            
            switch (opcion_lgr){
                case 1:
                    muestraflota(flota);
                    System.out.println("Indica el numero de vehiculo a añadir: ");
                    int numeroVehiculo = Pregunta.pidevalor(0, flota.length);
                    
                    alquilados [totalAlquilados]= flota[numeroVehiculo];
                break;
                case 2:
                    muestraseguros(seguros);
                    System.out.println("Indica el numero del seguro  a añadir: ");
                    int numeroSeguro = Pregunta.pidevalor(0, seguros.length);
                    alquilados [totalAlquilados]= seguros[numeroSeguro];
                break;
            }
            totalAlquilados++;
        }    while (totalAlquilados != totalAlquilables);
        System.out.println("¡Listo! A otra cosa, mariposa");
    }
    
    public static void setDiasAlquiler() {
        System.out.println("¿Cuantos dias dura el alquiler?");
        int diasAlquiler = Pregunta.pidevalor(1, 30);
        for (int d = 0; d< alquilados.length; d++) {
            alquilados[d].setnDias(diasAlquiler);
        }
        System.out.println(" Gracias");
    }
    
    public static void muestraAlquiler(){
        System.out.println("\t Alquiler actual: ");
        for (int l = 0; l < alquilados.length; l++) {
        System.out.println(l + "-"+ alquilados[l]);
        }
    }
}
