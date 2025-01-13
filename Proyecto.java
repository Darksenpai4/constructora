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

    public void setNombreProyecto(String nombre) {
        nombreProyecto = nombre;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    public void setIngeniero(Obrero ingeniero) {
        ingenieroACargo = ingeniero;
    }

    public String getDetails() {
        return "Nombre del proyecto: " + nombreProyecto  + ": Coste" + presupuesto + " Ingeniero a cargo: " + ingenieroACargo.getNombre();

    }

    public void printDetails() {
        System.out.println("Nombre del proyecto: " + nombreProyecto  + ": Coste" + presupuesto + " Ingeniero a cargo: " + ingenieroACargo.getNombre());
    }

}