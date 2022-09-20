package com.pa.presta_app;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Persona {
    // instance variables - replace the example below with your own
    private String nombre;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    private String cedula;

    private FirebaseAuth auth;
    private DatabaseReference reference;


    public Persona(String nombre, String telefono, String direccion, String correoElectronico, String cedula) {
        // initialise instance variables
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.cedula = cedula;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    /**
     * Método para registrar una persona
     *
     * @return cadena de texto que indica que el registro ha sido creado
     * @parampersona
     */
    public static String registrarPersona(Persona persona) {
        Dbeaver.personas.add(persona);
        return "Registro creado";
    }

    /**
     * Método para actualizar una persona
     *
     * @return cadena de texto que indica que el registro ha sido actualizado
     * @paramdocumento
     * @paramnombre
     * @paramtelefono
     * @paramdireccion
     * @paramcorreoElectronico
     * @paramcedula
     */
    public static String actualizarPersona(String documento, String nombre, String telefono, String direccion, String correoElectronico, String cedula) {
        Persona p = buscarPersonaByCedula(documento);
        p.setNombre(nombre);
        p.setCorreoElectronico(correoElectronico);
        p.setDireccion(direccion);
        p.setTelefono(telefono);
        p.setCedula(cedula);
        return "Registro actualizado";
    }

    /**
     * Método para eliminar una persona
     *
     * @return cadena de texto que indica si el registro fue o no eliminado
     * @paramdocumento
     */
    public static String eliminarPersona(String documento) {
        Persona persona = buscarPersonaByCedula(documento);
        boolean eliminar = Dbeaver.personas.remove(persona);
        if (eliminar) {
            return "Registro eliminado";
        } else {
            return "No se pudo eliminar el registro";
        }
    }

    /**
     * Método para buscar una persona por su documento de identidad
     *
     * @return objeto de tipo Persona cuyo documento corresponde con el ingresado
     * @paramdocumento
     */
    public static Persona buscarPersonaByCedula(String documento) {
        Persona persona = null;
        for (Persona p : Dbeaver.personas) {
            if (p.getCedula().equals(documento)) {
                persona = p;
                break;
            }
        }
        return persona;
    }

    /**
     * Método para buscar una persona por su nombre
     *
     * @return objeto de tipo Persona cuyo nombre corresponde con el ingresado
     * @paramnombre
     */
    public static Persona buscarPersonaByNombre(String nombre) {
        Persona persona = null;
        for (Persona p : Dbeaver.personas) {
            if (p.getNombre().equals(nombre)) {
                persona = p;
                break;
            }
        }
        return persona;
    }
}
