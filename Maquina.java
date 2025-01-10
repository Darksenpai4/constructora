class Maquina {
    private String nombreMaquina;
    private boolean funciona;

    /**
     * Constructor de la clase Agenda
     */
    public Maquina(String nombre) {
        nombreMaquina = nombre;
        funciona = true;
    }

    /**
     * Obtener el nombre de la máquina
     */
    public String getNombre() {
        return nombreMaquina;
    }

    /**
     * Obtener si funciona la máquina
     */
    public boolean getFuncionamiento() {
        return funciona;
    }

    /**
     * Modificar el nombre de la máquina
     */
    public void setNombre(String nombre) {
        nombreMaquina = nombre;
    }

    /**
     * Modificar el estado de la máquina
     */
    public void setFuncionamiento() {
        funciona = !funciona;
    }

    /**
     * Imprimir detalles
     */
    public void imprimirDetalles() {
        System.out.println("Máquina: "+nombreMaquina);
        if (funciona) {
            System.out.println("Funciona la máquina:Si");
        } else {
            System.out.println("Funciona la máquina: No");
        }
    }

    /**
     * Obtener detalles
     */
    public String getDetalles(){
        String funcion;
        if (funciona) {
            funcion = "Si";
        } else {
            funcion = "No";
        }


        return "Máquina: " + nombreMaquina  + " | Funciona la máquina: " +funcion;
    }
}
