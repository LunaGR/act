package actividad07;

import actividad07.Excepction.DniIncorrecto;
import actividad07.Excepction.EdadIncorrecta;
import actividad07.Excepction.NombreIncorrecto;

public class Persona {
    String nombre;
    int edad;
    String dni;
    
    Persona (String nombre, int edad, String DNI) throws NombreIncorrecto, EdadIncorrecta, DniIncorrecto {
        setNombre(nombre);
        setEdad(edad);
        setDni(dni);
        
    }

    Persona() {
    }
        /*por aquí los method anteriores
        *En los sets añadimos los controles de errores, mensajes y los if para limitar 
        *y controlar las busquedas
        */
    public void setNombre(String nombre) throws NombreIncorrecto {
        if(nombre.length()<3){
            throw new NombreIncorrecto ("El nombre debe tener minimo 3 caracteres.");
        }
        if(nombre.matches(".*//d.*")){
            throw new NombreIncorrecto ("El nombre no puede tener números");
        }
        this.nombre=nombre;
    }
    private String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad) throws EdadIncorrecta {
        if(edad <1 || edad >110){ 
            throw new EdadIncorrecta ("La edad no puede ser menor a 1 ni mayor a 110");
        }
        this.edad=edad;
    }
    public int getEdad(){
        return this.getEdad();
    }

    public void setDni(String dni) throws DniIncorrecto{        
        this.dni=dni;        
    }
    
    String getdni(){
        return this.dni;
    }
    
    /*este toString nos sirve para que se imprima la info en el 
    *orden deseado en la lista de las personas
    */
    public String toString(){
        return "Nombre:" + nombre + "|| Edad:"+edad;
    }
  

}
