
package actividad06.Seguro;

import actividad06.Vehiculos.*;

public class Seguros implements IAlquilable {
    private String nombreSeguro;
    private String descripcion;
    final double precioAlquiler=10.50;  //el tipo final es un tipo fijo, no se modifica
    int numeroDiasAlquiler=1;


    @Override
    public double getPrecioTotalALquilerporDias() {
        return numeroDiasAlquiler*precioAlquiler;
    }

    @Override
    public void setnDias(int n) {
            this.numeroDiasAlquiler = (n);        
    }
    //los dos primeros override son del interfaz
    
    @Override
    public String toString(){
        return "Seguro "+nombreSeguro+
                ". Descripción:"+descripcion+
                ". Precio:"+precioAlquiler+
                ". Alquilado:"+this.numeroDiasAlquiler+
                ". Total:"+ getPrecioTotalALquilerporDias();
    }
    
//getting y setting de nombre seguro
    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }
    public String getNombreSeguro(){
        return nombreSeguro;
    }
    
    //getting y setting de descripcion
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public Seguros (String nombreSeguro, String descripcion, int numeroDiasAlquiler){
        this.nombreSeguro = nombreSeguro;
        this.descripcion = descripcion;
        this.numeroDiasAlquiler = numeroDiasAlquiler;
    }
    
}
