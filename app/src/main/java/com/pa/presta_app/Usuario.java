package com.pa.presta_app;

import java.util.Collections;

public class Usuario implements Validation
{
    // instance variables - replace the example below with your own
    private int idUsuario;
    private Persona persona;
    private Rol rol;

    public Usuario(){

    }
    public Usuario(Persona persona,Rol rol)
    {
        // initialise instance variables
        idUsuario= Singleton.getSingletonInstance().getContadorUsuario();
        this.persona= persona;
        this.rol=rol;

    }
    public void setPersona(Persona persona){
        this.persona=persona;
    }
    public Persona getPersona(){
        return persona;
    }
    public void setidUsuario(int idUsuario){
        this.idUsuario=idUsuario;
    }
    public int getIdUsuario(){
        return idUsuario;
    }
    public void setRol(Rol rol){
        this.rol=rol;
    }
    public Rol getRol(){
        return rol;
    }
    public String obtenerClientes(int idUsuario){
        if(!validarRol(idUsuario, Collections.singletonList(Rol.PRESTAMISTA)))
            return "NO SE PUEDE CONSUMIR EL MÉTODO";


        return "EL MÉTODO SE CONSUMIÓ";
    }
}
