package Hospital.model;

import java.time.LocalDate;

public class Medicamento {

    private String nombre;
    private String formaFarmaceutica;
    private String dosis;
    private String principioActivo;
    private LocalDate fechaCaducidad;
    private String numeroLote;
    private double precio;
    private String indicaciones;
    private String contraindicaciones;

    public Medicamento(String nombre,String formaFarmaceutica, String dosis, String principioActivo, LocalDate fechaCaducidad, String numeroLote, double precio, String indicaciones, String contraindicaciones) {
        this.nombre = nombre;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.principioActivo = principioActivo;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.precio = precio;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public double getPrecio() {
        return precio;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }


    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                ", dosis='" + dosis + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote='" + numeroLote + '\'' +
                ", precio=" + precio +
                ", indicaciones='" + indicaciones + '\'' +
                ", contraindicaciones='" + contraindicaciones + '\'' +
                '}';
    }
}
