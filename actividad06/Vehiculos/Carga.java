
package actividad06.Vehiculos;


public class Carga extends Vehiculo {
    
    public Carga(){
        super();
    }
    
    double pma;
    
    public Carga (String matricula, String modelo, int n_plazas, double pma){
        super(matricula,modelo,n_plazas);
        this.pma = pma;
    }

    @Override
    public String toString(){
        return super.toString()+(" PMA:" + this.pma);
    }
    

    @Override
    public double getPrecioTotalALquilerporDias() {
        return pma * n_dias;
    }
    
    @Override
    public void pidedatos(){
        super.pidedatos();
        this.pma=Pregunta.pideDouble("Indica el pma del vehiculo");
    }
     
}
