package com.pa.presta_app;

public class Singleton
{
    // instance variables - replace the example below with your own
    private int contadorPrestamo = 0;
    private int contadorCuota = 0;
    private int contadorUsuario = 0;
    private int contadorTarjeta = 0;
    private static Singleton a;


    /**
     * Constructor for objects of class Singleton
     */
    public Singleton()
    {
        // initialise instance variables
    }


    public static Singleton getSingletonInstance() {
        if (a == null){
            a = new Singleton();
        }
        return a;
    }
    public int getContadorPrestamo(){
        contadorPrestamo++;
        return contadorPrestamo;
    }
    public int getContadorCuota(){
        contadorCuota++;
        return contadorCuota;
    }
    public int getContadorUsuario(){
        contadorUsuario++;
        return contadorUsuario;
    }
    public int getContadorTarjeta(){
        contadorTarjeta++;
        return contadorTarjeta;
    }
}