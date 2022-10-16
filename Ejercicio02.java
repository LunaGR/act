/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad01;

/**
 *
 * @author Luna
 */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Ejercicio02 {
    public static void main(String[] args) {
        
    boolean variableGR; //Muestra dos posibles valores: true o false//
    boolean variableRG;
    variableGR = false;
    variableRG = true;
    
    Byte num_bit; //Numeros enteros entre -128 y 127//
    num_bit = -30;    
    
    char letra; //Carácter Unicode de 16 bits. Los caracteres se representa siempre entre comillas simples//
    letra = 'T';
    
    short num_corto; //Números enteros, los números negativos se representa con el símbolo -//
    num_corto = 50;    
    
    int num_entero;
    num_entero = 256;    
    long num_largo;
    num_largo = 300;    

    float decimal; //números decimales con precisión aprox. de 7 digitos. Se les añade una F//
    decimal = 35.6f;    
    
    double d_decimal; //números decimales con precisión aprox. de 16 digitos. La coma en un decimal se indica con un punto//
    d_decimal = 3.14;
    
    
    
    System.out.println("--Operadores lógicos--\n");
    
    
    System.out.println("La palabra " + variableGR + " es verdadera y esta " + variableRG + " no lo es");
    System.out.println("");
    System.out.println("El numero " + num_bit + " ocupa 8 bits");
    System.out.println("");
    System.out.println("La letra secreta es la " + letra);
    System.out.println("");
    System.out.println("Hay " +num_corto+ " clases en linkia");
    System.out.println("");
    System.out.println("Necesitamos " +num_entero+ " libros de informática");
    System.out.println("");
    System.out.println("En la pelicula hay " +num_largo+ " soldados");
    System.out.println("");
    System.out.println("El cuerpo está a " +decimal+ " grados centigrados");
    System.out.println("");
    System.out.println("El numero pi es " +d_decimal+ " en decimales\n");

    
    int a = 20, b = 10, c = 15, d = 20, e = 40, f = 30;
    
            
    System.out.println("--Operadores Aritmeticos-- \n");
    
    System.out.println("a + b = "+(a + b));
    System.out.println("a - a = "+(a - a));
    System.out.println("d * f = "+(d * f));
    System.out.println("c / b = "+(c / b));
    System.out.println("");
    
    System.out.println("a,b,c,e,f = " + a + "," + b + "," + c + "," + e + "," + f);
    

    }
        
}
