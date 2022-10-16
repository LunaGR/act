
package actividad04;


import java.io.*;
import static actividad04.pregunta.pidevalor;

public class Archivos {
    static String [] archivos_lgr;

    public static void main(String[] args) throws IOException {
              
        int Opcion_lgr;
        //se pondrá esto aqui para no tener que hacer copy paste en cada method
        String separador = File.separator;
        String rutaProyecto = System.getProperty("user.dir"); //esta ruta lleva a la carpeta donde se guarda los archivos
        String rutaCarpeta = rutaProyecto + separador + "archivos"; //
        File carpetaLuna = new File (rutaCarpeta);
        
        //los string mejor se ponen aquí, para no tener que escribirlo en cada metodo
        
        do{
        
            System.out.println("""
                               Selcciona una opcion del menu: 
                               1.- Nuevo archivo 
                               2.- Listar archivos 
                               3.- Mostrar un archivos 
                               4.- Borrar archivo 
                               5.- Renombrar archivo 
                               6.- Reemplazar caracteres 
                               7.- Salir 
                               """);
            
            Opcion_lgr = pregunta.pidevalor(1, 7);

            switch(Opcion_lgr){ 

                case 1:
                    //hay que poner la ruta para guardar y modificar las carpetas, modo database on
                    NuevoArchivo(carpetaLuna, separador, rutaCarpeta);
                    break;
                case 2:
                    ListaArchivos(carpetaLuna, separador);
                    break;
                case 3:
                    MostrarArchivos(carpetaLuna,rutaCarpeta, separador); 
                    break;
                case 4:
                    BorrarArchivo(carpetaLuna, separador);
                    break;
                case 5:
                    RenombrarArchivo(carpetaLuna, rutaCarpeta, separador);
                    break;
                case 6:
                    Reemplazarchar(carpetaLuna, rutaCarpeta, separador);
                    break;
                case 7:  
                    System.out.println("¡Hasta pronto!");
                    break;
                default: 
                    System.out.println("Error \n Dato no válido");
            }
                    } while(Opcion_lgr !=7);
    }

    
    
    private static void NuevoArchivo(File carpetaLuna, String separador, String rutaCarpeta) throws IOException {
        
        //esta parte se asegura que la carpeta de la ruta esté creada, si no lo estuviese, se crearia de forma automática
        if (!carpetaLuna.exists()){
            System.out.print("Esta carpeta no existe");
            carpetaLuna.mkdir();
        }   else {
            System.out.println("La carpeta ya está creada");
        }             
                
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        FileWriter fw; //recalco: el filewrite y filereader sirve para leer y escribir en archivos, no lo olvides
                
        System.out.println("Introduce en nombre del archivo");
        String nombre = br.readLine();//esta linea crea desde teclado, lee y guarda el fichero
        
        System.out.println("Introduce el texto:");
        String texto = br.readLine();
        
        fw = new FileWriter(rutaCarpeta + separador + nombre);
        
        BufferedWriter bw = new BufferedWriter (fw);
        
        bw.write(texto);
        bw.flush();
        bw.close();
        

    }    

    private static String[] ListaArchivos(File carpetaLuna, String separador) {
        //ponemos el method como string para guardar toda la lista y leer
        System.out.println("Lista de archivos");
        
        String [] archivos_lgr = carpetaLuna.list();  
        //nota: si pones .listFile, no hace falta el metodo de if
        for (int B =0; B< archivos_lgr.length; B++){
            File fichero_lgr = new File (carpetaLuna + separador + archivos_lgr [B]);
        if (fichero_lgr.isFile()){            
            System.out.println("Fichero "+archivos_lgr[B] + " posicion: " +B);
            }
        }
        return archivos_lgr;
    }

    private static void MostrarArchivos(File carpetaLuna, String rutaCarpeta, String separador) throws IOException {
        String archivos_lgr[]; 
        archivos_lgr = ListaArchivos (carpetaLuna, separador);
        //esto de arriba nos ayuda a mostrar la lista de archivos
        
        System.out.println("Indica el numero de archivos que quieres ver: ");
        int numArch_lgr = pregunta.pidevalor(0, archivos_lgr.length - 1);
        
        FileReader fr = new FileReader(carpetaLuna + separador + archivos_lgr[numArch_lgr]);
        BufferedReader br = new BufferedReader(fr);

        String linea = "";
        linea = br.readLine();
        while (linea != null) { //lo de null se me puso solo, tengo que mirarlo
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();
    }

    private static void BorrarArchivo(File carpetaLuna, String separador) throws IOException {

        String archivos_lgr[]; 
        archivos_lgr = ListaArchivos (carpetaLuna, separador);

        System.out.println("Indica el archivo que quieres eliminar: ");
        int numArch_lgr = pregunta.pidevalor(0, archivos_lgr.length - 1);
        //este es easy, me lo esperaba peor
        File fichero = new File(carpetaLuna + separador + archivos_lgr[numArch_lgr]);
                        
        if (fichero.delete()){
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El fichero no pudo ser borrado");
        }

    }

    private static void RenombrarArchivo(File carpetaLuna, String rutaCarpeta, String separador) throws IOException {
        String archivos_lgr[]; //la guerra que me ha dado este...
        archivos_lgr = ListaArchivos(carpetaLuna, separador);
        
        System.out.println("Indica el archivo que quieres renombrar ");
        int numArch_lgr = pregunta.pidevalor(0, archivos_lgr.length - 1);
                 
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Modifique el nombre ");
        String nombre_lgr = br.readLine();
        
        File fichero = new File(carpetaLuna + separador + archivos_lgr[numArch_lgr]);
        File newfichero = new File(carpetaLuna + separador + nombre_lgr);
        
        
        if (fichero.renameTo(newfichero)) {
            System.out.println("El fichero se ha modificado correctamente.");
        } else {
            System.out.println("Error");
        }



    }

    private static void Reemplazarchar(File carpetaLuna, String rutaCarpeta, String separador) throws IOException {
        String archivos_lgr[]; 
        archivos_lgr = ListaArchivos (carpetaLuna, separador);
        
        System.out.println("Indica el num de archivo que quieres modificar");
        int numArch = pregunta.pidevalor (0, archivos_lgr.length -1);
        
               
       File archivo_lgr = new File (carpetaLuna + separador + archivos_lgr [numArch]);
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
       String txt_find, txt_replace;
       //para este se usa dos do/while, una para buscar el caracter a cambiar y el otro para modificar
       do{
           System.out.println("indica un caracter a reemplazar: ");
           txt_find = br.readLine();           
        }while (txt_find.length() !=1);
       
        do{
           System.out.println("indica el nuevo caracter: ");
           txt_replace = br.readLine();           
        }while (txt_replace.length() != 1);
        
        //esto de abajo tengo que estudiarlo y hacer más practicas
        RandomAccessFile raf = new RandomAccessFile (archivo_lgr, "rw");
        
        while (raf.getFilePointer() < raf.length()){
            Character chr = (char)raf.readByte();
            if (chr.toString().compareTo(txt_find)==0) {
                raf.seek(raf.getFilePointer()-1);
                raf.writeBytes(txt_replace);
            }
        }
        raf.close();
    }

      

    
}
