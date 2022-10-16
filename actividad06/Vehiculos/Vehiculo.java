
package actividad06.Vehiculos;


public abstract class Vehiculo implements IAlquilable {
    
    public String matricula;
    public String modelo;
    public int n_plazas;
    int n_dias;
    static final double alquiler_base_dia = 50;
    
    public Vehiculo(){
        super();
    } 
        
    public Vehiculo (String matricula, String modelo, int n_plazas){
        this.matricula = matricula;
        this.modelo = modelo;
        this.n_plazas = n_plazas;
    }
    

    //get y set de n_plazas y n_dias
    public double getnplazas(int n) {
        return n_plazas = n;
    }
    
    @Override
    public void setnDias(int n) {
        this.n_dias = n;
    }
    
    public double getPrecioTotalAlquilerporDias(){
        double precioAlquiler=alquiler_base_dia*n_dias;
        return precioAlquiler;
    }

    @Override
    public String toString (){
        return "Matricula:"+this.matricula+
                " Modelo:"+this.modelo+
                " Plazas:"+this.n_plazas+
                " Dias:"+this.n_dias;
    }
    
        public void pidedatos(){
        this.matricula=Pregunta.pideString("Introduce la matricula");
        this.modelo=Pregunta.pideString("Introduce el modelo");
        this.n_plazas=Pregunta.pidevalor(1,9, "Indica el numero de plazas");
        this.n_dias=Pregunta.pidevalor(1, 366, "Indica el numero de dias de alquiler");
    }
}
     

