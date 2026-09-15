package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DirectorioTelefonico {

    public static TreeMap<Long, Contacto> directorio = new TreeMap<>();
    
    public void agregarContacto(Long nro, Contacto contacto) {
        directorio.put(nro, contacto);
    }

    public Contacto buscarContacto(Long tel) {

        if (directorio.isEmpty()) {
            return null;
        }

        for (Map.Entry<Long, Contacto> aux : directorio.entrySet()) {

            Long Telefono = aux.getKey();
            Contacto contacto = aux.getValue();

            if (tel.equals(Telefono)) {
                return contacto;
            }

        }

        System.out.println("El numero no se encuentra en el directorio");
        return null;
        
    }

    public Set<Long> buscarTelefono(String apellido) {
    Set<Long> tel = new TreeSet<>();

    for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
        Long telefono = entry.getKey();
        Contacto contacto = entry.getValue();

        if (contacto.getApellido().equalsIgnoreCase(apellido)) {
            tel.add(telefono);
        }
    }

    return tel;
    }
    
    public ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> c = new ArrayList<>();
        Iterator<Contacto> i = directorio.values().iterator();
        
        while(i.hasNext()){
            Contacto cont = i.next();
            
            if (cont.getCiudad().equalsIgnoreCase(ciudad)) {
                c.add(cont);
            }
        }
        
        return c;
    }
    
    public void borrarContacto(Long tel){
        if (directorio.containsKey(tel)) {
            directorio.remove(tel);
            
        }
    }
}
