public class Proyecto {
    private String nombreProyecto;
    private float presupuesto;
    private Obrero ingenieroACargo;
    public Proyecto(String nombreProyecto, float presupuesto, Obrero ingenieroACargo) {
        this.nombreProyecto = nombreProyecto;
        this.presupuesto = presupuesto;
        this.ingenieroACargo = ingenieroACargo;	
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public float presupuesto() {
        return presupuesto;
    }

    public Obrero getIngeniero() {
        return ingenieroACargo;
    }
}