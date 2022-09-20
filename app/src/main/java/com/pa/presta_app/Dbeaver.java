package com.pa.presta_app;

import java.util.*;
/**
 * Write a description of class DB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dbeaver {
    public static Set<Persona> personas;
    public static Set<Usuario> usuarios;
    public static Set<Prestamo> prestamos;
    public static Set<Cuota> cuotas;

    static{
        //Inicializar personas
        personas = new HashSet<Persona>();
        Persona personaUno = new Persona("Brayan Quintero","3016002661","Carrera 38#116A-65","brayanquinteroa10@gmail.com","10074510");
        Persona personaDos = new Persona("Brandon Archila","3173124758","Carrera26w#66-08","archila1046@gmail.com","1005372681");
        Persona personaTres = new Persona("Fernando Rojas", "3001230981", "Calle 9#27","from@gmail.com","1121212");
        personas.add(personaUno);
        personas.add(personaDos);
        personas.add(personaTres);

        //Inicializar usuarios
        usuarios = new HashSet<Usuario>();
        Usuario usuarioUno = new Usuario(personaUno, Rol.PRESTAMISTA);
        Usuario usuarioDos = new Usuario(personaDos, Rol.PRESTATARIO);
        usuarios.add(usuarioUno);
        usuarios.add(usuarioDos);

        //Inicializar prestamos
        prestamos = new HashSet<Prestamo>();


        //Inicializar cuotas
        cuotas = new HashSet<Cuota>();


    }
}
