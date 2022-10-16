
package actividad07;


import actividad07.Pregunta;
import actividad07.Persona;
import actividad07.Excepction.*;

import java.util.HashMap;
import java.util.Iterator;
import java.io.*;
import java.util.ArrayList;


public class GestionaPersonas {
        static HashMap<String,Persona>Trabajadores = new HashMap<String,Persona>();
        static ArrayList<Persona> GrupoT = new ArrayList<Persona>();
        /*Con el hashmap creamos el key-valor para vincular la información de una forma 
        *mas rapida y cómoda.
        *El arraylist recoge una lista con la información ya creada en persona y vinculada
        con el grupo de personas (en mi caso, puse trabajo para poder organizarme mejor)
        */
    
    
    public static void main(String[] args)throws IOException,DniIncorrecto,EdadIncorrecta,NombreIncorrecto, DemasiadosObjetos, Exception {
            try {
                Persona p1 = new Persona ("Joseph",35,"14215367P");
                Persona p2 = new Persona ("Helena",29,"22416257K");
                Persona p3 = new Persona ("India",20,"59846310R");
                Persona p4 = new Persona ("Roberto",22,"77084344G");
                
                Trabajadores.put("14215367P",p1);
                Trabajadores.put("22416382K",p2);
                Trabajadores.put("59846310R",p3);
                Trabajadores.put("77084344G",p4);
            }catch
                (DniIncorrecto| EdadIncorrecta| NombreIncorrecto e){
                e.printStackTrace();}
            /*en el try catch aparece la creación de los datos, la key y vinulación
            *entre valores y key con el dni. estos son controlados en el catch con las clases
            *de exception creadas aparte en la carpeta del mismo nombre.
            */
            
        int LGR = 0;
        System.out.println("Buenos dias/tardes, usuario");
        do{
            
            System.out.println("\n¿Qué desea hacer?\n"+
                "1- Crear un trabajador\n" +
                "2- Borrar un trabajador\n" +
                "3- Añade un trabajador al grupo de trabajo\n" +
                "4- Borra un trabajador del grupo de trabajo.\n" +
                "5- Mostrar datos.\n" +
                "0- Salir");
            LGR = Pregunta.pidevalor(0, 5);
        
            switch (LGR){
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                case 1:
                    creartrabajador();
                    mostrarTrabajadores();//esto lo pongo aqui para que se actualice la lista 
                    mostrarGrupo();
                    break;
                case 2:                    
                    borrartrabajador();
                    mostrarTrabajadores();
                    mostrarGrupo();                    
                    break;
                case 3: {
                    try {
                        añadirTragrupo();
                        mostrarTrabajadores();
                        mostrarGrupo();
                    } catch (DemasiadosObjetos e) {
                        e.printStackTrace();
                    }
                }
                break;
                case 4: {
                    try {
                        borrarTgrupo();
                        mostrarTrabajadores();
                        mostrarGrupo();
                    } catch (PosicionIncorrecta e) {
                        e.printStackTrace();
                    }
                }
                break;
                case 5:
                    mostrarTrabajadores();
                    mostrarGrupo();
                    break;
            }                          
        }while (LGR !=0);
    }
    

    public static void creartrabajador() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Persona persona = new Persona();
        //creación de la persona con el control de errores
        boolean DatoNuevo;
        System.out.println("Empecemos por lo primero");        
        do{
            DatoNuevo = true;
            System.out.println("Indica el nombre del trabajador/a que quieres añadir");
            try{                
                String nombre = br.readLine();
                persona.setNombre(nombre);
            }catch (NombreIncorrecto n){
                System.out.println(n.getMessage());
                DatoNuevo = false;
            }catch (IOException ex){
                ex.printStackTrace();
                DatoNuevo = false;
            }
        }while (!DatoNuevo);
        
        do{
            DatoNuevo = true;
            
            System.out.println("Indica la edad");
            try{                
                int edad = Integer.parseInt(br.readLine());
                persona.setEdad(edad);                 
            }catch (EdadIncorrecta e){
                System.out.println("La edad no puede ser menor a 1 ni mayor a 110");
                DatoNuevo = false;
            }catch (IOException ex){
                ex.printStackTrace();
                DatoNuevo = false;
            }
        }while (!DatoNuevo);   
        
