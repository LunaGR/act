
package actividad06.Vehiculos;
import actividad06.Vehiculos.*;


public class Coche extends Vehiculo {
        
    private String gama = "A";
    
    public Coche(String matricula, String modelo, int n_plazas, String gama){
        super(matricula, modelo, n_plazas);
        this.gama = gama;
    }
    
    public Coche (){
        super();
    }
    
    @Override
    public String toString(){
        return super.toString()+(" Gama del coche:"+ this.gama);
    }

    @Override
    public double getPrecioTotalALquilerporDias() {
        return alquiler_base_dia * n_dias;
    }  
    
    @Override
        public void pidedatos(){
            super.pidedatos();
        this.gama=Pregunta.pideString("Indica la gama");
    }
    
}
