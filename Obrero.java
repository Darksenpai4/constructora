class Obrero {
    private String nombre;
    private int salario;
    private Maquina tipoDeMaquina; 

    public Obrero (String nombre, int salario, Maquina tipoDeMaquina) {
        this.nombre = nombre;
        this.salario = salario;
        this.tipoDeMaquina = tipoDeMaquina;		
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Maquina getMaquina() {
        return tipoDeMaquina;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setMaquina(Maquina maquina) {
        tipoDeMaquina = maquina;
    }

    public String getDetails() {
        return "Nombre: " + nombre + " Salario: " + salario + " Tipo de maquina:: " + tipoDeMaquina.getNombre();

    }

    public void printDetails() {
        System.out.println("Nombre: " + nombre + " | Salario: " + salario + " | Máquina usada: " + tipoDeMaquina.getNombre());
    }

}