package com.pa.presta_app;

public enum Rol
{
    PRESTAMISTA(1),PRESTATARIO(2);

    private int idRol;
    Rol(int idRol){
        this.idRol=idRol;
    }
    public void setIdRol(String rol){
        this.idRol=idRol;
    }
    public int getIdRol(){
        return idRol;
    }
}
