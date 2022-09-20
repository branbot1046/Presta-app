package com.pa.presta_app;

import java.util.List;

public interface Validation
{

    default boolean validarRol(int idUsuario, List<Rol> roles){
        //Buscar en DB usuario
        if(idUsuario == 1){
            Usuario usuario = new Usuario();
            usuario.setRol(Rol.PRESTAMISTA);
            return roles.contains(usuario.getRol());
        }
        return false;
    }
}
