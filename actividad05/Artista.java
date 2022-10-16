
package actividad05;


class Artista{

    private String dni;
    private String Nombre;
    private static int Fecha_nac;
    private String Sexo;

    Artista (){}
    
    //constructor artista
    Artista (String dni, String nombre, int fecha_nac, String sexo) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setFecha_nac(fecha_nac);
        this.setSexo(sexo);                
    }

    
    public void setDni(String dni) {
        this.dni=dni;
    }
    public String getDni(){
        return this.dni;
    }
    
    
    public void setNombre(String nombre) {
        this.Nombre=nombre;
    }    
    public String getNombre(){
        return this.Nombre;
    } 
    

    public void setFecha_nac(int fecha_nac) {
        this.Fecha_nac=fecha_nac;
    }
    public int getFecha_nac(){
        return this.Fecha_nac;
    }
    

    public void setSexo(String sexo) {
        this.Sexo=sexo;
    }
    public String getSexo(){
        return this.Sexo;
    }

    
}
