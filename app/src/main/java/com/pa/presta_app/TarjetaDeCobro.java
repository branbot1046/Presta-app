package com.pa.presta_app;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCobro
{
    // instance variables - replace the example below with your own
    private int idTarjetaDeCobro;
    private Prestamo datosPrestamo;
    private List<Cuota> cuotas = new ArrayList<Cuota>();
    private Double valorRestantePrestamo;

    public TarjetaDeCobro(Prestamo datosPrestamo, List<Cuota> cuotas)
    {
        // initialise instance variables
        idTarjetaDeCobro= Singleton.getSingletonInstance().getContadorTarjeta();
        this.datosPrestamo= datosPrestamo;
        this.cuotas = cuotas;
        valorRestantePrestamo= calcularValRestPre(datosPrestamo);
    }
    public void setIdTarjetaDeCobro(int idTarjetaDeCobro){
        this.idTarjetaDeCobro=idTarjetaDeCobro;
    }
    public int getIdTarjetaDeCobro(){
        return idTarjetaDeCobro;
    }
    public void setDatosPrestamo(Prestamo datosPrestamo){
        this.datosPrestamo=datosPrestamo;
    }
    public Prestamo getDatosPrestamo(){
        return datosPrestamo;
    }
    public void setCuotas(List<Cuota> cuotas){
        this.cuotas=cuotas;
    }
    public List<Cuota> getCuotas(){
        return cuotas;
    }
    public void agregarCuota(Cuota cuota){
        cuotas.add(cuota);
    }
    /**
     * Método para calcular el valor restante de un prestamo
     * @return Double que es el valor restante del prestamo
     */
    public Double calcularValRestPre(Prestamo prestamo){
        Double valCuotasAcum= 0d;
        for(Cuota c: cuotas){
            valCuotasAcum=valCuotasAcum+c.getValorCuota();
        }
        Double valRestPre = prestamo.getValorPrestamo()-valCuotasAcum;
        return valRestPre;
    }
}
