/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author ramir
 */
public class Main {
    public static void main(String[] arg){
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        
        Contacto c1 = new Contacto(12345678, "Juan", "Perez", "San Luis", "Colon");
        Contacto c2 = new Contacto(23456789, "Maria", "Gomez", "San Luis", "Belgrano");
        Contacto c3 = new Contacto(34567890, "Pedro", "Perez", "Villa Mercedes", "Pedernera");
        Contacto c4 = new Contacto(45678901, "Ana", "Lopez", "Merlo", "Pringles");
        Contacto c5 = new Contacto(56789012, "Lucas", "Gomez", "San Luis", "Rivadavia");
        
        directorio.agregarContacto(2664436571L, c1);
        directorio.agregarContacto(2664364752L, c2);
        directorio.agregarContacto(2657683469L, c3);
        directorio.agregarContacto(2666894734L, c4);
        directorio.agregarContacto(2664368456L, c5);
        
        
        System.out.println("Buscando contacto por telefono:");
        Contacto encontrado = directorio.buscarContacto(2664364752L);

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró el contacto");
        }
        
        
        System.out.println("Buscando telefonos por apellido:");
        Set<Long> tel = directorio.buscarTelefono("Perez");

        for (Long telefono : tel) {
            System.out.println(telefono);
        }

        
        System.out.println("Buscando contactos por ciudad:");
        ArrayList<Contacto> contciudad = directorio.buscarContactos("San Luis");

        for (Contacto contacto : contciudad) {
            System.out.println(contacto);
        }
        
        
        System.out.println("Borrar contacto:");
        directorio.borrarContacto(2666894734L);

        Contacto eliminado = directorio.buscarContacto(2666894734L);

        if (eliminado == null) {
            System.out.println("El contacto fue eliminado correctamente");
        } else {
            System.out.println("El contacto todavía existe");
        }
    }
}
