/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import com.trivial.entidades.Pregunta;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Buzon<K,E>{
    private Map<K,E> buzon;

    public Buzon() {
        this.buzon = new HashMap<K,E>();
    }
    
    public void guardar(K clave, E valor){
        if (buzon.containsKey(clave)) {
            throw new RuntimeException("Ya existe");
            
        }
        buzon.put(clave, valor);
    }
    public static void main(String[] args) {
        Buzon<String, Pregunta> miBuzon=new Buzon();
        miBuzon.guardar("hola", new Pregunta(1));
    }
    
    
    
}
