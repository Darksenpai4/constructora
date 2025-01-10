class Maquina{
    private String nombreMaquina;
    private boolean funciona; 

    /** 
     * Constructor de la clase Agenda
     */
    public Maquina(String nombre){
        nombreMaquina = nombre;
        funciona = true;
    }

    /** 
     * Obtener el nombre de la máquina
     */
    public String getNombre(){
        return nombreMaquina;
    }

    /** 
     * Obtener si funciona la máquina
     */
    public boolean getFuncionamiento(){
        return funciona;
    }
}