        do{
            DatoNuevo = true;
            System.out.println("Indica el DNI");
            try{                
                String dni = br.readLine();
                persona.setDni(dni); 
            }catch (DniIncorrecto d){
                System.out.println("El DNI no puede tener más de 9 caracteres.");
                DatoNuevo = false;
            }catch (IOException ex){
                ex.printStackTrace();
                DatoNuevo = false;
            }
            
        }while (!DatoNuevo); 
        //se añade y guarda en el array creando automaticamente el key usando el dni
        Trabajadores.put(persona.getdni(), persona);  
        
        System.out.println("Trabajador Creado");  
        
    }

    private static void borrartrabajador() {
        System.out.println("¿Qué trabajador desea eliminar?");
        mostrarTrabajadores();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Persona persona = new Persona();
        boolean datoCorrecto;
        String dni = null;
        do{
             System.out.println("Indica el dni:");
            try{            
                datoCorrecto=true;
                dni = br.readLine();
            } catch (IOException e){
                datoCorrecto = false;
            }
        }while (!datoCorrecto);
        
        persona = Trabajadores.get(dni);    
        //Se busca en el listado de trabajadores usando el dni para eliminarlo
        Iterator I = Trabajadores.entrySet().iterator();
        I = Trabajadores.entrySet().iterator();
        while (I.hasNext()) {
            HashMap.Entry e = (HashMap.Entry) I.next();
            if(e.getKey().equals(dni)){
                I.remove();
            }
        }        
        System.out.println("Trabajador Borrado");  
        
    }

    private static void añadirTragrupo() throws DemasiadosObjetos, PosicionIncorrecta {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (GrupoT.size()>=2){
            throw new DemasiadosObjetos("Puede contener como máximo 2 personas");
        }
        //usamos el if para controlar la cantidad de trabajadores en el grupo
        Persona persona = new Persona();
        boolean datoCorrecto;
        do{ 
            try{
                mostrarTrabajadores();
                mostrarGrupo();
                datoCorrecto = true;
                System.out.println("Indica el dni del trabajador/a que quieres añadir");
                String dni = br.readLine();
                persona = Trabajadores.get(dni);    
            } catch (IOException e){
                datoCorrecto = false;
            } 
        }while (!datoCorrecto);
        GrupoT.add(persona);
        //el add añade a la persona al grupo y se guarda.
        System.out.println("Trabajador añadido satisfactoriamente.");
    }
    

    private static void borrarTgrupo() throws PosicionIncorrecta {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean datoCorrecto = true;
        
         do{
             mostrarGrupo();
             System.out.println("¿Qué trabajador/a desea eliminar del grupo?");
            try{
                int numeroLGR = Integer.parseInt(br.readLine());                    
                if (numeroLGR < 0 || numeroLGR >= GrupoT.size()) {
                    throw new PosicionIncorrecta("\nEl número de trabajadores que quieres eliminar del grupo no puede ser menor a 1 ni mayor a " + GrupoT.size() + ". ");
                    }
                GrupoT.remove(numeroLGR);
            } catch (IOException e){
                datoCorrecto = false;
            }
        }while (!datoCorrecto);
        //al igual que en el anterior, remove elimina al trabajador del grupo y se guarda el cambio
        System.out.println("Trabajador eliminado del grupo.");
        
    }
    
    

    private static void mostrarTrabajadores() {
        /*El itinerar busca y devuelve los datos guardados en el array usando los key-valor
        *para evitar repeticiones y/o errores de compilación
        */
        System.out.println("Lista de trabajadores");
        Iterator I = Trabajadores.entrySet().iterator();
        I = Trabajadores.entrySet().iterator();
        while (I.hasNext()) {
            HashMap.Entry e = (HashMap.Entry) I.next();
            System.out.println(e.getKey()+" - "+ e.getValue());
        }
    }

    private static void mostrarGrupo() {
        System.out.println("Grupos de trabajo");
        for(int g = 0; g < GrupoT.size(); g++){
            System.out.println("["+ g +"]"+ GrupoT.get(g));
        }
    }

    
}
