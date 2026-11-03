package cl.duoc.comida.model;



public enum GrupoAlimento {
    //Definir opciones fijas (reglas de negocio pauta alimentaria)
    CEREALES("Cereales", 3.5),
    FRUTAS("Frutas", 2.0),
    VERDURAS_GENERAL("Verduras en general", 1.0),
    VERDURAS_LIBRE("Verduras de libre consumo", 2.0),
    CARNES_MAGRAS("Carnes bajas en grasa", 6.5),
    LACTEOS_DESCREMADOS("Lácteos bajos en grasa", 2.0),
    ACEITES_GRASAS("Aceites y grasas", 1.0),
    ALIMENTOS_LIPIDOS("Alimentos ricos en lípidos", 0.5);


    //Variable almacenamiento de datos
    private final String nombre;
    private final double metaDiaria;

    //Constructor
    GrupoAlimento(String nombre, double metaDiaria) {
        this.nombre = nombre;
        this.metaDiaria = metaDiaria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetaDiaria() {
        return metaDiaria;
    }
}

