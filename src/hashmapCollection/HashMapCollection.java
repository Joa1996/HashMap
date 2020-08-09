/*
HashMap es un tipo de coleccion que utiliza una arquitectura de Diccionario, es decir que para guardar un objeto u otra cosa
necesitamos guardarlo con una clave o un identificador unico. por ej. si queremos guardar un objeto
Alumno n1, necesitaremos asignarle una clave o identificador por ej. su DNI
 */
package hashmapCollection;

import java.util.*;

public class HashMapCollection {

   
    public static void main(String[] args) 
    {
    
       HashMap<Integer,Alumno>a=new HashMap<Integer,Alumno>();
       
       a.put(1111,new Alumno("Juan",22));
       a.put(2222, new Alumno("Marcos",23));
       
        //                       Usamos la Key con el que guardamos el objt. para poder buscarlo en el HashMap
        System.out.println(a.get(1111).getNombre());
        System.out.println(a.get(2222).getNombre());
        
     
        
        
    }
    
}
