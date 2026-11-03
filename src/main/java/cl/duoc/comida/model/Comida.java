package cl.duoc.comida.model;

import java.time.LocalDateTime;

public class Comida {
    private GrupoAlimento grupo;
    private double porciones;
    private LocalDateTime fechaHora;

    public Comida() {
    }

    public Comida(GrupoAlimento grupo, double porciones) {
        if (porciones <= 0) {
            throw new IllegalArgumentException("Las porciones debe ser mayor que 0");
        }
        this.grupo = grupo;
        this.porciones = porciones;
        this.fechaHora = LocalDateTime.now();
    }

    public GrupoAlimento getGrupo() {
        return grupo;
    }

    public double getPorciones() {
        return porciones;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setGrupo(GrupoAlimento grupo) {
        this.grupo = grupo;
    }

    public void setPorciones(double porciones) {
        this.porciones = porciones;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
