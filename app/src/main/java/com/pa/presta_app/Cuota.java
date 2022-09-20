package com.pa.presta_app;

import java.util.Date;

public class Cuota {
    // instance variables - replace the example below with your own
    private int idCuota;
    private Prestamo datosPrestamo;
    private Date fechaCuota;
    private Double valorCuota;

    public Cuota(String fechaCuota, Prestamo datosPrestamo) {
        // initialise instance variables
        idCuota = Singleton.getSingletonInstance().getContadorCuota();
        this.fechaCuota = new Date(fechaCuota);
        this.datosPrestamo = datosPrestamo;
        this.valorCuota = datosPrestamo.calcularValorCuota(datosPrestamo);
    }

    public void setIdCuota(int idCuota) {
        this.idCuota = idCuota;
    }

    public int getIdCuota() {
        return idCuota;
    }

    public void setFechaCuota(String fechaCuota) {
        this.fechaCuota = new Date(fechaCuota);
    }

    public Date getFechaCuota() {
        return fechaCuota;
    }

    public void setDatosPrestamo(Prestamo datosPrestamo) {
        this.datosPrestamo = datosPrestamo;
    }

    public Prestamo getDatosPrestamo() {
        return datosPrestamo;
    }

    public void setValorCuota(Double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public Double getValorCuota() {
        return valorCuota;
    }
}
    /**
     * Método para registrar una cuota
     * @paramcuota
     * @return cadena de texto que indica que el registro ha sido creado
     */
    /**public static String registrarCuota(Cuota cuota){
        Dbeaver.cuotas.add(cuota);
        return "Registro creado";
    }
    /**
     * Método para actualizar una cuota
     * @paramidCuota
     * @paramfechaCuota
     * @paramvalorCuota
     * @return cadena de texto que indica que el registro ha sido actualizado
     */
    /**public static String actualizarCuota(int idCuota, String fechaCuota, Double valorCuota){
        Cuota c = buscarCuotaById(idCuota);
        c.setFechaCuota(fechaCuota);
        c.setValorCuota(valorCuota);
        return "Registro actualizado";
    }

    /**
     * Método para eliminar una cuota
     * @paramidCuota
     * @return cadena de texto que indica si el registro fue o no eliminado
     */
    /**public static String eliminarCuota(int idCuota) {
        Cuota cuota = buscarCuotaById(idCuota);
        boolean eliminar = Dbeaver.cuotas.remove(cuota);
        if(eliminar){
            return "Registro eliminado";
        }else{
            return "No se pudo eliminar el registro";
        }
    }
    /**
     * Método para buscar una cuota por su id
     * @paramidcuota
     * @return objeto de tipo Cuota cuyo id corresponde con el ingresado
     */
    /**public static Cuota buscarCuotaById (int idCuota) {
        Cuota cuota = null;
        for(Cuota c: Dbeaver.cuotas){
            if(c.getIdCuota() == (idCuota)){
                cuota = c;
                break;
            }
        }
        return cuota;
    }
}*/
