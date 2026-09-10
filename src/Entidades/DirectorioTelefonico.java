package Entidades;

import java.util.Map;
import java.util.TreeMap;

public class DirectorioTelefonico {

    private TreeMap<Long, Contacto> directorio = new TreeMap<>();

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

        System.out.println("El numero especificado no se encuentra en el directorio");
        return null;
        
    }

}
