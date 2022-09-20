package com.pa.presta_app;


import java.util.Date;

public class Prestamo
{
    // instance variables - replace the example below with your own
    private int idPrestamo;
    private Persona prestatario;
    private Persona prestamista;
    private String anexo;
    private Persona codeudor;
    private Date fechaFinalizacion;
    private Double valorPrestamo;
    private float porcentajeInteres;
    private int numeroCuotas;
    private String frecuenciaPago;

    public Prestamo(Persona prestatario,Persona prestamista, String anexo, Persona codeudor,String fechaFinalizacion,Double valorPrestamo,float porcentajeInteres,int numeroCuotas,String frecuenciaPago)
    {
        // initialise instance variables
        idPrestamo= Singleton.getSingletonInstance().getContadorPrestamo();
        this.prestatario=prestatario;
        this.prestamista=prestamista;
        this.anexo= anexo;
        this.codeudor=codeudor;
        this.fechaFinalizacion = new Date(fechaFinalizacion);
        this.valorPrestamo=valorPrestamo;
        this.porcentajeInteres= porcentajeInteres;
        this.numeroCuotas=numeroCuotas;
        this.frecuenciaPago=frecuenciaPago;

    }
    public void setIdPrestamo(int idPrestamo){
        this.idPrestamo=idPrestamo;
    }
    public int getIdPrestamo(){
        return idPrestamo;
    }
    public void setPrestatario(Persona prestatario){
        this.prestatario=prestatario;
    }
    public Persona getPrestatario(){
        return prestatario;
    }
    public void setPrestamista(Persona prestamista){
        this.prestamista=prestamista;
    }
    public Persona getPrestamista(){
        return prestamista;
    }
    public void setAnexo(String anexo){
        this.anexo=anexo;
    }
    public String getAnexo(){
        return anexo;
    }
    public void setCodeudor(Persona codeudor){
        this.codeudor=codeudor;
    }
    public Persona getCodeudor(){
        return codeudor;
    }
    public void setFechaFinalizacion(String fechaFinalizacion){
        this.fechaFinalizacion=new Date(fechaFinalizacion);
    }
    public Date getFechaFinalizacion(){
        return fechaFinalizacion;
    }
    public void setValorPrestamo(Double valorPrestamo){
        this.valorPrestamo=valorPrestamo;
    }
    public Double getValorPrestamo(){
        return valorPrestamo;
    }
    public void setPorcentajeInteres(float porcentajeInteres){
        this.porcentajeInteres=porcentajeInteres;
    }
    public float getPorcentajeInteres(){
        return porcentajeInteres;
    }
    public void setNumeroCuotas(int numeroCuotas){
        this.numeroCuotas=numeroCuotas;
    }
    public int getNumeroCuotas(){
        return numeroCuotas;
    }
    public void setFrecuenciaPago(String frecuenciaPago){
        this.frecuenciaPago=frecuenciaPago;
    }
    public String getFrecuenciaPago(){
        return frecuenciaPago;
    }
    /**
     * Método para registrar un Prestamo
     * @paramPrestamo
     * @return cadena de texto que indica que el Prestamo ha sido creado
     */
    public static String guardarPrestamo(Prestamo prestamo){
        Dbeaver.prestamos.add(prestamo);
        return "Prestamo Guardado Satisfactoriamente";
    }
    /**
     * Método para buscar un Prestamo por su id de prestamo
     * @paramidPrestamo
     * @return objeto de tipo Prestamo cuyo id corresponde con el ingresado
     */
    public static Prestamo buscarPrestamoByid(int idPrestamo) {
        Prestamo prestabuscado = null;
        for(Prestamo pre: Dbeaver.prestamos){
            if(pre.getIdPrestamo() == (idPrestamo)){
                prestabuscado = pre;
                break;
            }
        }
        return prestabuscado;
    }
    /**
     * Método para buscar un Prestamo por el Prestatario
     * @paramPrestatario
     * @return objeto de tipo Prestamo cuyo Prestatario corresponde con el ingresado
     */
    public static Prestamo buscarPrestamoByPrestatario(Persona prestatario) {
        Prestamo prestabuscado = null;
        for(Prestamo pre: Dbeaver.prestamos){
            if(pre.getPrestatario().getNombre().equals(prestatario.getNombre()) && pre.getPrestatario().getCedula().equals(prestatario.getCedula())){
                prestabuscado = pre;
                break;
            }
        }
        return prestabuscado;
    }
    /**
     * Método para buscar un Prestamo por el Prestamista
     * @paramPrestamista
     * @return objeto de tipo Prestamo cuyo Prestamista corresponde con el ingresado
     */
    public static Prestamo buscarPrestamoByPrestamista(Persona prestamista) {
        Prestamo prestabuscado = null;
        for(Prestamo pre: Dbeaver.prestamos){
            if(pre.getPrestamista().getNombre().equals(prestamista.getNombre()) && pre.getPrestamista().getCedula().equals(prestamista.getCedula())){
                prestabuscado = pre;
                break;
            }
        }
        return prestabuscado;
    }

    /**
     * Método para actualizar un Prestamo
     * @paramprestatario
     * @paramprestamista
     * @paramanexo
     * @paramcodeudor
     * @paramfechaFinalizacion
     * @paramvalorPrestamo
     * @paramporcentajeInteres
     * @paramnumeroCuotas
     * @paramfrecuenciaPago
     * @return cadena de texto que indica que el registro ha sido actualizado
     */
    public static String actualizarPrestamo(int idPrestamo, Persona prestatario,Persona prestamista, String anexo, Persona codeudor,String fechaFinalizacion,Double valorPrestamo,float porcentajeInteres,int numeroCuotas,String frecuenciaPago){
        Prestamo prestact = buscarPrestamoByid(idPrestamo);
        prestact.setPrestatario(prestatario);
        prestact.setPrestamista(prestamista);
        prestact.setAnexo(anexo);
        prestact.setCodeudor(codeudor);
        prestact.setFechaFinalizacion(fechaFinalizacion);
        prestact.setValorPrestamo(valorPrestamo);
        prestact.setPorcentajeInteres(porcentajeInteres);
        prestact.setNumeroCuotas(numeroCuotas);
        prestact.setFrecuenciaPago(frecuenciaPago);
        return "Prestamo actualizado";
    }

    /**
     * Método para eliminar un Prestamo
     * @paramidPrestamo
     * @return cadena de texto que indica si el registro fue o no eliminado
     */
    public static String eliminarPrestamo(int idPrestamo) {
        Prestamo prestaOri = buscarPrestamoByid(idPrestamo);
        boolean eliminar = Dbeaver.prestamos.remove(prestaOri);
        if(eliminar){
            return "Prestamo eliminado Satisfactoriamente";
        }else{
            return "No se pudo eliminar el Prestamo";
        }
    }

    /**
     * Método para calcular el valor de la cuota predeterminado de un Prestamo
     * @paramprestamo
     * @return Double que es el valor predeterminado de una cuota
     */
    public static Double calcularValorCuota(Prestamo prestamo) {
        Double cuotaPre= (prestamo.getValorPrestamo()+(prestamo.getValorPrestamo()*prestamo.getPorcentajeInteres()))/prestamo.getNumeroCuotas();
        return cuotaPre;
    }
}
